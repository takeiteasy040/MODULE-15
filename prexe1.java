public class prexe1 {
    public void fibocount(int n) {
        int a = 0, b = 1, c;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            c = a + b;
            sum+=c;
            a = b;
            b = c;
        }
        System.out.println("The sum of the first " + n + " Fibonacci numbers is: " + sum);
    }
    public static void main(String[] args) {
        prexe1 obj = new prexe1();
        obj.fibocount(3);
    }
}