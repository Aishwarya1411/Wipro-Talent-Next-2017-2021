importjava.util.ArrayList; 
importjava.util.Arrays; 
importjava.util.List; 
publicclassAssignment13{ publicstaticvoidmain(String[]args){ Stringstr1="abcXY123XYijk";//"XY123XY"
Stringstr2="XY";
StringBuffersb=newStringBuffer(); 
while(str1.indexOf(str2)!=-1){ intindex=str1.indexOf(str2); 
if(index==0&&index+str2.length()<str1.length()-1){ sb.append(str1.charAt(index+str2.length())); 
str1=str1.replaceFirst(str2,""); continue;
}
if(index-1>=0&&index+str2.length()>=str1.length()){ sb.append(str1.charAt(index-1)); 
str1=str1.replaceFirst(str2,""); continue;
}
if(index+str2.length()<str1.length()-1&&index-1>=0){ sb.append(str1.charAt(index-1)); 
sb.append(str1.charAt(index+str2.length())); str1=str1.replaceFirst(str2,""); 
}
}
System.out.println(sb);
}
