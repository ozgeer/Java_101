import java.util.*;
public class Mukemmel_sayi {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("test etmek istediginiz sayiyi girin:");
		int variable=input.nextInt();
		int toplam=0;
		
		for (int i=1;i<variable;i++) {
			if (variable%i==0) {
				toplam+=i;
				
			}
		}
		if(variable==toplam) {
			System.out.println("mukemmel sayi");
		}
		
		else {
			System.out.println("mukemmel sayi degil");
		}
	}

}
