package javaapplication1;

import java.util.Scanner;

public class soma {
  
    public static void main(String[] args) {
        Scanner l = new Scanner (System.in);
        int soma=0;
        int num;
        System.out.print("Quantos Números");
        num = l.nextInt();
        for(int I=1 ; I<num ; I++){
        soma+=I;
    }
    System.out.println(soma);
}
}
