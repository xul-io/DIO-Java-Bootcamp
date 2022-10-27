package br.com.dio.metodos;

public class Quadrilatero {
    public static void main(String[] args) {
        area(2);
        area(2d,5d);
        area(4,3,5);
        area(3f, 7f);
    }
    public static void area(double lado){
        System.out.println("Área do quadrilátero:" + (lado * lado));
    }
    public static void area(double lado1, double lado2){
        System.out.println("Área do quadrilátero:" + (lado1 * lado2));
    }
    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do quadrilátero:" + ((baseMaior+baseMenor) * altura)/2);
    }
    public static void area(float diagonal1, float diagonal2){
        System.out.println("Área do quadrilátero:" + (diagonal1 + diagonal2)/2);
    }
}
