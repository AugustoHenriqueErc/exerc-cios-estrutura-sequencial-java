/*
João recebeu seu salário e precisa pagar 2 contas atrasadas. Em razão do atraso, ele deverá pagar multa de
2% sobre cada conta. Faça um programa que receba o salário do João e o valor de cada conta, calcule e
mostre quanto restará de salário após o pagamento das duas contas.
*/

import java.util.Scanner;
   public class AugustoHenrique11
   {
      public static void main(String []args)
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      double conta1, conta2, multa, salarBruto, salar, montan;
      
      System.out.print("Digite o valor do: Salário, conta1 e conta2\n");
      salarBruto = teclado.nextDouble();
      conta1 = teclado.nextDouble();
      conta2 = teclado.nextDouble();
      
      multa = 0.02;
      montan = (conta1 + conta2) * (multa + 1);
      salar = salarBruto - montan;
      
      System.out.printf("O salário de João apoós o pagamento das duas contas é de: %.2f",salar);
      teclado.close();
      }
   }