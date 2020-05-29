publicclassAssignment2{ publicstaticvoidmain(String[]args){
Stringstr1="Mark"; Stringstr2="Kate"; str1=str1.toLowerCase();
str2=str2.toLowerCase(); StringBuffersb=newStringBuffer(); sb.append(str1); if(str1.charAt(str1.length()-1)==str2.charAt(0)){ sb.append(str2.substring(1,str2.length()));
}else{
sb.append(str2);
}
System.out.println(sb); sb.append(str1);
}
}
