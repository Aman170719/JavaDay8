import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner which is added to take values from the user
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        Scanner Scan = new Scanner(System.in);
        //Input values from the user
        System.out.println("Enter the Values of the line X1 and X2");
        System.out.println("Enter the value of X1 :  ");
        int X1 = Scan.nextInt();
        System.out.println("Enter the value of X2 :  ");
        int Y1 = Scan.nextInt();
        System.out.println("Enter the Values of the line Y1 and Y2");
        System.out.println("Enter the value of Y1 :  ");
        int X2 = Scan.nextInt();
        System.out.println("Enter the value of Y2 :  ");
        int Y2 = Scan.nextInt();
        double length = Math.sqrt((X2 - X1) * (Y2 - Y1) + (Y2 - Y1) * (Y2 - Y1));
        System.out.println("The length of the line is  : " +length);
    }
}

