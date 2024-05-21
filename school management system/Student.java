import java.util.*;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }
     
    public void setGrade(int grade){
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }


    public void payFees(int fees, School school){
        feesPaid += fees;
        school.updateTotalMoneyEarned(fees);
    }

    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Name of Student: "+name+
                "Total fees paid so far: "+feesPaid;
    }

    
}