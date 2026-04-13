# Exercícios Java — Orientação a Objetos (javaOO)

Conjunto de exercícios para suporte e prática no aprendizado de **Java** e **Orientação a Objetos**.

## Estrutura

### Nível 1 — Fundação (Classe, Objeto, Atributos)

- `Exercicio01_Classe/` — O que é uma classe (molde)
- `Exercicio02_Objeto/` — O que é um objeto (instância)
- `Exercicio03_New/` — Criar múltiplos objetos
- `Exercicio04_Vazio/` — Valores padrão (defaults)
- `Exercicio05_Preencher/` — Preenchendo atributos
- `Exercicio06_Ler_Atributos/` — Lendo atributos

### Nível 2 — Métodos e Construtores

- `Exercicio07_Construtores/` — Inicializar objetos no momento da criação
- `Exercicio08_Metodos/` — Adicionar comportamento (ações) aos objetos
- `Exercicio09_Encapsulamento/` — Proteger dados com `private` e `public`

Cada pasta geralmente possui:

- `Aluno.java` — A classe
- `Principal.java` — Arquivo executável (main) com exemplos
- `README.md` — Objetivo e instruções
- um enunciado (`Exercicio_XX_*.md`) — O que fazer
- um arquivo de respostas (`Resposta_Exercicio_XX.md`) — Respostas esperadas e explicações

## Roadmap de Aprendizado

Siga nesta ordem para melhor aprendizado:

| Exercício | Conceito | Duração | Status |
| --------- | -------- | ------- | ------ |
| 01 | Classe (molde) | 5 min | ✅ |
| 02 | Objeto (instância) | 5 min | ✅ |
| 03 | Múltiplos objetos | 5 min | ✅ |
| 04 | Valores padrão | 5 min | ✅ |
| 05 | Preenchendo atributos | 10 min | ✅ |
| 06 | Lendo atributos | 10 min | ✅ |
| **07** | **Construtores** | **15 min** | 🆕 |
| **08** | **Métodos** | **20 min** | 🆕 |
| **09** | **Encapsulamento** | **20 min** | 🆕 |

**Próximas (sugestões):**

- Exercício 10: Herança
- Exercício 11: Polimorfismo
- Exercício 12: Interfaces
- Exercício 13: Classes Abstratas

## Como executar no Windows (PowerShell / CMD)

Os arquivos usam `package`, então a forma mais simples é compilar e executar a partir da **raiz** do repositório.

Exemplo (Exercício 04):

```bat
javac Exercicio04_Vazio\Aluno.java Exercicio04_Vazio\Principal.java
java Exercicio04_Vazio.Principal
```

Observação: em **PowerShell antigo (5.x)** o operador `&&` pode não funcionar. Prefira rodar em duas linhas (como acima).

## Como responder os exercícios

- Leia o enunciado `Exercicio_XX_*.md`.
- Rode o `Principal.java`.
- Copie a saída do console (quando solicitado).
- Responda as perguntas no `Resposta_Exercicio_XX.md` (ou no seu caderno).

## Fork: recebendo atualizações do repositório original (upstream)

Se você fez um fork e quer trazer atualizações do repositório original (upstream) para o seu fork (origin):

### 1) Configurar o upstream (uma vez)

```bat
git remote add upstream URL_DO_REPOSITORIO_ORIGINAL.git
git remote -v
```

### 2) Buscar atualizações

```bat
git fetch upstream
```

### 3) Mesclar na sua branch principal

```bat
git checkout main
git merge upstream/main
```

Se houver conflitos, resolva-os e finalize o merge.

### 4) Enviar para o seu fork (origin)

```bat
git push origin main
```

### Alternativa (interface do GitHub)

No seu fork, use **Sync fork** → **Update branch** quando houver atualizações.
