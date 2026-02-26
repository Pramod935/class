package Stringconcept;


public class StringIntern22{
    static void main(String[] args) {
        String s1=new String("abc");
        String s2="hello";

        String s3=s1.intern();

        System.out.println(s1==s2);
    }

}
//due to diffrent memory location in RAM