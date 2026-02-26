package Abstraction;

abstract class Animal{

    abstract void sound();
        void run(){
            System.out.println("runnig");
        }

}
class Lion extends Animal {
    void sound() {
        System.out.println("rorars");
    }
}
class cat extends Animal{
    void sound(){
        System.out.println("meoe");
    }
}
class Driver{
    static void main(String[] args) {
        Lion l=new Lion();
        l.sound();
        l.run();

        cat c=new cat();
        c.sound();

    }
}