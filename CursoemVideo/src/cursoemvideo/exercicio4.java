/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoemvideo;

/**
 *
 * @author romei
 */
import java.util.Scanner
        ;
public class exercicio4 {
    

public static void main (String [] args){
    
String Nome,classe;
int salario;

Scanner teclado = new Scanner (System.in);

System.out.println("Qual seu nome?");
Nome=teclado.nextLine();

System.out.println("Digite o valor da sua renda");
salario=teclado.nextInt();

    
if((salario<=0)&&(salario<=999)){
    classe="D";
    System.out.println("Ola "+Nome+" seu salario é de"+salario+" e sua classe salarial é "+classe);
}
if((salario<=1000)&&(salario<=1999)){
    classe="C";
    System.out.println("Ola "+Nome+" seu salario é de "+salario+" e sua classe salarial é "+classe);
}
if((salario<=2000)&&(salario<=2999)){
    classe="B";
    System.out.println("Ola "+Nome+"seu salario é de "+salario+" e sua classe salarial é "+classe);
}
if(salario<=3000){
    classe="A";
    System.out.println("Ola "+Nome+" seu salario é de "+salario+" e sua classe salarial é "+classe);
}







   

   }
}
