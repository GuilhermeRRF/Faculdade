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
public class Exercicio4 {
    /*faça um algoritmo que o usuario informa seu nome,a sua taxa de comissão e o
    //salário basesabendo que o código deve calcular o salário total e apresentar 
    todos esses valores1000*10/1005000*15/100*/
    
public static void main(String[] args) {
    
    
double sal_base,comissao,sal_total,taxa;
String funcionario;

Scanner entrada=new Scanner(System.in);

System.out.print("Digite o Nome do Funcionário: ");
funcionario=entrada.nextLine();

System.out.print("Digite o valor do Salário Base: ");
sal_base=entrada.nextDouble();

System.out.print("Digite o valor da taxa de comissão: ");
taxa=entrada.nextDouble();

comissao=((sal_base*taxa)/100);
sal_total=sal_base+comissao;

System.out.println(" ");
System.out.println("********RELATÓRIO DE SALÁRIO E COMISSÃO****");
System.out.println("Nome do Funcionário: "+funcionario);
System.out.println("Salário Base :  "+sal_base);
System.out.println("Taxa de Comissão :  "+taxa +"%");
System.out.println("Valor  de Comissão :  "+comissao);
System.out.println("Salário Total:  "+sal_total);
System.out.println("********FIM DO RELATÓRIO ******************");


  }

}