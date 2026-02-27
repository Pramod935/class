package Stringconcept;

import java.sql.SQLOutput;

public class Stringfunctions {
 public static void main(String[] args) {
     String s1="optival Health";
     String s2="Solution";
     System.out.println("origin string is:"+s1);

     //length()
     System.out.println("length is:"+s1.length());
     //charAt()
     System.out.println("character at index 2:"+s1.charAt(2));
     //toupperclass() and lowerclaSS()
     System.out.println("upper class:"+s1.toUpperCase());
     System.out.println("lower case:"+s2.toLowerCase());
     //equals() and ==
     System.out.println("using ==:"+s1==s2);
     System.out.println("using equals():"+s1.equals(s2));
     //compare()
     System.out.println("using compareto():"+s1.compareTo(s2));
     //0 value when both are equal
     //+ve value when string1>string2
     //-ve value when string1<string2


     //substring()
     System.out.println("substring(0 to 4):"+s1.substring(0,4));

     //contain()
     System.out.println("contains Health:"+s1.contains("Health"));

     //Indexof()
     System.out.println("index of H:"+s1.indexOf("H"));

     //replace
     System.out.println("replace optival with Medplus:"+s1.replace("optival","Medplus"));
     System.out.println("original s1 string:"+s1);//string not updated


     //startwith() and endwith()
     System.out.println("start with:"+s1.startsWith("optival"));
     System.out.println("end with:"+s1.endsWith("optival"));

     //trim
     String s3="    pkr    ";
     System.out.println("before trim:"+s3);
     System.out.println("aftter trim:"+s3.trim());


     //concat()
     System.out.println("concat():"+s1.concat(" solution"));

     //isempty
     System.out.println("is empty():"+s1.isEmpty());

     //split()
     String scentence="optival helth solution private limited";
     String[]arr=scentence.split(" ");
     for(String i:arr){
         System.out.println(i);
     }

    }
}
