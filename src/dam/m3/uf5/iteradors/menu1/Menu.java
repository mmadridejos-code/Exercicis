package dam.m3.uf5.iteradors.menu1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**Exemple 1 d'estructura de dades Iterable
 * Un Menú és una llista de Plats
 * Quan utilitzem el bucle for-each
 * utilitzem l'iterator de la classe ArrayList;
 * per defecte es recorren tots els plats.
 * @author Montse
 * @version 21/09/2020
 */
public class Menu implements Iterable<Plat>{
    private List<Plat> plats=new ArrayList<Plat>();

    @Override
    public Iterator iterator() {
        return plats.iterator();
    }

    public void afegirPlat(Plat p){
        plats.add(p);
    }

    public static void main(String[] args) {
        Menu m=new Menu();
        m.afegirPlat(new Plat("sopa",1.5,true,false,true));
        m.afegirPlat(new Plat("pizza 4 formatges",2.5,true,false,false));
        m.afegirPlat(new Plat("orada al forn",3.80,false,true,true));
        m.afegirPlat(new Plat("pizza carbassó",2.5,true,false,false));

        /* bucle for-each*/
        for(Plat p: m){
            System.out.println(p);
        }
    }
}

