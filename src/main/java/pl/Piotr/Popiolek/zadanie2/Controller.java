package pl.Piotr.Popiolek.zadanie2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class get http request and response
 */
@RestController
public class Controller {

    /**
     * Method get some string and return this string, number of: upper letters, lower letters, numbers and special characters in response
     *
     * @param someString is a string for details
     * @return Details class with informations about string in json
     */
    @RequestMapping("/getDetails/{someString}")
    public Details getDetailsAboutString(@PathVariable String someString) {
        Details response = new Details(someString);
        response.setNumberOfLowerLetters(someString.chars().filter(Character::isLowerCase).count());
        response.setNumberOfUpperLetters(someString.chars().filter(Character::isUpperCase).count());
        response.setNumberOfNumbers(someString.chars().filter(Character::isDigit).count());
        response.setNumberOfSpecialCharacters(someString.length()-response.getNumberOfLowerLetters()-response.getNumberOfNumbers()-response.getNumberOfUpperLetters());
        return response;
    }



}
