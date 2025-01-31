import java.util.Scanner;

public class Vowel {
    Scanner sc =new Scanner(System.in);
    char ch;
    void Check()
    {
        System.out.println("Enter the character :");
        ch = sc.next().charAt(0);
        if(ch == 'a'||ch =='e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A'||ch =='E'|| ch == 'I' ||ch == 'O' ||ch == 'U')
        {
            System.out.println(ch+" the character is vowel.");
        }
        else
        {
            System.out.println(ch+" the character is consonant.");
        }
    }

    public static void main(String[] args) {
        Vowel v1 = new Vowel();
        v1.Check();
    }

}