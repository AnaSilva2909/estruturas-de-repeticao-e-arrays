import java.util.Random;

/*
 * Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num  vetor. Ao final mostre os números  e seus sucessores.
 */
public class Ex03_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0;i < numerosAleatorios.length; i++){
            int numeros = random.nextInt(100);
            numerosAleatorios[i] = numeros;

        }
        
        System.out.println("numeros Aleatórios: ");
       for(int numero : numerosAleatorios){
        System.out.println(numero + " ");

       }

       
       System.out.println("Antececessor dos numeros Aleatórios: ");
       for(int numero : numerosAleatorios){
        System.out.println((numero-1) + " ");

       }

       System.out.println("Sucessores dos numeros Aleatórios: ");
       for(int numero : numerosAleatorios){
        System.out.println((numero + 1) + " ");

       }
        
    }
}
