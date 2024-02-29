import java.util.Scanner;
public class Bank{
    public static void main(String[] args) {
        System.out.println("Welcome to ABC Bank");
        System.out.println("Enter your Name as in Account Book");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Enter your Initial Balance");
        double initialamount=sc.nextDouble();
        Account acc=new Account(name,initialamount);
        System.out.println("Enter \"1\" to withdraw the amount from the account or Enter \"2\" to deposit amount in to the account");
        int ip=sc.nextInt();
        if(ip==1){
            System.out.println("Enter the amount");
            int amount =sc.nextInt();
            acc.withdraw(amount);
        }
        else if(ip==2){
            System.out.println("Enter the amount");
            int amount=sc.nextInt();
            acc.deposit(amount);
        }
        else{
            System.out.println("Invalid input ");
        }
        System.out.println("Personal Information of AccountHolder: \n"+acc.getPersonalInformation());
        sc.close();
    }
}
class Account{
    private String accountHolder;
    private double balance;
   
    public Account(String accountHolder,double initialbalance){
        this.accountHolder=accountHolder;
        this.balance=initialbalance;
    }
    public void withdraw(double amount){
        if(amount>0&&amount<balance){
            balance=balance-amount;
            System.out.println("Successfully Withdrawn "+amount);
        }
        else{
            System.out.println("Insufficient Balance or Invalid withdrawl! please check withdrawl amount. ");
        }
    }
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Successfully deposited "+amount);
        }
        else{
            System.out.println("Invalid deposit amount! ");
        }
    }
    public String getPersonalInformation(){
        return "Name of the Account Holder : "+accountHolder +" \n Balance in rupees : "+balance;
    }
}