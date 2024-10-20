/*
Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber,
sabendo que esse funcionário possui uma gratificação de 10% sobre o salário base e paga 5% de imposto
sobre o valor acumulado (salário base + gratificação).
*/

import java.util.Scanner;
   public class AugustoHenrique5
   {
      public static void main(String []args)
      {
      Scanner teclado =  new Scanner(System.in, "ISO-8859-1");
      
      double salar, salarBase, salarReceb, grati, impos;
      
      System.out.printf("Digite o valor de seu salário\n");
      salarBase = teclado.nextDouble();
      
      grati = salarBase * 0.10;
      salar = salarBase + grati;
      impos = salar * 0.05;
      salarReceb = salar - impos;
      
      System.out.printf("O salário à receber é de: %.2f\n", salarReceb); 
      teclado.close();
      
      }
   
   }
   