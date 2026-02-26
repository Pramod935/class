public class StringIntern{
     public static void main(String[] args) {
        String s1=new String("hello");
        String s2="hello";

        String s3= s1.intern();
         System.out.println(s1==s2);
         System.out.println(s2==s3);
    }
}
//s1==s2 false due to diffrent memorry location
//but for s2==s3 true due to s3 try to take same pointer  location (same address)