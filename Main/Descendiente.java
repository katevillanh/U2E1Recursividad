package Main;

import java.util.Scanner;

public class Descendiente {
    Scanner c=new Scanner(System.in);
     int opc;
     public  void unoadiez(){   
     System.out.println("************");
     System.out.println("¿A que numero quieres llegar?");
     opc=c.nextInt();
     recursividad2(opc);   
        
}
  private static void recursividad2(int n){
      int k=1;
      if(k>=10){
    if (n>=0){
        recursividad2(n-1);
        System.out.print(n+" "); 
        System.out.print(" ");
        
    }k++;
  }
  }  
}
