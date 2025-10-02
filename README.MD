# Prova Arquiteturas Padrão

Esta prova foi realizada no dia 04/08/2025 pelo docente Matehus Quost sobre Arquiteturas Padrão.

# índice 

- [O que são Arquiteturas Padrão?](#o-que-são-arquiteturas-padrão)
- [Ferramentas utilizadas](#ferramentas-utilizadas)
- [Qual arquitetura foi escolhida?](#qual-arquitetura-foi-escolhida)
- [Quais padrões foram aplicados?](#quais-padrões-foram-aplicados)
- [Como rodar o Sistema](#como-rodar-o-sistema)

# O que são Arquiteturas Padrão?

Soluções reutilizáveis para problemas comuns em desenvolvimento de software.

# Ferramentas Utilizadas

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/vscode/vscode-original.svg" width="40" /> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="40" />


# Qual arquitetura foi escolhida?

A arquitetura escolhida foi a MVVM porque achamos interessante
o jeito de trabalhar com ela e hoje em dia muitos projetos utilizam esta arquitetura. 


# Quais padrões foram aplicados?

A arquitetura MVVM organiza o código em três camadas principais:

- Model (model/ e enums/)
Contém as classes de domínio, responsáveis pelas regras de negócio e estrutura dos dados.
Ex.: Tarefa.java, Prioridade.java.

- View (view/)
Responsável pela interface do usuário e exibição de dados.
Ex.: TelaTarefas.java.

- ViewModel (vm/)
Faz a ponte entre o Model e a View, gerenciando o estado e a lógica da aplicação.
Ex.: TarefaViewModel.java.

- Padrões de Projeto Utilizados

- Factory (factory/)
Criação de objetos de forma centralizada e flexível.
Ex.: TarefaFactory.java.

- Command (command/)
Encapsula ações em objetos, permitindo desfazer/refazer operações e maior desacoplamento.
Ex.: Command.java, ConcluirCommand.java, CommandInvocador.java.

- Decorator (decorator/)
Adiciona responsabilidades dinamicamente a objetos sem modificar sua estrutura.
Ex.: PrioridadeDecorator.java.

# Como rodar o sistema?

- Passo a passo: 

1. Abra o VS Code e no terminal digite: 

```bash
git clone https://github.com/seu_usuario/nome_do_repositorio.git
```

2. Navegue até o diretótio do projeto: 

```bash
cd nome_do_repositorio
```

3. Para executar a main() escreva no terminal:

```bash
Main.java
```



