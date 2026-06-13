import java.util.*;

class Attendence{
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
}

public class AttendanceEncapsulation {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        System.out.print("Total Classes : ");
        int tc=in.nextInt();

        System.out.print("Attended Classes : ");
        int ac=in.nextInt();

        Attendence a1=new Attendence();

        a1.set(tc,ac);

        ac=a1.getAttendedClasses();
        tc=a1.getTotalClasses();

        double Attendance=((double)ac/tc)*100;

        System.out.printf("\n\n Attendance Percentage : %.2f",Attendance,"%");
    }
}
