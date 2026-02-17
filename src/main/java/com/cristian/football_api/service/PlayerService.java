package com.cristian.football_api.service;

import com.cristian.football_api.model.Player;
import com.cristian.football_api.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PlayerService {
    private final PlayerRepository playerRepository;
    public PlayerService(PlayerRepository playerRepository){
        this.playerRepository=playerRepository;
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



}
