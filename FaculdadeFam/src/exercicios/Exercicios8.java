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
public class Exercicios8 {
    //cLASSIFICAÇÃO SALARIAL0 - 999 -
    //cLASSE c1000 - 1999 - cLASSE b>2000 - CLASSE A
    public static void main(String[] args) {
        
        double salario;  
        String classe,nome;
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Digite seu nome: "); 
        nome=entrada.nextLine();
        
        System.out.print("Digite o valor do seu salário: ");
        salario=entrada.nextDouble();
        
        if ((salario>0) && (salario <=999)){
            classe ="C";
            
            System.out.println("Seu nome é "+nome+ " seu salário é "+salario+ " e sua classe salarial é "+classe);
            }
        
        if ((salario>1000) && (salario <=1999)){
            classe="B";
            
            System.out.println("Seu nome é "+nome+ " seu salário é "+salario+ " e sua classe salarial é "+classe);
            }
        
        if (salario>2000) {
            
            classe="A";System.out.println("Seu nome é "+nome+ " seu salário é "+salario+ " e sua classe salarial é "+classe);
        
            }
    
    }

}
       
       
   

