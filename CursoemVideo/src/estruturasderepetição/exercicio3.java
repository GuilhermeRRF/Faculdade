/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturasderepetição;

/**
 *
 * @author romei
 */
public class exercicio3 {
    
    public static void main (String[] args){
    
     int cc=0;
     
     while(cc<=10){
         cc++;
         
         if(cc==4||cc==6||cc==8){
             continue; // vai ignorar o comando de baixo e voltar no loppin que é a codição 
         }
     
         if(cc==7){
             break; // ele vai finalizar a execução sem escolher se ele é falso ou verdadeiro ou sim ou não.
         }
         
         System.out.println(" cambalhota"+cc);
         
     }
    
        
        
        
   
    
}
    
}
