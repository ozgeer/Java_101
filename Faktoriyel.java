import java.util.*;
import java.lang.*;

    public class Faktoriyel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int deger,sonuc=1;
        do{
        System.out.println("hesaplanmasini istediginiz degeri giriniz:");
        deger= input.nextInt();
        for(int a=1;a<=deger; a++){
            sonuc*=a;
        }
            System.out.println("sonuc:"+sonuc);
          sonuc=1;

    } while (deger>0);
}
    }
