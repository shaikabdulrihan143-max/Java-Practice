import java.util.*;
/* class Student{
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
} */
/* class Teacher{
    int teacherid;
    String teacherName;
    String subject;
    Teacher(int tid,String tname,String subj){
        this.teacherid=tid;
        this.teacherName=tname;
        this.subject=subj;
        System.out.println("Teacher Created Successfully\n");
        displaydetails();
    }
    public void displaydetails(){
        System.out.println("ID: "+teacherid);
        System.out.println("Name: "+teacherName);
        System.out.println("Subject: "+subject);
    }
} */
/* class Attendence{
    private int totalClasses;
    private int attendedClasses;
    public void set(int tc,int ac){
        this.totalClasses=tc;
        this.attendedClasses=ac;
    }
    public int getTotalClasses(){
        return totalClasses;
    }
    public int getAttendedClasses(){
        return attendedClasses;
    }
} */
/* abstract class Person{
    String name;
    int age;
}
class Student extends Person{
    int rollNo;
    Student(String sname,int sage,int srno){
        this.name=sname;
        this.age=sage;
        this.rollNo=srno;
        System.out.println("Student Details\n");
        displayStudentDetails();
    }
    public void displayStudentDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age : "+age);
        System.out.println("Roll No : "+rollNo);
    }

}
class Teacher extends Person{
    String subject;
    Teacher(String tname,int tage,String tsubj){
        this.name=tname;
        this.age=tage;
        this.subject=tsubj;
        System.out.println("\nTeacher Details\n");
        displayTeacherDetails();
    }
    public void displayTeacherDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Subject : "+subject);
    }
} */
/* class Marks{
    int calculateMarks(int m1,int m2){
        return m1+m2;
    }
    int calculateMarks(int m1,int m2,int m3){
        return m1+m2+m3;
    }
} */
/* abstract class Notification{
    public void sendNotification(){
        System.out.println("Notification sented successfully");
    }
}
class EmailNotification extends Notification{
    public void sendNotification(){
        System.out.println("Email Notification Sent\n");
    }
}
class SMSNotification extends Notification{
    public void sendNotification(){
        System.out.println("SMS Notification Sent\n");
    }
} */
/* abstract class User{
    abstract void login();
}
class Student extends User{
    public void login(){
        System.out.println("Student Login Successful\n");
    }
}
class Teacher extends User{
    public void login(){
        System.out.println("Teacher Login Successful\n");
    }
} */
interface AttendanceSystem{
    void markAttendence();
}
class StudentAttendence implements AttendanceSystem{
    public void markAttendence(){
        System.out.println("Attendance Marked Successfully");
    }
}
public class OOPS {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        //Question-1:Classes and Objects
        /* Student s1=new Student();
        System.out.print("Enter Student ID: ");
        int sid=in.nextInt();
        in.nextLine();
        System.out.print("Enter Name: ");
        String sname=in.nextLine();
        System.out.print("Enter Branch: ");
        String branch=in.next();
        s1.addStudent(sid, sname, branch);
        s1.displayStudent(); */
        //Question-2 Constructors
        /* Teacher t1=new Teacher(1,"Ravi Kumar","Java"); */
        //Question-3:Encapsulation
        /* System.out.print("Total Classes : ");
        int tc=in.nextInt();
        System.out.print("Attended Classes : ");
        int ac=in.nextInt();
        Attendence a1=new Attendence();
        a1.set(tc, ac);
        ac=a1.getAttendedClasses();
        tc=a1.getTotalClasses();
        double Attendance=((double)ac/tc)*100;
        System.out.printf("\n\n Attendance Percentage : %.2f",Attendance,"%");*/
        //Question-4:Inheritance
        /* Student s1=new Student("Abdul",19,101);
        Teacher t1=new Teacher("Ravi",35,"Java"); */
        //Question-5:Method Overloading
        /* Marks m=new Marks();
        System.out.println("Total Marks : "+m.calculateMarks(90,90));
        System.out.println("Total Marks : "+m.calculateMarks(90, 90,90)); */
        //Question-6:Method Overriding
        /* EmailNotification e1=new EmailNotification();
        e1.sendNotification();
        SMSNotification s1=new SMSNotification();
        s1.sendNotification(); */
        //Question-7:Abstraction
        /* Student s=new Student();
        s.login();
        Teacher t=new Teacher();
        t.login(); */
        StudentAttendence sa=new StudentAttendence();
        sa.markAttendence();

    }
}
