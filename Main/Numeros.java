package Main;

import java.util.Scanner;


public class Numeros {
     
     Scanner c=new Scanner(System.in);
     int opc;
     public  void unoadiez(){   
     System.out.println("************");
     System.out.println("¿A que numero quieres llegar?");
     opc=c.nextInt();
     recursividad2(opc);   
        
}
  private static void recursividad2(int n){
    if (n>0){
        recursividad2(n-1);
        System.out.print(n+" ");    
    }  
  }  
}
