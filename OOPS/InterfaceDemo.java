interface AttendanceSystem{
    void markAttendence();
}

class StudentAttendence implements AttendanceSystem{

    public void markAttendence(){
        System.out.println("Attendance Marked Successfully");
    }
}

public class InterfaceDemo {
    public static void main(String[] args){

        StudentAttendence sa=new StudentAttendence();

        sa.markAttendence();
    }
}
