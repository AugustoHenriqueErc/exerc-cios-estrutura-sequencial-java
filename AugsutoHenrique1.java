/*
Crie um algoritmo que calcule a soma e a média de 3 números passados pelo usuário.
*/

import java.util.Scanner;
   public class AugsutoHenrique1
   {
      public static void main(String []args)
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      double n1, n2, n3, med, soma;
      
      System.out.print("Digite o primeiro, segundo e terceiro número respectivamente\n");
      n1 = teclado.nextDouble(); 
      n2 = teclado.nextDouble();
      n3 = teclado.nextDouble();
      
      soma=n1+n2+n3;
      med=soma/3;
      
      System.out.printf("A soma dos três números é: %.2f\nA média dos três números é: %.2f",soma, med); 
      teclado.close();
      }
   
   }
      
    