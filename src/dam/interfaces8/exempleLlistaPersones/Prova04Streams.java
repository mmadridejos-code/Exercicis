package dam.interfaces8.exempleLlistaPersones;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prova04Streams {
    public static void main(String[] args) {

        ///////////////////////////////////////
        Persona a1 = new Persona("Montse", 46, "Barcelona");
        Persona a2 = new Persona("Pepe", 49, "Santiago");
        Persona a3 = new Persona("Yolanda", 55, "Madrid");
        Persona a4 = new Persona("Enzo", 43, "Valparaiso");
        Persona a5 = new Persona("Angeles", 46, "Barcelona");

        List<Persona> llista = Arrays.asList(a1, a2, a3, a4, a5);
        Stream<Persona> sp=llista.stream().filter((x)->x.getEdat()>=45);
        Stream<Integer> sp2=llista.stream().map((p)->p.getEdat()).distinct(); //sense edats repetides, elimina un dels 46
        sp2.forEach(System.out::println);

        IntStream is=llista.stream().mapToInt((p)->p.getEdat());
        IntStream is2=llista.stream().mapToInt(Persona::getEdat);


        //exemples de diferents maneres de generar un stream. Font: openwebinars.net

        // Un stream a partir de una serie de elementos
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Un stream a partir de un array
        IntStream stream2 = Arrays.stream(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        // Un stream vacío
        Stream<String> stream3 = Stream.empty();

        // Un stream infinito
        Stream<Integer> stream4 = Stream.iterate(1,  x -> x + 2);

        // Un stream "infinito", pero limitado
        Stream<Integer> stream5 = Stream.iterate(0, x -> x + 2).limit(100);

        // Un stream a partir de una colección
        Stream<String> stream6 = Arrays.asList("En", "un", "lugar", "de", "La", "Mancha").parallelStream();

        // Un stream a partir de un Supplier<T>
        Stream<Integer> stream7 = Stream.generate(new Random()::nextInt);


    }
}
