/*
Implemente um algoritmo que receba 3 números reais de entrada. Calcule e mostre o resultado da
multiplicação dos dois primeiros números dividido pelo terceiro número fornecido pelo usuário. Sabe-se
que o denominador não pode ser zero, mas neste momento não se preocupe com as validações.
*/

import java.util.Scanner;
   public class AugustoHenrique3
   {
      public static void main(String []args)
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      double n1, n2, n3, opera;
      
      System.out.print("Digite o primeiro, segundo e terceiro número resspectivamente\n");
      n1 = teclado.nextDouble();
      n2 = teclado.nextDouble(); 
      n3 = teclado.nextDouble();
      
      opera = (n1 * n2) + n3;
      
      System.out.printf("O resultado da multiplicação do primeiro número com o segundo somado ao terceiro número é de: %.2f", opera);
      teclado.close();
      }
   
   }
   
