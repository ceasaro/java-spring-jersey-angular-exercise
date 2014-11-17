package nl.jeslee.shows.costs.models;

import nl.jeslee.shows.core.AbstractTimestampEntity;

import javax.persistence.*;

/**
 * Created by ceasaro on 11-11-14.
 * Represents a single cost entity of a show, it
 */
@Entity
@Table(name = "show_part")
public class ShowCostPart extends AbstractTimestampEntity implements java.io.Serializable {

    @Column(name = "estimatedCosts")
    public Integer estimatedCosts;

    @Column(name = "actualCosts")
    public Integer actualCosts;

    @Column(name = "description")
    public String description;

    public Integer getActualCosts() {
        return actualCosts;
    }

    public void setActualCosts(Integer actualCosts) {
        this.actualCosts = actualCosts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
