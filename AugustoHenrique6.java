/*
Funcionários da IFVende tem como benefício a receber ao final de cada mês um salário fixo mais 4% de
comissão sobre as vendas realizadas pelo mesmo. Assim, faça um algoritmo que receba o salário fixo e o
valor de vendas realizadas por um funcionário, calcule e mostre o benefício a ser recebido pelo mesmo.
*/

import java.util.Scanner;
   public class AugustoHenrique6
   {
      public static void main(String []args)
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      double salarFixo, salarReceb, comis, vendas;
      
      System.out.printf("Digite o valor referente ao salário fixo, e as vendas realizadas pelo funcionário respectivamente\n");
      salarFixo = teclado.nextDouble();
      vendas = teclado.nextDouble();
      
      comis = vendas * 0.04;
      salarReceb = salarFixo + comis;
      
      System.out.printf("O salário a receber é: %.2f\n", salarReceb);
      teclado.close();
      }
  
   }
      