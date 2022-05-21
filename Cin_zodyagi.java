import java.util.Scanner;
public class Cin_zodyagi {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int yil, deger;
        System.out.println("dogum yilinizi giriniz:\n");
        yil = value.nextInt();
        deger = yil % 12;

        switch (deger) {
            case 0:
                System.out.println("Cin zodyagi burcunuz:maymun");
                break;
            case 1:
                System.out.println("Cin zodyagi burcunuz:horoz");
                break;
            case 2:
                System.out.println("Cin zodyagi burcunuz:kopek");
                break;
            case 3:
                System.out.println("Cin zodyagi burcunuz:domuz");
                break;
            case 4:
                System.out.println("C zodyagi burcunuz:fare");
                break;
            case 5:
                System.out.println("Cin zodyagi burcunuz:okuz");
                break;
            case 6:
                System.out.println("Cin zodyagi burcunuz:kaplan");
                break;
            case 7:
                System.out.println("Cin zodyagi burcunuz:tavsan");
                break;
            case 8:
                System.out.println("Cin zodyagi burcunuz:ejderha");
                break;
            case 9:
                System.out.println("Cin zodyagi burcunuz:yilan");
                break;
            case 10:
                System.out.println("Cin zodyagi burcunuz:at");
                break;
            case 11:
                System.out.println("Cin zodyagi burcunuz:koyun");
                break;

        }
    }
}
