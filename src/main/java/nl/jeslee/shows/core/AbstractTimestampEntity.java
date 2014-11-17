package nl.jeslee.shows.core;


import java.util.Date;

import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractTimestampEntity extends AbstractEntity {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created")
    public Date created;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified")
    public Date modified;

    @PrePersist
    void createdAt() {
        this.created = this.modified= new Date();
    }

    @PreUpdate
    void updatedAt() {
        this.modified = new Date();
    }
}

