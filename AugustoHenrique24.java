import java.util.Scanner;
   public class AugustoHenrique24
   {
      public static void main(String []args)
      {
      Scanner teclado =  new Scanner(System.in, "ISO-8859-1");
      
      double a, b, c, delta, x1, x2, div;
      
      System.out.print("Digite os valores das variÃ¡veis a, b, c, respectivamente\n");
      a= teclado.nextDouble();
      b=teclado.nextDouble();
      c=teclado.nextDouble();
       
      if (a==0 && b==0) 
      {
      System.out.printf("A não há equação"); 
      } 
      else if (a == 0)
      {
      x1 = c/b;
      System.out.printf("A equação é do primeiro grau x = %.2f", x1);
      }
      else
      {
      delta = (Math.pow(b,2)) - 4*a*c;
         if (delta < 0)
         {
         System.out.print("A não há raiz real");
         }
         else if(delta == 0)
         {
         x1 = (-b + Math.sqrt(delta)) / (2*a);
         System.out.printf("Possui uma raiz real x1 = %.2f", x1);
         }
         else
         {
         x1 = (-b + Math.sqrt(delta)) / (2*a);
         x2 = (-b - Math.sqrt(delta)) / (2*a);
         System.out.printf("Possui duas raizes reais x1 = %.2f e x2 = %.2f", x1, x2);
         }
      }
      
      teclado.close();
      }
   
   }
   