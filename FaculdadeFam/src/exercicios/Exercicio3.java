/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;
/**
 *
 * @author romei
 */
import java.util.Scanner; // biblioteca para ler o teclado
public class Exercicio3 {
    /*o usuario informa:nome completonome da disciplinanome do professornota da A1nota
    //da A2média ((a1+a2)/2)exibir a seguinte mensagemMeu nome é: José da Silva estudo a
    //disciplina de Lógica de Programação com o Professor Joao de Jesustirei as notas 5 e
    6 com média 5,5.*/
public static void main(String[] args) {
        
double a1,a2, media;

String aluno,professor,disciplina;

Scanner entrada = new Scanner(System.in);

System.out.print("Digite o nome do aluno:");

aluno=entrada.nextLine();

System.out.print("Digite o nome do professor:");
professor=entrada.nextLine();

System.out.print("Digite o nome da disciplina:");
disciplina=entrada.nextLine();

System.out.print("Digite o valor da primeira nota: ");
a1=entrada.nextDouble();

System.out.print("Digite o valor da segunda nota: ");
a2=entrada.nextDouble();

media=(a1+a2)/2;System.out.println("************RELATÓRIO FINAL*******");
System.out.println("Nome d(o/a) Alun(o/a): "+aluno);
System.out.println("Nome d(o/a) Professor(a): "+professor);
System.out.println("Nome da Disciplina: "+disciplina);
System.out.println("Nota A1: "+a1);
System.out.println("Nota A2: "+a2);
System.out.println("Média: "+media);
System.out.println("************FIM DO RELATÓRIO*******");

   }

}