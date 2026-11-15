public class prexe3 {
    public int sumofdigits(int n){
        int sum=0;
        if(n==0){
            return(0);
        }
        for(int i=n; i!=0; i/=10){
            sum+=(i%10);
        }
        return(sum);
    }
    public static void main(String []args){
        prexe3 obj = new prexe3();
        int sum = obj.sumofdigits(-1234);
        System.out.println("The sum of the digits of 1234 is: " + sum);
    }
}
