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
public class Atividade4 {
    

public static void main(String[] args) {
    
double salario, conta1, conta2, desc_conta1, desc_conta2, total_contas, result; 
Scanner entrada = new Scanner(System.in);

System.out.println("Digite o valor do salario: ");
salario=entrada.nextDouble();

System.out.println("Digite o valor da primeira conta: ");
conta1=entrada.nextDouble();

System.out.println("Digite o valor da segunda conta: ");
conta2=entrada.nextDouble();

desc_conta1=conta1*2/100+conta1;
desc_conta2=conta2*2/100+conta2;
total_contas=desc_conta1+desc_conta2;
result=salario-total_contas;

System.out.println("Seu salario "  +salario);
System.out.println("Total da primeira conta com multa de 2% "  +desc_conta1);
System.out.println("Total da segunda conta com multa de 2% "  +desc_conta2);
System.out.println("Valor geral das contas "  +total_contas);
System.out.println("Salario liquido "  +result);


     
    }

}

