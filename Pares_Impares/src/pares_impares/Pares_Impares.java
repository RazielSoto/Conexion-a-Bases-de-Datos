package pares_impares;

import java.util.Scanner;

public class Pares_Impares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[] = new int[10];//CREAMOS EL ARREGLO PARA 10 ELEMENTOS ENTEROS
        int pares = 0, impares = 0;

        System.out.println(" ¿Cuales numeros quieres imprimir en los arreglos? ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ". Digite un numero: ");
            arreglo[i] = sc.nextInt();
            if (arreglo[i] % 2 == 0) {//SI EL NUMERO ES PAR
                pares++;
            } else { //SI EL NUMERO ES IMPAR
                impares++;
            }
        }
        //CREAMOS LOS ARREGLOS SIGUIENTES
        int par[] = new int[pares];//CREAMOS EL ARREGLO PARA ALMACENAR LOS NUMEROS PARES
        int impar[] = new int[impares];// Y AHORA LOS NUMEROS IMPARES 
        pares = 0;
        impares = 0;
        //ALMACENAMOS LOS NUMEROS PARES EN SU ARREGLO Y LOS IMPARES TAMBIEN 
        for (int i = 0; i < 10; i++) {
            if (arreglo[i] % 2 == 0) {
                par[pares] = arreglo[i];
                pares++;
            } else {
                impar[impares] = arreglo[i];
                impares++;
            }
        }
        System.out.print("\nArreglo pares: ");
        for (int i = 0; i < pares; i++) {
            System.out.print(par[i] + " - ");
        }
        System.out.println("");

        System.out.print("\nArreglo impares: ");
        for (int i = 0; i < impares; i++) {
            System.out.print(impar[i] + " - ");
        }
        System.out.println("");
    }
}
