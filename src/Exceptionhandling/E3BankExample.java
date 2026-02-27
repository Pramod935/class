package Exceptionhandling;

public class E3BankExample {
    static void main(String[] args) {
        try{
            int balance=2000;
            int withdraw=300;
            if(withdraw > balance){
                throw new ArithmeticException("insufficient balance");
            }
            System.out.println("withdraw sucessfully");
        } catch (ArithmeticException e) {
            System.out.println("exception caught:"+e.getMessage());
        }
    }
}
