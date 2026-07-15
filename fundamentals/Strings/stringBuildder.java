package Strings;

public class stringBuildder {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        s.append("pintu");
        System.out.println(s);
        s.setCharAt(1,'o');
        System.out.println(s);
    }
}
