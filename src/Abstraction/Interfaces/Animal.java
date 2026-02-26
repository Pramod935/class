package Abstraction.Interfaces;

public interface Animal {
    void sound();//abstract method
}
class Tiger implements Animal{     /*like inheritance inated of extenda using an implements*/
   public void sound(){
        System.out.println("sound");
    }
}
class Drive{
    static void main(String[] args) {
        Tiger l =new Tiger();
        l.sound();
    }
}
