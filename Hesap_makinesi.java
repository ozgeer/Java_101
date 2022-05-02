import java.util.Scanner;

public class Hesap_makinesi {
    public static void main(String[] args) {

        int n1,n2,deger,sonuc;
        Scanner giris=new Scanner(System.in);
        System.out.println("birinci sayi:\n");
        n1=giris.nextInt();
        System.out.println("ikinci sayi\n");
        n2=giris.nextInt();
        System.out.println("Yapmak istediğiniz islemi secin:\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        deger=giris.nextInt();

        switch (deger) {
            case 1:
                sonuc=n1+n2;
                System.out.println(sonuc);
                break;
            case 2:
                sonuc=n1-n2;
                System.out.println(sonuc);
                break;
            case 3:
                sonuc=n1*n2;
                System.out.println(sonuc);
                break;
            case 4:
                sonuc=n1/n2;
                System.out.println(sonuc);
                break;
            default:
                System.out.println("hatali secim,islem yapilamadi");
        }
    }
}
