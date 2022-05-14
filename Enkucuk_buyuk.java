import java.util.*;
import java.security.DrbgParameters.NextBytes;

public class Enkucuk_buyuk {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int sayi=0;int enk=0,enb=0;
		
		System.out.println("kac sayi gireceksiniz:");
		sayi=input.nextInt();
		
	for (int i=1;i<=sayi;i++){
		System.out.println(i+".sayi degeri giriniz:");
		int deger=input.nextInt();
		System.out.println(i+".deger:"+deger);
		
		if(i==1) {
		enk=deger; 
		enb=deger;
		}
		
		if(deger>enb) {
		enb=deger;
		}
		 if (deger<enk) {
		enk=deger;
		}  
		
}
	System.out.println("en kucuk eleman:"+enk);
	System.out.println("en buyuk eleman:"+enb);
    }
}



