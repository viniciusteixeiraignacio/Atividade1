package br.com.satc.atividades;

import java.util.Scanner;

/**
 *
 * @author Markson
 */
public class Atividade1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1,n2,n3,nc;
        System.out.println("Informe a 1ª Nota");
        n1 = entrada.nextFloat();
        System.out.println("Informe a 2ª Nota");
        n2 = entrada.nextFloat();
        System.out.println("Informe a 3ª Nota");
        n3 = entrada.nextFloat();
        
        float media = (n1+n2+n3)/3;
        
        System.out.println("Informe a nota mínima para aprovação");
        nc = entrada.nextFloat();
        
        if (nc <= media){
            System.out.println("Você foi aprovado!\n Sua media: "+media+" \n Tchau");
            
        }else{
            System.out.println("O aluno tem direito a recuperação? (SIM/NÃO)");
            String direito = entrada.next();
            if (direito.toUpperCase().equals("SIM")){
                System.out.println("Informe qual a sua nota da recuperação: ");
                float nRec = entrada.nextFloat();
                
                float novaMedia = (media + nRec)/2;
                
                if(nc <= novaMedia){
                    System.out.println("Parabéns, você passou!\nSua média: "+novaMedia+" \n Tchau");
                }else{
                    System.out.println("Infelizmente você foi REPROVADO.\nSua média: "+novaMedia+" \n Adeus");
                } 
            }else{
             System.out.println("Infelizmente você foi REPROVADO.\nSua média: "+media+" \n Adeus");   
            }
        }
    }

}
