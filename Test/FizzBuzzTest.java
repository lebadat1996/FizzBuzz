import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizz() {
        int number = 3;
        String expected = "Fizz";
        String actual = FizzBuzz.FizzAndBuzz(number);
        assertEquals(expected,actual);
    }
    @Test
    void Buzz() {
        int number = 5;
        String expected = "Buzz";
        String actual = FizzBuzz.FizzAndBuzz(number);
        assertEquals(expected,actual);
    }
    @Test
    void fizzBUzz() {
        int number = 15;
        String expected = "FizzBuzz";
        String actual = FizzBuzz.FizzBuzz(number);
        assertEquals(expected,actual);
    }
    @Test
    void fizz1() {
        int number = 17;
        String expected = "Fizz";
        String actual = FizzBuzz.FizzBuzz(number);
        assertEquals(expected,actual);
    }
}