package com.manoj.github.model;

import java.beans.Transient;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Actor {
	@Id
	private Long id;
	private String login;
	private String avatar;

	private int totalEventCount;

	public Actor() {
	}

	public Actor(Long id, String login, String avatar) {
		this.id = id;
		this.login = login;
		this.avatar = avatar;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	@Transient
	public int getTotalEventCount() {
		return totalEventCount;
	}
	@Transient
	public void setTotalEventCount(int totalEventCount) {
		this.totalEventCount = totalEventCount;
	}

	
	
}
