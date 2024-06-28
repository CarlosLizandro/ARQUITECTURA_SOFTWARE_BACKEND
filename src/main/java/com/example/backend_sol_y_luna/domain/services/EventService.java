package com.example.backend_sol_y_luna.domain.services;

import com.example.backend_sol_y_luna.domain.entities.Event;

import java.util.List;

public interface EventService {
    Event createEvent(Event event);

    Event updateEvent(Event event);

    void deleteEvent(Integer id);

    List<Event> listEvents();
}
