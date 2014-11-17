package nl.jeslee.shows.core;


import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    public Long id;

    @Version
    public int version;

}

