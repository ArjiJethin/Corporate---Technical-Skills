import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        int Lshift[] = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of right shifts: ");

        int step = sc.nextInt();

        sc.close();

        for (int i = 0; i < size; i++) {
            Lshift[(i - step + size) % size] = arr[i];
        }
        System.out.println("Array after right shifting: ");
        for (int i = 0; i < size; i++) {
            System.out.print(Lshift[i] + " ");
        }
    }
}
