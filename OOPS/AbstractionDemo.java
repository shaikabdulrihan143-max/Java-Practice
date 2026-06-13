abstract class User{
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
}

public class AbstractionDemo {
    public static void main(String[] args){

        Student s=new Student();

        s.login();

        Teacher t=new Teacher();

        t.login();
    }
}
