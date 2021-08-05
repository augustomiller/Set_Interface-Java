package com.github.maicmiller;

import java.util.Objects;

public class Car implements Comparable<Car>{

    String marca;

    public Car(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(marca, car.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                '}';
    }

    /*
    * Comparando pelo tamanho da ‘string’...
    * */
//    @Override
//    public int compareTo(Car o) {
//        if(this.marca.length() < o.marca.length()){
//            return -1;
//        }else if (this.marca.length() > o.marca.length()){
//            return -1;
//        }
//        return 0;
//    }

    /*
     * Comparando por ordem alfabética...
     * */
    @Override
    public int compareTo(Car o) {
        return this.getMarca().compareTo(o.getMarca());
    }
}
