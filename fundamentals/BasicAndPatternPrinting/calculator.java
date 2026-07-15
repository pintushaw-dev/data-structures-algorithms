package BasicAndPatternPrinting;
class calc{
    public int add(int n1,int n2){
        int result=n1+n2;
        return result;

    }


}

public class calculator {
    public static void main(String[] args) {
        calc cal=new calc();
        int num1=9;
        int num2=19;
      int re=  cal.add(5,6);
        int result=num1+num2;
        System.out.println(re);
        System.out.println(result);
    }
}
