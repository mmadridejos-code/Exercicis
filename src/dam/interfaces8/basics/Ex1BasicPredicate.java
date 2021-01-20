package dam.interfaces8.basics;

import java.util.function.Predicate;

public class Ex1BasicPredicate {
    public static void main(String[] args) {
        Predicate<Integer> serParell;

//        serParell=new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer%2==0;
//            }
//        };

        //exemple sense funció
        serParell = (x) -> x % 2 == 0;
        System.out.println(serParell.test(48) ? "És parell" : "No és parell");

        Predicate<Integer> multipleDe7=(x)->x%7==0;
        //(exemple de funció amb paràmetre Predicate
        //Strategy Design Pattern
        funcio(4,serParell);
        funcio(4, multipleDe7);


    }

    public static void funcio(Integer numero, Predicate<Integer> caracteristica){
        System.out.println(caracteristica.test(numero)?"Ho és":"No ho és");
    }
}
