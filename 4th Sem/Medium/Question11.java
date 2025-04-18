import java.util.*;

public class Question11 {
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

    public static int chkRep(int[] arr) {
        int[] dup = arr;
        Arrays.sort(dup);
        int n = dup.length;
        int max = dup[n - 1];
        int[] rep_arr = new int[max + 1];
        Arrays.fill(rep_arr, 0);

        for (int i = 0; i < n - 1; i++) {
            rep_arr[dup[i]]++;
        }

        for (int i = 0; i < max + 1; i++) {
            if (rep_arr[i] > 1) {
                System.out.printf("%d is repeated %d times%n", i, rep_arr[i]);
                System.out.println();
            }
        }

        return 0;
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
