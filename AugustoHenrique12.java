/*
Dona Maria das Couve é uma mulher muito preocupada com sua saúde e busca a prática de exercícios
físicos constantes. Devido a crise financeira, Dona Maria está sem dinheiro para pagar academia, e teve
como alternativa fazer caminhada diária ao redor do quarteirão de sua casa. O quarteirão da casa dela
possui formato de um triângulo retângulo (figura abaixo), sabendo que ela deve caminhar um valor fixo de
km por dia e dadas as medidas das ruas A e B (em metros) da figura abaixo, calcule e mostre quantas
voltas Dona Maria precisa fazer no quarteirão para que ela atinja sua meta.
*/

import java.util.Scanner;
   public class AugustoHenrique12 
   {
      public static void main(String []args) 
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      double a, b, c2, c, meta, volta, totalVoltas, mV;
      
      System.out.printf("Digite o valor em KM, da extensÃ£o das ruas A, e B respecitvamente\n");
      a=teclado.nextDouble(); 
      b=teclado.nextDouble();
      System.out.print("Digite o valor em KM, da meta diÃ¡ria de corrida de Dona Maria das Couve\n");
      meta=teclado.nextDouble();
      
      c2 = Math.pow(a,2) + Math.pow(b,2);
      c = Math.sqrt(c2);
      volta = a+b+c;
      totalVoltas = meta/volta;
      mV = meta/volta;
      
      if(mV % 1 != 0) 
      {
      totalVoltas = Math.ceil(mV);
      System.out.printf("O valor de voltas que supera a meta diária de Dona Maria é: %.2f", totalVoltas);
      }
      else 
      {
      totalVoltas = mV;
      System.out.printf("O valor de voltas que é a meta diária de Dona Maria é: %.2f", totalVoltas); 
      }      
      
      teclado.close();
      }
   }