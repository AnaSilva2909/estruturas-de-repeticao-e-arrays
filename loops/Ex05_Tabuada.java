import java.util.Scanner;
/*
 Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número  inteiro entre 1 a 10. O usuário deve informar  de qual  numero ele desja ver a tabuada.
 A saida deve ser conforme o exemplo abaixo:

 Tabuada de 5:
 5 x 1 = 5
 5 x 2 = 10
 ...
 5 x 10 = 50
 */
public class Ex05_Tabuada {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
     
   
     System.out.println("Tabuada: ");
     int tabuada = scan.nextInt();

     
     for(int i = 1;i <= 10; i++){
        System.out.println(tabuada + "x" + i + " = " + (tabuada*i) );

     }



  }

}
