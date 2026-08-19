package semester2026_2.DataStructures1.JavaExercises;

public class List5 {
    // recursivity

    public int factorial(int num) {
        if (num == 1) {
            return 1;
        }

        return num * factorial(num - 1);
    }

    public int sum(int start, int end) {
        int result = 0;

        for (int i = start; i <= end; i++) {
            result += i;
        }

        return result;
    }

    public int sumRecursive(int start, int end) {
        if (start > end) {
            return 0;
        }

        return start + sumRecursive(start + 1, end);
    }

}
