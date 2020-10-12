package dam.m3.uf5.iteradors.foreach;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/** Exemple d'ús del mètode forEach de la interface Iterable
 *
 * @author Montse
 * @version 12/10/2020
 */
public class ExemplesForEach {
    public static void main(String[] args) {
        Persona p1= new Persona("Montse", 46,"Barcelona");
        Persona p2=new Persona("Pepe",49,"Santiago");
        Persona p3=new Persona("Yolanda",55,"Madrid");
        Persona p4=new Persona("Enzo",43,"Valparaiso");
        Persona p5=new Persona("Angeles",46,"Barcelona");

        List<Persona> llista= Arrays.asList(p1,p2,p3,p4,p5);

        //iterar sobre la llista, versió clàssica
        for(Persona p: llista){
            System.out.println(p.getNom());
        }

        System.out.println("---------------------");
        //iterar amb el mètode forEach
        //implementant de manera anònima la interface Consumer<T>
        llista.forEach(new Consumer<Persona>(){
            @Override
            public void accept(Persona persona) {
                System.out.println(persona.getNom());
            }
        });

        System.out.println("---------------------");
        //amb lambda
        llista.forEach((x)-> System.out.println(x.getNom()));
    }
}


