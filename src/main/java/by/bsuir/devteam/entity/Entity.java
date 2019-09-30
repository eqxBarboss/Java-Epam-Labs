package by.bsuir.devteam.entity;

import by.bsuir.devteam.singleton.IdGenerator;

import java.util.Objects;

public class Entity implements java.io.Serializable{

    private int id;

    public Entity() {
        this.id = IdGenerator.getNewId();
    }

    public int getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return id == entity.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Id: " + id;
    }
}
