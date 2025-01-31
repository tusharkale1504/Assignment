import java.util.Scanner;

public class LeapYear {
    int year;
    void getData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter year :");
        year = scan.nextInt();
        scan.nextLine();
    }

  void  checkLeapYear(){
       if(year%4==0){
           System.out.println(year+" this is a leap year");
       }
       else {
           System.out.println(year+" this is not a leap year");
       }
    }
    public static void main(String[] args) {
        LeapYear obj = new LeapYear();
        obj.getData();
        obj.checkLeapYear();
    }
}
