package dam.interfaces8.basics;

import java.util.function.Function;

public class Ex1BasicFunction {
    public static void main(String[] args) {
        Function<Integer,Integer> doblador=new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };

        int num=doblador.apply(5);
        System.out.println(num);

        Function<int[], Integer> sumadorArray=new Function<int[], Integer>() {
            @Override
            public Integer apply(int[] ints) {
                int suma=0;
                for(int i:ints){
                    suma=suma+i;
                }
                return suma;
            }
        };

        int [] array={1,2,3,4,5};
        int suma=sumadorArray.apply(array);
        System.out.println(suma);

    }
}
