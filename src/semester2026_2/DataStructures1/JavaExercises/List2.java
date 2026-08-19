package semester2026_2.DataStructures1.JavaExercises;

public class List2 {
    // methods, flow-control structures involving repetition
    public void numbersWhile(int num1, int num2) {
        while (num1 <= num2){
            System.out.println(num1);
            num1++;
        }
    }

    public void numbersDo(int num1, int num2) {
        do {
            System.out.println(num1);
            num1++;
        } while (num1 <= num2);
    }

    public void numbersFor(int num1, int num2) {
        for (int i = num1; i <= num2; i++){
            System.out.println(i);
        }
    }

    public void numbersOddWhile(int num1, int num2) {
        while (num1 <= num2){
            if (num1 % 2 == 1){
                System.out.println(num1);
            }
            num1++;
        }
    }

    public void numbersOddDo(int num1, int num2) {
        do {
            if (num1 % 2 == 1) {
                System.out.println(num1);
            }
            num1++;
        } while (num1 <= num2);
    }

    public void numbersOddFor(int num1, int num2) {
        for (int i = num1; i <= num2; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }

    public void passwordWhile(String test) {
        String password = "123456789helloworldhi";
        while (password.equals(test) != true) {
            System.out.println("Wrong password");
        }
        if (password.equals(test) == true){
            System.out.println("Correct password");
        }
    }

    public void passwordDo(String test) {
        String password = "123456789helloworldhi";
        do {
            System.out.println("Wrong password");
        }   while (password.equals(test) != true);
        if (password.equals(test) == true){
            System.out.println("Correct password");
        }
    }

    public void multiplTable(int num) {
        for (int i = 1; i <= 9; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static double calculateSavings(double initialInvestment, double monthlyInvestment, int months, double monthlyInterestRate) {
        double accumulatedBalance = initialInvestment;
        for (int i = 0; i < months; i++) {
            double monthlyReturn = accumulatedBalance * monthlyInterestRate;
            accumulatedBalance += monthlyInvestment + monthlyReturn;
        }
        return accumulatedBalance;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int calculateSum(int initialNumber, int finalNumber) {
        int sum = 0;
        for (int i = initialNumber; i <= finalNumber; i++) {
            sum += i;
        }
        return sum;
    }

    public static int calculateFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

}
