package com.manoj.github.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manoj.github.dto.EventDTO;
import com.manoj.github.model.Actor;
import com.manoj.github.model.Event;
import com.manoj.github.model.Repo;
import com.manoj.github.repository.ActorRepository;
import com.manoj.github.repository.EventRepository;
import com.manoj.github.repository.RepoRepository;
import com.manoj.github.service.GitHubApiService;

/**
 * 
 * @author manoj krishna
 *
 */
@RestController
public class GithubApiRestController {

	@Autowired
	public EventRepository eventRepository;

	@Autowired
	public ActorRepository actorRepository;

	@Autowired
	public RepoRepository repoRepository;

	@Autowired
	public GitHubApiService gitHubService;

	/**
	 * 
	 * @param event
	 * @return
	 */
	@PostMapping("/events")
	public ResponseEntity<?> saveEvent(@RequestBody EventDTO eventDTO) {

		EventDTO eventResponse = gitHubService.saveEvent(eventDTO);
		return new ResponseEntity<>(eventResponse, HttpStatus.CREATED);

	}
	@GetMapping("/get")
	public String getHello(){
		return "welcome to hellow world";
	}

	/**
	 * 
	 * @param event
	 * @return
	 */
	@GetMapping("/events")
	public ResponseEntity<?> getEvent() {
		List<Event> listOfEvents = (List<Event>) eventRepository.findAll();
		return new ResponseEntity<>(listOfEvents, HttpStatus.OK);
	}

	/**
	 * 
	 * @param actorID
	 * @return
	 */
	@GetMapping("/events/actors/{actorID}")
	public ResponseEntity<?> getActor(@PathVariable Long actorID) {
		Actor actor = actorRepository.findOne(actorID);
		if (actor == null) {
			return new ResponseEntity<>(actor, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(actor, HttpStatus.OK);
	}

	/**
	 * 
	 * @param actor
	 * @return
	 */
	@PutMapping("/actors")
	public ResponseEntity<?> updateActor(@RequestBody Actor actor) {
		Actor actorObject = actorRepository.findOne(actor.getId());
		if (actorObject == null) {
			return new ResponseEntity<>(actor, HttpStatus.NOT_FOUND);
		}
		actorRepository.save(actor);
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

	/**
	 * 
	 * @return
	 */
	@DeleteMapping("/erase")
	public ResponseEntity<?> deleteAllEvents() {
		eventRepository.deleteAll();
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

	/**
	 * 
	 * @param actors
	 * @return
	 */
	@GetMapping("/actors")
	public ResponseEntity<?> getActorsByTotalEvents(@RequestBody Event event) {
		List<Actor> listOfActors = (List<Actor>) actorRepository.findAll();
		return new ResponseEntity<>(listOfActors, HttpStatus.OK);
	}

	/**
	 * 
	 * @param actors
	 * @return
	 */
	@GetMapping("/actors/streak")
	public ResponseEntity<?> getActorsBySteak(@RequestBody Event event) {
		List<Actor> listOfActors = (List<Actor>) actorRepository.findAll();
		return new ResponseEntity<>(listOfActors, HttpStatus.OK);
	}
}
