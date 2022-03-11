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
public class Exercicio24 {
    
    //três tipos de estruturas de repetiçõess  
    
        public static void main(String[] args) { 
      
        int cont;
        
        cont=0;
        System.out.println("Loop com while");
        while(cont<=10){
        System.out.println("Posição:"+cont);
        }
        
        cont=0;
        System.out.println("Loop com do... while");
        do{
            System.out.println("Posição:"+cont);
            cont++;
        
            {
        cont=1;
        System.out.println("Loop com do...while");
        do{
           System.out.println("posição:"+cont);
           cont++;
        }while (cont<=10);
            
        System.out.println("Loop com for");
        for(cont=0;cont<=10;cont++){
            System.out.println("Posição;"+cont);
        }
              
            
             
            }  
         
            }