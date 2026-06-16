public class MinBitFlips {
    public static void main(String[] args){
        int start=10;
        int goal=7;
        int ans=start^goal;
        int temp=ans;
        int count=0;
        while(temp!=0){
            count++;
            temp=temp&(temp-1);
        }
        System.out.println("Min Flips: "+count);
    }
}
