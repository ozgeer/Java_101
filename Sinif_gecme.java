import java.util.Scanner;

public class Sinif_gecme {
    public static void main(String[] args) {
           Scanner degisken=new Scanner(System.in);
           int mat,dila,kimya,fizik,bio,geo;
           double ort;
        System.out.print("matematik notu:");
            mat=degisken.nextInt();
        System.out.println("kimya notu:");
        kimya= degisken.nextInt();

        System.out.println("fizik notu:");
        fizik= degisken.nextInt();

        System.out.println("geo notu:");
        geo= degisken.nextInt();

        System.out.println("dila notu");
        dila= degisken.nextInt();

        ort=(mat+kimya+fizik+geo+dila)/5.0;
        System.out.println("ortalamaniz:"+ort);
        String sonuc;
        sonuc=(ort>6) ? "bidahaki sefere :(" : "gozunuz aydın :)";
        System.out.println(sonuc);




    }
}
