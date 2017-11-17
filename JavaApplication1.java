
package javaapplication1;

import java.io.InputStream;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double q , w , y ;
        double max = 0;
        System.out.println("Qual o primeiro número?");
        q= ler.nextDouble();
        System.out.println("Qual o primeiro número?");
        w= ler.nextDouble();
        System.out.println("Qual o primeiro número?");
        y= ler.nextDouble();
        
        if(q>w)
        if(q>y)
        max = q;
        
        
        if(w>q)
        if(w>y)
        max=w;
        
        
        if(y>q)
        if(y>w)
        max=y;
        
        System.out.println("O maximo é" +max);
                
    }

  
    }
  

   
    

