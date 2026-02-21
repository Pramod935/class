public class Medicine {
    String company;
    int  expiary;
    String description;

public Medicine(String company,int expiary,String description) {
    this.company = company;
    this.expiary = expiary;
    this.description = description;
}

    void printDetails()
    {
        System.out.printf("Medicine company is:%s\n ",this.company);
        System.out.printf("Medicine expiary is:%d \n",this.expiary);
        System.out.printf("Medicine description is:%s\n",this.description);
    }
}
class Driver{
   public static void main(String[] args) {
        Medicine M1= new Medicine("cipla",21,"DIABETIC");
       Medicine M2= new Medicine("mankind",22,"PCOD");
        M1.printDetails();
        M2.printDetails();

    }


}
