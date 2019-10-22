package pl.Piotr.Popiolek.zadanie2;

/**
 * Class contains details about some string
 */
public class Details {
    private String string;
    private long numberOfUpperLetters;
    private long numberOfLowerLetters;
    private long numberOfNumbers;
    private long numberOfSpecialCharacters;

    public Details(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public long getNumberOfUpperLetters() {
        return numberOfUpperLetters;
    }

    public void setNumberOfUpperLetters(long numberOfUpperLetters) {
        this.numberOfUpperLetters = numberOfUpperLetters;
    }

    public long getNumberOfLowerLetters() {
        return numberOfLowerLetters;
    }

    public void setNumberOfLowerLetters(long numberOfLowerLetters) {
        this.numberOfLowerLetters = numberOfLowerLetters;
    }

    public long getNumberOfNumbers() {
        return numberOfNumbers;
    }

    public void setNumberOfNumbers(long numberOfNumbers) {
        this.numberOfNumbers = numberOfNumbers;
    }

    public long getNumberOfSpecialCharacters() {
        return numberOfSpecialCharacters;
    }

    public void setNumberOfSpecialCharacters(long numberOfSpecialCharacters) {
        this.numberOfSpecialCharacters = numberOfSpecialCharacters;
    }
}
