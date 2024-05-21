import java.util.Scanner;
public class SumOfNnaturalnums{
    public static void printsum(int i,int n,int sum){
        if(i==n){
            sum=sum+i;
            System.out.println("Sum of n natural num ="+sum);
            return;
        }
        sum=sum+i;
        printsum(i+1, n, sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        printsum(1,n,0);
    }
}