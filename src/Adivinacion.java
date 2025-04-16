import java.util.Random;
import java.util.Scanner;

public class Adivinacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        int numeroSecreto = new Random().nextInt(100);

        while(true){
            System.out.println("Ingresa un número entre 0 y 100 para adivinar el número secreto");
            int numeroUsuario = teclado.nextInt();
            contador++;

            if (numeroSecreto == numeroUsuario){
                System.out.println("Felicidades, encontraste el número!");
                break;
            } else if (numeroUsuario < numeroSecreto){
                System.out.println("Intenta con un numero mayor");
            } else {
                System.out.println("El número es menor");
            }
        }
    }
}
