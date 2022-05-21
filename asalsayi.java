public class asalsayi {
    public static void main(String args[]) {
      
      
     
      int i=0,j=0;
      String primenum="";
      for (i=1;i<=100;i++){
        int count=0;
          
        for(j=i;j>=1;j--){
              
              if(i%j==0){
                  count+=1;
              }
             
          }
           
              if(count==2){
                  primenum=primenum+i+" ";
              }
          
      }
      System.out.println(primenum);
    }
}