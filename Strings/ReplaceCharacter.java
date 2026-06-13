public class ReplaceCharacter {
    public static void main(String[] args) {

        String s1="eabcdef";

        String result="";

        for(int i=0;i<s1.length();i++){

            if(s1.charAt(i)=='e')
                result+="i";
            else
                result+=s1.charAt(i);
        }

        System.out.println(result);
    }
}
