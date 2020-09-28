package dam.m3.uf5.iteradors.menu2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** Segon exemple d'ús d'iteradors. Creem un iterador sobre
 * els plats del menú, només passem pels plats vegetarians
 * @author Montse
 * @version 28/9/2020
*/
public class Menu implements Iterable<Plat>{
    private List<Plat> plats = new ArrayList<Plat>();

    public void afegirPlat(Plat p) {
        plats.add(p);
    }

    @Override
    public Iterator<Plat> iterator() {
        return new IteradorVegetaria(plats);
    }

    /** classe interna , nested inner class*/
    class IteradorVegetaria implements Iterator<Plat>{
        private  List<Plat>plats;
        private int actual=0;
        public IteradorVegetaria(List<Plat> p){
            plats=p;
        }

        /* s'ha de fer una búsqueda del següent element que compleix el
        criteri
         */
        @Override
        public boolean hasNext() {
            boolean hihaNext=false;
            int i=actual;
            while(i<plats.size() && !hihaNext){
                if(plats.get(i).isVegetaria()) hihaNext=true;
                else i++;
            }
            return hihaNext;
        }

        @Override
        public Plat next()
        {
            Plat p=plats.get(actual++);
            while(!p.isVegetaria()) {
                p=plats.get(actual++);
            }
            return p;
        }
    }

}









