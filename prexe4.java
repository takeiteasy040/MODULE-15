import java.util.Scanner;
public class prexe4 {
    public boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void multable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number(0 if you want to exit the program): ");
        int n = sc.nextInt();
        prexe4 obj = new prexe4();
        while (n != 0) {
            if (obj.isprime(n)) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
            multable(n);
            System.out.print("Enter a number(0 if you want to exit the program): ");
            n = sc.nextInt();
            while(n < 0) {
                System.out.print("Please enter a positive number: ");
                n = sc.nextInt();
            }
        }
        System.out.println("Exiting the program.");
        sc.close();
    }
}
