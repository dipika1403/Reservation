package com.online.reservation.model;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Event {

    private Timestamp timeframe;
    private String conext;

    @Id
    @org.hibernate.annotations.Type(type = "pg-uuid")
    @Column(name="userId")
    private UUID userId;


    @Builder
    Event(UUID userId, Timestamp timeframe, String context){
        this.userId = userId;
        this.timeframe = timeframe;
        this.conext = context;

    }




}
