/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoemvideo;

/**
 *
 * @author romei
 */

import java.util.Scanner;

public class exercicio1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int delta,b2,a3,c4,n4;
        
        Scanner digitação = new Scanner (System.in);
        
       System.out.println("Digite o valor de b2");
       b2=digitação.nextInt();
       System.out.println("Digite o valor de a3");
       a3=digitação.nextInt();
       System.out.println("Digite o valor de c4");     
       c4=digitação.nextInt();
               
               
              
        /*soma*/ b2=5;
        /*soma*/c4=2;
        /*soma*/ a3=10;
        /*n4=resultado*/
          n4=4;
        
        
        delta = (b2^2-n4)*a3*c4;
        
         System.out.println("O valor de delta é igual a "+delta);
    
    }
}