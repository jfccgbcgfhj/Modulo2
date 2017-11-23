
package javaapplication2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class CalcularNotas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        double n1 , n2 , nf ;
        double nome = 0;
        
        System.out.println("Digite o nome do aluno");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        double userName = nome;
        
       
        System.out.println("Qual o primeiro nota?");
        n1= ler.nextDouble();
        System.out.println("Qual a segunda nota?");
        n2= ler.nextDouble();
        nf= n1 * 0.6 + n2 * 0.4;
        System.out.println("A Media e"+nf);
        if(nf>=10){
        System.out.println("Aprovado");
        }else{
        System.out.println("Reprovado");
    }
}
}

