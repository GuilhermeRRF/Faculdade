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
public class Exercicio20 {
  
    public static void main(String[] args) { 

       Scanner entrada = new Scanner(System.in);
       
       String opc;
       int soma,subtracao,cont,multiplicacao;
       opc="x";
       soma=0;
       subtracao=0;
       multiplicacao=1;
       
       System.out.print("digite a opção: + para somar, - para subtrair , * - para multiplicar: ");
       opc=entrada.nextLine();//capturar a linha inteira
       
       if (opc.equals("+"))
       
               {
           System.out.println("******Operação Escolhida: Adição*******"); 
           
           do{  
               System.out.println("Digite o número ou = para ver o resultado: "); 
               opc=entrada.nextLine(); 
               
               if(opc.equals("="))
               
               { 
                   System.out.println("O resultado da soma é: " +soma );  
               }   
               
               else{     
                   int num1 = Integer.parseInt(opc);
                   soma=soma+num1;     
                   
                   System.out.print( " + \n");  
                   
               }    }while (!opc.equals("=")); 
       }
       
       if (opc.equals("-"))
       
       
                {
           
           System.out.println("******Operação Escolhida: Subtração*******");
           
           do{
               System.out.println("Digite o número ou = para ver o resultado: ");
               opc=entrada.nextLine();  
               cont=1;  
               
               if(opc.equals("=")){   
                   System.out.println("O resultado da subtracao é: " +subtracao );
               }    
               
               else{   
                   int num2 = Integer.parseInt(opc);
                   
                   if(subtracao==0){    
                       subtracao=num2-subtracao;
                   }  
                   
                   else{    
                       subtracao=subtracao-num2;
                       
        }    System.out.print("- \n ");
               }    
           
           }while (!opc.equals("=")); 
        }
       
       if (opc.equals("*"))
       
             { 
           
           System.out.println("******Operação Escolhida: Multiplicação*******"); 
           
           do{ 
               System.out.println("Digite o número ou = para ver o resultado: "); 
               opc=entrada.nextLine();
               
               if(opc.equals("="))
               
             {   
                   
                   System.out.println("O resultado da multiplicação é: " +multiplicacao ); 
               }   
               
               else{ 
                   int num3 = Integer.parseInt(opc);
                   multiplicacao=multiplicacao*num3;  
                   
                   System.out.print( " x \n"); 
               
               }   
           
           }while (!opc.equals("="));}
           } 
   
      }
   
  
