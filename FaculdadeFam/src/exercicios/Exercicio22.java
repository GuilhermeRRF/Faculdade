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
public class Exercicio22 {
    public static void main(String[] args) { 
        
    
      /*    Faça um programa que receba a idade, o peso, a altura,de 10 pessoas e calcule e mostre na tela: 
      A quantidade e a porcentagem de pessoas com idade superior a 50 anos epeso inferior a 60 quilos; 
      A média das idades das pessoas com altura inferior a 1.50;   
      A percentagem de pessoas com peso superior a 100 kgs;********************************************/
    
int cont,idade,qtde_sup_50;
double peso,altura,tx_sup_50,med_inf,qtde_inf,qtde_sup_100,tx_sup_100;

Scanner entrada = new Scanner(System.in);

cont=0;idade=0;
peso=0;altura=0;
qtde_sup_50=0;
tx_sup_50=0;
med_inf=0;
qtde_inf=0;
qtde_sup_100=0;
tx_sup_100=0;

for(cont=1;cont<=10;cont++){System.out.print("Digite o peso da pessoa  " +cont + " :");
peso=entrada.nextDouble();

}System.out.print("Digite a altura da pessoa " +cont+ " :");
altura=entrada.nextDouble();

System.out.print("Digite a idade da pessoa " +cont+ " :");
idade=entrada.nextInt();

if ((idade>50) && (peso<60)){qtde_sup_50++;}

if(altura<1.50){med_inf=idade+med_inf;
qtde_inf++;
    

}
        
        
        
if(peso>100){
    qtde_sup_100++;
        
        }
        
   
        tx_sup_50=(qtde_sup_50*100)/10;
        med_inf=med_inf/qtde_inf;
        tx_sup_100=(qtde_sup_100*100)/10;
        
        System.out.println("Quantidade de Pessoas com Idade Superior a 50 anos e Peso Inferior a 60 kgs "+qtde_sup_50);
        System.out.println("Porcentagem de Pessoas com Idade Superior a 50 anos e Peso Inferior a 60 kgs " +tx_sup_50 +" %");
        System.out.println("A média da idade das pessoas com altura inferior a 1.50 é:  " +med_inf);
        System.out.println("A porcentagem de pessoas com peso superior a 100 kgs é:  " +tx_sup_100 +" %");
        
        }

    }