public class CLACI {

    public static void main(String[] args) {
    System.out.println(Calculator.powerDouble(55.0, 5));
    System.out.println(Calculator.powerInt(60,7));
    }

}

class Calculator
{
    static double powerInt(int num1,int num2)
    {
        return Math.pow(num1,num2);
    }
static double powerDouble(double num1,int num2)
{
    return Math.pow(num1,num2);
}
}
