import java.util.*;

public class Question12 {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length + arr2.length;
        int[] result = new int[n];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            result[k++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[k++] = arr2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the First array: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of the First array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the Second array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of the Second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        sc.close();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] result = mergeArrays(arr1, arr2);

        System.out.println("Merged array: " + Arrays.toString(result));

    }

}
