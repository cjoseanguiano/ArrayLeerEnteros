/*
Programa Java que lea 10 números enteros por teclado y los guarde en un array.
Calcula y muestra la media de los números que estén en las posiciones pares
del array.
 */
package arrayleerenteros;

import java.util.Scanner;

/**
 *
 * @author carlosjoseanguiano
 */
public class ArrayLeerEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numero = new int[3];
        Scanner entrada = new Scanner(System.in);
        int media = 0;

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Ingresa los numeros");
            numero[i] = entrada.nextInt();
        }

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] > 0) {
                if (numero[i] % 2 == 0) {
                    media = media + numero[i];
                }
            }
        }
        System.out.println("Esta es la media " + media);
        System.out.println("Media de los valores, que estan en posicion par" + media/1.5);
    }

}
