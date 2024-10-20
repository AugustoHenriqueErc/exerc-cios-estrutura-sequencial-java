/*
Uma pessoa depositou R$2000,00 em um fundo de investimento que rende 0.5% ao mês. Essa pessoa
gostaria de saber qual o total acumulado após 2 anos. Faça um programa que forneça tais informações.
(Obs. desconsidere correção monetária e utilize a fórmula de juros compostos).
*/
import java.util.Scanner;
   public class AugustoHenrique10
   {   
      public static void main(String []args) 
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      double m, c, i, t, i2, j;
      
      System.out.print("Digite o valor do capital inicial, a taxa e o tempo aplicado respectivamente\n");
      c = teclado.nextDouble();
      i = teclado.nextDouble();
      t = teclado.nextDouble();
      
      m = c * Math.pow(1+i,t);      
      System.out.printf("O montante é igual a: %.2f", m);
      
      teclado.close();
      }
   }