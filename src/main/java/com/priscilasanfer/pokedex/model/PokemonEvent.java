package com.priscilasanfer.pokedex.model;

import java.util.Objects;

public class PokemonEvent {

    private Long eventId;
    private String eventType;

    public PokemonEvent(Long eventId, String eventType) {
        this.eventId = eventId;
        this.eventType = eventType;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PokemonEvent)) return false;
        PokemonEvent that = (PokemonEvent) o;
        return getEventId().equals(that.getEventId()) &&
                getEventType().equals(that.getEventType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEventId(), getEventType());
    }

    @Override
    public String toString() {
        return "PokemonEvent{" +
                "eventId=" + eventId +
                ", eventType='" + eventType + '\'' +
                '}';
    }
}
