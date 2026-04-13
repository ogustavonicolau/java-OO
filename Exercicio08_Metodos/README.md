# Exercício 08 — Métodos

## Objetivo

Neste exercício vamos aprender:

- O que é um **método** em Java
- A diferença entre **métodos void** (sem retorno) e **com retorno**
- Como **chamar** métodos usando `.` (ponto)
- Como usar **parâmetros** em métodos
- Por que métodos adicionam **comportamento** aos objetos (não só dados)

---

## Contexto (por quê aprender métodos?)

Até agora, a classe `Aluno` só tinha **atributos** (dados): `nome` e `idade`.

Nos exercícios 01-07, você aprendeu a criar objetos e acessar dados.

Com **métodos**, você adiciona **comportamento** (coisas que o objeto pode fazer):

```java
// Dados (atributos):
aluno.nome = "João";

// Comportamento (métodos):
aluno.apresentar();           // Faz algo
int ano = aluno.calcularAnoNascimento();  // Faz algo E retorna um resultado
```

---

## Estrutura deste exercício

Nesta pasta existem dois arquivos:

- `Aluno.java`: define a classe com **6 métodos diferentes**
  - 3 métodos `void` (sem retorno)
  - 3 métodos com retorno
- `Principal.java`: demonstra o uso de todos os métodos

Você deverá executar o `Principal.java`, observar a saída e responder as perguntas no arquivo de respostas.

---

## Tipos de métodos neste exercício

### 1. Método VOID (sem parâmetro, sem retorno)
```java
public void apresentar() {
    System.out.println("Olá, meu nome é " + nome + "...");
}

// Chamado assim:
aluno.apresentar();  // Executa e pronto (não devolve nada)
```

### 2. Método VOID (com parâmetro, sem retorno)
```java
public void fazer(int nota) {
    System.out.println(nome + " fez um teste com nota " + nota);
}

// Chamado assim:
aluno.fazer(85);  // Passa o parâmetro, executa e pronto
```

### 3. Método com RETORNO (sem parâmetro)
```java
public int calcularAnoNascimento() {
    int anoAtual = 2026;
    int anoNascimento = anoAtual - idade;
    return anoNascimento;  // Retorna um valor
}

// Chamado assim:
int ano = aluno.calcularAnoNascimento();  // Recebe o resultado em 'ano'
```

### 4. Método com RETORNO (com parâmetro)
```java
public int multiplicarIdade(int multiplicador) {
    int resultado = idade * multiplicador;
    return resultado;
}

// Chamado assim:
int resultado = aluno.multiplicarIdade(2);  // Passa parâmetro, recebe resultado
```

---

## Atividade 1 — Rodando o programa

1. Execute o `Principal.java`.
2. Observe os **6 métodos diferentes** sendo usados.
3. Veja que alguns métodos imprimem direto, outros devolvem valores.

## Atividade 2 — Entendendo VOID vs RETORNO

- **VOID**: Método faz algo (pode imprimir, modificar, etc) mas não devolve nada
- **COM RETORNO**: Método calcula algo e devolve o resultado (você pode guardar em uma variável)

## Atividade 3 — Perguntas

Responda no `Resposta_Exercicio_08.md` (ou no seu caderno):

1. O que é um método?
2. Qual é a diferença entre `void` e um método com retorno?
3. O que significa chamar um método?
4. Qual é a diferença entre um método com parâmetro e sem?
5. Quantos métodos a classe `Aluno` tem? Liste-os.
6. Qual método você mais usaria na prática? Por quê?

---

## Como executar (Windows)

Na raiz do projeto:

```bat
javac Exercicio08_Metodos\Aluno.java Exercicio08_Metodos\Principal.java
java Exercicio08_Metodos.Principal
```
