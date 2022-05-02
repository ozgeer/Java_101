import java.util.Scanner;
import java.lang.Math;

public class Vucutkitle_indeksi {
    public static void main(String[] args) {
        Scanner degisken=new Scanner(System.in);
        double boy,kilo,vucutkitle_indeksi;
        System.out.println("boyunuz:");
        boy=degisken.nextDouble();
        System.out.println("kilonuz:");
        kilo=degisken.nextDouble();
        vucutkitle_indeksi=kilo/Math.pow(boy,2);
        System.out.println("Vucut kitle indeksiniz:"+vucutkitle_indeksi);


    }
}
