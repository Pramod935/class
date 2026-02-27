package Exceptionhandling;
//uncheked exception
public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=0;
        try {
            k = i / j;
            int[] arr={1,2,3,4,5};
            System.out.println(arr[10]);
        }catch (ArithmeticException e) { //e will catch the that excepion variable in it
            System.out.println("undefind");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid Index");
        }catch(Exception e){
            System.out.println("unknow exception");
        }finally{
            System.out.println("return finally");
        }
        System.out.println("hi");
    }
    static {
        System.out.println("its staic");
    }
}

