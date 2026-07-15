package Strings;

public class stringBuilderReverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("bishal is bad boy");
          // sb.reverse();
       int i = 0, j = sb.length() - 1;

        while (i <= j) {
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);

            i++;j--;

           }
        System.out.println(sb);
    }
}

