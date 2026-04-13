# Respostas — Exercício 07 (Construtores)

## Atividade 1 — Execute e observe

Depois de rodar `Principal.java`, você deve ter visto:

```
=== Exercício 07 - Construtores ===

--- Jeito 1: Construtor vazio (como nos exercícios anteriores) ---
Criado: aluno1 = new Aluno();
Nome: null
Idade: 0

Depois de preencher:
Nome: João Silva
Idade: 18

--- Jeito 2: Construtor com parâmetros (novo jeito) ---
Criado: aluno2 = new Aluno("Maria Santos", 20);
Nome: Maria Santos
Idade: 20

--- Jeito 3: Construtor vazio, depois preenche ---
Nome: Carlos
Idade: 19

--- Jeito 4: Múltiplos objetos (construtor parametrizado) ---
Aluno 4: Ana (21 anos)
Aluno 5: Bruno (17 anos)
Aluno 6: Carla (19 anos)

=== Conclusão ===
Construtores permitem inicializar o objeto com dados
desde o momento da criação, evitando esquecer de preencher.
```

---

## Atividade 3 — Tabela de comparação

| Jeito | Código | O que acontece | Nome do construtor usado |
|------|--------|-----------------|--------------------------|
| 1 | `Aluno aluno1 = new Aluno();` | Cria vazio, depois preenche manualmente | `Aluno()` (sem parâmetros) |
| 2 | `Aluno aluno2 = new Aluno("Maria", 20);` | Cria JÁ preenchido | `Aluno(String, int)` (com parâmetros) |
| 3 | `Aluno aluno3 = new Aluno();` depois `aluno3.nome = ...` | Cria vazio, depois preenche | `Aluno()` (sem parâmetros) |
| 4 | `Aluno aluno4 = new Aluno("Ana", 21);` | Cria JÁ preenchido | `Aluno(String, int)` (com parâmetros) |

---

## Atividade 5 — Perguntas

### 1. O que é um construtor?

Um construtor é um **método especial** da classe que é **executado automaticamente** quando você cria um objeto com `new`. Ele serve para **inicializar** (preparar) o objeto, atribuindo valores aos atributos.

### 2. O que faz a palavra `new`?

A palavra `new`:
- **Cria** o objeto na memória
- **Chama automaticamente** o construtor apropriado
- **Retorna uma referência** para aquele objeto

### 3. Qual é a diferença entre esses dois?

- `Aluno aluno = new Aluno();`
  - Chama o **construtor vazio**
  - O objeto nasce com valores padrão (`nome = null`, `idade = 0`)
  - Você preenche depois manualmente

- `Aluno aluno = new Aluno("João", 18);`
  - Chama o **construtor parametrizado**
  - O objeto nasce JÁ preenchido (em um único passo)
  - Você não precisa preencher depois

### 4. O que significa `this` no construtor?

`this` significa **"este objeto"** (o objeto que está sendo criado).

Exemplo:
```java
public Aluno(String nome, int idade) {
    this.nome = nome;     // this.nome é o atributo do objeto
}
```

Sem `this`, ficaria confuso qual é o parâmetro e qual é o atributo. `this` diferencia.

### 5. Vantagem: Por que é bom ter um construtor com parâmetros?

Vantagens:

1. **Menos código**: Uma linha em vez de três
2. **Menos chance de erro**: Você não esquece de preencher
3. **Mais rápido**: Se criar 100 alunos, é bem mais prático
4. **Mais claro**: Fica óbvio quais dados cada aluno tem

Exemplo com 100 alunos:
```java
// Jeito velho (tedioso, propenso a erro):
for (int i = 0; i < 100; i++) {
    Aluno a = new Aluno();
    a.nome = "Aluno" + i;
    a.idade = 18;
}

// Jeito novo (prático):
for (int i = 0; i < 100; i++) {
    Aluno a = new Aluno("Aluno" + i, 18);
}
```

### 6. A classe `Aluno` tem quantos construtores? Liste-os.

Tem **2 construtores**:

1. `public Aluno()` — construtor vazio (sem parâmetros)
2. `public Aluno(String nome, int idade)` — construtor com parâmetros

Isso se chama **sobrecarga de construtores** (ter múltiplos construtores com assinaturas diferentes).

---

## Atividade 6 — Modificando o código

Seu código adicionado poderia ficar assim:

```java
// Adicionado no final de main():

System.out.println("\n--- Atividade 6: Criando mais alunos ---");
Aluno aluno7 = new Aluno("Fernando", 22);
Aluno aluno8 = new Aluno("Gabriela", 19);
Aluno aluno9 = new Aluno("Helena", 21);

System.out.println("Aluno 7: " + aluno7.nome + " (" + aluno7.idade + " anos)");
System.out.println("Aluno 8: " + aluno8.nome + " (" + aluno8.idade + " anos)");
System.out.println("Aluno 9: " + aluno9.nome + " (" + aluno9.idade + " anos)");

System.out.println("\n--- Atividade 6b: Aluno criado com construtor vazio ---");
Aluno aluno10 = new Aluno();
aluno10.nome = "Igor";
aluno10.idade = 20;
System.out.println("Aluno 10: " + aluno10.nome + " (" + aluno10.idade + " anos)");
```

Depois de rodar, você verá todos os 10 alunos criados com sucesso.

---

## Atividade 7 — Reflexão final

### 1. Qual jeito você prefere: construtor vazio ou construtor com parâmetros?

**Resposta esperada:**

Depende do contexto:

- **Construtor vazio**: Útil quando você quer criar o objeto "em branco" e preenchê-lo depois
- **Construtor com parâmetros**: Útil quando você sabe os dados do objeto na hora da criação

Na prática, **a maioria dos programadores prefere o construtor com parâmetros** porque é mais seguro (não esquece de preencher) e mais prático.

### 2. Se tivesse 1000 alunos para criar, qual seria mais prático?

**Construtor com parâmetros**, definitivamente.

```java
// Com construtor vazio: 3000 linhas de código
Aluno a1 = new Aluno();
a1.nome = "Aluno 1";
a1.idade = 18;
... (repetido 1000 vezes)

// Com construtor parametrizado: 1000 linhas (ou menos em um loop)
for (int i = 1; i <= 1000; i++) {
    Aluno a = new Aluno("Aluno " + i, 18);
}
```

### 3. Você consegue ter os dois construtores na mesma classe?

**Sim!** Isso se chama **sobrecarga de construtores** (ou overloading).

Java permite ter múltiplos construtores **desde que tenham assinaturas diferentes** (número ou tipo de parâmetros diferentes).

Exemplo:
```java
public class Aluno {
    public Aluno() { }                          // Construtor 1
    public Aluno(String nome) { }               // Construtor 2
    public Aluno(String nome, int idade) { }    // Construtor 3
}
```

---

## Resumo do aprendizado

✅ **Construtor** = método especial que inicializa objetos
✅ **`this`** = referência ao próprio objeto
✅ **Sobrecarga** = múltiplos construtores na mesma classe
✅ **Prática** = construtores com parâmetros economizam código e evitam erros

Próximo passo: **Métodos** (Exercício 08), que são funções dentro de classes que fazem operações interessantes!
