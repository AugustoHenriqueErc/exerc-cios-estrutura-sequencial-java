/*
Faça um programa que receba de entrada um número real, encontre e mostre:
a. A parte inteira desse número;
b. A parte fracionária desse número.
*/

import java.util.Scanner;
   public class AugustoHenrique17
   {
      public static void main(String []args)
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      double num, pInte, pFrac;
      
      System.out.print("Digite um numero real:\n");
      num = teclado.nextDouble();
      
      pInte = Math.floor(num);
      pFrac = num - pInte; 
      
      System.out.printf("A parte inteira deste número é %.0f \nA parte fracionária deste número é: %.4f", pInte, pFrac);
      teclado.close();
      }
   }