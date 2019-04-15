package com.manoj.github.dto;

import java.sql.Timestamp;

import com.manoj.github.model.Actor;
import com.manoj.github.model.Repo;

public class EventDTO {

	private Long id;
	private String type;

	private Actor actor;
	private Repo repo;
	private Timestamp createdAt;

	public EventDTO() {
	}

	public EventDTO(Long id, String type, Actor actor, Repo repo, Timestamp createdAt) {
		this.id = id;
		this.type = type;
		this.actor = actor;
		this.repo = repo;
		this.createdAt = createdAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Repo getRepo() {
		return repo;
	}

	public void setRepo(Repo repo) {
		this.repo = repo;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

}
