/*
Num dado momento, 3 canais de TV tinham, em sua programa��o, novelas em seu hor�rio nobre: canal A,
novela A, canal B, novela B, canal C novela C. Numa pesquisa com 3000 pessoas, perguntou-se quais
novela agradavam. Implemente um algoritmo que encontre o n�mero de telespectadores que nenhuma das novelas os agradam.
Receba as informa��es de prefer�ncias na entrada de dados e utilize as f�rmulas de teoria dos conjuntos.
*/

import java.util.Scanner;
   public class AugustoHenrique23
   {
      public static void main(String []args)
      {      
      double A, B, C, AB, AC, BC, ABC, totalVotos, totalParti, nNovela;
      
      ABC = 100;
      AB = 350 - ABC;
      AC = 400 - ABC;
      BC = 300 - ABC;
      A = 1450 - (ABC + AB + AC);
      B = 1150 - (ABC + AB + BC);
      C = 900 - (ABC + AC + BC);
      totalVotos = A + B + C;
      nNovela = 3000 - totalVotos;
      
      System.out.printf("O n�mero de telespectadores que nenhuma das novelas os agradam �: %.0f", nNovela);
     
      }
   }