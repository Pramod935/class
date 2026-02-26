package Abstraction.Interfaces;

public class multiplelevelinheritance {
}
interface Mom{
    default void cook(){
        System.out.println("indid");
    }
        }

        interface dad{
    default void cook(){
        System.out.println("chinnes");
        }
}
class child implements Mom,dad{
    @Override
    public void cook(){ //all the method in the child class are public //
        dad.super.cook();
    }
}
class momdad{
   public static void main(String[] args) {
       child c=new child();
       c.cook();
   }
}