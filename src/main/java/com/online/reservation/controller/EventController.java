package com.online.reservation.controller;

import com.online.reservation.model.Event;
import com.online.reservation.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/userEvents")
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    /**
     * As a reporting user, I can request a list of user events (for all users) that took place within a given timeframe.
     * As a reporting user, I can request a list of all user events for a single user, specified by their user id.
     *
     * Example data format for a UserEvent:
     * {
     *     type: 'promotion-viewed', // i.e., the user clicked on a "house ad" (an internal ad) on the site
     *     string - userId: '1b468f7d-79e8-40c1-80a2-0dd7226e7771', // let's assume this system uses GUIDs
     *     long - timestamp: 1544401072, // unix epoch time
     *     String - context: 'homepage.topnav', // which view did this event take place in?
     *
     *     create table event (userId varchar, timestamp long, context varchar);
     * }
     */


    @RequestMapping
    public List<Event> getEventsWithinTimeFrame(@RequestParam("t1") Timestamp t1, @RequestParam("t2") Timestamp t2){
        return eventService.getEventsWithinTimeFrame(t1, t2);
    }

    @RequestMapping("/{uuid}")
    public List<Event> getEventsByUserId(UUID uuid){
        return eventService.getEventByUserId(uuid);
    }


}
