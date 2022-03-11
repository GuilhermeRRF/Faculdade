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

public class exercicio {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

     int elevado,proximo,valor_total;
     double ao_quadrado;
     Scanner entrada= new Scanner (System.in);
     
     System.out.println("Ola bem vindo ao sistema bancario");
     System.out.println("Digite 1");
     proximo=entrada.nextInt();
    
     if(proximo==1){
     System.out.println("Digite o valor do seu salario");
     valor_total=entrada.nextInt();
     

     
    ao_quadrado=valor_total*2;
     
     System.out.print("O valor do salario ao quadrado é de "+ao_quadrado);}
     
     
     
    
     else{
        System.out.print("obrigado por usar nosso aplicativo");}
     
    
     
    
     
     
    
    
    
    
    }
    
}
