package br.com.dio.metodos;

public class Quadrilatero2 {
    //Quadrilatero2 muda a conta de acordo com o número de entradas
    //Esse exercício se trata de retornos, em que é necessário que o retorno do método seja o mesmo tipo do método
    public static void main(String[] args) {
        System.out.println("Exercício retornos");

        double areaQuadrado = area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);
    }

    public static double area(double lado) {

        return lado * lado;
    }

    public static double area(double lado1, double lado2) {

        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {

        return ((baseMaior+baseMenor)*altura) / 2;
    }

    public static void xpto() {

        System.out.println("Antes");
        return;
    }

    public static double abc() {
        return 1.6;
    }



}
