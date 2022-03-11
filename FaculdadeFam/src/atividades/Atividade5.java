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
public class Atividade5 {
     //João  recebeu  seu  salário  de  R$  1200,00  e  precisa  pagar  duas  contas
    //(C1=R$  200,00  e  C2=R$120,00)  que  estão  atrasadas.  Como  as  contas estão 
    //atrasadas, João terá de pagar multa de 2% sobre cada conta. Faça um algoritmo que
    //calcule e mostre quanto restará do salário do João 

public static void main(String[] args) {
    
int num1, num2, result_dif, soma_igual; 

Scanner entrada = new Scanner(System.in);

System.out.println("Digite o valor do primeiro numero: ");
num1=entrada.nextInt();

System.out.println("Digite o valor do segundo numero: ");
num2=entrada.nextInt();

result_dif=num1*num2;
soma_igual=num1+num2;

if (num1!=num2){
    
System.out.println("Os numeros sao diferentes, o resultado da multiplição é"  +result_dif);
}
else {
    
System.out.println("Os numeros sao iguais, o resultado da soma é "  +soma_igual);
}


     }

}
