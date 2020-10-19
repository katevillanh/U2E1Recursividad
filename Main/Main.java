
package Main;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       int opc;
       boolean opc2;
       Scanner c=new Scanner(System.in);
       Numeros instanciaNum=new Numeros();
       Fibonacci instanciaFib=new Fibonacci();
       Factorial instanciaFac=new Factorial();
       Descendiente instanciaDesc=new Descendiente();
       Palindromos instanciaPali=new Palindromos();
        
       while(opc2=true){
        System.out.println(" ");
        System.out.println("¿Que acción quiere realizar?");
        System.out.println("1. Fibonacci");
        System.out.println("2. Numeros desde el 1");
        System.out.println("3. Factorial");
        System.out.println("4. Desaparece números");
        System.out.println("5. Palíndromos");
        System.out.println("6. Salir");
        opc=c.nextInt();
        
       
        
        switch(opc){
            
            case 1:
                instanciaFib.SusFib();
            break;
            
            case 2:
              instanciaNum.unoadiez();
            break;
            
            case 3:
              instanciaFac.Facto();
            break;
               
            case 4:
              instanciaDesc.unoadiez();
            break;
            
            case 5:
                instanciaPali.palindro();
            break;
            
            case 6:
                System.exit(0);
            break;    
            
            default: System.out.println("Opción incorrecta");
          }
       } 
   } 
}
