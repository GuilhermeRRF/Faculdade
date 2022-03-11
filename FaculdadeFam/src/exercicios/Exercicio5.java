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
public class Exercicio5 {
    
 //Escreva um programa que o usuário informa seu nome, seu ano de nascimentoe o ano atual.
// O programa deve calcular a idade do usuário e informarse ele já pode dirigir ou não.
    

public static void main(String[] args) {
    int ano_nasc,ano_atual,idade;
    String nome;
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Digite o seu nome: ");
    nome=entrada.nextLine();
    
    System.out.print("Digite o ano do seu nascimento: ");
    ano_nasc=entrada.nextInt();
    
    System.out.print("Digite o ano atual: ");
    ano_atual=entrada.nextInt();
    
    idade=ano_atual - ano_nasc;
    
    if (idade>= 18){
        
        System.out.println("Seu nome é " +nome + " e sua idade é " +idade + " anos, portanto você PODE DIRIGIR");
         }
    else {System.out.println("Seu nome é " +nome + " e sua idade é " +idade + " anos, portanto você NÃO PODE DIRIGIR");
         }
    
    
   }
    
}
