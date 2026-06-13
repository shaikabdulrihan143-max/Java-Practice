class Teacher{
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
}

public class TeacherConstructorDemo {
    public static void main(String[] args){

        Teacher t1=new Teacher(1,"Ravi Kumar","Java");
    }
}
