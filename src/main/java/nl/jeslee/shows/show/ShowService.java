package nl.jeslee.shows.show;

import nl.jeslee.shows.show.models.Show;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;

/**
 * Created by ceasaro on 12-11-14.
 * service responsible for managing the show models and it's business logic
 */
@Component
public class ShowService {

//    @Inject
    private ShowManager manager;

    public Show store(Show show) {
        return getManager().save(show);
    }

    public Collection<Show> allShows() {
        return this.manager.all();
    }

    public String injectionSuccess() {
        return "injection succeeded";
    }
    /*********************************************
     * Getters and Setters
     */
    public ShowManager getManager() {
        return manager;
    }

    public void setManager(ShowManager manager) {
        this.manager = manager;
    }

}
