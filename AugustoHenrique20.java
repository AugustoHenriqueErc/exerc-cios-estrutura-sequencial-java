/*
Faça um algoritmo que receba o número de horas trabalhadas, o valor do salário mínimo e o número de
horas extras trabalhadas. Calcule e mostre o salário a receber seguindo as seguintes regras:
a) O valor a ser pago por hora trabalhada é 0.125 do salário mínimo;
b) O valor a ser pago por hora extra vale 0.25 do salário mínimo;
c) o salário bruto equivale ao número de horas trabalhadas vezes o valor pago por hora;
d) a quantia a receber por horas extras equivale à horas extras realizadas multiplicado pelo valor pago
por hora extra;
e) o salário a receber equivale à soma do salário bruto mais a quantia a receber pelas horas extras.
*/

import java.util.Scanner;
   public class AugustoHenrique20
   {
      public static void main(String []args)
      {
      Scanner teclado = new Scanner(System.in, "ISO-8859-1");
      
      double horasT, salar, horasEx, salarBruto, valHoraT, valHoraEx, salarBrut, salarEx, salarReceb;
      
      System.out.print("Digite o número de horas trabalhadas, o valor do salário mínimo, número de horas extras trabalhadas\n");
      horasT = teclado.nextDouble();
      salar = teclado.nextDouble();
      horasEx = teclado.nextDouble();
      
      valHoraT = salar * 0.125;
      valHoraEx = salar * 0.25; 
      salarBrut = horasT * valHoraT;
      salarEx = horasEx * valHoraEx;
      salarReceb = salarBrut + salarEx;
      
      System.out.printf("O salário a receber é %.2f", salarReceb);
      
      teclado.close();
      }
   }