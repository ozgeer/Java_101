import java.util.Scanner;
public class Teksayilarin_toplami {
    public static void main(String[] args) {
        Scanner alinan = new Scanner(System.in);
        int deger,toplam=0;
        do{
            System.out.println("sayi giriniz:");
            deger= alinan.nextInt();
            if (deger%4==0){
                toplam+=deger;
                System.out.println("toplam deger:"+toplam);
            }
        } while(deger>0);
    }
}
