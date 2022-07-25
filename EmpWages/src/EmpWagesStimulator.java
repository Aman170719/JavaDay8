import javax.swing.*;
import java.util.*;
import java.io.*;
public class EmpWagesStimulator{
    public static int Present = 1, Emp_full_work_hr = 8, Emp_wages = 20, Emp_Part_work_hr = 4, Working_days = 20, Working_hrs = 100;
    ;
    public static void empAttendance() {
        System.out.println("This Has been called for checking attendance");
        Random random = new Random();
        int check = random.nextInt(2);
        if (check == Present) {
            System.out.println("Employee Is Present");
        } else {
            System.out.println("Employee Is Absent");
    }

}
       public static void empSalary(){
            System.out.println("This Has been called for finding Full Time Salary");
            Random random = new Random();
            int check = random.nextInt(2);
            if (check == Present){
                System.out.println("Employee Is Present");
                int Employee_Full_salary = (Emp_full_work_hr * Emp_wages);
                System.out.println("Employee Salary per Day is" + Employee_Full_salary);
            }
            else {
                System.out.println("Employee Is Absent");
            }
            }
         public static void partTime(){
             System.out.println("This Has been called for Finding Part Time Salary");
             Random random = new Random();
             int check = random.nextInt(2);
             if (check == Present){
                 System.out.println("Employee Is Present");
                 int Employee_PartTime_salary = (Emp_Part_work_hr * Emp_wages);
                 System.out.println("Employee Salary per Day is" + Employee_PartTime_salary);
             }
             else {
                 System.out.println("Employee Is Absent");
             }
        }
       public static void switchCase(){
           System.out.println("This Has been called for For finding salary in Switch Case");
           Scanner scan = new Scanner(System.in);
           System.out.println("Chose Option 1 or 2 to Print Full / Part Time salary respectively");
           int choice= scan.nextInt();
           switch (choice){
               case 1:
                   System.out.println("Employee Is Present Full Time");
                   int Employee_Full_salary = (Emp_full_work_hr * Emp_wages);
                   System.out.println("Employee Salary per Day is" + Employee_Full_salary);
               case 2:
                       System.out.println("Employee Is Present Part Time");
                       int Employee_PartTime_salary = (Emp_Part_work_hr * Emp_wages);
                       System.out.println("Employee Salary per Day is" + Employee_PartTime_salary);
               default:
                   System.out.println("Enter Correct Value");
           }
    }
    public static void monthlySalary() {
        System.out.println("This Has been called for For finding salary in Switch Case");
        Scanner scan = new Scanner(System.in);
        System.out.println("Chose Option 1 or 2 to Print Full / Part Time salary respectively");
        int choice= scan.nextInt();
        switch (choice){
            case 1:
                System.out.println("Employee Is Present Full Time");
                int Employee_Full_salary = ((Emp_full_work_hr * Emp_wages ) * Working_days);
                System.out.println(("Employee Salary per Month is" + Employee_Full_salary));
            case 2:
                System.out.println("Employee Is Present Part Time");
                int Employee_PartTime_salary = ((Emp_Part_work_hr * Emp_wages) * Working_days);
                System.out.println("Employee Salary per Month is" + Employee_PartTime_salary);
            default:
                System.out.println("Enter Correct Value");
        }
    }
    public static void conditionalStatement() {
        for (int i = 1; i <= Working_days; i++) {
            int wages = (Emp_wages * Emp_full_work_hr);
            System.out.println("day : " + i + " Salary is : " + wages);
        }
        for (int i = 1; i <= Working_hrs; i++) {
            int wages2 = (Emp_wages * Emp_Part_work_hr);
            System.out.println("day : " + i + " Salary is : " + wages2);
        }
}
    public static void main(String[] args){
    EmpWagesStimulator works = new EmpWagesStimulator();
    works.empAttendance();
    works.empSalary();
    works.partTime();
    works.monthlySalary();
    works.switchCase();
    works.conditionalStatement();
    }
}