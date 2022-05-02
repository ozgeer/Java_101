import java.util.Scanner;

public class Ciftsayibulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int okunan;
        System.out.println("Sayi degeri girin:");   //System.out.println("elma kac kilo?");
        okunan=input.nextInt();
        for (int i=0;i<=okunan;i++){
            int deger =i%2;
            if (deger==0){
                System.out.println(i);
            }
        }
    }





}
