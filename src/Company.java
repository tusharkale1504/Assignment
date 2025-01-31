import java.util.Scanner;

class Company {
    String compName, compAddress, compEmail, compContact;
    Scanner scan = new Scanner(System.in);

    void getCompanyData() {
        System.out.println("Enter the company name:");
        this.compName = scan.nextLine();

        System.out.println("Enter the company address:");
        this.compAddress = scan.nextLine();

        System.out.println("Enter the company email:");
        this.compEmail = scan.nextLine();

        System.out.println("Enter the company contact no.:");
        this.compContact = scan.nextLine();
    }

    void printCompanySlip() {
        System.out.println("-----------------------------");
        System.out.println(compName);
        System.out.println(compAddress);
        System.out.println(compEmail);
        System.out.println(compContact);
        System.out.println("-----------------------------");
    }
}

class PermanentEmployee extends Company {
    String empName, contact, department, designation, grade;
    double basicSalary, HRA, DA, Pf;
    int empId;
    int gradeProce = 0;
    double grossSalary;

    void getData() {
        System.out.println("Please enter the employee ID:");
        empId = scan.nextInt();
        scan.nextLine(); // Consume newline

        System.out.println("Please enter the employee name:");
        empName = scan.nextLine();

        System.out.println("Please enter the employee contact No.:");
        contact = scan.nextLine();

        System.out.println("Please enter the department:");
        department = scan.nextLine();

        System.out.println("Please enter the designation:");
        designation = scan.nextLine();

        System.out.println("Please enter the basic salary:");
        basicSalary = scan.nextDouble();
        scan.nextLine(); // Consume newline

        System.out.println("Please enter the grade (A/B/C):");
        grade = scan.nextLine();


        HRA = basicSalary * 0.20;
        DA = basicSalary * 0.50;
        Pf = basicSalary * 0.11;


        if(grade.equals("A")){
            gradeProce=1700;
        }
        else if(grade.equals("B")){
            gradeProce=1500;
        }
        else if(grade.equals("C")){
            gradeProce=1300;
        }

        grossSalary = basicSalary + HRA + DA + gradeProce - Pf;
    }

    void printSlip() {
        System.out.println("\n-----------------------------");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Contact: " + contact);
        System.out.println("Department: " + department + ", Designation: " + designation);
        System.out.println("-----------------------------");
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Grade: " + grade);
        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);
        System.out.println("Allowances: " + gradeProce);
        System.out.println("PF: " + Pf);
        System.out.println("-----------------------------");
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("-----------------------------\n");
    }
}

class TemporaryEmployee extends Company {
    String empName, contact, department;
    int wagePerDay, presentDays, grossSalary;

    void getData() {
        System.out.println("Please enter the employee name:");
        empName = scan.nextLine();

        System.out.println("Please enter the employee contact No.:");
        contact = scan.nextLine();

        System.out.println("Please enter the department:");
        department = scan.nextLine();

        System.out.println("Enter wage per day:");
        wagePerDay = scan.nextInt();

        System.out.println("Enter number of present days:");
        presentDays = scan.nextInt();
        scan.nextLine(); // Consume newline

        grossSalary = wagePerDay * presentDays;
    }

    void printSlip() {
        System.out.println("\n-----------------------------");
        System.out.println("Temporary Employee Details:");
        System.out.println("Name: " + empName);
        System.out.println("Contact: " + contact);
        System.out.println("Department: " + department);
        System.out.println("Wage Per Day: " + wagePerDay);
        System.out.println("Present Days: " + presentDays);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("-----------------------------\n");
    }
}

 class SalarySlipOfEmp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Company c1 = new Company();
        c1.getCompanyData();
        c1.printCompanySlip();

        while (true) {
            System.out.println("\nChoose Employee Type:");
            System.out.println("1. Permanent Employee");
            System.out.println("2. Temporary Employee");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    PermanentEmployee permEmp = new PermanentEmployee();
//                    permEmp.getCompanyData();
//                    permEmp.printCompanySlip();
                    permEmp.getData();
                    permEmp.printSlip();
                    break;

                case 2:
                    TemporaryEmployee tempEmp = new TemporaryEmployee();
//                    tempEmp.getCompanyData();
//                    tempEmp.printCompanySlip();
                    tempEmp.getData();
                    tempEmp.printSlip();
                    break;

                case 3:
                    System.out.println("Exiting the program. Thank you!");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
        }
    }
}
