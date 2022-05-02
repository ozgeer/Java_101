import java.util.Scanner;
public class Ikinin_kuvvetleri {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int deger;
        System.out.println("sayi gir:");
        deger= input.nextInt();
        for (int i=1; i<deger ; i*=2) {
            System.out.println(i);
        }
    }

}
