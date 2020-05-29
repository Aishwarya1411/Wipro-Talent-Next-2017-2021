publicclassAssignment7{ 
publicstaticvoidmain(String[]args){Stringstr="xHix"; 
if(str.charAt(0)=='x') str=str.substring(1,str.length());
         if(str.charAt(str.length()-1)=='x') 
            str=str.substring(0,str.length()-1); 
        System.out.println(str);
     }
}
