package Stringconcept;
public class StringBuilderExample1 {
    public void stringAppend(){
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Old String: " + sb);
        sb.append(" World");
        System.out.println("New String: " + sb);
    }
    public void stringInsert(){
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Old String: " + sb);
        sb.insert(1, "EEE");
        System.out.println("New String: " + sb);
    }

    public void stringReverse(){
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Old String: " + sb);
        sb.reverse();
        System.out.println("New String: " + sb);
    }

    public static void main(String[] args) {
        StringBuilderExample1 obj = new StringBuilderExample1();
        obj.stringAppend();
        obj.stringInsert();
        obj.stringReverse();
    }
}
