import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int i = 1;
        while (i <= 10) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
            i++;
        }
    }
}
