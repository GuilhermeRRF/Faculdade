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
public class Exercicio19 {
  public static void main(String[] args) {
       
       Scanner entrada = new Scanner(System.in);
       
       int num1, soma;  
       soma=0; 
       
       do{  
           System.out.println("Digite o número ou 0 para sair ");
           num1=entrada.nextInt();
           
           soma=soma+num1;
           System.out.println(+num1 + " + ");
          
       }while (num1 != 0);  
       System.out.println(" O resultado da soma é: " +soma );
       }
   
   
     }
   


