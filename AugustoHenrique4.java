/*
Faça um algoritmo que receba 3 notas e seus respectivos pesos, calcule e mostre a media ponderada dessas
notas.
*/

import java.util.Scanner;
   public class AugustoHenrique4
   {
      public static void main(String []args)
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      double nota1, nota2, nota3, peso1, peso2, peso3, med;
      
      System.out.print("Digite a primeira nota, e seu respectivo peso\n");
      nota1 = teclado.nextDouble();
      peso1 = teclado.nextDouble();
      System.out.print("Digite a segunda nota, e seu respectivo peso\n");
      nota2 = teclado.nextDouble();
      peso2 = teclado.nextDouble();
      System.out.print("Digite a tereira nota, e seu respectivo peso\n");
      nota3 = teclado.nextDouble();
      peso3 = teclado.nextDouble();
      
      med = (nota1*peso1)+(nota2*peso2)+(nota3*peso3);
      
      System.out.printf("A média ponderada entre as três notas é de: %.2f", med);
       
       teclado.close();
      }
   
   }