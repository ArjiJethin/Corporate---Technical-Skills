import java.util.*;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int flag = 0;
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.print("The superior elements in the array are: ");
        for (int i = 0; i < size; i++) {
            boolean isSuperior = true;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] < arr[j]) {
                    isSuperior = false;
                    break;
                }
            }
            if (isSuperior) {
                System.out.print(arr[i] + " ");
                flag = 1;
            }
        }

        if (flag == 0) {
            System.out.print("NULL");
        }
    }
}
