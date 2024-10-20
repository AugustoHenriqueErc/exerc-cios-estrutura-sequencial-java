/*
Sabe-se que, para iluminar corretamente os cômodos de uma casa, para cada m2, deve-se usar 18 W de
potência. Faça um programa que receba as dimensões de um cômodo retangular (em metros), calcule e
mostre a área de mesmo (em m2) e a potência de iluminação necessária para iluminar corretamente o
cômodo.
*/
import java.util.Scanner;
   public class AugustoHenrique14
   {
      public static void main(String []args)
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      double l1, l2, area, poten;
      
      System.out.print("Digite O o valor em metros referente aos dois lados cômodo\n");
      l1 = teclado.nextDouble();
      l2 = teclado.nextDouble();
      
      area = l1*l2;
      poten = area*18;
     
      System.out.printf("A potência de iluminação necessária para iluminar corretamente este cômodo é de: %.2f Watts",poten);
      teclado.close();
      }
   }      