import java.util.Scanner;

  public class Exercicio3 {
  

      public  static void main(String[] args){

          Scanner teclado = new Scanner(System.in);
          System.out.println("Digite o tipo de combustível, A=Alcool, G=Gasolina");
          System.out.println("Digite o valor com o desconto");
           String combustivel = teclado.nextLine();
            int litros = teclado.nextInt();

           if(combustivel == "A" && litros < 20){
            System.out.println("Total a pagar:"+ (litros *3.30)/0.02);
            
          }else if (combustivel == "A" && litros > 20){
            System.out.println("Total a pagar:"+ (litros *3.50)/0.04);
          }else if (combustivel == "G" && litros < 20){
            System.out.println("Total a pagar:"+ (litros *3.50)/0.06);
              }else{ 
                System.out.println("Total a pagar:"+ (litros *3.50)/0.01);

           
           

             
             
            

              
          }

          
      }
    
}


