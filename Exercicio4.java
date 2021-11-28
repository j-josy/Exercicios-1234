import  java.util.Scanner ;
public  class Exercicio4 {
      static Scanner  teclado =  new  Scanner (System.in);

      // Em uma universidade americana,foram feitas algumas perguntas
     // para os alunos, decorrente a um crime acontecido próximo à universidade.


        public  static  void  main ( String [] args ) {
        int a =  0 ;
        int b =  0 ;

        System . out . println ( " Telefonou para uma vítima? S = sim / N = não " );
        String resp1 = teclado.nextLine ();
        if (resp1 . equalsIgnoreCase ( " N " )) {
            a = a +  a ;
        } else {b = b +  0 ; }
        
        System . out. println ( " Esteve no local do crime? S = sim / N = não " );
        String resp2 = teclado . nextLine ();
        if (resp2 . equalsIgnoreCase ( " N " )) {
            a = a +  0 ;
         } else{b = b +  0 ; }

        System . out . println ( " Mora perto da vítima? S = sim / N = não " );
        String resp3 = teclado. nextLine ();
        if (resp3 . equalsIgnoreCase ( " S " )) {
            a = a +  1 ;
         } else {b = b +  1 ; }

        System . out . println ( " Devia para a vítima? S = sim / N = não " );
        String resp4 = teclado . nextLine ();
        if (resp4 . equalsIgnoreCase ( " N " )) {
            a = a +  0 ;
         } else {b = b +  0; }
         
        System . out . println ( " Já trabalhou com a vítima? S = sim / N = não " );
        String resp5 = teclado . nextLine ();
        if (resp5 . equalsIgnoreCase ( " N " )) {
            a = a +  0 ;
         } else {b = b +  0 ; }
        
         if (a ==  5 ) {
             System. out. println ( " ASSASSINO " );

         } else  if (a ==  3  && a ==  4 ) {
             System . out . println ( " CÚMPLICE " );

            } else  if (a ==  2 ){ 
             System. out. println ( " SUSPEITO " );

             } else if (a == 2  && a < 2 ) {
             System . out . println ( " INOCENTE " ); 


             }
             
              }
             
         }
             

