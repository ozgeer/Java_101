import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

        int miktar;
        double kdvli_fiyat,kdv_orani;
        Scanner degisken2=new Scanner(System.in);
        System.out.println("hesaplanacak miktari giriniz:");
        miktar=degisken2.nextInt();
        int hesap;
        hesap=(miktar>0 && miktar<=1000) ? 18:8;
        // System.out.println(hesap);
        kdv_orani=(miktar*hesap)/100;
        kdvli_fiyat=miktar+kdv_orani;
        System.out.println("odenmesi gereken miktar:\n"+kdvli_fiyat);
    }
}
