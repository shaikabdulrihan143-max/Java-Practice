abstract class Person{
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
}

public class InheritanceDemo {
    public static void main(String[] args){

        Student s1=new Student("Abdul",19,101);

        Teacher t1=new Teacher("Ravi",35,"Java");
    }
}
