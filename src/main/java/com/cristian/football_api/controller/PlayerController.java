package com.cristian.football_api.controller;

import com.cristian.football_api.model.Player;
import com.cristian.football_api.model.Team;
import com.cristian.football_api.repository.PlayerRepository;
import com.cristian.football_api.repository.TeamRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    private final PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }
    @PostMapping
    public Player salvar(@RequestBody Player player){
        return playerRepository.save(player);
    }
    @GetMapping
    public List<Player> listar(){
        return playerRepository.findAll();
    }
    @GetMapping("/{id}")
    public Player buscarPorId(@PathVariable Long id){
        return playerRepository.findById(id).orElseThrow(()-> new RuntimeException("Jogador não encontrado"));
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        playerRepository.deleteById(id);
    }
        @GetMapping("/team/{teamId}")
        public List<Player> listarPorTime(@PathVariable Long teamId){
            return playerRepository.findByTeamId(teamId);
        }
    }



