package Main;

import java.util.Scanner;

public class Fibonacci {
    Scanner c=new Scanner(System.in);
     int opc;
     public  void SusFib(){   
          System.out.print("¿Cuántos elementos quieres visualizar? ");
          opc = c.nextInt();
 
          for(int i=0;i<opc;i++){
               System.out.print(fiboRecur(i)+", ");
          }
}
  private static int fiboRecur(int n){
          if(n==0||n==1)
               return n;
          else{
               return fiboRecur(n-1)+fiboRecur(n-2);
          }
     }
}
