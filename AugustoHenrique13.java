/*
A copa do mundo de futebol da FIFA é uma competição internacional que iniciou em 1930, acontecendo
desde então de 4 em 4 anos, exceto durante o período das guerras mundiais que impossibilitaram a
realização 2 copas mundiais. Sabendo dessas informações, faça um algoritmo em JAVA que dado o ano
atual calcule o número de copas já realizadas e exiba o resultado ao usuário.
(As copas voltaram a partir do ano de 1950)
*/

import java.util.Scanner;
   public class AugustoHenrique13
   {
      public static void main(String[] args)
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      double nCopas, nCopas2, nCopas3;
      int anoAtual;
      
      System.out.format("Digite o ano atual\n");
      anoAtual=teclado.nextInt();
            
      if(anoAtual>=1950){
         nCopas=((anoAtual-1930)/4)-1;
         System.out.printf("O número de copas realizadas até este ano é de: %.2f", nCopas);
         }
      else if(anoAtual>=1942 && anoAtual<1950){
         nCopas2=3;
         System.out.printf("O número de copas realizadas até este ano é de: %.2f", nCopas2);
         }
      else{
         nCopas3=((anoAtual-1930)/4)+1;
         System.out.printf("O número de copas realizadas até este ano é de: %.2f", nCopas3);  
         }
  
      teclado.close();
      }
   }