package br.com.satc.atividades;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Atividade2 {

    
     
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número : ");
        int n1 = entrada.nextInt();
        
        System.out.println("Digite o segundo número : ");
        int n2 = entrada.nextInt();
        System.out.println("Qual a operação matemática? (M,S,D,A)");
        char operacao = entrada.next().toUpperCase().charAt(0);
        switch (operacao){
            case 'M': {
                System.out.println("O resultado da multiplicação é : "+ (n1*n2));
                break;
            }
            case 'S': {
                System.out.println("O resultado da subtração é : "+ (n1-n2));
                break;
            }            
            case 'D': {
                System.out.println("O resultado da divisão é : "+ (n1+n2));
                break;
            }
            case 'A': {
                System.out.println("O resultado da adição é : "+ (n1+n2));
                break;
            }
            default :{
                System.out.println("A operação que você colocou eu nem \n"
                        + "programei ainda   :(   ");
            }
            
            
        }
        
                
        
        
        
        
    
    }
    
}
