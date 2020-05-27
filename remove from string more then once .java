import java.util.Scanner;
import java.util.*;
public class HelloWorld{
     public static void main(String []args){
       String st="";
       Scanner sc=new Scanner(System.in);
       st=sc.nextLine();
       char str[]=st.toCharArray();
       int n = str.length;
        int index = 0; 
       // Traverse through all characters 
        for (int i = 0; i < n; i++) 
        { 
            // Check if str[i] is present before it  
            int j; 
            for (j = 0; j < i; j++)  
            { 
                if (str[i] == str[j]) 
                { 
                    break; 
                } 
            } 
            // If not present, then add it to 
            // result. 
            if (j == i)  
            { 
                str[index++] = str[i]; 
            } 
        } 
        String result= String.valueOf(Arrays.copyOf(str, index));
        System.out.println(result);
        }
