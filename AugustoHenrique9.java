/*
Implemente um algoritmo que receba o número de lados de um polígono convexo regular, calcule e mostre
o número de diagonais desse polígono. Sabe-se que ND = N*(N – 3)/2, em que N representa o número de
lados do polígono.
*/

import java.util.Scanner;
   public class AugustoHenrique9
   {
      public static void main(String []args)
      {
      Scanner teclado=new Scanner(System.in, "ISO-8859-1");
      
      double n, d;
      
      System.out.print("Digite o número de lados de um polígono:\n");
      n = teclado.nextDouble();
       
      d = n * (n-3)/2;
      
      System.out.printf("O número de diagonais deste polígono é: %.2f", d);
      
      teclado.close();
      }
   }