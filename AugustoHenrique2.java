/*
Implemente um algoritmo que leia um número inteiro e imprima seu antecessor e seu sucessor.
*/

import java.util.Scanner;
   public class AugustoHenrique2
   {
      public static void main(String []args)
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      double num, suces, antec;
      
      System.out.print("Digite um número\n");
      num = teclado.nextDouble();
      suces=num+1;
      antec=num-1;
      
      System.out.printf("O antecessor deste número é: %.2f \nO sucessor deste número é: %.2f", antec, suces);      
      teclado.close();
      }
   
   }