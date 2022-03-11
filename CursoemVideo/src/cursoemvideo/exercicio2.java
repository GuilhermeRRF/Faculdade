/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoemvideo;

/**
 *
 * @author romei
 */
import java.util.Scanner ;
public class exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
      String nome;
      int data_nascimento;
      
      Scanner entrada = new Scanner(System.in);
      
      System.out.println("Ola qual o seu nome?");
      nome=entrada.nextLine();
 
      
      System.out.println("Qual é a sua idade");
      data_nascimento=entrada.nextInt();

      if(data_nascimento>=18){
              System.out.println("Ola "+nome+" Você pode dirigir pois voce tem "+data_nascimento+" anos de idade");}
      
      else{
          
              System.out.println("Ola "+nome+" voce não pode dirigir pois voce tem "+data_nascimento);}
    
    
    
    
    
    
         }
      }
    
    
    
    
    




