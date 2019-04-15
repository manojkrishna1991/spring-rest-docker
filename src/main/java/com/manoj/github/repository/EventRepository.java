package com.manoj.github.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.manoj.github.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}
