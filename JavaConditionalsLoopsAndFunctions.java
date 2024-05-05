import java.util.Scanner;
public class JavaConditionalsLoopsAndFunctions{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    //Conditionals in java (if statements,switch statements)

        //1.Write a code to check whether the given input year is leap year or not
        System.out.println("Enter the year to check whether it is a leap year or not:");
        int year=sc.nextInt();
        if((year%4==0)&&(year%100!=0)||(year%400==0)){ //if-statement
            System.out.println("LEAP YEAR");
        }
        else{                                           //else statement
            System.out.println("NOT A LEAP YEAR");
        }

        /*2.write the code to print the grade attained by the student based on his marks i.e; if he scores between 
        91-100 its A grade , 81-90 is B grade , 71-80 is c grade , 61-70 is D grade , 51-60 is E and below 50 is a fail*/
        System.out.println("Enter the marks of the student out of 100:");
        int marks=sc.nextInt();
        if(marks>90&&marks<=100){   
            System.out.println("A grade");
        }
        else if(marks>80&&marks<=90){
            System.out.println("B grade");
        }
        else if(marks>70&&marks<=80){
            System.out.println("C grade");
        }
        else if(marks>60&&marks<=70){
            System.out.println("D grade");
        }
        else if(marks>50&&marks<=60){
            System.out.println("E grade");
        }
        else {
            System.out.println("Failed");
        }
        
        
        /*3 Write code to print whether its a weekday or weekend by taking integer between 1-7 representing them from 
        monday-sunday and week day or weekend. If sample input=1 output should be "Monday is a week day".*/
        System.out.println("Enter a number between 1-7:");
        int dayNumber=sc.nextInt();
        String dayType;
        String dayString;
 
        // Switch case
        switch (dayNumber) {
 
        // Case
        case 1:
            dayString = "Monday";
            break;
 
        // Case
        case 2:
            dayString = "Tuesday";
            break;
 
        case 3:
            dayString = "Wednesday";
            break;
        case 4:
            dayString = "Thursday";
            break;
        case 5:
            dayString = "Friday";
            break;
        case 6:
            dayString = "Saturday";
            break;
        case 7:
            dayString = "Sunday";
            break;
        default:
            dayString = "Enter valid day number between 1-7";
        }
 
        switch (dayNumber) {
            // Multiple cases without break statements
 
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            dayType = "Weekday (Working day)";
            break;
        case 6:
        case 7:
            dayType = "Weekend (Holiday)";
            break;
 
        default:
            dayType = "Enter valid day number between 1-7";
        }
 
        System.out.println(dayString + " is a " + dayType);

    //Loops (For,While)

        /*4.Write a code that prints the multiplication table(1-10) of the given number 
         ex: 2 x 1=2
             2 x 2=4
             .......
             2 x 10=20
        */
        System.out.println("Enter  a number to print out its multiplication table:");
        int number=sc.nextInt();
        for(int i=1;i<=10;i++){
                int product=i*number;
                System.out.println(number+" x "+i+" = "+product);
        }

        //5.Write the code to find the sum of the integers in an array taking array as input
        System.out.println("Enter the size of the array");
        int sizeofarr=sc.nextInt();
        int[] arr=new int[100];
        //int sumofArr=0;
        for(int i=0;i<sizeofarr;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int sumofArr=0;
        while(i<sizeofarr){
            sumofArr+=arr[i];
            i++;
        }
        System.out.println("sum of the integers in an array "+sumofArr);

    //Functions

        //6.Write a function to calculate the gcd of the given two numbers
        System.out.println("Enter 2 numbers to caluculate gcd:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("GCD of 2 numbers is:"+gcd(num1,num2));
}
        public static int gcd(int num1,int num2){
            int gcd=0;
            for(int i=1;i<=num1&&i<=num2;i++){
                if(num1%i==0&&num2%i==0){
                   gcd=i;

                }
            }
            return gcd;
        


        }
}