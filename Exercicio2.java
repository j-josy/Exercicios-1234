import java.util.Scanner;

  public class Exercicio2 {

      public  static void main(String[] args){

     Scanner teclado = new Scanner(System.in);
          System.out.println("Digite o ano bisexto");
          int anoBisexto = teclado.nextInt();

           if(anoBisexto %4 == 0 && anoBisexto % 100 != 0){

              System.out.println("É ano bisexto");
              int exercicio2 = teclado.nextInt();
            }else if(anoBisexto % 4 == 0 && anoBisexto % 300 == 0 && anoBisexto % 400 == 0){

             
                System.out.println( "Não é ano bisexto"); 
            

             }else{ 
          }

          
      }
    
}


