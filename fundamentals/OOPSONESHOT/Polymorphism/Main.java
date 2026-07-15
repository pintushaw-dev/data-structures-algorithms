package OOPSONESHOT.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
       Circle circle=new Circle();
       Triangle TRi=new Triangle();

       shape.area();
       circle.area();
       TRi.area();
    }
}
