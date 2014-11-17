package nl.jeslee.shows.costs.models;

import nl.jeslee.shows.core.AbstractTimestampEntity;
import nl.jeslee.shows.show.models.Show;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by ceasaro on 11-11-14.
 * All the costs of a show
 */
@Entity
@Table(name = "show_cost")
public class ShowCost extends AbstractTimestampEntity implements java.io.Serializable {

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "show")
    public Show show;

    @Column()
    public Collection<ShowCostPart> parts;

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Collection<ShowCostPart> getParts() {
        return parts;
    }

    public void setParts(Collection<ShowCostPart> parts) {
        this.parts = parts;
    }
}
