package pl.Piotr.Popiolek.zadanie2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    /**
     * Method get some string and return count upper letters, lower letters, numbers and special characters in response
     *
     * @param someString
     * @return Details class with informations about string in json
     */
    @RequestMapping("/getDetails/{someString}")
    public Details getDetailsAboutString(@PathVariable String someString) {
        return null;
    }

}
