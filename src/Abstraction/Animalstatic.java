package Abstraction;

abstract class Animalstatic{
    static void info(){//static method
        System.out.println("animal parent");
    }
    abstract void sound();
}
class Dog extends Animalstatic{
    void sound(){
        System.out.println("dog barks(child)");
    }
}
class driver{

static void main(String[] args) {
    Animalstatic.info();
    Dog d= new Dog();
    d.sound();

}
        }
        /* why does abstract class have Constractor?
        because when we call a child class constrector initally it calls a parent class constructor
         and then child cllass constractor(refer above code to clarify it)
         */