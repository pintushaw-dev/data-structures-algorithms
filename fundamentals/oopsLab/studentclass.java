package oopsLab;

public class studentclass {
    public static class Student{
        String name;
        int roll;
        int marks;
        public Student(String name,int roll,int marks){
            this.name=name;
            this.roll=roll;
            this.marks=marks;
        }
        void display(){
            System.out.println("name "+name);
            System.out.println("roll "+roll);
            System.out.println(("marks "+marks));

        }

    }
    public static void main(String[] args) {
        Student s1=new Student("pintu",71,87);
        Student s2=new Student("aditya",78,78);
        s1.display();
        s2.display();

    }
}
