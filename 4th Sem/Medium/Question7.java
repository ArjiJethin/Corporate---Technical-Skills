import java.util.Scanner;

public class Question7 {

    // Left Shifting
    public static int[] leftShift(int[] array, int shift) {
        int n = array.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = array[(i + shift) % n];
        }
        return result;
    }

    // Right Shifting
    public static int[] rightShift(int[] array, int shift) {
        int n = array.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(i + shift) % n] = array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter '1' for left shift or '2' for right shift:");
        int choice = scanner.nextInt();

        System.out.println("Enter the number of positions to shift:");
        int shift = scanner.nextInt();

        int[] result;
        if (choice == 1) {
            result = leftShift(array, shift);
        } else if (choice == 2) {
            result = rightShift(array, shift);
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        System.out.println("Shifted array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}