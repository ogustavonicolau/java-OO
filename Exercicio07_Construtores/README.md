# Exercício 07 — Construtores

## Objetivo

Neste exercício vamos aprender:

- O que é um **construtor** em Java
- A diferença entre **construtor sem parâmetros** (vazio) e **com parâmetros**
- Como usar construtores para **inicializar objetos automaticamente**
- O que significa a palavra-chave `this`
- Por que construtores são úteis (evita esquecer de preencher atributos)

---

## Contexto (por quê aprender construtores?)

Nos exercícios anteriores (01-06), você criava objetos vazios e depois preenchia:

```java
// Jeito antigo (Ex. 05)
Aluno aluno = new Aluno();     // cria vazio
aluno.nome = "João";            // preenche depois
aluno.idade = 18;               // preenche depois
```

Com **construtores**, você faz tudo de uma vez:

```java
// Jeito novo (Ex. 07)
Aluno aluno = new Aluno("João", 18);  // cria JÁ preenchido
```

---

## Estrutura deste exercício

Nesta pasta existem dois arquivos:

- `Aluno.java`: define a classe com **dois construtores**
  - Um sem parâmetros (vazio)
  - Um com parâmetros (inicializa `nome` e `idade`)
- `Principal.java`: demonstra os **diferentes jeitos** de criar objetos

Você deverá executar o `Principal.java`, observar a saída e responder as perguntas no arquivo de respostas.

---

## Atividade 1 — Rodando o programa

1. Execute o `Principal.java`.
2. Observe os **4 jeitos diferentes** de criar e preencher um `Aluno`.
3. Repare na diferença de "antes" (vazio) vs "depois" (preenchido).

## Atividade 2 — Entendendo `this`

No arquivo `Aluno.java`, veja a linha:

```java
this.nome = nome;
```

- `this.nome` é o **atributo** do objeto
- `nome` é o **parâmetro** recebido no construtor
- `this` significa "este objeto" (para diferençar)

## Atividade 3 — Perguntas

Responda no `Resposta_Exercicio_07.md` (ou no seu caderno):

1. O que é um construtor?
2. Qual é a diferença entre `new Aluno()` e `new Aluno("João", 18)`?
3. O que faz a palavra `this` no construtor?
4. Quantos construtores a classe `Aluno` tem? Qual é cada um?
5. Por que é útil ter um construtor com parâmetros?

---

## Como executar (Windows)

Na raiz do projeto:

```bat
javac Exercicio07_Construtores\Aluno.java Exercicio07_Construtores\Principal.java
java Exercicio07_Construtores.Principal
```
