package semester2026_2.DataStructures1.JavaExercises;

public class List1 {
    // in/outputs, operators, conditional flow structures

    public double BMI(double height, double weight){
        double BMI = weight / (height * height);
        return BMI;
    }

    public double circleArea(double radius){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public void oddEven(int num){
        if (num % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public void averageGrade(double grade1, double grade2, double grade3){
        double finalGrade = (grade1 + grade2 + grade3) / 3;
        if (finalGrade >= 7.0){
            System.out.println("Approved");
        }
        if (finalGrade < 7.0 && finalGrade >= 3.5){
            System.out.println("Required to retake the exam");
        }
        if (finalGrade < 3.5){
            System.out.println("Failed");
        }
    }

    public double calculateDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public String numberInWords(int number) {
        switch (number) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            default:
                return "invalid value";
        }
    }
}
