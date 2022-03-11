/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturasderepetição;

/**
 *
 * @author romei
 */
import java.util.Scanner;
public class exercicio9 {
    
    public static void main(String [] args){
        
        
    int opc,codigo;
    
    Scanner teclado=new Scanner(System.in);
    
    do{//lop
	        System.out.println("***** Bem vindo *****");    
	        System.out.println("Opção 1 - Funcionario");
	        System.out.println("Opção 2 - Cliente");
	        System.out.println("Opção 0 - Sair");
        	System.out.println("****************************");    
	        System.out.print("Digite sua Opção: "); 
                opc = teclado.nextInt();
	
	        if ((opc>=1) && (opc<=2)){
	   
	        }
	        else{
	            if(opc==0){
	                System.out.println("Obrigado até a proxima");
	            }
	            else {
	                    System.out.println("Opção Inválida! Digite 1 ou 2");
	            }
	        }
	
	        if(opc==1){
		        
		        
		        System.out.print("Digite seu codigo de acesso: ");//pede o codigo para confirmar se é um funcionario
                        codigo = teclado.nextInt();
        
            if(codigo == 123){//verifica se o codigo de acesso esta correto
                
            
              if(opc==01){
                  System.out.println("Bem vindo");
              }
                    do{
            	        System.out.println("***** Bem vindo *****");    
            	        System.out.println("Olá Bem Vindo! Digite uma das opções");
                        System.out.println("opção 01 acesso ao estoques");
                        System.out.println("opção 02 acesso a dados dos funcionarios ");
                        System.out.println("opção 00 para sair");
                        System.out.print("Digite sua Opção: "); 
                        opc = teclado.nextInt();
            	
            	        if ((opc>=1) && (opc<=2)){
                            
            	        }
            	        else{
            	            if(opc==0){
            	                System.out.println("Obrigado");
            	            }
            	            else {
            	                    System.out.println("Opção Inválida! Digite um número entre 1 a 2");
            	            }
            	       }
            	
            	        if(opc==1){  
            		      
                                 System.out.println("Olá Bem Vindo ao Estoque!");
                                 System.out.println("Xbox Disponivel");
                                 System.out.println("Playstation 5");}
            	
            	        if(opc==2){
            	            
            	            System.out.println("  ");
            		        System.out.println(" Dados do funcionario");
                                System.out.println("Nome:Guilherme  Idade:17 anos Local de Moradia:zona leste Cargo:gerente");}
            		      
                 
                    
                    
            
       

	        if(opc==1){
	            System.out.println("");
		        System.out.println("Bem vindo Cliente ");
		        System.out.println("");}
		        
		  
	       
	        
	if(opc==2){//Início produto Laranja
	            
	                System.out.println("Informe a quantidade de Laranjas que você vai Comprar:");
                		
        }       
		            	   
            	   	}while (opc!=0);

            	           //*******************************************************************************             
            
                    
                    }while (opc!=0);
                 
    
              else{//avisa que o codigo de acesso esta errado
                System.out.println("Codigo de acesso incorreto");
                    }
    }
    
    
    }  
      //*******************************************************************************             
    

    
    

                        
                        
	
                         		
