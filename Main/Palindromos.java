package Main;

import java.util.Scanner;

public class Palindromos {
    Scanner c=new Scanner(System.in);
    String Mipalabra;   
    //int Posfinal=0;
    String palabra;
     int b=1;
    // int d=Mipalabra.length();
     
    public void palindro(){
    System.out.println("¿Cual es tu entrada?");
    Mipalabra=c.next();
    int tamaño=Mipalabra.length()-1;
   paliRecur(Mipalabra,0,tamaño);
    //palabra=Mipalabra;
     /*for(int i=0;i<=Mipalabra.length();i++){
       System.out.println(Mipalabra.charAt(i));
       }
       for(int j=0;j<=palabra.length();j++){
       System.out.println(palabra.charAt(j));
       }
    */
    }
    
    public static boolean paliRecur(String Mipalabra, int i, int tamaño){
     
           boolean res;
           //if(i<Mipalabra.length()){
               if(Mipalabra.charAt(i)==Mipalabra.charAt(tamaño)){
                   //System.out.println("dentro");
                   res=true;
                 paliRecur((Mipalabra),i+1,tamaño-1);
                 return res;
               
           }else{
               //System.out.println("fuera");
               res=false;
               //return paliRecur((Mipalabra),i+1,tamaño-1);
           }
           if(res==true){
               System.out.println("Es palíndromo");
              
           }else{
               System.out.println("No es palíndromo");
               
           }
        return res;
       
       
    }
       
}
