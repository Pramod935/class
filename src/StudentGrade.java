import java.util.Scanner;

public class StudentGrade {
    static void main(String[] args) {
        Scanner Sc=new Scanner(System.in) ;
        System.out.println("enter sub1 mark:");
        int sub1 = Sc.nextInt();
        System.out.println("enter sub2 mark:");
        int sub2= Sc.nextInt();
        System.out.println("enter sub3 mark:");
        int sub3= Sc.nextInt();
        System.out.println("enter sub4 mark:");
        int sub4= Sc.nextInt();
        System.out.println("enter sub5 mark:");
        int sub5= Sc.nextInt();

        int total_mark=sub1+sub2+sub3+sub4+sub5;
        double percentage=(total_mark/500.0) * 100;
        System.out.println("total mark:"+total_mark);
        System.out.println("percentage:"+percentage);
        if(percentage>=75){
            System.out.println("Grade:A");
        }
        else if(percentage>=50){
            System.out.println("Grade:B");
        }
        else if (percentage>=30){
            System.out.println("Grade:C");
        }
        else{
            System.out.println("Fail");
        }
        }
    }

