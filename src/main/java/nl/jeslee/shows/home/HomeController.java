package nl.jeslee.shows.home;

import nl.jeslee.shows.show.ShowService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

@Controller
public class HomeController {

    @Inject
    private ShowService showService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/test",
            method = RequestMethod.GET)
    public ResponseEntity<String> processJson(
            @RequestBody String requestBody) {

        return new ResponseEntity<String>(
                "injection succeeded? = "
                        + showService.injectionSuccess(),
                new HttpHeaders(),
                HttpStatus.OK);
    }


}
