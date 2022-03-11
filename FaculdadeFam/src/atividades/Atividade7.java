/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividades;
import java.util.Scanner;
/**
 *
 * @author romei
 */
public class Atividade7 {
    //Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando
    //o  preço  normal  de  etiqueta  e  a  escolha  da  condição  de pagamento. Utilize
    //os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e
    //efetuar o cálculo adequado. Código Condição de pagamento:1 À vista em dinheiro ou 
    //cheque, recebe 10% de desconto 2 À vista no cartão de crédito, recebe 15% de 
    //desconto 3 Em duas vezes, preço normal de etiqueta sem juros 4 Em duas vezes, preço
    //normal de etiqueta mais juros de 10%Obs.: Caso o usuário informe um código que não 
    //esteja na lista acima, o algoritmo deve produzir uma mensagem de código inválido.

public static void main(String[] args) {
    
int cod1, cod2, cod3, cod4, etiqueta, cod_pag, cod1_pag, cod2_pag, cod3_pag; 
Scanner entrada = new Scanner(System.in);

System.out.println("Digite o valor da etiqueta: ");
etiqueta=entrada.nextInt();

System.out.println("Digite o codigo da condição de pagamento:  ");
cod_pag=entrada.nextInt();

    cod1=etiqueta*10/100;
    
    cod2=etiqueta*15/100;
    
    cod3=etiqueta/2;
    
    cod4=etiqueta*10/100+etiqueta;
    
    cod1_pag=etiqueta-cod1;
   
    cod2_pag=etiqueta-cod2;
    
    cod3_pag=etiqueta;
    
    
if (cod_pag==1){  
System.out.println("Codigo 1 - a vista em dinheiro ou cheque, recebe 10% de desconto.");
System.out.println("Seu desconto é de "+cod1);
System.out.println("O valor a ser pago sao de "+cod1_pag);
}
      if (cod_pag==2){       
System.out.println("Codigo 1 - é vista em dinheiro ou cheque, recebe 10% de desconto.");
System.out.println("Seu desconto sao de "+cod2);
System.out.println("O valor a ser pago sao de "+cod2_pag);
}
if (cod_pag==3){
    System.out.println("Codigo 3 - Em duas vezes, preço normal da etiqueta sem juros.");
System.out.println("Nao tem desconto. Valor da Parcela "+cod3);
System.out.println("O valor a ser pago sao de "+cod3_pag);
}
if (cod_pag==4){
    System.out.println("Codigo 4 Em duas vezes, preÃ§o normal de etiqueta mais juros de 10%.");
System.out.println("Voce tem juros de "+cod1);
System.out.println("O valor a ser pago sao de "+cod4);
}
else {
    System.out.println("Codigo Invalido!");
    
}


     }

}
