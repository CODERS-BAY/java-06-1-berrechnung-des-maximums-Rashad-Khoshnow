import java.util.Scanner;

public class SechsPunktEins {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[0];

        while (!input.hasNext("q")) {
            int number = input.nextInt();
            int[] newArray = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                newArray[i] = numbers[i];
            }
            newArray[newArray.length - 1] = number;
            numbers = newArray;
        }
        System.out.println();
        int max = numbers[0];
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] > max) {
                max = numbers[j];
            }
        }
        System.out.printf("highest number is: %d", max);
    }
}