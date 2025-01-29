import java.util.Scanner;

public class StudentPercentage {
    String stdName ;
    int rollNo,math,sci,eng,socs,coms,cls;
    double percentage,totalMarks;

    void stdMarks() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the student name :");
        stdName = scan.nextLine();

        System.out.println("Enter the roll no :");
        rollNo = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the class :");
        cls = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the Mathematics marks :");
        math = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the Science marks :");
        sci = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the English marks :");
        eng = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the social studies marks :");
        socs = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the computer science marks :");
        coms = scan.nextInt();
        scan.nextLine();

        totalMarks = math + sci + eng + socs + coms;
        percentage = (totalMarks * 100) / 500;

        System.out.println("------------------------------");
        System.out.println("      STUDENT MARKS SLIP      ");
        System.out.println("------------------------------");
        System.out.println("Student Name  :" + stdName);
        System.out.println("Roll Number   :" + rollNo);
        System.out.println("Class         :" + cls);
        System.out.println("------------------------------");
        System.out.println("Subjects       Marks");
        System.out.println("------------------------------");
        System.out.println("Mathematics    :" + math);
        System.out.println("Science        :" + sci);
        System.out.println("English        :" + eng);
        System.out.println("Social Studies :" + socs);
        System.out.println("Com Science    :" + coms);
        System.out.println("------------------------------");

        System.out.println("Total Marks     :" + totalMarks);
        System.out.println("Percentage      :" + percentage + "%");

        if (percentage > 75) {
            System.out.println("Grade: A");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 50) {
            System.out.println("Grade: C");
        } else if (percentage >= 35) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        if (math < 35 || sci < 35 || eng < 35 || socs < 35 || coms < 35) {
            System.out.println("Fail");
        } else {
            System.out.println("Pass");
        }
    }
    public static void main(String[] args) {
        StudentPercentage sp= new StudentPercentage();
        sp.stdMarks();
    }
}
