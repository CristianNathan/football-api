package com.cristian.football_api.controller;

import com.cristian.football_api.model.Player;
import com.cristian.football_api.service.PlayerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public Page<Player> listar(Pageable pageable){
        return playerService.listarComPaginacao(pageable);
    }

    @GetMapping("/{id}")
    public Player buscarPorId(@PathVariable Long id){
        return playerService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        playerService.deletar(id);
    }
    @PutMapping("/{id}")
    public Player atualizar(@PathVariable Long id,@RequestBody Player player){
        return playerService.atualizar(id, player);
    }
    @GetMapping("/posicao/{posicao}")
    public List<Player> buscarPorPosicao(@PathVariable String posicao){
        return playerService.buscarPorPosicao(posicao);
    }
    @GetMapping("/nome/{nome}")
    public List<Player> buscarPorNome(@PathVariable String nome){
        return playerService.buscarPorNome(nome);
    }


}






