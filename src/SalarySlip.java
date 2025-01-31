import java.util.Scanner;
public class SalarySlip {
  String compName,compAddress,empName,contact,department,designation,grade ;
  double basicSalary,HRA,DA,Pf;
  char allow;
  int empId;
  int gradeProce=0;
  double grossSalary;

    Scanner scan = new Scanner(System.in);

    void employee(){
        System.out.println("Please enter the company name :");
        compName = scan.nextLine();

        System.out.println("Please enter the company address :");
        compAddress = scan.nextLine();

        System.out.println("Please enter the employee id :");
        empId = scan.nextInt();

        scan.nextLine();

        System.out.println("Please enter the emp name :");
        empName = scan.nextLine();

        System.out.println("Please enter the emp contact No. :");
        contact = scan.nextLine();

        System.out.println("Please enter the department :");
        department = scan.nextLine();

        System.out.println("Please enter the designation :");
        designation = scan.nextLine();

        System.out.println("Please enter the basic salary :");
        basicSalary = scan.nextDouble();

        scan.nextLine();
        System.out.println("Please enter the grade :");
        grade = scan.nextLine();

        HRA = basicSalary*0.20;
        DA = basicSalary*0.50;
        Pf = basicSalary*0.11;

        if(grade.equals("A")){
            gradeProce=1700;
        }
       else if(grade.equals("B")){
            gradeProce=1500;
        }
        else if(grade.equals("C")){
            gradeProce=1300;
        }
        grossSalary = basicSalary + HRA + DA+ gradeProce - Pf;

        System.out.println("-----------------------------");
        System.out.println(compName);
        System.out.println(compAddress);
        System.out.println("-----------------------------");
        System.out.print(empId);
        System.out.println(empName);
        System.out.print(contact);
        System.out.println(designation+", "+designation);
        System.out.println("-----------------------------");
        System.out.println("Basic salary :"+basicSalary);
        System.out.println("Grade :"+grade);
        System.out.println("HRA :"+HRA);
        System.out.println("DA :"+DA);
        System.out.println("Allow :"+gradeProce);
        System.out.println("PF :"+Pf);
        System.out.println("-----------------------------");
        System.out.println("Gross salary is :"+grossSalary);
    }

    public static void main(String[] args) {
        SalarySlip slip= new SalarySlip();
        slip.employee();
    }
}
