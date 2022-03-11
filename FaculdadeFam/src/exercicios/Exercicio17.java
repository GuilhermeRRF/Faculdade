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
public class Exercicio17 {    
    
public static void main(String[] args) {
   
    int cont,multiplicador,res;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Qual taboada você quer ? ");
    multiplicador=entrada.nextInt();
    
    System.out.println("********Taboada do "+multiplicador+"**********");
    
    cont=0;
    
    while(cont<11){
        res=multiplicador*cont; 
        
        System.out.println(+multiplicador+"x"+cont+"+"+res);
        cont++;
    }
}
}