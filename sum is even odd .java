import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
         int a=s.nextInt();
         int b=s.nextInt();
         int n=a+b;
         if(n%2==0)
         {
            System.out.println("Sum is Even number"); 
         }
         else
         {
             System.out.println("Sum is Odd number");
         }
	}
}