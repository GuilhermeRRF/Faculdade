/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;
import java.util.Scanner;
/**
 *
 * @author romei
 */
public class Exercicio11 {
  
     public static void main(String[] args) {
     int num1,res; 
     
   Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite o número");
    num1 = entrada.nextInt();
    
    res = num1 % 2;

if(res==0) { 
    
    System.out.println("O número " +num1 + " é par ");
}

else { 
    
    System.out.println("O número " +num1 + " é ímpar ");
}
    
 
    }

}