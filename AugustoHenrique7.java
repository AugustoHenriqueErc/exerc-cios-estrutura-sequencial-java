/*
Faça um algoritmo que calcule a área e o perímetro de um retângulo recebendo de entrada os valores dos
lados.
*/

import java.util.Scanner;
   public class AugustoHenrique7
   {
      public static void main(String []args)
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      double l1, l2, area, perim;
      
      System.out.printf("Digite o valor dos dois lados do retângulo\n");
      l1 = teclado.nextDouble();
      l2 = teclado.nextDouble();
     
      area = l1 * l2;
      perim = 2 * (l1 + l2);
      
      System.out.printf("A Área do retângulo é: %.2f\nO Perímetro do retângulo è: %.2f", area, perim);
      
      teclado.close();
      }
   }