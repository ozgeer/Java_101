import java.lang.*
;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;public class usalan {
    public static void main(String[] args) {
         int taban,us,sonuc;
         sonuc=1;
         Scanner input=new Scanner(System.in);
        System.out.println("taban sayi degerini girin:");
        taban=input.nextInt();
        System.out.println("us degeriniz giriniz:");
        us=input.nextInt();

        for (int i=1;i<=us;i++){
            sonuc=sonuc*taban;
            
        }
        System.out.println(sonuc);
     

        
    }
    
}
