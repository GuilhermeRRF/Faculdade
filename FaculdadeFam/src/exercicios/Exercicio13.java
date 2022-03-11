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
public class Exercicio13 {
    
    /***************Online Java Compiler.Code, Compile, Run and Debug java program online.Write your code in this editor and press "Run" button to execute it.*******************/
    
    public class Main{
        public static void main(String[] args) {
            
            int cont;
            cont=0;  
            
            System.out.println("Loop com while");
            
            while(cont<=10){
                
                System.out.println("PosiÃ§Ã£o:" +cont);  
                cont++;   
                } 
            
                cont=0;   
                System.out.println("Loop com do ...while");
                
                do{ 
                    
                    System.out.println("PosiÃ§Ã£o:" +cont);
                    cont++;   
                }
                
                while (cont<=10);
                
                System.out.println("Loop com for"); 
                for(cont=0;cont<=10;cont++){
                    
                    System.out.println("PosiÃ§Ã£o:" +cont);  
                }
           }
    
        
        
        
      }
    
 }
