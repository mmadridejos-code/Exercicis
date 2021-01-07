package dam.interfaces8.exempleLlistaPersones;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Prova01Consumer {
    public static void main(String[] args) {
        Persona a1 = new Persona("Montse", 46, "Barcelona");
        Persona a2 = new Persona("Pepe", 49, "Santiago");
        Persona a3 = new Persona("Yolanda", 55, "Madrid");
        Persona a4 = new Persona("Enzo", 43, "Valparaiso");
        Persona a5 = new Persona("Angeles", 46, "Barcelona");

        List<Persona> llista = Arrays.asList(a1, a2, a3, a4, a5);

        //CONSUMER
        //el mètode forEach rep un Consumer<T>
        //és a dir, per cada objecte s'aplica la funció void accept()

        //iterar sobre la llista, versió clàssica
        System.out.println("Iterar amb bucle tradicional ---------------------");
        for (Persona p : llista) {
            System.out.println(p.getNom());
        }

        //iterar amb el mètode forEach, implementant de manera anònima la interface Consumer<T>
        System.out.println("Iterar amb classe interna anònima Consumer ---------------------");
        llista.forEach(new Consumer<Persona>() {
            @Override
            public void accept(Persona persona) {
                System.out.println(persona.getNom());
            }
        });

        //amb lambda
        System.out.println("Iterar amb lambda per l'accept de Consumer ----------");
        llista.forEach((x) -> System.out.println(x.getNom()));
        System.out.println("Iterar amb lambda per Consumer i andThen ------------------");
        Consumer<Persona> cp=(p)->System.out.print(p.getNom()+" ");
        Consumer<Persona> cp2=cp.andThen((n)->System.out.println(n.getEdat()+" anys"));
        llista.forEach(cp2);

        System.out.println("Iterar amb referència al mètode println ------------------");
        //amb referències a mètodes
        llista.forEach(System.out::println);
    }
}
