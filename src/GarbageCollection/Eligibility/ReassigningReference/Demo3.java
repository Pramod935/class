package GarbageCollection.Eligibility.ReassigningReference;

// 1) Nullifying Reference
public class Demo3 {
    public static void main(String[] args) {
        Demo3 obj = new Demo3();
        obj = null; // This obj is now elegible for GC
    }
}
