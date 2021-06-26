package com.scatena.marcello.Raid.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scatena.marcello.Raid.model.Raid;



public interface RaidRepository extends JpaRepository<Raid, Long>{
	
	Optional<Raid> findById(Long id);
}
