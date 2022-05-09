import java.util.Scanner;
import java.lang.*;

public class Palindrom {

    static boolean isPalindrom(int a){
        int temp=a;
        int lastDigit, reverseNumber = 0;

        while(temp!=0) {

            lastDigit = temp % 10;
            reverseNumber = (10 * reverseNumber) + lastDigit;
            temp /=10;

        }
        if(a==reverseNumber){
            System.out.println("\n");
            System.out.println("palindrom");
            return true;
        }
        else {
            System.out.println("ne yazikki");
            return false;
        }


    }
    public static void main(String[] args) {

        /*Scanner input=new Scanner(System.in);
        int variable;
        System.out.println("please,type number:");
        variable= input.nextInt();  */
        isPalindrom(7447);
    }
}
