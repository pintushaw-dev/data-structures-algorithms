package OOPSONESHOT;

public class CallingFuncnOfStudent {
    public static class student{
        String name;
        int roll;
        double percent;
    }
    public static void fun(student s1){
        System.out.println(s1.name);
        System.out.println(s1.percent);
        return;
    }
    public static void main(String[] args) {
        student s1=new student();
        s1.name="pintu";
        s1.roll=98;
        s1.percent=67;
        fun(s1);

    }

}
