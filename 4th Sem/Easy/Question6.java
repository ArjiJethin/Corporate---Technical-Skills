import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int i = 0;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.printf("The sum of natural numbers from 1 to %d is: %d", n, sum);
    }
}
