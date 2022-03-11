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
public class Exercicio7 {
    //Escreva um programa que o usuário informa a base e a altura de um retângulo.
    //O programa deve calcular a área do retângulo (area=base*altura). O código deve
    //identificar seas dimensões informadas formam um retângulo ou um quadrado. 
    //A saber: o quadrado tem base igual aaltura.
   public static void main(String[] args) {
       
      int base, altura, area;
      Scanner entrada = new Scanner(System.in);
      
      System.out.print("Digite o tamanho da base: ");
      base=entrada.nextInt();
      
      System.out.print("Digite o tamanho da altura: ");
      altura=entrada.nextInt();
      
      area = base * altura;
      
      if (base == altura){
          System.out.println("O quadrado com base "+base+ " e altura " +altura+ " tem área :" +area);
      }
      else {System.out.println("O retângulo com base "+base+ " e altura " +altura+ " tem área :" +area);
      }
       
       
       
       }
   
   }