import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hola papus, welcome to my first hello word :)");
        //System.out.println("Película Matrix");

        // datos primitivos: integer-int | double | float | boolean |
        int fechaLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoPlanBasic = true;

        // String es una clase pero tambien almacena texto
        String nombre = "Matrix";
        String sinopsis  = """
                La mejor película del fin del milenio
                """;

        System.out.println("Película: " + nombre);
        System.out.println("Fecha de Lanzamiento: " + fechaLanzamiento);
        System.out.println("Calificación: " + evaluacion);
        System.out.println("Incluido en el Plan Basico : " + incluidoPlanBasic);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Calificación General: " + mediaEvaluacion);

        // Structuras de Desicion

        if (fechaLanzamiento >= 2023) {
            System.out.println("Pelicula de los 90's");
        } else {
            System.out.println("Pelicula de los 2000 en adelante");
        }

        // Ciclos de repeticion
        double mediaEvaluacionUser = 0;

        for (int i = 0; i < 3; i++) {
            // clase que nos permite leer los datos del usuario
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa tu calificación sobre la pelicula matrix: ");
            double evaluacionMatrix = teclado.nextDouble();
            mediaEvaluacionUser = mediaEvaluacionUser + evaluacionMatrix;
        }
        System.out.println("La califiación general por parte de los usuarios es de: " + mediaEvaluacionUser/3);
    }
}

/*
 * TIP
 * convencion de nomenclatura para declaracion de variables, metodos, classes : camelCase
 * variables explicativas
 * Java: lenguaje tipado
 *
 *
 * Reto:
 *
 * */