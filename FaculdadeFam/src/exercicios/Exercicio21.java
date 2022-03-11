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
public class Exercicio21 {
        public static void main(String[] args) { 
            

  // Faça um programa que receba a idade, o peso, a altura,de 5 pessoas e calcule e mostre na tela:  
  // A quantidade e a porcentagem de pessoas com idade superior a 50 anos epeso inferior a 60 quilos;   
  // A média das idades das pessoas com altura inferior a 1.50;     A percentagem de pessoas com peso superior a 100 kgs;
  // *********************/import java.util.Scanner;
  
  int cont,idade,qtde;
  double peso, altura,tx;
  
  Scanner entrada = new Scanner (System.in);
  
  cont=0;
  idade=0;
  qtde=0;
  peso=0;
  altura=0;
  tx=0;
  
  for (cont=1;cont<=5;cont++){
      System.out.println("Dados da Pessoa: "+cont);
      
      System.out.print("Digite a idade: ");
      idade=entrada.nextInt();
      
      System.out.print("Digite o peso: ");
      peso=entrada.nextDouble();
      
      System.out.print("Digite a altura: ");
      altura=entrada.nextDouble();
      
      if((idade>50) && (peso<60)){
          
          qtde++;
          
          }
     }
  
       tx= (qtde*100/5);
       System.out.println("A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kgs é: "+qtde);
       System.out.println("A porcentagem de pessoas com idade superior a 50 anos e peso inferior a 60 kgs é: "+tx + "%");
        
      
        
        
        }

    }
            
            
            
            
            
            
   
