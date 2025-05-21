import java.util.Scanner;

public class Workshop01 {
    public static void main(String[] args) {
        System.out.println("-------Assignment#1-----------");
        System.out.println("Snoopy");

        System.out.println("-----Assignment#2----------");

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a variable of a: ");
        double a=scanner.nextDouble();
        System.out.print("Enter a variable of b: ");
        double b=scanner.nextDouble();

        double sum=a+b;
        System.out.println("The sum is: "+sum);
        double diff=a-b;
        System.out.println("The difference is: "+diff);
        double multiple=a*b;
        System.out.println("The multiple is: "+multiple);
        if(b!=0) {
            double divide = a / b;
            System.out.println("The divide is: " + divide);
        } else {
            System.out.println("Cannot be divided by zero.");

        }

        System.out.println("-----Assignment#3-------------");
        System.out.println("Enter the variable of radius: ");
        double radius=scanner.nextDouble();
        double area=Math.PI*radius*radius;
        double area1=radius*radius;
        System.out.println("The area is: "+area+ " or the area is: "+area1 +"PI");

        System.out.println("-----Assignment#4------------");
        System.out.println("Enter the value of minutes:");
        double minutes=scanner.nextDouble();
        double seconds=minutes*60;
        System.out.println("The "+minutes+ " minutes in seconds is: "+ seconds);

        System.out.println("-----Assignment#5------------");
        System.out.println("Enter the value of the  height:");
        int height=scanner.nextInt();
        for (int i=0;i<=height;i++) {
            for (int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();

    }
}