publicclassAssignment9{ 
publicstaticvoidmain(String[]args){
      Stringstr="ab*cd";
      String[]strs=str.split(".[\\*]+."); 
      StringBuffersb=newStringBuffer(); 
      for(Stringx:strs) sb.append(x);
System.out.println(sb);
}
}
