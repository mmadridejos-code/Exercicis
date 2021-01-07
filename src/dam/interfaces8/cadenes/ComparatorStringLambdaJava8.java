package dam.interfaces8.cadenes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorStringLambdaJava8 {
    public static void main(String[] args) {
        ArrayList<String> llista;
        llista=new ArrayList<String>(
            Arrays.asList("en","un","lugar","de","la","mancha")
        );

        //Exemple 1
        // ordenar lexicogràficament
        System.out.println("Ordenat lexicogràficament");
        Collections.sort(llista);
        System.out.println(llista);

        //Exemple 2.1
        //ordenar per longitud de cadena, estil Java 7, amb una classe auxiliar
        System.out.println("Ordenat per longitud de cadena amb classe auxiliar");
        Collections.sort(llista, new ComparatorCadenesPerLongitud());
        System.out.println(llista);

        //Exemple 2.2
        //ordenar per longitud de cadena, estil Java 7
        System.out.println("Ordenat per longitud de cadena amb interna anònima");
        Collections.sort(llista, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                return s1.length()-s2.length();
            }
        });
        System.out.println(llista);


        //Exemple 2.3
        //ordenar lexicogràficament amb sort() de List, Java 8, expressió Lambda
        llista.sort((s1,s2)->s1.compareTo(s2));
        System.out.println("Ordenat lexicogràficament estil Java 8 amb sort de List");
        System.out.println(llista);


        System.out.println("Ordenat per longitud de cadena amb expressió Lambda");
        //ordenar per longitud de cadena, estil Java 8, amb Lambda Expressions
        llista.sort((String s1, String s2)->s1.length()-s2.length());
        //en Java 8, no cal posar el tipus, es dedueix
        llista.sort((s1, s2)->s1.length()-s2.length());
        //printar Java 7
        System.out.println(llista);

        //printar en Java 8
        llista.forEach(x-> System.out.print(x+" "));
        System.out.println();
        System.out.println("Amb referencia a mètode...");
        llista.forEach(System.out::println);


    }
}

//classe auxiliar per comparar strings per longitud
class ComparatorCadenesPerLongitud implements Comparator<String>{
    @Override
    public int compare(String s1, String s2) {
        return s1.length()-s2.length();
    }
}
