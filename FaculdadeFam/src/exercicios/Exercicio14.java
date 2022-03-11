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
public class Exercicio14 {
    
 public static void main(String[] args) {
     
     int num1,res, opc;
     
     Scanner entrada = new Scanner(System.in);
     res=0;
     num1=0;   
     
     do{ 
         System.out.println("***** Menu da Calculadora *****");
         System.out.println("Opção 1 - Cálculo do Quadrado");  
         System.out.println("Opção 2 - Cálculo do Cubo");   
         System.out.println("Opção 3 - Identificar se o Número é Par ou Ímpar");  
         System.out.println("Opção 0 - Para encerrar o sistema");
         System.out.println("****************************");   
         System.out.print("Digite sua Opção: ");
         opc = entrada.nextInt();  
         
         if ((opc>=1) && (opc<=3)){
             System.out.print("Digite o número: ");
             num1 = entrada.nextInt();
         }        
         
         else{ 
         if(opc==0){
             System.out.println("Finalizando o Sistema");  
         }         
         else { 
             System.out.println("Opção Inválida! Digite um número entre 1 a 3"); 
              }        
         
         }      
         
         if(opc==1){
             res= num1*num1;
             
             System.out.println("O " +num1+ " elevado ao quadrado =" +res);
         }       
         
         if(opc==2){
             res= num1*num1*num1;    
             
             System.out.println("O " +num1+ " elevado ao cubo =" +res);
         }      
         if (opc==3){
              res = num1 % 2; 
              
         if (res==0){  
             
             System.out.println("o número " +num1+ " é par"); 
         }       
         
         else{ 
             System.out.println("o número " +num1+ " é ímpar"); 
             
              }        
         
         }
      }
    
     
