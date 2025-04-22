import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double a = scanner.nextDouble();
        System.out.println("Enter the value of b:");
        double b = scanner.nextDouble();
        System.out.println("sum is :"+(a+b));
        scanner.nextLine();

        //Student data
        System.out.println("Please enter the student name: ");
        String studentName;
        studentName=scanner.nextLine();
        System.out.println("Please enter the student ID: ");
        int studentID;
        studentID = scanner.nextInt();
        System.out.println("Please enter the student grade: ");
        int studentGrade;
        studentGrade=scanner.nextInt();
        System.out.println("The student- "+studentName+"'s (ID-"+studentID+") garde is : " +studentGrade );
        scanner.nextLine();

        //Rectangle area
        System.out.println("Please enter the value of the rectangle's length: ");
        double length=scanner.nextDouble();
        System.out.println("Please enter the value of the rectangle's width: ");
        double width=scanner.nextDouble();
        double area=length*width;
        System.out.println("The area of the rectangle is "+area);
        scanner.nextLine();

        //widening casting
        System.out.println("Please enter the value of an integer:  ");
        int integer=scanner.nextInt();
        System.out.println("the "+integer+ " in double is "+ (double) integer);
        scanner.nextLine();

        //Narrowing casting
        System.out.println("Please enter the value of a number in double:");
        double number=scanner.nextDouble();
        int num=(int) number;
        System.out.println("The double "+number+" is "+num+" in integer.");



        scanner.close();
    }
}
