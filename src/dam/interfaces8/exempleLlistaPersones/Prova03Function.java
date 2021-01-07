package dam.interfaces8.exempleLlistaPersones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Prova03Function {
    public static void main(String[] args) {
        Persona a1 = new Persona("Montse", 46, "Barcelona");
        Persona a2 = new Persona("Pepe", 49, "Santiago");
        Persona a3 = new Persona("Yolanda", 55, "Madrid");
        Persona a4 = new Persona("Enzo", 43, "Valparaiso");
        Persona a5 = new Persona("Angeles", 46, "Barcelona");

        List<Persona> llista = Arrays.asList(a1, a2, a3, a4, a5);

        //FUNCTION (T)->(R)
        //apply (T)->R
        Function<Persona,String> op=(p)->p.getNom();
        List<String> resul=convertirPersonaANomPersona(llista,op);
        //CONSUMER
        resul.forEach(System.out::println);

        //Amb Streams
        //Stream<String> sp = llista.stream().map(op);
        //sp.forEach(p->System.out.println(p));
        llista.stream().map(op).forEach(System.out::println);

    }

    public static List<String> convertirPersonaANomPersona(List<Persona> llista, Function<Persona,String> opera){
        List<String> noms=new ArrayList();
        for(Persona p: llista){
            noms.add(opera.apply(p));
        }
        return noms;
    }
}
