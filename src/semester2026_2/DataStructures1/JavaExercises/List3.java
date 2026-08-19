package semester2026_2.DataStructures1.JavaExercises;
import java.util.Scanner;
public class List3 {
    // Arrays, matrices, strings

    public void array(){
        Scanner cin = new Scanner(System.in);
        System.out.println("Insert array's size");
        int size = cin.nextInt();

        int[] array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Type value for the " + i + " array's position: ");
            array[i] = cin.nextInt();
            i++;
        }

        i = 0;
        while (i < array.length){
            System.out.println(array[i]);
            i++;
        }
    }

    public void matrice(){
        Scanner cin = new Scanner(System.in);
        System.out.println("Insert matrix's lines");
        int lines = cin.nextInt();
        System.out.println("Insert matrix's columns");
        int columns = cin.nextInt();

        int[][] matrix = new int[lines][columns];

        for (int i = 0 ; i < lines ; i++){
            for (int j = 0 ; j < columns ; j++){
                System.out.println("Insert value to position [" + i + "] [" + j + "]");
                matrix[i][j] = cin.nextInt();
                System.out.print(matrix[i][j]);
            }
        }

        for (int i = 0 ; i < lines ; i++){
            for (int j = 0 ; j < columns ; j++){
                System.out.print(matrix[i][j] + "");
            }
            System.out.println();
        }
    }

    public void reverseArray(){
        Scanner cin = new Scanner(System.in);
        System.out.println("Insert array's size");
        int size = cin.nextInt();

        int[] array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Type value for the " + i + " array's position: ");
            array[i] = cin.nextInt();
            i++;
        }

        int[] array2 = new int[array.length];
        int j = array.length - 1;
        i =0;
        while (j >= 0){
            array2[i] = array[j];
            i++;
            j--;
        }
    }

    public void reverseString(){
        Scanner cin = new Scanner(System.in);
        System.out.println("Write a phrase: ");
        String phrase = cin.nextLine();
        String reversedPhrase = "";

        for (int i = (phrase.length() - 1) ; i >= 0 ; i--){
            reversedPhrase += phrase.charAt(i);
        }

        System.out.println(reversedPhrase);
    }

    public void bigLow(){
        Scanner cin = new Scanner(System.in);
        System.out.println("Insert array's size");
        int size = cin.nextInt();

        int[] array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Type value for the " + i + " array's position: ");
            array[i] = cin.nextInt();
            i++;
        }

        int isLower = array[0];
        int isBigger = array[0];

        for (i = 0 ; i < array.length ; i++){
            if (array[i] < isLower){
                isLower = array[i];
            }
            if (array[i] > isBigger){
                isBigger = array[i];
            }
        }

        System.out.println("Lowest number: " + isLower);
        System.out.println("Lowest number: " + isBigger);
    }

}
