package com.fokouarnaud.webserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fokouarnaud.webserver.entity.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate,Integer>{

	Candidate findByName(String name);

}
