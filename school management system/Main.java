import java.util.*;

public class Main {

    public static void main(String[] args){
        Teacher ravi=new Teacher(1,"Ravi", 5000);
        Teacher mary=new Teacher(2, "Mary", 6000);
        Teacher stella=new Teacher(3, "Stella", 8000);

        Student mia=new Student(1,"Mia",4);
        Student preeth=new Student(2, "Preeth", 12);
        Student rina=new Student(3,"Rina",7);
         
        List<Teacher> teacherList=new ArrayList<>();
        teacherList.add(ravi);
        teacherList.add(mary);
        teacherList.add(stella);

        List<Student> studentList=new ArrayList<>();
        studentList.add(mia);
        studentList.add(preeth);
        studentList.add(rina);

        School ghs=new School(teacherList,studentList);

        mia.payFees(5000, ghs);
        preeth.payFees(7000,ghs);
        System.out.println("Ghs has earned rupees "+ghs.getTotalMoneyEarned());

        System.out.println("Making ghs pay salary");
        mary.receiveSalary(mary.getSalary(), ghs);
        System.out.println("Money ghs has spent for salary to"+mary.getName()+
        "and now has"+ghs.getTotalMoneyEarned());

        ravi.receiveSalary(mary.getSalary(), ghs);
        System.out.println("Money ghs has spent for salary to"+ravi.getName()+
        "and now has"+ghs.getTotalMoneyEarned());

        System.out.println(mia);
        System.out.println(mary);

    }
    
}
