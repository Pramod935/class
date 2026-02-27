package GarbageCollection.Eligibility.ReassigningReference;

// 3) Object is created inside method()
public class Demo4 {
    static void createObject(){
        Demo4 obj = new Demo4(); // after the method execution is over this object in the heap will get eligible foe GC
    }

    public static void main(String[] args) {
        createObject();
    }
}
