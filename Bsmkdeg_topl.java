import java.lang.*;
import java.util.Scanner;

public class Bsmkdeg_topl {
    public static void main(String[] args) {
        
        int num,sum=0,chang,remain=1;
        Scanner input=new Scanner(System.in);
        System.out.println("sayi degeri girin:");
        num=input.nextInt();
        while (remain!=0){
            chang=num;
            remain=chang%10;
            sum+=remain;
            num=chang/10;
        }
        System.out.println(sum);
            
    }

}
    

