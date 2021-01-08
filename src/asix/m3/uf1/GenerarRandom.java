

package asix.m3.uf1;

import java.util.Random;

/**
 * Exemples d'ús de la funció Math.random()
 *
 * @author Montse
 * @version 07/11/2019
 */
public class GenerarRandom {
    public static void main(String[] args) {


        //La funció stàtica random() de la classe Math retorna una probabilitat en un valor double, amb decimals
        //un valor entre 0 i menor que 1, aleatòriament:0.1, 0.2, 0.45, 0.987, mai arriba a 1
        double p = Math.random();
        System.out.println("Probabilitat p = " + p);

        //Aleatoris entre 0 i 10
        double p2 = p * 11;
        System.out.println("P2 =" + p2);
        int num = (int) p2;
        System.out.println("Entre 0 i 10 =" + num);

        //Aleatoris entre 1 i 10
        int n2 = (int) (Math.random() * 10 + 1);
        System.out.println("Entre 1 i 10 = " + n2);

        //Aleatori entre 5 i 10
        int n3 = (int) (Math.random() * 6 + 5);
        System.out.println("Entre 5 i 10 = " + n3);

        //Aleatori entre 25 i 37
        int n4 = (int) (Math.random() * 13 + 25);
        System.out.println("Entre 25 i 37 = " + n4);
        //interval entre min i max
        //es calcula max-min+1

        //aleatoris entre min i max
        //(int)(Math.random()*(max-min+1)+min)

        //Aleatori entre 15 i 29
        int n5 = (int) (Math.random() * 15 + 15);


        //lletra majúscula aleatoria
        //entre 65 i 90
        //int n6=(int)(Math.random()*26+65);
        int n6 = (int) (Math.random() * ('Z' - 'A' + 1) + 'A');
        System.out.println("Lletra majúscula = " + (char) n6);

        //aleatoris de valors no consecutius, buscar codificació alternativa.
        //Per exemple:
        //mostrar aleatòriament el caràcter 'A', '?', o 's'
        int random = (int) (Math.random() * 3);
        //suposar 0 =='A', 1=='?' i 2 =='s'
        switch (random) {
            case 0:
                System.out.println('A');
                break;
            case 1:
                System.out.println('?');
                break;
            case 2:
                System.out.println('s');
        }


        //aleatoris no consecutius amb un array de valors
        String []noms={"Jordi", "Joan", "Emma", "Maria", "Josep","Anna", "Isabel"};
        String nomRandom=noms[new Random().nextInt(noms.length)];
        System.out.println("Nom random "+nomRandom);

    }
}
