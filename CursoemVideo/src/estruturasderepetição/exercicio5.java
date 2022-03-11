/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturasderepetição;

/**
 *
 * @author romei
 */
import java.util.Scanner;
public class exercicio5 {
    
   public static void main (String[]args) {
   
       int numero, soma=0; //colocar a soma igual a zero para somar os valores
       String resp;
         
       Scanner teclado= new Scanner(System.in);
   
   
   /* faça*/do{
       System.out.println("Digite um numero");
       numero=teclado.nextInt();
       
       soma += numero;// obs: += que é a mesma coisa que soma = soma + numero;
       
       System.out.println(" Quer continuar ? [S/N]");
       resp=teclado.next();}// obs: deixar so next sem o restante para o usuario conseguir responder.
  
  
   /*equanto*/while(resp.equals("s"));/*enquanto minha resposta for "S" faça o mortal*/
                System.out.println("A soma de todos os valores é "+soma);
  
   }

}