package br.com.dio.metodos;
import java.util.Scanner;

public class Mensagem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hora;
        System.out.println("Que horas são? ");
        hora = scan.nextInt();

        pegarMensagem(hora);
    }
    public static void pegarMensagem(int hora){
        if (hora > 5 && hora < 13){
            bomDia();
        }
        else if (hora > 12 && hora < 18){
            boaTarde();
        }
        else {
            boaNoite();
        }

    }
    public static void bomDia (){
        System.out.println("Bom dia");
    }
    public static void boaTarde(){
        System.out.println("Boa tarde");
    }
    public static void boaNoite(){
        System.out.println("Boa noite");
    }
}
