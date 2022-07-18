import java.io.*;
import java.util.*;
public class linecomparison {
    static int x1, x2, x3, x4, y1, y2, y3, y4;
    double length1, length2;
    public void lengthMeasure() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Values for 1st Line");
        System.out.println("Enter Values of X1 and Y1 Please");
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        System.out.println("Enter Values of X2 and Y2 Please");
        x2 = scan.nextInt();
        y2 = scan.nextInt();
        System.out.println("Enter Values for 2nd Line");
        System.out.println("Enter Values of X3 and Y3 Please");
        y3 = scan.nextInt();
        x3 = scan.nextInt();
        System.out.println("Enter Values of X4 and Y4 Please");
        y4 = scan.nextInt();
        x4 = scan.nextInt();
    }

    public void lengthCal() {
        length1 = Math.sqrt((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        length2 = Math.sqrt((x4 - x3) * (x4 - x3)) + ((y4 - y3) * (y4 - y3));
        System.out.println("The Length  of the line 1 is : " + length1);
        System.out.println("The Length  of the line 2 is : " + length2);
    }

    public void equalLines() {
        if (length1 == length2) {
            System.out.println("The Lines are Equal");
        } else {
            System.out.println("The line are Not equal");
        }
    }

    public void bigLines() {
        if (length1 == length2) {
            System.out.println("The Lines are Equal");
        } else if (length1 > length2) {
            System.out.println("The Line 1 is bigger");
        } else {
            System.out.println(("The Line 2 is bigger"));
        }
    }

    public void main(String[] args) {
        linecomparison line = new linecomparison();
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose from 1 to 4 values");
        int chose = scan.nextInt();
        switch (chose) {
            case 1:
                line.lengthMeasure();
            case 2:
                line.equalLines();
            case 3:
                line.lengthCal();
            case 4:
                line.bigLines();
        }
    }
}

