package com.cristian.football_api.controller;

import com.cristian.football_api.model.Team;
import com.cristian.football_api.repository.TeamRepository;
import com.cristian.football_api.service.TeamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {
    private final TeamService teamService;
    public TeamController(TeamService teamService){
        this.teamService=teamService;
    }
    @PostMapping
    public Team salvar(@RequestBody Team team){
        return teamService.salvar(team);
    }
    @GetMapping
    public List<Team> listar(){
        return teamService.listar();
    }
    @GetMapping("/{id}")
    public Team buscarPorId(@PathVariable Long id){
        return teamService.buscarPorId(id);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
            teamService.deletar(id);
    }


}
