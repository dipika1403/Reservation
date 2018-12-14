package com.online.reservation.service;

import com.online.reservation.model.Event;
import com.online.reservation.repository.EventRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;
import java.util.stream.StreamSupport;

@Service
public class EventService {
    private final EventRepository eventRepository;

    private final static Logger LOGGER = LoggerFactory.getLogger(EventService.class);

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getEventsWithinTimeFrame(Timestamp t1, Timestamp t2){
       return eventRepository.findEventsByTimeframeBetween(t1, t2);
    }

    public List<Event> getEventByUserId(UUID uuid){
        return eventRepository.findEventsByUserId(uuid);
    }


}
