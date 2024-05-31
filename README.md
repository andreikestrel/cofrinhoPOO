**Projeto: Gerenciador de Cofrinho**

Este projeto foi desenvolvido como parte de um trabalho da disciplina de Programação Orientada a Objetos (POO). O objetivo é criar um sistema que permita gerenciar um cofrinho virtual, onde o usuário pode adicionar, remover e verificar o saldo total das moedas armazenadas no cofre.

**Funcionalidades:**

1. **Adicionar Moeda:** Permite ao usuário adicionar uma moeda ao cofrinho, escolhendo entre Real, Dólar ou Euro.

2. **Remover Moeda:** Permite ao usuário remover uma moeda específica do cofrinho.

3. **Verificar Saldo Total:** Mostra ao usuário o saldo total do cofrinho em Reais, levando em consideração as taxas de conversão para Dólar e Euro, conforme especificado em cada classe de moeda.

**Estrutura do Projeto:**

O projeto é estruturado em quatro classes principais:

- **Cofrinho:** Esta classe é responsável por gerenciar o cofrinho virtual. Permite adicionar e remover moedas, bem como calcular o saldo total.

- **Moeda:** Classe abstrata que representa uma moeda genérica. Possui um atributo de valor e métodos para obter esse valor e arredondá-lo para um valor inteiro.

- **Real, Dólar e Euro:** Estas são classes que estendem a classe Moeda, representando moedas específicas. Cada uma possui métodos para exibir informações sobre a moeda e converter seu valor para outras moedas, se necessário.

**Instruções de Uso:**

1. Compile e execute o arquivo `Cofrinho.java`.
2. Siga as instruções no console para adicionar, remover ou verificar o saldo do cofrinho.

Este projeto é uma demonstração simples de conceitos de POO, destacando a utilização de herança, polimorfismo e encapsulamento para modelar e gerenciar um sistema de cofrinho virtual.
