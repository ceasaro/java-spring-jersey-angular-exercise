package nl.jeslee.shows.show.models;

import nl.jeslee.shows.core.AbstractTimestampEntity;
import nl.jeslee.shows.costs.models.ShowCost;
import nl.jeslee.shows.costs.models.ShowCostPart;
import nl.jeslee.shows.utils.Slugify;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

/**
 * Created by ceasaro on 11-11-14.
 * represents a show
 */
@Entity
@Table(name = "show_part")
public class Show extends AbstractTimestampEntity implements java.io.Serializable {


    @Column(name = "slug", unique = true)
    public String slug;

    @Column(name = "name")
    public String name;

    @Column(name = "event_date")
    @Temporal(TemporalType.TIMESTAMP)
    public Date event_date;

    @OneToOne(fetch=FetchType.LAZY, mappedBy="show_cost")
    public ShowCost costs;

    public Show(String slug, String name) {
        this.slug = slug;
        this.name = name;
    }

    public Show(String name) {
        this.slug = Slugify.toSlug(name);
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
