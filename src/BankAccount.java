public class BankAccount {
    String accHolder;
    double balance;
    BankAccount(String accHolder,double balance){
        this.accHolder=accHolder;
        this.balance=balance;

    }
    void deposit(double amount){
        balance += amount;
        System.out.println("upadted balance:"+balance);
    }
    void withdrwal(double amount){
        if(amount<=balance) {
            balance = balance - amount;
            System.out.println("withdrwal amount"+amount);

            System.out.println("insufficient balance");
        }
    }
    void displaybalance(){
        System.out.println("acc holder name:"+this.accHolder);
        System.out.println("acc balance:"+balance);
    }

    public static void main(String[] args) {
        BankAccount b1=new BankAccount("noob",50000);
        b1.deposit(20000);
        b1.withdrwal(10000);
        b1.displaybalance();


    }
}
