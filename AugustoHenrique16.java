/*
Faça um algoritmo que receba uma quantidade qualquer em minutos e converta em horas e minutos (utilize
divisão inteira e resto da divisão inteira).
*/

import java.util.Scanner;
   public class AugustoHenrique16
   {
      public static void main(String []args)
      {
         
         Scanner teclado = new Scanner(System.in, "ISO-8859-1");
         
         double minut, horas, rest;
         
         System.out.print("Digite o número de minutos\n");
         minut = teclado.nextInt();
         
         rest = minut % 60;
         horas = (minut - rest) / 60;
         
            if (horas<1)
            {
            System.out.printf("%.2f minutos",rest);
            }   
            
            else if (horas==1)
            {
            System.out.printf("%.2f hora e %.2f minutos", horas, rest);
            }
            
            else {
            System.out.printf("%.2f horas e %.2f minutos", horas, rest);
            }
         
         
      }
   }  