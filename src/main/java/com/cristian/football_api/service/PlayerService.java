package com.cristian.football_api.service;

import com.cristian.football_api.model.Player;
import com.cristian.football_api.model.Team;
import com.cristian.football_api.repository.PlayerRepository;
import com.cristian.football_api.repository.TeamRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PlayerService {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;
    public PlayerService(PlayerRepository playerRepository, TeamRepository teamRepository){
        this.playerRepository=playerRepository;
        this.teamRepository = teamRepository;
    }
    public Player salvar (Player player){
        return playerRepository.save(player);
    }
    public List<Player> listar(){
        return playerRepository.findAll();
    }
    public Player buscarPorId(Long id){
        return playerRepository.findById(id).orElseThrow(() -> new RuntimeException("Jogador não encontrado "));
    }
    public void deletar(Long id){
        playerRepository.deleteById(id);
    }
    public Player atualizar(Long id,Player playerAtualizado){
        Player jogadorExistente = playerRepository.findById(id).orElseThrow(()-> new RuntimeException("Jogador não encontrado"));
        jogadorExistente.setNome(playerAtualizado.getNome());
        jogadorExistente.setNumero(playerAtualizado.getNumero());
        jogadorExistente.setPosicao(playerAtualizado.getPosicao());
        if(playerAtualizado.getTeam()!=null){
            Long teamId = playerAtualizado.getTeam().getId();

            Team team = teamRepository.findById(teamId).orElseThrow(()->new RuntimeException("Time não encontrado"));
            jogadorExistente.setTeam(team);
        }
        return playerRepository.save(jogadorExistente);
    }
    public List<Player> buscarPorPosicao(String posicao){
        return playerRepository.findByPosicao(posicao);
    }
    public List<Player> buscarPorNome(String nome){
        return playerRepository.findByNomeContaining(nome);
    }
    public Page<Player> listarComPaginacao(Pageable pageable){
        return playerRepository.findAll(pageable);
    }




}
