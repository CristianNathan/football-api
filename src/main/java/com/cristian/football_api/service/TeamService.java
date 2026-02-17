package com.cristian.football_api.service;

import com.cristian.football_api.model.Team;
import com.cristian.football_api.repository.PlayerRepository;
import com.cristian.football_api.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository){
        this.teamRepository = teamRepository;
    }
    public Team salvar (Team team){
        return teamRepository.save(team);
    }
    public List<Team> listar(){
        return teamRepository.findAll();

    }
    public Team buscarPorId(Long id){
        return teamRepository.findById(id).orElseThrow(()-> new RuntimeException("Time não encontrado"));
    }
    public void deletar(Long id){
        teamRepository.deleteById(id);
    }
}
