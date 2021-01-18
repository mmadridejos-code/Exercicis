package dam.interfaces8.basics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex1BasicConsumer {
    public static void main(String[] args) {
        //Crear una interface Consumer que multiplica per 2
        Consumer<Integer> doblador;

//        doblador=new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer*2);
//            }
//        };

        doblador =(x)-> System.out.println(x*2);

        doblador.accept(5);


        Consumer<int []> dobladorArray;
//        dobladorArray=new Consumer<int[]>() {
//            @Override
//            public void accept(int[] ints) {
//                for(int i:ints) {
//                    System.out.print(i*2+" ");
//                }
//            }
//        };

        dobladorArray=(x)-> {
            for (int i : x) {
                System.out.print(i * 2 + " ");
            }
        };

        int []array={1,2,3,4,5};
        dobladorArray.accept(array);
        System.out.println();


        Consumer <int[]>triplicadorArray=(x)->{
            for (int i : x) {
                System.out.print(i * 3 + " ");
            }
        };

        funcioVersatil(dobladorArray,array);
        funcioVersatil(triplicadorArray,array);


        Consumer<List<Integer>> dobladorList;
        dobladorList=(x)->{
            for(int i=0;i<x.size();i++){
                x.set(i,x.get(i)*2);
            }
        };

        List<Integer> llista= Arrays.asList(1,2,3,4,5);
        funcioVersatil2(dobladorList, llista);
    }

    public static void funcioVersatil(Consumer<int[]> operacio, int []a){
        //exemple de com concatenar 2 consumer amb .andThen()
        operacio.andThen(x-> System.out.println(x)).accept(a);
        //System.out.println();
    }

    public static void funcioVersatil2(Consumer<List<Integer>> operacio, List<Integer> a){
        operacio.accept(a);
        System.out.println();
    }

}
