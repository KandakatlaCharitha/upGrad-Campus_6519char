import java.util.Scanner;
public class VariablesAndDataTypes{
    public static void main(String[] args) {
       
    //1.Declaring,Initializing variables and updating them

        System.out.println("Hello there!");//printing a statement
        int a=5;//declaring and initializing the variables "variableType variableName=value;"
        System.out.println(a);
        a=10;//updating the variable;
        System.out.println(a);
        int  b=a;
        System.out.println(b);


    //2.Variable declaration with Datatypes "number type"

        byte smallest=10;//smallest datatype,1 byte8-bit
        short s=25;//larger than byte,2 bytes,16-bits
        int  number=500;//larger than short,4 bytes,32-bit
        long l=456789089l;//larger than int,8 bytes,64 bits
        //datatypes with decimal precission 
        float decimalnumber=999.99f;//4 bytes,32 bits,can have upto 7 digit decimal precssion
        double largedecimal=9999.9999999;//8 bytes,64 bits,can have upto 15 digits decimal precission
        System.out.println("The byte variable smallest="+smallest + " and range of byte= "+Byte.MIN_VALUE+"to"+Byte.MAX_VALUE);
        System.out.println("The short variable s="+s+ " and range of short= "+Short.MIN_VALUE+"to"+Short.MAX_VALUE);
        System.out.println("The int variable number="+number+ " and range of int= "+Integer.MIN_VALUE+"to"+Integer.MAX_VALUE);
         System.out.println("The long variable l="+l+ " and range of long= "+Long.MIN_VALUE+"to"+Long.MAX_VALUE);
        System.out.println("The float variable decimalnumber="+decimalnumber);
        System.out.println("The double variable largedecimal="+largedecimal);


    //3.Variable declaration with primitive Datatypes "char-type" and "boolean-type"

        char ch='c';//size=2 bytes
        System.out.println("character = "+ch);
        ch=65;
         System.out.println("character = "+ch);//prints ASCII value i.e 'A' (ASCII value of 'A' is 65);
        
        boolean var=true;//1 byte, stores values that is either "true" or "false" 
        System.out.println("Boolean value is "+var);
        var=false;
        System.out.println("Boolean value is "+var);


    //4.Arithematic Operations

        int a1=10;
        int a2=5;
        int sum=a1+a2;//Addition
        int product=a1*a2;//Multiplication
        int division=a1/a2;//Division
        int modulous=a1%a2;//Mod operator 
        System.out.println("Sum="+sum);
        System.out.println("Product="+product);
        System.out.println("Division ="+division);
        System.out.println("Remainder ="+modulous);//prints remaider which is 0
        //BODMAS rule
        int answer=a1+a2*sum/a2;//follows bodmas rule so answer=25
        System.out.println(answer);

        //Find Area of a square where side=5.5
        float side=5.5f;
        float areaOfSquare=side*side;
        System.out.println("Area of Square ="+areaOfSquare);


    //5.User input

        //Find the Speed of a vehicle by taking distance and time as input
        Scanner sc= new Scanner(System.in);//Scanner class which helps user to give inputs
        System.out.println("Enter distance and time to calculate speed");
        System.out.println("Enter Distance in km=");
        int distanceinKm=sc.nextInt();
        System.out.println("Enter Time in hours=");
        int timeinHr=sc.nextInt();
        //sc.close();//end of the scanner class
        int speed=distanceinKm/timeinHr;
        System.out.println("Speed of a vehicle is approximately "+speed+" kmph");


    //6.Casting of variable datatypes

        int num1=45;
        int num2=4;
        int divi=num1/num2;
        System.out.println("Division in integer datatype:"+divi);//Division of 2 inttegers will return an integer i.e 11
        float div=(float)45/4;
        System.out.println("Division in double datatype:"+div);//here after casting the answer into double datatype will limit the wastage i.e 11.25
        
        //convert given value in meters to kilometers without data wastage
         //Scanner sc= new Scanner(System.in);//Scanner class is already declared in the above example-5
        System.out.println("Enter the value in meters that is needed to be converted into km:");
        int m=sc.nextInt();
        double km=(double)m/1000;//casting m variable to double datatype
        System.out.println("Above given value in km:"+km);

        /*Find the final salary received by an individual after adding year end bonus to the initial salary.Take Salary and bonus percent as input from the system.
        Print exact final salary received i.e in double*/
        //Scanner sc= new Scanner(System.in);//Scanner class is already declared in the above example-5
        System.out.println("Enter the Salary:");
        int salary=sc.nextInt();
        System.out.println("Enter bonus Interest:");
        int bonusInterest=sc.nextInt();
        sc.close();//end of the scanner class
        double amnt=(double)bonusInterest/100*(double)salary;
        double finalSal=(double)salary+amnt;
        System.out.println("Salary received by individual after year end bonus is "+finalSal);

    //7.Non primitive datatypes i.String 

        //Declare Strings to store First name and last name of employee with his salary And print the full name with space between them
        String firstName="Jack";//String declaration
        String lastName="Taylor";
        int salaryofemploee=800000;
        System.out.println("Name of the Employee: "+firstName+" "+lastName+" Salary="+salaryofemploee);//string concatination using "+"


    //8.Non primitive datatypes ii.Arrays
        
        //Create two arrays of same size  whcih stores student names and their marks . print out values of both array at index 3
        String[] names={"Ram","John","hani","Rocky","Raj"};//Array decleration
        int[] marks=new int[5];//Another way of declaring an array
        marks[0]=50;
        marks[1]=80;
        marks[2]=65;
        marks[3]=90;
        marks[4]=75;
        System.out.println("Student Name="+names[3]+" and "+"Marks="+ marks[3]);//printing values present in index 3
    }
}