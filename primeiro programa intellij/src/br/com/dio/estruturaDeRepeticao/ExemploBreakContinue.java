package br.com.dio.estruturaDeRepeticao;
// Exemplo do break e do continue no java
public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){
            if (numero == 3)
                break;
            // continue;

            System.out.println(numero);
        }
    }
}
