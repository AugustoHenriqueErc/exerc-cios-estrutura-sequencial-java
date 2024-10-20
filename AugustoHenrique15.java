/*
Faça um algoritmo que calcule a área de uma circunferência, recebendo o valor do raio. Obs.: Defina PI
como constante de valor 3.1416.
*/

import java.util.Scanner;
   public class AugustoHenrique15
   {
      public static void main(String []args)
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
         
      double pi, r, area;
         
      System.out.print("Digite o valor do raio\n");
         
      r = teclado.nextDouble();
      pi = 3.1416; 
      area = Math.pow(pi, 2)*r;
         
      System.out.printf("O valor da área é:%.2f ", area);
      teclado.close(); 
      }
   }