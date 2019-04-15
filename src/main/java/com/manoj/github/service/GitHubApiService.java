package com.manoj.github.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manoj.github.dto.EventDTO;
import com.manoj.github.model.Event;
import com.manoj.github.repository.EventRepository;

@Service
public class GitHubApiService {

	@Autowired
	public EventRepository eventRepository;

	@Transactional
	public EventDTO saveEvent(EventDTO eventDTO) {
		if (eventDTO.getId() == null) {
			throw new RuntimeException("id cannot be null");
		}

		Event event = new Event(eventDTO.getId(), eventDTO.getType(), eventDTO.getActor(), eventDTO.getRepo(),
				eventDTO.getCreatedAt());
		Event savedEvent = eventRepository.save(event);
		return new EventDTO(savedEvent.getId(), savedEvent.getType(), savedEvent.getActor(), savedEvent.getRepo(),
				savedEvent.getCreatedAt());

	}

}
