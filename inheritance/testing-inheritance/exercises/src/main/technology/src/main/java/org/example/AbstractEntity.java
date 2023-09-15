package org.example;

public abstract class AbstractEntity {
    private static int nextId = 1;
    private int id;

    public AbstractEntity() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }
}
