package com.github.maicmiller;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Car> hashSetCar = new HashSet<>();

        hashSetCar.add(new Car("Ford"));
        hashSetCar.add(new Car("Chevrolet"));
        hashSetCar.add(new Car("Fiat"));
        hashSetCar.add(new Car("Peugeot"));
        hashSetCar.add(new Car("Zip"));
        hashSetCar.add(new Car("Alfa Rome"));

        /*
        * O método 'set' não preserva a ordem de inserção, ele imprime
        * conjunto fora de ordem...
        * */
        System.out.println(hashSetCar);

        /*
        * Temos um conjunto e iremos inseri-lo na árvore conforme o tamanho de cada um.
        * E será exibido em ordem.
        *
        * Na segunda opção listamos o conjunto em ordem alfabética...
        *
        * Veja o método "compareTo(Car o)" na classe Car, ele é responsável por isso...
        * */
        Set<Car> treeSetCar = new TreeSet<>();

        treeSetCar.add(new Car("Ford"));
        treeSetCar.add(new Car("Chevrolet"));
        treeSetCar.add(new Car("Fiat"));
        treeSetCar.add(new Car("Peugeot"));
        treeSetCar.add(new Car("Zip"));
        treeSetCar.add(new Car("Alfa Romeo"));

        System.out.println(treeSetCar);
    }
}
