package Main;

import java.util.Scanner;

public class Factorial {
    int c;
    int opc;
    Scanner a=new Scanner(System.in);
    
     public  void Facto(){   
     System.out.println("************");
     System.out.println("¿De qué numero quieres el factorial?");
     opc=a.nextInt();
     System.out.println("El factorial es: "+factorial(opc));        
}
    
    private int factorial (int n) {
       if (n==0){
           return 1;
       }else{
           return n*factorial(n-1);
       }
    }
}
