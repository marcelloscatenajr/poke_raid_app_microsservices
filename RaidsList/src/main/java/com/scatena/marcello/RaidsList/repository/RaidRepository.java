package com.scatena.marcello.RaidsList.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scatena.marcello.RaidsList.model.Raid;


public interface RaidRepository extends JpaRepository<Raid, Long>{
	
	Optional<Raid> findById(Long id);
}
