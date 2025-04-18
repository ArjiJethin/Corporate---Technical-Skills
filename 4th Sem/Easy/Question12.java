import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a number: ");
        int num = sc.nextInt();
        sc.close();
        int i = 0;
        int sum = 0;
        while (i <= num) {
            sum += i * i;
            i++;
        }
        System.out.printf("The sum of squares of first %d natural numbers is: %d", num, sum);
    }
}
