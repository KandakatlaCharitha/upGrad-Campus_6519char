//calculating power of the number x^n
import java.util.Scanner;
public class CalculatePower{
    public static int clacpower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int x1pow=clacpower(x,n-1);
        int pow=x*x1pow;
        return pow;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        System.out.println("Enter the power that needs to be calculated for the above num");
        int n=sc.nextInt();
        int ans=clacpower(x,n);
        System.out.println("power= "+ans);
    }
}