import java.util.Scanner;
public class FibonacciSequence{
    public static void printfib(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printfib(b,c,n-1);
    }
    public static int printnterm(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int num=printnterm(n-1)+printnterm(n-2);
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term (n should be grater than 2)");
        int n=sc.nextInt();
       
        int a=0;
        int b=1;
        
        System.out.println(a);
        System.out.println(b);
        printfib(a,b,n-2);
        int ans=printnterm(n);
        System.out.println("nth term is "+ans);
        
    }
}