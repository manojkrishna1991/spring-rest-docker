package com.manoj.github.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.manoj.github.model.Event;
import com.manoj.github.model.Repo;

public interface RepoRepository extends JpaRepository<Repo, Long> {
	
}
