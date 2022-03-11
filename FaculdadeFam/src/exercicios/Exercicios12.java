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
public class Exercicios12 {
    
    public static void main(String[] args) {
        
    int res,cont,soma_par,soma_impar;
    soma_par=0;
    soma_impar=0;
    cont=0;
    System.out.print("Números Pares de 0 até 10 são: ");

while(cont<11){res=cont%2;

if(res==0){soma_par=soma_par+cont;

System.out.print(cont +",");
}
cont++;
}
System.out.println("- A soma dos números pares é: "+soma_par);

cont=0;

System.out.print("Números Ímpares de 0 até 10 são: ");

while(cont<11){res=cont%2;

if(res!=0){
    
    System.out.print(cont +",");
    soma_impar=soma_impar+cont;
}cont++;
}
System.out.println(" - A soma dos números ímpares é: "+soma_impar);
    
  
    }
    
}
