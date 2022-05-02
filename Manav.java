import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        Scanner variable=new Scanner(System.in);
        double arm,elma,dom,muz;
        arm=2.14; elma=3.67; dom=1.11; muz=0.95;
        double a,e,d,m,toplam;
        System.out.println("armut kac kilo?");
        a=variable.nextInt();
        a*=arm;
        System.out.println("elma kac kilo?");
        e=variable.nextDouble();
        e*=elma;
        System.out.println("domates kac kilo?");
        d=variable.nextDouble();
        d*=dom;
        System.out.println("muz kac kilo?");
        m=variable.nextDouble();
        m*=muz;
        toplam=a+e+d+m;
        System.out.println("toplam miktar:\n"+toplam);



    }
}
