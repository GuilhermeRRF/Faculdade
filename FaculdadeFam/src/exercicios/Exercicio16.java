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
public class Exercicio16 {
    
public class Main{public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    

String opc;
int soma;
opc="x";
soma=0;

System.out.print("digite a opção: + para somar ");
opc=entrada.nextLine();//capturar a linha inteira

if (opc.equals("+")){
    System.out.println("******Operação Escolhida: Adição*******");  
    
    do{ 
        System.out.println("Digite o número ou = para ver o resultado: ");
        opc=entrada.nextLine();
        
        if(opc.equals("=")){   
            System.out.println("O resultado da soma é: " +soma );  
        }   
        
        else{    
            int num1 = Integer.parseInt(opc);  
            soma=soma+num1;   
            
            System.out.print( " + \n");  
            
            }    }while (!opc.equals("=")); }
        }
      

      }

}
    
 
     





