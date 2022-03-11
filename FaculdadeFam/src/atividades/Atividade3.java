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
public class Atividade3 {
     // Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual, 
    //calcule e mostre:a) a idade dessa pessoa em anos; b) a idade dessa pessoa em meses;
    //c) a idade dessa pessoa em dias; d) a idade dessa pessoa em semanas.e) a idade dessa 
    //pessoa em horas.

public static void main(String[] args) {
    
double ano_nasc, ano_atual, semana_mes, meses_ano, idade, idade_meses, idade_dias, idade_semanas, idade_horas;
Scanner entrada = new Scanner(System.in);

System.out.println("Digite o seu ano de nascimento: ");
ano_nasc=entrada.nextDouble();

System.out.println("Digite o ano atual: ");
ano_atual=entrada.nextDouble();

meses_ano=12;
semana_mes= 4.345;

idade=ano_atual-ano_nasc;
idade_meses=idade*12;
idade_dias=idade*365;
    idade_semanas=(meses_ano*semana_mes)*idade;
    
    idade_horas=(24*365)*idade;
    
    
System.out.println("Voce tem "  +idade + " ANOS de vida ");
System.out.println("Voce tem "  +idade_meses + " MESES de vida ");
System.out.println("Voce tem "  +idade_dias + " DIAS de vida ");
System.out.println("Voce tem "  +idade_semanas + " SEMANAS de vida ");
System.out.println("Voce tem "  +idade_horas + " HORAS de vida ");


    }

}
