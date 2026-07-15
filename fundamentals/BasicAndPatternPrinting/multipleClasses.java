class student{
    int rollNo;
    String student_Name;
}
public class multipleClasses {
    public static void main(String[] args) {
        student obj1=new student();
        obj1.rollNo=94;
        obj1.student_Name="Pintu Kumar Gupta";
        System.out.println(obj1.rollNo);
        System.out.println(obj1.student_Name);
        student obj2=new student();
        obj2.rollNo=71;
        obj2.student_Name="Nitai Pandit";
        System.out.println(obj2.rollNo);
        System.out.println(obj2.student_Name);
    }
}
