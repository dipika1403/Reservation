package com.online.reservation.repository;

import com.online.reservation.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Repository
public interface EventRepository extends CrudRepository <Event, UUID> {

    public List<Event> findEventsByTimeframeBetween(Timestamp t1, Timestamp t2);

    public List<Event> findEventsByUserId(UUID uuid);





}
