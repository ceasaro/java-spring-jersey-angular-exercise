package nl.jeslee.shows.show;

import nl.jeslee.shows.show.ShowService;
import nl.jeslee.shows.show.models.Show;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by ceasaro on 13-11-14
 * Base Show rest service api..
 */
@Component
@Path("/")
public class ShowRestService {

    @Inject
    private ShowService showService;

    /**
     * Returns info about the REST-API
     *
     * @return all known shows
     */
    @GET
//    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//    @Transactional
    @Path("piet")
    public List<Show> test() {
        ArrayList<Show> shows = new ArrayList<Show>();
        shows.add(new Show("harry potter"));
        return shows;
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("piet2")
    public List<Show> test3() {
        ArrayList<Show> shows = new ArrayList<Show>();
        shows.add(new Show("piet 3"));
        return shows;
    }

}
