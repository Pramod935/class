package Abstraction;

abstract class Bank {
    String branch;
    Bank(String branch){
        this.branch=branch;
        System.out.println("branch is" +branch);
    }
    abstract void calculateintrest();

}
class HDFC extends Bank {
    HDFC(String branch) {
        super(branch);
    }
    void calculateintrest(){
        System.out.println("intrestis 10%");
    }

}
class ddriver{
    static void main(String[] args) {
        HDFC obj=new HDFC("AGB");
                obj.calculateintrest();
    }
}
/* in the above code tells about that using of super key words,ie..
by using super we can call the  main class attributes(super(branch)-used to get the branch name in child class
with out calling in the child(refer above code )
 */