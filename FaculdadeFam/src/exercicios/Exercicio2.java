/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author romei
 */
import java.util.Scanner;// biblioteca para ler o teclado
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2;
    
    Scanner entrada = new Scanner(System.in);
   
    System.out.println("Digite o valor do primeiro número");
   
    n1=entrada.nextInt();// captura o dado inteiro digitado pelo usuário
   
    System.out.println("Digite o valor do segundo número");
   
    n2=entrada.nextInt();// captura o dado inteiro digitado pelo usuário
    
    System.out.println("A soma de " +n1+ " com " +n2 + " resulta em " +(n1+n2));
    
    }
    
}
