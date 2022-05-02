import java.util.Scanner;
import java.lang.Math;

public class Hipotenus {
    public static void main(String[] args) {

        // hipotenüs hesabı
     Scanner degisken3=new Scanner(System.in);
        double x,y,hipotenus;
        System.out.println("hipotenus hesabi");
        System.out.println("\n");
        System.out.println("1. degerini giriniz:\n");
        x=degisken3.nextDouble();
        System.out.println("2. degerini giriniz:\n");
        y=degisken3.nextDouble();
        hipotenus=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("hipotenus:"+hipotenus);

        // Alan hesabı
        System.out.println("\n");
        System.out.println("ucgenin alan hesabi\n");
        System.out.println("\n");
        double alan,u,_1,_2,_3;
        System.out.println("1.kenar:");
        _1=degisken3.nextDouble();
        System.out.println("2. kenar");
        _2=degisken3.nextDouble();
        System.out.println("3. kenar");
        _3=degisken3.nextDouble();
        u=(_1+_2+_3)/2;
        alan=Math.sqrt(u*(u-_1)*(u-_2)*(u-_3));
        System.out.println("Alan:"+alan);

    }
}
