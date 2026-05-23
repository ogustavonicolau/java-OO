# Java 07 - Construtores - Questoes

---

## Atividade 1 - Execute e observe

**O que fazer:**

- Execute o `Principal.java` sem alterar nada.
- Observe os 4 jeitos diferentes de criar e preencher objetos na saida.

**Cole a saida completa do terminal abaixo.**

```text
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

## Atividade 2 - Entendendo construtores

**O que fazer:**

- Abra o `Aluno.java` e leia os dois construtores e seus comentarios.

**Responda:**

**O que e um construtor?**

R. É a forma de se criar um objeto

**Quando ele e chamado automaticamente?**

R. Quando se vai criar um atributo a ele

---

## Atividade 3 - Comparando os jeitos

**O que fazer:**

- Complete a tabela abaixo:

**Complete a tabela:**

| Jeito | Codigo | O que acontece | Construtor usado |
|-------|--------|----------------|------------------|
| 1 | `new Aluno()` depois `aluno1.nome = ...` | Se cria um objeto sem seus atributos | Construtor vazio depois preenche |
| 2 | `new Aluno("Maria", 20)` | Se cria um objeto e seus atributos | Construtor com parâmetros |
| 3 | `new Aluno()` depois `aluno3.nome = ...` | Se cria um objeto sem seus atributos | Construtor vazio depois preenche |
| 4 | `new Aluno("Ana", 21)` | Se cria um objeto e seus atributos | Construtor com parâmetros |

---

## Atividade 4 - Entendendo this

**O que fazer:**

- Observe no construtor a linha `this.nome = nome;`

**Responda:**

**O que significa `this.nome` nessa linha?**

R. "this" significa este objeto e "this.nome" se refere ao atributo nome deste objeto

**O que significa `nome` (sem this) nessa linha?**

R. significa o parâmetro recebido

**Por que sem `this` o Java ficaria confuso?**

R. Por que o Java não saberia se "nome" é um objeto ou um atributo

---

## Atividade 5 - Perguntas

**Responda:**

**O que e um construtor?**

R. é um código chamado automaticamente quando um objeto é criado

**O que faz a palavra `new`?**

R. É usado para criar um novo objeto a partir de uma classe

**Qual e a diferenca entre `new Aluno()` e `new Aluno("Joao", 18)`?**

R. A diferença é que um cria um objeto sem parâmetros e o outro cria um objeto e seus parâmetros

**O que significa `this` no construtor?**

R. "this" significa este objeto

**Por que e vantajoso ter um construtor com parametros?**

R. Por que além de diminuir as linhas de código, não corre o risco do desenvolvedor esquecer de preencher e deixar o construtor vazio

**A classe `Aluno` tem quantos construtores? Liste cada um.**

R. 2 Construtores, um construtor vazio e um construtor com parâmetros

---

## Atividade 6 - Modificando o codigo

**O que fazer:**

- No `Principal.java` adicione ao final:
- 1. Crie 3 novos alunos usando o construtor parametrizado.
- 2. Imprima o nome e a idade de cada um.
- 3. Crie mais um aluno com o construtor vazio, preencha manualmente e imprima.

**Cole a saida completa apos as alteracoes abaixo.**

```text
---- Criando 3 novos alunos com construtor parametrizado ---
Nome: Gustavo (26 anos)
Nome: Vanessa (21 anos)
Nome: Eduardo (25 anos)

 --- Criando um novo aluno com construtor vazio e preenchendo depois ---
Nome: Luis (20 anos)
```

---

## Atividade 7 - Reflexao final

**Responda:**

**Qual jeito voce prefere: construtor vazio ou com parametros? Por que?**

R. Com parametros. Por questão de praticidade, além de diminuir as linhas de código, não corre o risco de esquecer de preencher os parametros

**Se precisasse criar 1000 alunos, qual seria mais pratico?**

R. Construtor parametrizado

**E possivel ter os dois construtores na mesma classe? Explique.**

R. Sim, pois os dois construtores criam um objeto, portanto não importa qual construtor você usa

---
