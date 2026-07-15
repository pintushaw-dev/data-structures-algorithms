package OOPSONESHOT.Polymorphism;

public class Numbers {
    // same method name but arguments are different -- compile time polymorphism

    int Sum(int a,int b){
        return a+b;
    }

    int Sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj= new Numbers();
        obj.Sum(2,5);
        obj.Sum(1,4,5);
    }
}
