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
public class Exercicio23 {
        public static void main(String[] args) { 

        /*5-    Elabore um algoritmo que leia as variáveis C e N, respectivamente código 
        e número de horas trabalhadas de um operário. E calcule o salário sabendo-se que 
        ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso
        de pagamento armazenando-o na variável E, caso contrário zerar tal variável.
        A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o
        salário total e o salário excedente.*//**************************************
        * 11-   Faça uma Programa que receba duas notas de 6 alunos e calcule e imprima: 
        * A média entre essas 2 notas de cada aluno;
        * A mensagem de acordo com a tabela abaixo:Média Mensagem  
        * De 0 a 5.0 reprovado  
        * De 5.1 a 6.9 recuperação  
        * De 7.0 a 10 aprovado   
        * Total de alunos aprovados e o total de alunos reprovados;   
        * A média geral entre as médias dos alunos.**************************************/
        
        /*12-   Faça um programa que receba várias idades informadas pelo usuário,e que
        calcule e mostre a média das idades digitadas.Finalize digitando a idade igual a zero,
        não permitir idade < que 0,neste caso mostrar a mensagens de idade inválida edesconsiderar 
        este valor no cálculo da média..*//*14-   Cada espectador de um cinema respondeu a um 
        questionário no qualconstava sua idade e a sua opinião em relação ao filme:ótimo 
        – 3, bom – 2, regular – 1.Faca um programa que receba a idade e a opinião de 15 
        espectadores e quecalcule e mostre: 
        A média das idades das pessoas que responderam ótimo;
        
             A quantidade de pessoas que respondeu regular;
             A percentagem de pessoas que respondeu bom entretodos os espectadores analisados*/
        
        /*15-   Faça um programa que apresente o menu de opções a seguir: 
        Menu de opções:
   
        1. Média aritmética2. Média ponderada3. SairDigite a opção desejada.Na opção 1: receber duas notas,
        calcular e mostrar a média aritmética.Na opção 2: receber três notas e seus respectivos pesos, 
        calcular e mostrar a média ponderada.Na opção 3: sair do programa.Verifique a possibilidade de opção
        inválida, mostrando uma mensagem.*/    
            
            
         
        
        /*5-    Elabore um algoritmo que leia as variáveis C e N, respectivamente código e número de horas
        //trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando
        //o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso 
        //contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento
        //imprimir o salário total e o salário excedente.*/
        
        double n,e,vlr_hr,vlr_hr_extra,sal_total,sal_exc,qtde_hrs_trab;
        int c;Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o código do operário: ");
        c=entrada.nextInt();
        
        System.out.print("Digite o número de horas trabalhadas: ");
        n=entrada.nextInt();
        
        vlr_hr=10;
        vlr_hr_extra=20;
        
        if(n>50){    e=n-50;
        sal_exc=e * vlr_hr_extra;
        ]
        System.out.println ("Quantidade de horas Extras: "+e);
        System.out.println ("Valor da hora Extra: "+vlr_hr_extra);
        System.out.println ("Salário Excedente: "+sal_exc);
        }
        
        else{e=0;
        }
        qtde_hrs_trab=n-e;
        sal_total=qtde_hrs_trab*vlr_hr;
        
        System.out.println ("*******Código do Operário: "+c);
        System.out.println ("Quantidade de horas Trabalhadas: "+qtde_hrs_trab);
        System.out.println ("Valor da hora : "+vlr_hr);
        System.out.println ("Salário Total: "+sal_total); }}
        
         /*/**********11-   Faça uma Programa que receba duas notas de 6 alunos e calcule e imprima: 
        //A média entre essas 2 notas de cada aluno;   
        //A mensagem de acordo com a tabela abaixo:Média Mensagem  
        //De 0 a 5.0 reprovado   
        //De 5.1 a 6.9 recuperação
        //De 7.0 a 10 aprovado
        //Total de alunos aprovados e o total de alunos reprovados; 
        //A média geral entre as médias dos alunos.****************************/
        import java.util.Scanner;
        public class Main{public static void main(String[] args) {
         float nota1,nota2,media,cont_aprov,cont_reprov,media_geral,soma_geral;
         int cont;
         Scanner entrada = new Scanner(System.in);
         soma_geral=0;
         media_geral=0;
         cont_aprov=0;
         cont_reprov=0;
         
         for(cont=1;cont<=6;cont++){
             
             System.out.println("\n Notas do Aluno "+cont);
             System.out.print("Digite a nota 1:");
             nota1=entrada.nextFloat();
             System.out.print("Digite a nota 2:");
             nota2=entrada.nextFloat();
             media =(nota1+nota2)/2;
             soma_geral=soma_geral+media;
             if((media>=0) &&(media<5)){
                 System.out.println("Aluno Reprovado! Com Média: "+media);
                 cont_reprov++;
             }
             else{if(media>=5 && media<=6.9){
                 System.out.println("Aluno Recuperação!Com Média:" +media);
             }
             else{System.out.println("Aluno Aprovado!Com Média:" +media);
              cont_aprov++;
             }
             }
         }
         media_geral=soma_geral/6;
         System.out.println("A média geral é:"+media_geral);
         System.out.println("Total de alunos aprovados:"+cont_aprov);
         System.out.println("Total de alunos reprovados:"+cont_reprov);}}
        
        /*12-   Faça um programa que receba várias idades informadas pelo usuário,e que calcule 
        //e mostre a média das idades digitadas.Finalize digitando a idade igual a zero,não 
        //permitir idade < que 0,neste caso mostrar a mensagens de idade inválida edesconsiderar
        //este valor no cálculo da média..*/
        
        import java.util.Scanner;
        
        public class Main{
            public static void main(String[] args) {
        float idade,media,soma,cont;idade=0;
        media=0;soma=0;
        cont=0;
        Scanner entrada = new Scanner(System.in);
        do{       
            System.out.print("\n Digite a idade ou 0 para ver a média das idades: ");    
            idade=entrada.nextFloat();
            
            if (idade==0){ 
                System.out.print("\n Terminando o cálculo da média....");     
                cont--;        } 
            
            if(idade<0){   
                System.out.print("Idade Inválida....");     
            }
            else{   
                soma=soma+idade;    
                cont++;
        } 
        }
        while(idade!=0);
        media=soma/cont;
        
        System.out.println(" \n Qtde de Idades digitadas: "+cont);
        System.out.print(" A média das idades é: "+media);
        }
        }
        
        /*14-   Cada espectador de um cinema respondeu a um questionário no qualconstava sua idade 
        //e a sua opinião em relação ao filme:ótimo – 3, bom – 2, regular – 1.Faca um programa que 
        //receba a idade e a opinião de 15 espectadores e quecalcule e mostre:   
        //A média das idades das pessoas que responderam ótimo; 
        //A quantidade de pessoas que respondeu regular;   
        //A percentagem de pessoas que respondeu bom entretodos os espectadores analisados*/
        
        import java.util.Scanner;
        
        public class Main{
            
        public static void main(String[] args) {
        
        int idade,nota,cont=0,soma,media,quant1,quant2,quant3,tx_bom;
        idade=0;
        nota=0;
        soma=0;
        media=0;
        quant1=0;
        quant2=0;
        quant3=0;
        tx_bom=0;
        
        Scanner entrada = new Scanner(System.in);
        for(cont=0;cont<15;
                
        cont++){ 
        System.out.println("Digite a idade"); 
        idade=entrada.nextInt();
        
        System.out.println("Qual a nota do filme - ótimo – 3, bom – 2, regular – 1.  ");
        nota=entrada.nextInt();  
        if(nota==3 ){ 
            
        soma=soma+idade; 
        quant1++;   
        }   
        
        if(nota==1 ){ 
            quant2++;
        }    
        
        if(nota==2 ){        quant3++; 
        }
        }
        
        media=soma/quant1;
        tx_bom=quant3*15/100;
        
        System.out.println("A média das idades é: "+media);
        System.out.println("A quantidade de pessoas que respondeu regular é: "+quant2);
        System.out.println("A porcentagem de pessoas que responderam bom é: "+tx_bom +"%");
        }
        }
        
        /*15-   Faça um programa que apresente o menu de opções a seguir: Menu de opções:1. Média aritmética2.
        //Média ponderada3. SairDigite a opção desejada.Na opção 1: receber duas notas, calcular e mostrar a 
        //média aritmética.Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média
        //ponderada.Na opção 3: sair do programa.Verifique a possibilidade de opção inválida, mostrando uma mensagem.*/
        
        import java.util.Scanner;

        public class Main{
            
        public static void main(String[] args) {
        int opc;
        double nota1,nota2,media_ari,media_pond;opc=0;
        nota1=0;
        nota2=0;
        media_ari=0;
        media_pond=0;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("******Menu de Opções******");
        System.out.println("Opção 1 - Média Aritmética");
        System.out.println("Opção 2 - Média Ponderada");
        System.out.println("Opção 3 - Sair");
        System.out.print("Escolha a opção desejada: ");
        opc=entrada.nextInt();
        
        if (opc==1){
            System.out.println("Opção Escolhida: Média Aritmética");   
            System.out.println("Digite a primeira nota");
            nota1=entrada.nextFloat();
            
            System.out.println("Digite a segunda nota"); 
            nota2=entrada.nextFloat();
            media_ari=(nota1+nota2)/2; 
            
            System.out.println("A média arimética das notas é: "+media_ari); 
        }
        
        if (opc==2){ 
            System.out.println("Opção Escolhida: Média Ponderada");   
            System.out.println("Digite a primeira nota");
            nota1=entrada.nextFloat(); 
            
            System.out.println("Digite a segunda nota");
            nota2=entrada.nextFloat();  
            media_pond=(nota1*0.2+nota2*0.3);  
            
            System.out.println("A média ponderada das notas é: "+media_pond);
        }
        if(opc==3){   
            System.out.println("Saindo do Sistema!");
        }
        if((opc<1) || (opc >3)){ 
            System.out.println("Opção Inválida!");
            
             }
           }
        }