import java.util.*;

class Student{
    int studentid;
    String name;
    String branch;

    public void addStudent(int sid,String sname,String branch){
        this.studentid=sid;
        this.name=sname;
        this.branch=branch;
    }

    public void displayStudent(){
        System.out.println("----- Student Details -----");
        System.out.println("ID: "+studentid);
        System.out.println("Name: "+name);
        System.out.println("Branch: "+branch);
    }
}

public class StudentManagement {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int sid=in.nextInt();

        in.nextLine();

        System.out.print("Enter Name: ");
        String sname=in.nextLine();

        System.out.print("Enter Branch: ");
        String branch=in.next();

        Student s1=new Student();

        s1.addStudent(sid,sname,branch);

        s1.displayStudent();
    }
}
