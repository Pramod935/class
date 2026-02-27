package GarbageCollection.Eligibility.ReassigningReference;

//2) Reassigning Reference
public class Demo5 {
    public static void main(String[] args) {
        Demo5  obj1 = new Demo5();
        Demo5  obj2 = new Demo5();

        obj1 = obj2; //1st Obj is now elegible for GC
    }
}