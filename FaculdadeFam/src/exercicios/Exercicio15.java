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
public class Exercicio15 {
    public class Main{public static void main(String[] args) {
        
        int cont;
        float nota, media;
        
        cont=0;
        
        Scanner entrada = new Scanner(System.in);media=0;nota=0;
        
        do{
            System.out.println("Digite a nota ou para sair digite -1");
            nota=entrada.nextFloat();   
            
            if (nota== -1){ 
                System.out.println("Saindo do Sistema!");  
            } 
            
            else {   
                media=nota+media;        
                
                cont++;    }
        
        }while (nota !=-1);
        media=media/cont;
        
        System.out.println("A media de notas Ã©:" +media);
        }
    
    
    
    }
}
