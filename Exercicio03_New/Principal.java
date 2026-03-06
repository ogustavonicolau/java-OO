package Exercicio03_New;

public class Principal{

    public static void main(String[] args) {

        // 'new Aluno()' é a parte que CRIA o objeto na memória.
        // Sem o 'new', nenhum objeto real é criado.
        Aluno a1 = new Aluno();

        // Vamos criar um segundo objeto, para mostrar que podemos criar varios.
        Aluno a2 = new Aluno();

        System.out.println("Exercicio 03 - Criamos dois objetos com new.");
        System.out.println("a1 e a2 sao dois alunos diferentes na memoria.");
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);

    }

}