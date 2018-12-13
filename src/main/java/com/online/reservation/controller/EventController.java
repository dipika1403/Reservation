package com.online.reservation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userEvents")
public class EventController {

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

    public void addEvent(){

    }




}
