package nl.jeslee.shows.show;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import nl.jeslee.shows.show.models.Show;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ceasaro on 12-11-14.
 * test case for testing the show service
 */
@RunWith(MockitoJUnitRunner.class)
public class ShowServiceTest {

    Show show1;
    Collection<Show> storedShows = new ArrayList<Show>();

    @InjectMocks
    private ShowService showService = new ShowService();

    @Mock
    private ShowManager showManagerMock;

    @Before
    public void setUp() {
        // store some shows
        show1 = new Show("eerste show");
        when(showManagerMock.save(show1)).thenReturn(show1);

    }

    @Test
    public void shouldHaveOneShow() {
        Show storedShow = showService.store(show1);
        assertEquals("stored show must be the same as passed show.", storedShow, show1);
    }
}
