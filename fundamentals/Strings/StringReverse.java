package Strings;

public class StringReverse {
    public static void main(String[] args) {
        String s="bishal is a bad boy";
        String result=" ";
        String temp=" ";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                temp=s.charAt(i) + temp;

            }
            else{
                result = result + temp+" ";
                temp=" ";
            }

        }
        result=result+temp;

        System.out.println(result);

    }
}
