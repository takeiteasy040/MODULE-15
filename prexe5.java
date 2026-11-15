import java.util.Scanner;
public class prexe5 {
    public int pow(int base, int exp) {
        int res = base;
        if (exp == 0) {
            return 1;
        } else {
            for (int i = 1; i < exp; i++) {
                res *= base;
            }
            return res;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base number: ");
        int base = sc.nextInt();
        System.out.print("Enter an exponent number: ");
        int exp = sc.nextInt();
        prexe5 obj = new prexe5();
        int result = obj.pow(base, exp);
        System.out.println(base + " raised to the power of " + exp + " is: " + result);
        sc.close();
    }
}
