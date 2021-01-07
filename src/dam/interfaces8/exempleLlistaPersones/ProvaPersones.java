package dam.interfaces8.exempleLlistaPersones;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProvaPersones {
    public static void main(String[] args) {
        ArrayList<Persona> llista=new ArrayList<Persona>();
        llista.add(new Persona("Montse", 46,"Barcelona"));
        llista.add(new Persona("Pepe",49,"Santiago"));
        llista.add(new Persona("Yolanda",55,"Madrid"));
        llista.add(new Persona("Enzo",43,"Valparaiso"));
        llista.add(new Persona("Angeles",46,"Barcelona"));


        //buscar persones amb diferents característiques
        //Per cada característica hem d'escriure un mètode amb paràmetres diferents
        //No és una bona solució.
        System.out.println("Majors de 45");
        printMajorsDe(llista,45);
        System.out.println("Entre 45 i 50");
        printEntre(llista, 45,50);
        System.out.println("De Barcelona i 46 anys");
        printPerCiutatEdat(llista, 46,"Barcelona");
        //etc

        System.out.println("De Valparaiso");
        //amb una interface, per exemple, per ciutat "Valparaiso"
        //i una classe interna anònima
        //Aplicar el patró de disseny Estratègia (Strategy Design Pattern)
        printCaracteristica(llista, new CaracteristicaPersona() {
            @Override
            public boolean test(Persona p) {
                return p.getCiutat().equals("Valparaiso");
            }
        });


        //amb Lambda Expressions,es poden afegir tants criteris com calguin, fàcilment
        printCaracteristica(llista, (Persona p)->p.getCiutat().equals("Valparaiso") && p.getEdat()>=43);

        //amb les interfaces funcionals de Java 8, Consumer, Predicate, Function
        processElements(llista, p->p.getEdat()>44 && p.getCiutat().equals("Barcelona"),p->p.getNom(), nom-> System.out.println(nom));

    }

    private static void printMajorsDe(List<Persona>llista, int edat){
        for(Persona p: llista){
            if(p.getEdat()>edat){
                System.out.println(p);
            }
        }
    }

    private static void printEntre(List<Persona>llista, int min, int max){
        for(Persona p: llista){
            if(p.getEdat()<=max && p.getEdat()>=min) System.out.println(p);
        }
    }

    //diferents criteris, diferents funcions!! pesat!!
    private static void printPerCiutatEdat(List<Persona>llista, int edat, String ciutat){
        for(Persona p: llista){
            if(p.getCiutat().equals(ciutat) && p.getEdat()==edat){
                System.out.println(p);
            }
        }
    }


    //Aproximació amb una interface, segons la característica
    //Ús del Strategy Design Pattern, passant la interface com a paràmetre
    private static void printCaracteristica(List<Persona> llista, CaracteristicaPersona c){
        for(Persona p: llista){
            if(c.test(p)) System.out.println(p);
        }
    }


    //utilitzant les interfaces funcionals de Java 8
    //Comsumer<T> void accept(T t);
    //Predicate<T> boolean test(T t);
    //Function<T,R> R apply (T t);
    private static void processElements(List<Persona> llista, Predicate<Persona> tester, Function<Persona, String> mapper, Consumer<String> block){
        for(Persona p: llista){
            if(tester.test(p)){
                String data=mapper.apply(p);
                block.accept(data);
            }
        }
    }
}


//es una interface funcional perquè només té 1 mètode abstracte
@FunctionalInterface
interface CaracteristicaPersona{
    boolean test(Persona p);
}