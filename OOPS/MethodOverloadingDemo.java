class Marks{

    int calculateMarks(int m1,int m2){
        return m1+m2;
    }

    int calculateMarks(int m1,int m2,int m3){
        return m1+m2+m3;
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args){

        Marks m=new Marks();

        System.out.println("Total Marks : "+m.calculateMarks(90,90));

        System.out.println("Total Marks : "+m.calculateMarks(90,90,90));
    }
}
