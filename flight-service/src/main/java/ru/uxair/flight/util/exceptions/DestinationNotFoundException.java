package ru.uxair.flight.util.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DestinationNotFoundException extends AbstractResourceNotFoundException{
    @Override
    protected String getResourceAlias() {
        return "Destination";
    }
}