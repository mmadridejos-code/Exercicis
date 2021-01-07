package dam.interfaces8.exempleLlistaPersones;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Prova02Predicate {
    public static void main(String[] args) {

        Persona a1 = new Persona("Montse", 46, "Barcelona");
        Persona a2 = new Persona("Pepe", 49, "Santiago");
        Persona a3 = new Persona("Yolanda", 55, "Madrid");
        Persona a4 = new Persona("Enzo", 43, "Valparaiso");
        Persona a5 = new Persona("Angeles", 46, "Barcelona");

        List<Persona> llista = Arrays.asList(a1, a2, a3, a4, a5);

        //PREDICATE<T>
        //el mètode filter rep un Predicate<T> i retorna un Stream<T>
        // és a dir, cada objecte passa per la funció boolean test()
        //i aquesta funció és la que filtra true / false
        Stream<Persona> sp = llista.stream().filter(x -> x.getEdat() >= 45);

        //Predicate<Persona> combinat=((p)->p.getEdat()>=45)).or((p)->p.getNom().contains("o"));
        Predicate<Persona> f1 = (p) -> p.getEdat() >= 45;
        Predicate<Persona> f2 = (p) -> p.getNom().contains("o");
        Predicate<Persona> combinat = f1.or(f2);
        Predicate<Persona> combinat2 = f1.and(f2);
        //per fer-ho inline, cal que fer casting a Predicate<T>
        Predicate<Persona> combinat3 = ((Predicate<Persona>) (p) -> p.getEdat() >= 45).and((p) -> p.getNom().contains("o"));
        sp = llista.stream().filter(combinat);
        sp = llista.stream().filter((p) -> p.getEdat() >= 45).filter((p) -> p.getNom().startsWith("M"));
        sp = llista.stream().filter(combinat3);

        //Els streams només es poden iterar 1 vegada, un cop es consumeixen, adéu stream.
        //Per això no es poden fer 2 iteracions forEach seguides amb l'Stream sp
       //sp.forEach(System.out::println);
        //forEach rep un CONSUMER<T>
        sp.forEach(p-> System.out.println(p.getNom()));




    }
}
