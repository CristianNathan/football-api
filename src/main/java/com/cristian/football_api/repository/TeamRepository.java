package com.cristian.football_api.repository;

import com.cristian.football_api.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository <Team, Long>{

}
