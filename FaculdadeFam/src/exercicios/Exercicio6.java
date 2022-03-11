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
public class Exercicio6 {
    
//Escreva um programa que o usuário informa seu nome, seu ano de nascimentoe o ano atual.
//O programa deve calcular a idade do usuário e informarse ele já pode se aposentar. 
//Sabendo que para se aposentar é necessário ter65 anos. Além disso, se o usuário não 
//puder se aposentar ainda, o programa deveinformar quantos anos faltam para a sua aposentadoria.   
public static void main(String[] args) {
    
    int ano_nasc, ano_atual, idade, anos_faltam; 
    
    String nome;Scanner entrada=new Scanner(System.in); 
    
    System.out.print("Digite seu nome: ");
    nome=entrada.nextLine();
    
    
    System.out.print("Digite o seu ano de nascimento: ");
    ano_nasc=entrada.nextInt();
    
    System.out.print("Digite o ano atual: ");
    ano_atual=entrada.nextInt();
    
    idade = ano_atual - ano_nasc;
    
    if (idade>= 65){
        
        System.out.println("Seu nome é " +nome+ " e Você tem " +idade+ " anos . Portanto pode se aposentar" );
        }
    else {anos_faltam = 65-idade;
    
        System.out.println("Seu nome é " +nome + " e Você tem " +idade+ " anos. Você ainda não pode se aposentar, pois faltam " +anos_faltam + " anos. ");
        }
    
    /*if (condicao){    o que deve acontecer se a condição for verdadeira}else {
    comandos que devem acontecer se a condição for falsa.}*/

   
  }

}
