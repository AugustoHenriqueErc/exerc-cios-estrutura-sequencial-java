/*
Faça um algoritmo que leia dois valores numéricos e armazene nas variáveis A e B, após isso, efetue a
troca dos valores de forma que A passe a possuir o valor de B e B passe a possuir o valor de A. Imprima os
valores após troca.
*/

import java.util.Scanner;
   public class AugustoHenrique22
   {
      public static void main(String []args)
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      double A, B, b, a;
      
      System.out.print("Digite dois valores numéricos\n");
      A = teclado.nextDouble();
      B = teclado.nextDouble();
      
      System.out.printf("O valor das variaveis A e B antes da troca são: %.2f, %.2f\n", A, B);
      
      a = A;
      b = B;
      A = b;
      B = a;
                  
      System.out.printf("O valor das variaveis A e B após a troca são: %.2f, %.2f", A, B);
         
      teclado.close();
      }
   }