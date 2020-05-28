public class Main
{	
	public static void main(String[] args) {
		char ch='M';
		if(Character.isUpperCase(ch))
		{
		    char r=Character.toLowerCase(ch);
		    System.out.println(ch+ "->"+r);
		}
		else
		{
		    char r=Character.toUpperCase(ch);
		    System.out.println(ch+ "->"+r);
		}
	}
}
