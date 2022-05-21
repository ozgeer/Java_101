import java.util.Scanner;

public class Harmoniksayi {
    public static void main(String[] args) {
        
    
    double sum=0.0;
    Scanner inp =new Scanner(System.in);
    System.out.println("n degeri giriniz:");
    int num=inp.nextInt();

    for(int i=1;i<=num;i++){
        sum+=1.0/i;
    }
    System.out.println(sum);
    }
    // onemlı not double ı int degıskene bolunce double doner.
}
