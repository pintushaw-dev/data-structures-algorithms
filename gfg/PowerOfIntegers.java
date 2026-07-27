public class PowerOfIntegers {
    double power(double b, int e) {
        if (e == 0) return 1;
        if (e < 0)
            return 1 / power(b, -e);
        double call = power(b, e / 2);
        if (e % 2 == 0) return call * call;
        else return b * call * call;

    }

    public static void main(String[] args) {
        double b=3.0;
        int e=5;
        PowerOfIntegers obj=new PowerOfIntegers();
        double result=obj.power(b,e);
        System.out.println(result);

    }
}
