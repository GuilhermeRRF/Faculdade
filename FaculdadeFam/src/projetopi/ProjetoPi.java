/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopi;
import java.util.Scanner;
/**
 *
 * @author romei
 */
public class ProjetoPi {
    
    public static void main(String[] args) {
         
         
  int codigo,escolha,estoque;//vai denir as aÃ§Ã´es
        
        int maça,laranja,manga,banana,morango;//vai armazenar a qunatidade que cada fruta tem
        int abobora,chuchu,beterraba,batata,cenoura;//vai armazenar a qunatidade que cada legume tem
        int alface,coentro,couve,alho_poro,rucula;//vai armazenar a qunatidade que cada verdura tem
        int alçafrao,pimenta_do_reino,sal,bicarbonato_de_sodio,colorau;//vai armazenar a quantidade que cada tempero tem
        
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Digite 1 para funcionario e 2 para cliente: ");//vai pedir para informar se Ã© um funcionario ou um cliente
        escolha = entrada.nextInt();
        
        if(escolha == 1){//define se Ã© um funcionario
            
            System.out.print("Digite seu codigo de acesso: ");//pede o codigo para confirmar se Ã© um funcionario
            codigo = entrada.nextInt();
        
            if(codigo == 123){//verifica se o codigo de acesso esta correto
               
                    System.out.println("Bem vindo");
                    System.out.print("Digite 1 para ver o estoque"); 
                    estoque = entrada.nextInt();
               
                    if(estoque == 1){//envia para o estoque
                    System.out.println("Estoque");
                    }
                    
            }
            
            else{//avisa que o codigo de acesso esta errado
                System.out.print("Codigo de acesso incorreto");
            }
        
        }
        if(escolha == 2){//define se Ã© um cliente
            System.out.print("Bem vindo cliente");
        }
  
	}
}

    