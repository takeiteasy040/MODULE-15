public class prexe2 {
    public static int add(int a, int b) {
        return(a + b);
    }
    public static int sub(int a, int b) {
        return(a - b);
    }
    public static int mul(int a, int b){
        return(a * b);
    }
    public static int div(int a, int b){
        if(b == 0){
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return(a / b);
    }
    public static void main(String []args){
        int sum = add(10, 5);
        int sub = sub(10, 5);
        int mul = mul(10, 5);
        int div1 = div(10, 5);
        int div2 = div(10, 0);
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division (10/5): " + div1);
        System.out.println("Division (10/0): " + div2);
    }
}  
