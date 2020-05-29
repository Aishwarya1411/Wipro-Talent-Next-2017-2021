import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n, sum = 0;
        float avg;
        Scanner s = new Scanner(System.in);
        int a[] = new int[4];
        n=a.length;
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        avg = (float)sum / n;
        System.out.println("Average:"+avg);
	}
}
