/*
Implemente m programa que receba um número positivo, calcule e mostre:
 O número digitado elevado ao quadrado;
 O número digitado elevado ao cubo;
 A raiz quadrada do número;
 A raiz cúbica do número.
*/

import java.util.Scanner;
   public class AugustoHenrique19
   {
      public static void main(String []args)
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      double num, numQuad, numCub, numSqrt, numScrt;
      
      System.out.print("Digite um número\n");
      num = teclado.nextDouble();
      
      numQuad = Math.pow(num,2);
      numCub = Math.pow(num,3);
      numSqrt = Math.sqrt(num);
      numScrt = Math.cbrt(num);
      
      System.out.printf("O quadrado deste número é: %.2f\nO cubo deste número é: %.2f\nA raiz quadrada deste número é: %.2f\nA raiz cubica deste número é: %.2f\n",numQuad, numCub, numSqrt, numScrt);
      teclado.close();
      }
   }