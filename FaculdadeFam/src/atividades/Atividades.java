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
public class Atividades {
    
    //A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade 
    //de broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao
    //final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas
    //(juntos), e quanto deve guardar numa conta de poupança  (10%  do  total  arrecadado). 
    //Você  foi  contratado  para  fazer  os cálculos para o dono. Com base nestes fatos,
    //faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular os 
    //dados solicitados. Segue abaixo o exemplo da execução.

public static void main(String[] args) {
    
double valor_total, broa, paes, valor_broa, valor_paes, poupanca;
Scanner entrada = new Scanner(System.in);

System.out.println("Digite a quantidade de paes vendidos: ");
paes=entrada.nextDouble();

System.out.println("Digite a quantidade de Broas vendidas: ");
broa=entrada.nextDouble();

valor_broa=1.50*broa;
valor_paes=0.12*paes;
valor_total=valor_broa+valor_paes;
poupanca=valor_total*0.1;

System.out.println("Total de vendas de Paeo: "+valor_paes);
System.out.println("Total de vendas de Broa: " +valor_broa);
System.out.println("Total de vendas: "+valor_total);
System.out.println("Valor para poupança: "+poupanca);


    }

}


        