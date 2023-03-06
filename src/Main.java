public class Main {

    // Question 1 - calculateGrade
    public String calculateGrade(int grade) {
        if (grade >= 90) {
            return "A";
        }
        if (grade >= 80 && grade < 89) {
            return "B";
        }
        if (grade >= 70 && grade < 79) {
            return "C";
        }
        if (grade >= 50 && grade < 59) {
            return "D";
        }
        if (grade <= 49) {
            return "F";
        }
        return calculateGrade(grade);
    }

    // Question 2 - fizzBuzz
    public String fizzBuzz(int a) {
        if (a % 3 == 0) {
            return "fizz";
        }
        else if (a % 5 == 0) {
            return "buzz";
        }
        else if ((a % 3 == 0) && (a % 5 == 0)) {
            return "fizzbuzz";
        }
        else {
            return "unlucky";
        }
    }
    // Question 3 - frontBack
    public String frontBack(String argument) {
            return argument.substring(1,3) + argument + argument.substring(1,3);
        }


    // Question 4 - twoAsOne
    public boolean twoAsOne(int a, int b, int c) {
        if ((a + b == c)||(a + c == b)||(b + c == a)) {
            return true;
        }
        else {
            return false;
        }
    }

    // Question 5 - endUp
    public String endUp(String sentence) {
        sentence.toUpperCase();
        return sentence;
    }
}
