package ru.job4j.queue;

public record Task(Position position,
                   String description,
                   int urgency) {

    public int getUrgency() {
        return urgency;
    }

    public Position getPosition() {
        return position;
    }
}
