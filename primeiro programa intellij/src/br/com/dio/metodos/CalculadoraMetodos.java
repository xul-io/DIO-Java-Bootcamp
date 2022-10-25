package br.com.dio.metodos;

public class CalculadoraMetodos {
    public static void main(String[] args) {
        somar(3,4);
        subtrair(2,3);
        multiplicar(45, 12);
        dividir(20, 5);
    }
    public static void somar(int a, int b){

        System.out.println("Resultado soma = " + (a+b));
    }
    public static void subtrair(int a, int b){
        System.out.println("Resultado subtrair = " + (a-b));
    }
    public static void multiplicar(int a, int b){

        System.out.println("Resultado multiplicar = " + (a*b));
    }
    public static void dividir(int a, int b){

        System.out.println("Resultado dividir = " + (a/b));
    }
}
