publicclassAssignment8{ 
    publicstaticvoidmain(String[]args){
        Stringstr1="Wipro"; Stringstr2="X"; intseparator=3;
        StringBuffersb=newStringBuffer(); 
        for(inti=0;i<separator-1;i++) 
        sb.append(str1).append(str2);
        sb.append(str1); 
        System.out.println(sb);
      }
}
