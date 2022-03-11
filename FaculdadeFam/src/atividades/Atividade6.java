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
public class Atividade6 {
    //O IMC – Indice de Massa Corporal é um critério da Organização Mundial de  Saúde 
    //para  dar  uma  indicação  sobre  a  condição  de  peso  de  uma pessoa adulta.
    ///A fórmula é IMC = peso / ( altura )2 Elabore um algoritmo que leia o peso e a
    //altura de um adulto e mostre sua condição de acordo com a tabela abaixo. IMC em
    //adultos Condição Abaixo de 18,5 Abaixo do peso Entre 18,5 e 25 Peso normal Entre
    //25 e 30 Acima do peso Acima de 30 obeso

public static void main(String[] args) {
    
double peso, altura, cal_imc, altura_cal; 
Scanner entrada = new Scanner(System.in);

System.out.println("Digite a sua altura: ");
altura=entrada.nextDouble();

System.out.println("Digite o seu peso: ");
peso=entrada.nextDouble();

altura_cal=altura*2;
cal_imc=peso/altura_cal;
if (cal_imc<18.5){
    
System.out.println("Seu IMC é " +Math.round (cal_imc)+ " e voce esta abaixo do peso.");
}
      if ((cal_imc>=18.5) && (cal_imc<25)){
          
System.out.println("Seu IMC é " +Math.round (cal_imc)+ " e voce esta com o peso normal.");
}
if ((cal_imc>=25) && (cal_imc<30)){
    
System.out.println("Seu IMC é " +Math.round (cal_imc)+ " e voce esta acima do peso.");
}
if (cal_imc>30){
    
System.out.println("Seu IMC é " +Math.round (cal_imc)+ " e voce esta esta obeso.");
}


    }

}

