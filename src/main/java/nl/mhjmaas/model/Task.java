package nl.mhjmaas.model;

import org.springframework.data.annotation.Id;

public class Task {
    @Id
    public String id;

    public String description;

    public Boolean done;

    public Task() {

    }

    public Task(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Task[id=%s, description='%s', done=%b]", id, description, done);
    }
}
