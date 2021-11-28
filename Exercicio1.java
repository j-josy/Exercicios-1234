import java.util.Scanner;

  public class Exercicio1 {
      public void exercicio1(){

          Scanner teclado = new Scanner(System.in);
          System.out.println("Digite o primeiro lado:");
          int lado1 = teclado.nextInt();

          System.out.println("Digite o segundo lado:");
          int lado2 = teclado.nextInt();

          System.out.println("Digite o terceiro lado:");
          int lado3 = teclado.nextInt();

          if(lado1 + lado2 > lado3){

              System.out.println("Não é um triangulo");
            }else if (lado1 == lado2 && lado1 != lado3){  
             
                System.out.println( "É um triangulo Escaleno"); 
            } else if (lado1 == lado2 && lado1 == lado3){

                System.out.println( "É um triangulo Equilátero");
            }else{ 
                System.out.println("É um triangulo Isósceles");

          }

          teclado.close();
      }
    
}

