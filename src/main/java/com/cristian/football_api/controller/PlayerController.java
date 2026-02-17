package com.cristian.football_api.controller;

import com.cristian.football_api.model.Player;
import com.cristian.football_api.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @PostMapping
    public Player salvar(@RequestBody Player player){
        return playerService.salvar(player);
    }

    @GetMapping
    public List<Player> listar(){
        return playerService.listar();
    }

    @GetMapping("/{id}")
    public Player buscarPorId(@PathVariable Long id){
        return playerService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        playerService.deletar(id);
    }
}






