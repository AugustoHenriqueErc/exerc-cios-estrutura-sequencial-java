/*
Sabe-se que o valor pago por quilowatt de energia custa um quinto do valor do salário mínimo. Faça um
algoritmo que receba o valor atual do salário mínimo e a quantidade de quilowatt consumida em uma
residência, calcule e mostre:
a. O valor pago por quilowatt;
b. O valor a ser pago pelo consumo nessa residência;
c. O valor a ser pago considerando um desconto de 15%.
*/

import java.util.Scanner;
   public class AugustoHenrique18
   {
      public static void main(String []args)
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      double sal, qtdQuiloW, quiloW, valor, valorDesc;
      
      System.out.print("Digite o valor do salário mínimo e a quantidade de quilowatts consumidos no mês\n");
      sal = teclado.nextDouble();
      qtdQuiloW = teclado.nextDouble();
      
      quiloW = sal/7;
      valor = quiloW*qtdQuiloW;
      valorDesc = valor*0.85;
      
      System.out.printf(" a): %.2f\n b): %.2f\n c): %.2f", quiloW, valor, valorDesc);          
      
      teclado.close();
      }
   }