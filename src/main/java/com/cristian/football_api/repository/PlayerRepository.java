package com.cristian.football_api.repository;

import com.cristian.football_api.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository  extends JpaRepository<Player ,Long> {
    List<Player> findByTeamId(Long teamId);
}
