publicclassAssignment3{
publicstaticvoidmain(String[]args){ Stringstr="Wipro"; intn=str.length();
Stringrepeater=""; if(n<2)repeater=str; elserepeater=str.substring(0,2); Stringoutput=""; for(inti=0;i<n;i++){ output+=repeater;
}
System.out.println(output);
}
}
