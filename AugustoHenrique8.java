/*
Zé Borba Gato é dono de um terreno na cidade de Sabará e deseja saber qual seria o preço médio de venda
desse terreno. Conforme visto na planta do mesmo, nota-se que o lote possui um formato de trapézio. Assim sendo, dados os valores das medidas da base maior, base menor e da altura do terreno (em metros), e
sabendo o valor médio (R$) pago por metro quadrado no local onde se encontra o lote, calcule e mostre a área
total e o valor médio de venda (R$) que Zé Borba Gato pode pedir pelo terreno.
*/

import java.util.Scanner;
   public class AugustoHenrique8
   {
      public static void main(String []args)
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      double baseMenor, baseMaior, altura, area, valorMetro, valorLote;
      
      System.out.printf("Digite o valor da base maior, base menor e altura respectivamente\n");
      baseMaior = teclado.nextDouble(); 
      baseMenor = teclado.nextDouble();
      altura = teclado.nextDouble();
      System.out.printf("Digite o valor médio do m²\n");
      valorMetro = teclado.nextDouble();
      
      area = ((baseMaior * baseMenor) * altura) / 2;
      valorLote = area * valorMetro;
      
      System.out.printf("O a área do lote é: %.2f\nO valor do lote é: R$%.2f", area, valorLote);
      teclado.close();
      }
   }   