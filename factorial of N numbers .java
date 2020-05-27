import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args){
        int i,fact=1;  
  int num;//It is the number to calculate factorial    
  Scanner sc= new Scanner(System.in);
  num=sc.nextInt();
  for(i=1;i<=num;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+num+" is: "+fact);  
}
