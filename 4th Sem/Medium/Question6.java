import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an array size: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements of the array:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr);

        int n = arr[size - 1];
        int[] ref = new int[n + 1];
        Arrays.fill(ref, 0);

        for (int i = 0; i < size; i++) {
            ref[arr[i]] += 1;
        }

        int flag = 0;
        System.out.print("Numbers missing the array are: ");
        for (int i = 1; i <= n; i++) {
            if (ref[i] == 0) {
                System.out.print(i + " ");
                flag = 1;
            }
        }
        if (flag == 0)
            System.out.println("NULL");

    }
}
