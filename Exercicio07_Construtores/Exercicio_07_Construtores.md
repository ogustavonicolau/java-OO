# Exercício 07 — Construtores

## Objetivo

Entender o que é um **construtor** e como ele **inicializa automaticamente** os atributos de um objeto no momento da criação.

---

## Estrutura deste exercício

Você vai trabalhar com:

- `Aluno.java`: Define dois construtores
  - Um sem parâmetros: `public Aluno()`
  - Um com parâmetros: `public Aluno(String nome, int idade)`
- `Principal.java`: Demonstra o uso dos dois construtores

---

## Atividade 1 — Execute e observe

1. Execute o `Principal.java` como está.
2. Observe a saída e note os **4 jeitos diferentes** mostrados.
3. Repare como cada jeito cria e preenche o objeto de forma diferente.

---

## Atividade 2 — Entendendo construtores

No arquivo `Aluno.java`, você vê:

```java
public Aluno() {
    // Construtor vazio - não inicializa nada
}

public Aluno(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
}
```

**O que é um construtor?**

Um construtor é um **método especial** que é **chamado automaticamente** quando você usa `new` para criar um objeto. Ele serve para **inicializar** (preparar) o objeto.

**Quando é chamado?**

Toda vez que você escreve `new`:

```java
new Aluno()                    // Chama o construtor vazio
new Aluno("João", 18)         // Chama o construtor com parâmetros
```

---

## Atividade 3 — Comparando os jeitos

Copie e complete a tabela:

| Jeito | Código | O que acontece | Nome do construtor usado |
|------|--------|-----------------|--------------------------|
| 1 | `Aluno aluno1 = new Aluno();` | Cria vazio, depois preenche manualmente | ? |
| 2 | `Aluno aluno2 = new Aluno("Maria", 20);` | Cria JÁ preenchido | ? |
| 3 | `Aluno aluno3 = new Aluno();` depois `aluno3.nome = ...` | Cria vazio, depois preenche | ? |
| 4 | `Aluno aluno4 = new Aluno("Ana", 21);` | Cria JÁ preenchido | ? |

---

## Atividade 4 — Entendendo `this`

Na linha:

```java
this.nome = nome;
```

- `this.nome` = o **atributo** `nome` do objeto
- `nome` = o **parâmetro** passado no construtor
- `this` = significa "**este objeto**"

Se você não usasse `this`, o Java ficaria confuso:

```java
// ERRADO (confuso):
public Aluno(String nome, int idade) {
    nome = nome;      // Qual é qual? Não consegue diferenciar
    idade = idade;
}

// CORRETO:
public Aluno(String nome, int idade) {
    this.nome = nome;    // this.nome é o atributo; nome é o parâmetro
    this.idade = idade;
}
```

---

## Atividade 5 — Perguntas

Responda:

1. **O que é um construtor?**

2. **O que faz a palavra `new`?** (Você aprendeu nos exercícios anteriores, mas reforce aqui.)

3. **Qual é a diferença entre esses dois?**
   - `Aluno aluno = new Aluno();`
   - `Aluno aluno = new Aluno("João", 18);`

4. **O que significa `this` no construtor?**

5. **Vantagem: Por que é bom ter um construtor com parâmetros?**
   - Dica: Pense em criar 100 alunos. Qual jeito é mais rápido?

6. **A classe `Aluno` tem quantos construtores? Liste-os.**

---

## Atividade 6 — Modificando o código

Abra `Principal.java` e **faça as mudanças** abaixo. Execute após cada mudança:

1. Crie 3 novos alunos com o construtor parametrizado (use nomes e idades diferentes).
2. Imprima o nome e idade de cada um.
3. Crie um aluno com o construtor vazio, depois preencha manualmente e imprima.

**Esperado:** Você consegue criar alunos de duas formas diferentes e ambas funcionam.

---

## Atividade 7 — Reflexão final

Responda:

1. **Qual jeito você prefere: construtor vazio ou construtor com parâmetros? Por quê?**

2. **Se tivesse 1000 alunos para criar, qual seria mais prático?**

3. **Você consegue ter os dois construtores na mesma classe?** (Sim ou não? Por quê?)
