/*Faça um programa que receba a medida do ângulo formado por uma escada apoiada e a altura da parede.
Calcule e mostre a medida da escada para que a ponta da parede possa ser alcançada.
*/
import java.util.Scanner;
   public class AugustoHenrique21
   {
      public static void main(String []args)
      {
      Scanner teclado = new Scanner(System.in "ISO-8859-1");
      
      double angA, medPared, medEscad, medChao, sqrtMedChao;
      
      System.out.print("Digite a medida do ângulo, da escada e da altura da parede");
      angA = teclado.nextDouble();
      medPared = teclado.nextDouble();
      medEscad = teclado.nextDouble();
      
      Math.pow(medChao,2) = Math.pow(medEscad,2) - Math.pow(medPared,2); 
      sqrtMedChao = Math.sqrt(medChao);
      
      System.out.print("A medida do da escada para que a ponta da parede possa ser alcançada ");
      teclado.close();
      }
   
   }