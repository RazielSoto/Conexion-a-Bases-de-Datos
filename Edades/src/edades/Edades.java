package edades;

import java.util.Scanner;

public class Edades {

    public static void main(String[] args) {
        int edad, sumaEdad = 0, sumaEstatura = 0, alumnoMayores = 0, alumnoAltos = 0;
        float estatura, mediaEdad, mediaEstatura;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa la edad " + (i + 1) + " alumno: ");
            edad = sc.nextInt();
            System.out.println("Ingresa tu estatura: ");
            estatura = sc.nextFloat();

            sumaEdad += edad;
            sumaEstatura += estatura;

            if (edad >= 18) {
                alumnoMayores++;
            }
            if (estatura >= 1.75) {
                alumnoAltos++;
            }
        }
        mediaEdad = (float) sumaEdad / 5;
        System.out.println("Media edad: " + mediaEdad);
        mediaEstatura = (float) sumaEstatura / 5;
        System.out.println("Media estatura: " + mediaEstatura);
        System.out.println("Mayores de 18: " + alumnoMayores);//CUANTOS SON MAYORES DE 18
        System.out.println("Altos de 1.75: " + alumnoAltos);//CUANTOS MIDEN MAS DE 1.75
    }
}
