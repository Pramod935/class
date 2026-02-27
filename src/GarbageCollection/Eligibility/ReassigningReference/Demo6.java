package GarbageCollection.Eligibility.ReassigningReference;

public class Demo6 {
    public void finalize(){
        System.out.println("Garbage Collected!");
    }

    public static void main(String[] args) {
        for(int i=0; i<10000; i++){
            Demo6  obj = new Demo6();
            obj = null;
        }
        System.gc();
    }
}