package com.online.reservation.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class EventNotFoundException extends RuntimeException {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventNotFoundException.class);

    public EventNotFoundException(String exception) {
        super(exception);
        LOGGER.warn("Visit not found exception: {}", exception);
    }
}
