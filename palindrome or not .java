importjava.util.Scanner;
classChkPalindrome
{
publicstaticvoidmain(Stringargs[])
{
Stringstr,rev="";
Scannersc=newScanner(System.in); System.out.println("Enterastring:"); str=sc.nextLine();
intlength=str.length();
for(inti=length-1;i>=0;i--)
rev=rev+str.charAt(i);
if(str.equals(rev))
System.out.println(str+"isapalindrome"); else
System.out.println(str+"isnotapalindrome");
}
}
