publicclassAssignment12{ 
publicstaticvoidmain(String[]args){ 
Stringstr="Wipro"; intn=3;
        StringBuffersb=newStringBuffer(); 
        for(inti=0;i<n;i++){
          sb.append(str.substring(str.length()-n));
    }
System.out.println(sb);
}
}
