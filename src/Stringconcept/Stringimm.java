package Stringconcept;

public class Stringimm {
    public static void main(String[] args) {
        String Str="Hello";
        Str.concat("world");
        System.out.println(" "+Str);
    }
}
 // we got a out put as Hello insted of world even thoudh we pass other string value(Str.concat("world")
     //which tells about immuatable concept of string (ie...we cannot change a string value once it is done)