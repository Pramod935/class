package GarbageCollection.Eligibility.ReassigningReference;

// Island of Isolation
public class Demo2{
    Demo2 ref;
}

class Driver{
    public static void main(String[] args) {
        Demo2 obj1 = new Demo2();
        Demo2 obj2  = new Demo2();

        obj1.ref = obj2;
        obj2.ref = obj1;

        obj1 = null;
        obj2 = null;
    }
}