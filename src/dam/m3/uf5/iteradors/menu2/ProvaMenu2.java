package dam.m3.uf5.iteradors.menu2;

import java.util.Iterator;

public class ProvaMenu2 {
    public static void main(String[] args) {
        Menu m=new Menu();
        m.afegirPlat(new Plat("sopa",1.5,true,false,true));
        m.afegirPlat(new Plat("pizza 4 formatges",2.5,true,false,false));
        m.afegirPlat(new Plat("orada al forn",3.80,false,true,true));
        m.afegirPlat(new Plat("civet de senglar", 4.5, false,false,false));
        m.afegirPlat(new Plat("pizza carbassó",2.5,true,false,false));

        /* En aquest exemple, l'iterador per defecte itera sobre plats vegetarians */

        // Iterar SENSE bucle for-each
        Iterator<Plat> it=m.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("--------------------------------------");

        /* Iterar AMB bucle for-each*/
        for(Plat p: m){
            System.out.println(p);
        }

        }
}
