package entities;

import java.util.UUID;

public abstract class Entities {
    private UUID id;

    void setId(){
        this.id=UUID.randomUUID();
    }

    UUID getId(){
        return this.id;
    }
}