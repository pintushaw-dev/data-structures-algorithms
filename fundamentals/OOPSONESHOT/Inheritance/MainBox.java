package OOPSONESHOT.Inheritance;

public class MainBox {
    public static void main(String[] args) {
        Box box=new Box();
        Box box1=new Box(4);
        Box box2=new Box(9,2,3);

        System.out.println(box2.l+" "+box2.h+" "+box2.w);
        BoxWeight boxWeight=new BoxWeight();
        System.out.println(boxWeight.weight+""+boxWeight.h);
    }
}

