# ☕ Desafio: Modelando o Bootcamp com Programação Orientada a Objetos em Java

Este repositório contém a resolução do desafio prático de Programação Orientada a Objetos (POO) da plataforma [DIO](https://www.dio.me/). O objetivo principal foi consolidar os pilares fundamentais da orientação a objetos aplicando cenários do mundo real (um ecossistema de Bootcamp).

## 🚀 Pilares de POO Aplicados

Durante o desenvolvimento da arquitetura do projeto, foram exercitados os 4 pilares de POO:

1. **Abstração:** Criação da classe mãe e abstrata `Conteudo`, servindo como um molde genérico para representar qualquer tipo de entrega pedagógica.
2. **Encapsulamento:** Uso de modificadores de acesso (`private` e `protected`) e métodos getters/setters para proteger os dados internos das classes `Dev`, `Bootcamp`, `Curso` e `Mentoria`.
3. **Herança:** As classes `Curso` e `Mentoria` estendem (`extends`) a classe `Conteudo`, herdando seus atributos básicos (`titulo` e `descricao`) e evitando a duplicação de código.
4. **Polimorfismo:** Implementação do método abstrato `calcularXp()` na classe mãe, onde cada classe filha responde de maneira diferente ao mesmo estímulo (Cursos multiplicam a carga horária e Mentorias ganham um bônus fixo de XP).

## 🛠️ Tecnologias e Conceitos Utilizados

* **Java JDK 11** / **Java JDK 21**
* **Collections Framework:** Uso estratégico de `Set`, `HashSet` e `LinkedHashSet` para armazenar conteúdos inscritos/concluídos e desenvolvedores matriculados, garantindo a não-duplicação de elementos e mantendo a ordem de inserção onde necessário.
* **Java Streams API & Optionals:** Utilização do `stream()`, `findFirst()` e expressões lambda para manipular as coleções de forma limpa, elegante e performática durante o cálculo total de XP e progressão do desenvolvedor.

## 📁 Estrutura das Classes Domínio

* `Conteudo.java` (Classe Abstrata Mãe)
* `Curso.java` (Filha de Conteudo)
* `Mentoria.java` (Filha de Conteudo)
* `Bootcamp.java` (Agrega os conteúdos e gerencia os desenvolvedores)
* `Dev.java` (Contém as regras de negócio para inscrição e progressão de XP)
* `Main.java` (Instanciação dos objetos e execução dos testes de fluxo)

## 💻 Como Rodar o Projeto

1. Clone o repositório:
   ```bash
   git clone [https://github.com/SEU_USUARIO_DO_GITHUB/portifolio-Augusto2.git](https://github.com/SEU_USUARIO_DO_GITHUB/portifolio-Augusto2.git)# portifolio-Augusto2