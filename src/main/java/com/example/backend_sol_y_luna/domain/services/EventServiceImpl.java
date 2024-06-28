package com.example.backend_sol_y_luna.domain.services;

import com.example.backend_sol_y_luna.domain.entities.Event;
import com.example.backend_sol_y_luna.repositories.EventRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepositoryImpl eventRepository;

    public EventServiceImpl(EventRepositoryImpl eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Event createEvent(Event event) {
        return eventRepository.createEvent(event);
    }

    @Override
    public Event updateEvent(Event event) {
        return eventRepository.updateEvent(event);
    }

    @Override
    public void deleteEvent(Integer id) {
        eventRepository.deleteEvent(id);
    }

    @Override
    public List<Event> listEvents() {
        List<Event> listEventsAll = eventRepository.listEvents();
        return listEventsAll;
    }

}
