# Java 10 - Modificadores de Acesso - Questoes

---

## Atividade 1 - Executando o codigo

**O que fazer:**

- Execute o `Principal.java` e observe a saida.

**Cole a saida do terminal abaixo.**

```text
=== Exercicio 10 - Modificadores de Acesso ===

--- Acesso a atributos ---
nome  (public)    : Joao
idade (via getter) : 18
turma (protected) : TI-01
escola (sem mod.) : Escola Padrao

--- Chamando metodos publicos ---
Nome: Joao | Turma: TI-01 | Idade: 18
Codigo: TI-01-J18

--- Modificando atributos ---
Nome alterado: Joao Silva

=== Resumo dos Modificadores ===
public    -> visivel para todos
private   -> visivel so dentro da propria classe
protected -> visivel na classe e em subclasses
(nenhum)  -> visivel apenas no mesmo pacote
```

---

## Atividade 2 - A declaracao correta de uma classe

**Analise as alternativas abaixo e marque a CORRETA para declarar uma classe publica chamada Aluno:**

- A) `Private class Aluno{}`
- B) `Class Aluno{}`
- C) `Protected class Aluno{}`
- D) `public class Aluno{}` 
- E) `extends class Aluno{}`

**Qual alternativa esta correta?**

R. Letra D.

**Por que as outras estao erradas? Explique cada uma.**

- A) `Private class Aluno{}`:

R. Modificador que é visivel somente dentro da sua propria classe

- B) `Class Aluno{}`:

R. Erro de Sintaxe

- C) `Protected class Aluno{}`:

R. Modificador que é visivel na classe em subclasses

- E) `extends class Aluno{}`:

R. É usada para criar uma subclasse

---

## Atividade 3 - Identificando os modificadores

**Abra o `Aluno.java` e preencha a tabela:**

| Atributo/Metodo | Modificador | Visibilidade |
|-----------------|-------------|--------------|
| `nome` | public | para todos |
| `idade` | private | Somente dentro da classe |
| `turma` | protected | Visivel na classe em subclasses |
| `escola` | Sem modificador | Apenas dentro do mesmo pacote |
| `getIdade()` | public | Acessível de qualquer lugar |
| `gerarCodigo()` | private | Só pode ser chamado dentro da classe |
| `exibirCodigo()` | public | Método publico que usa o privado internamente |

---

## Atividade 4 - Tentando acessar o que nao pode

**O que fazer:**

- No `Principal.java`, tente adicionar a linha: `aluno1.idade = 25;`
- Observe o erro de compilacao.
- Depois remova a linha.

**Cole a mensagem de erro do compilador abaixo.**

```text
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        The field Aluno.idade is not visible

        at Java_10_Modificadores.Principal.main(Principal.java:48)
```

**Responda:**

**Por que o compilador nao permite esse acesso?**

R. Por que o atributo idade é um método privado

**Como e possivel alterar a idade de forma correta?**

R. Terá que adicionar um Setter em Aluno.java

---

## Atividade 5 - Composicao de modificadores

**O professor mostrou que podemos combinar modificadores. Exemplo: `public static void main`.**

**O que significa cada palavra nessa linha?**

- `public`:

R. É um modificador de acesso, ele avisa que é um método publico e pode ser visto por e executado por todos

- `static`:

R. Indica que o método é estático, ou seja, que pertence à própria classe e não a um objeto específico

- `void`:

R. Significa que a função não retorna nenhum resultado

- `main`:

R. É o nome oficial da função

---

## Atividade 6 - Perguntas finais

**O que e um modificador de acesso?**

R. São palavras-chave usadas para definir a visibilidade e determinar quem pode acessar as classes, atributos e métodos

**Qual modificador torna um atributo acessivel SOMENTE dentro da propria classe?**

R. private

**Qual modificador torna um atributo acessivel de qualquer lugar?**

R. public

**Por que usamos getters em vez de deixar tudo `public`?**

R. Para podermos ter o controle e não deixar que qualquer um tenha acesso aos dados

**O que e um metodo `private` e quando ele e util?**

R. É um método privado, ele é útil quando precisamos proteger os dados de uma classe

---
