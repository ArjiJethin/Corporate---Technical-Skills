import java.util.*;

public class Question9 {

    public static int[] arr_init(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static void chkRep(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int flag = 0;
        System.out.println("Duplicate elements in the array are: ");
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i] + " ");
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.print("No duplicate elements found.");
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();

        int[] arr = arr_init(size);

        chkRep(arr);

    }
}
