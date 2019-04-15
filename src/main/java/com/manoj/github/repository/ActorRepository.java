package com.manoj.github.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.manoj.github.model.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long> {
}
