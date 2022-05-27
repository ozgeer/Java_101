import java.util.Scanner;

public class Kullanicigir {
    public static void main(String[] args) {
        
        String userName,pass,newPass;

        Scanner inp=new Scanner(System.in);
        System.out.println("kullanici adinizi girin:");
        userName=inp.nextLine();
        System.out.println("sifreniz:");
        pass=inp.nextLine();

        if(userName.equals("yuvarlaksac") && pass.equals("16712753608")){
            System.out.println("giris basarili");
         }
         else{
             System.out.println("sifre yanlis");
             System.out.println("Sifrenizi sifirlamak ister misiniz? Evetse 1,Hayirsa 2 yazabilirsiniz");
             int ans=inp.nextInt();
             inp.nextLine();

             switch(ans){
                 case 1:
                 System.out.println("yeni sifrenizi giriniz:");
                 newPass=inp.nextLine();
                 if(newPass.equals("16712753608")){
                     System.out.println("sifreniz eski sifreniz ile ayni olamaz.");
                 }
                 else{
                     System.out.println("sifreniz sifirlandi");
                 }
                 break;

                 case 2:
                 System.out.println("sen bilirsin :))");
                 break;
                 default:
                 System.out.println("secim yapiniz");
                 
                }


        }
    }
            
}

     
    
