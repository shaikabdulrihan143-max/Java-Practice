import java.util.*;
public class BitManipulation {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        //Get Bit operation
        /* int n=5;//0101
        int pos=3;
        int firststep=1<<pos;//bitMask
        int secondstep=firststep & n;
        // if second step returns an non-zero->our bit 1
                               // an zero->our bit 0 
        if(secondstep!=0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        } */
       //Set Bit operation
       /* int n=5;//0101
       int pos=3;
       int firststep=1<<pos;//BitMask
       int secondStep=firststep | n;//newnumber generates after operation
       System.out.println(secondStep); */
       //Clear Bit operation
       /* int n=5;
       int pos=2;
       int firststep=1<<pos;//bitmask
       int seconstep=~firststep;
       int thirdstep=seconstep & n;//newnumber generates after operation
       System.out.println(thirdstep); */
       //Update operation
       /* int n=5;
       System.out.println("Enter position to be update:");
       int pos=in.nextInt();
       System.out.println("Enter operation(0/1)");//operation=1->update bit to 1 else update bit to 0
       int oper=in.nextInt();
       if(oper==1){
        int firststep=1<<pos;
        int secondstep=firststep | n;
        System.out.println(secondstep);
       }
       else{
        int firststep=1<<pos;
        int secondstep=~firststep;
        int thirdstep=secondstep & n;
        System.out.println(thirdstep); }*/
        //Toggling a bit
        System.out.println("Enter a number");
        int n=in.nextInt();
        System.out.println("Enter position to be toggled:");
        int pos=in.nextInt();
        System.out.println("Enter the operation(0/1)");
        int oper=in.nextInt();
        if(oper==1){
            int bitmask=1<<pos;
            System.out.println(bitmask | n);
        }
        else{
            int bitmask=1<<pos;
            int secondstep=~bitmask;
            System.out.println((secondstep & n));
        }

    }
}
