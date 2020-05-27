import java.util.Scanner;
     public class HelloWorld{ 

     public static void main(String []args){
        
         int i; 
         int  arr[] = new int[10];
         int count=0;
         
         Scanner sc = new Scanner(System.in);
         for(i=0;i<10;i++)
         {
             arr[i]=sc.nextInt();
         }
           
         // Initialize maximum element 
         int max = arr[0]; 
         
        
         // Traverse array elements from second and 
         // compare every element with current max   
         for (i = 1; i < arr.length; i++) 
         {
             if (arr[i] > max) 
                 max = arr[i];
         }
         System.out.println(max);
         for( i=0;i<arr.length;i++)
         {
             if(arr[i]==max)
             {
                 count=count+1;
             }
         }
         System.out.println(count);
     }
}
