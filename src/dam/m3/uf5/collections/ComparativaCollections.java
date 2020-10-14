package dam.m3.uf5.collections;

import java.util.*;

/** Comparativa entre Collections. Quina té el contains més efectiu? --> SEMPRE HASH
 * Per N = 10000, aproximadament HashMap triga 6 i ArrayList 70, LinkedList, 107
 * Per N= 100000, aproximadament HashMap triga 25, HashSet 19, ArrayList 3583, LinkedList 9679
 *
 * @version 14/10/2020
 * @author Montse
 */
public class ComparativaCollections {

    static final int N = 100000;
    static ArrayList numlist = new ArrayList(N);
    // fill up List with random Integer values

    static {
        Random rn = new Random();
        for (int i = 0; i < N; i++) {
            numlist.add(new Integer(rn.nextInt()));
        }
    }

    static void dotimeMap(Map map, String which) {
        long start = System.currentTimeMillis(); // add all List values to Map
        for (int i = 0; i < N; i++) {
            map.put(numlist.get(i), i);
        }


        for (int i = 0; i < N; i++) {
            if (map.get(numlist.get(i)) == null) {
                System.out.println("bla bla");
            }
        }
        long elapsed = System.currentTimeMillis() - start;
        System.out.println(which + " " + elapsed);
    }

    static void dotimeList(List llista, String which) {
        long start = System.currentTimeMillis(); // add all List values to List
        for (int i = 0; i < N; i++) {
            llista.add(numlist.get(i));
        }

        for (int i = 0; i < N; i++) {
            if (!llista.contains(numlist.get(i))) {
                System.out.println("bla bla");
            }
        }
        long elapsed = System.currentTimeMillis() - start;
        System.out.println(which + " " + elapsed);
    }

    static void dotimeSet(Set set, String which) {
        long start = System.currentTimeMillis(); // add all List values to Set
        for (int i = 0; i < N; i++) {
            set.add(numlist.get(i));
        }

        for (int i = 0; i < N; i++) {
            if (!set.contains(numlist.get(i))) {
                System.out.println("contains error");
            }
        }
        long elapsed = System.currentTimeMillis() - start;
        System.out.println(which + " " + elapsed);
    }
    public static void main(String args[]) {
        //Per col·leccions MOLT grans, sempre té més rendiment HashMap
        //HashMap millor que LinkedHashMap millor que TreeMap

        dotimeMap(new HashMap(), "HashMap");
        dotimeSet(new HashSet(),"HashSet");
        dotimeSet(new TreeSet(),"TreeSet");
        dotimeList(new ArrayList(), "ArrayList");
        dotimeList(new LinkedList(), "LinkedList");

    }
}
