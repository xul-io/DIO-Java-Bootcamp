package br.com.dio.estruturaDeRepeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + "é " + alunos[x]);
        }

        // For each
        //for(Sring aluno : alunos){
        //    System.out.println("Nome do aluno é: " + aluno);
        //}
    }
}
