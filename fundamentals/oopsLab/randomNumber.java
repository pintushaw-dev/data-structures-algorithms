package oopsLab;
import java.util.*;
class NumberGenerator extends Thread{
    public void run(){
        Random rand=new Random();
        while (true){
            int num=rand.nextInt(100);
            System.out.println("generated number "+num);
            new SquareThread(num).start();
            new CubeThread(num).start();
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class SquareThread extends Thread{
    int number;
    SquareThread(int num){
        number=num;
    }
    public void run(){
        System.out.println("square of "+ number+"="+(number*number));
    }
}
class CubeThread extends Thread{
    int number;
     CubeThread(int num){
         number=num;
     }
     public void run(){
         System.out.println("cube of "+ number+"="+(number*number*number));
     }
}
public class randomNumber {
    public static void main(String[] args) {
        NumberGenerator t=new NumberGenerator();
        t.start();
    }

}
