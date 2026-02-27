package Exceptionhandling;
//Throw key using-it allow us to throw an exception in a program
public class E3 {
   static void chekage(int age){
        if(age>=18){
            System.out.println("can vote");
        }
        else{
            throw new RuntimeException("not to vote");
        }
    }

    static void main(String[] args) {
       // chekage(12);
        chekage(20);

    }

}
//check the code with both the cases