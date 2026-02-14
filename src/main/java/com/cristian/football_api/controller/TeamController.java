package com.cristian.football_api.controller;

import com.cristian.football_api.model.Team;
import com.cristian.football_api.repository.TeamRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {
    private final TeamRepository teamRepository;
    public TeamController(TeamRepository teamRepository){
        this.teamRepository=teamRepository;
    }
    @PostMapping
    public Team salvar(@RequestBody Team team){
        return teamRepository.save(team);
    }
    @GetMapping
    public List<Team> listar(){
        return teamRepository.findAll();
    }
    @GetMapping("/{id}")
    public Team buscarPorId(@PathVariable Long id){
        return teamRepository.findById(id).orElseThrow(()-> new RuntimeException("Time não encontrado"));
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
            teamRepository.deleteById(id);
    }


}
