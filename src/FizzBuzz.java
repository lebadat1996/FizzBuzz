public class FizzBuzz {
    public static String FizzAndBuzz(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return FizzAndBuzz(number);
    }

    public static String FizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        return "Fizz";
    }

}
