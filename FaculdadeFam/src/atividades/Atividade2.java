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
public class Atividade2 {
    //A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos: lata
    //de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra
    //uma determinada quantidade de cada formato, faça um algoritmo para calcular 
    //quantos litros de refrigerante ele comprou. Segue abaixo o exemplo da execução.

public static void main(String[] args) {
    
double lata, garrafa600ml, garrafa2l, total, lata_litro, garrafa600ml_litro, garrafa2l_litro;
Scanner entrada = new Scanner(System.in);

System.out.println("Digite a quantidade de latas compradas: ");
lata=entrada.nextDouble();

System.out.println("Digite a quantidade de garrafas de 600 ml compradas: ");
garrafa600ml=entrada.nextDouble();

System.out.println("Digite a quantidade de garrafas de 2l compradas: ");
garrafa2l=entrada.nextDouble();

lata_litro=350*lata/1000;
garrafa600ml_litro=600*garrafa600ml/1000;
garrafa2l_litro=garrafa2l*2;
total=lata_litro+garrafa2l_litro+garrafa600ml_litro;

System.out.println("Foram compradas "  +lata + " de latas de 350ml, portanto foram comprados " +lata_litro+ " de refrigerante nesse formato");
System.out.println("Foram compradas " +garrafa600ml+ " de garrafas de 600ml, portanto foram comprados " +garrafa600ml_litro+ " de refrigerante nesse formato");
System.out.println("Foram compradas " +garrafa2l+ " de garrafas de 2l, portanto foram comprados " +garrafa2l_litro+ "de refrigerante nesse formato" );
System.out.println("Foram compradas " +total+ " de litros de refrigentes no Total.");



    }

}

