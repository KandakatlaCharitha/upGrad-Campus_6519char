import java.util.Scanner;
public class Factorial{
    public static int calcFactorial(int n){
        if(n==0||n==1){
            return 1;
        }
        int f1=calcFactorial(n-1);
        int f=n*f1;
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int ans=calcFactorial(n);
        System.out.println("factorial = "+ans);
    }
}