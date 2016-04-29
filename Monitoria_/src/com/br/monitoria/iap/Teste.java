package teste;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Teste {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int qntedSal = 0, qntedFilhos=0;
        
        System.out.println("Digite a quantidade de pessoas que vão participar: ");
        int pess = scan.nextInt();
        
        for(int i=0; i<pess; i++){
            System.out.println("Quantos filhos você tem ?");
            int filhos = scan.nextInt();
            
            System.out.println("Qual seu salário ?");
            double sal = scan.nextDouble();
            
            if(sal>=350){
                qntedSal++;
                qntedFilhos = filhos + qntedFilhos;
            }
        }
        
        System.out.println(percentual350(qntedSal, pess));
        System.out.println(mediaFilhos(pess, qntedFilhos));
    }
    
    public static int percentual350(int qntedSal, int pess){
        
        return (qntedSal/pess)*10;
        
    }
    
    public static int mediaFilhos(int pess, int qntedFilhos){
        return qntedFilhos/pess;
    }
}
