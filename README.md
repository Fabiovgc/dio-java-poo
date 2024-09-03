# Objetivo do Repositório :
-> Abordar conceitos do paradigma e os pilares da Orientação a Objetos
1. Classes
2. enums
3. construtores
4. Java Bens
5. UML

## Conceito de POO
### Programação estruturada
-> Paradigma de programação que visa melhorar clareza , qualidade e tempo de desenvolvimento de um programa, fazendo uso extensivo das construções de fluxo de controle estruturado de seleção `if/then/else` e repetição `while/for` , estrutura de bloco e sub-rotinas.
-> Implementamos algoritmos com estruturas sequenciais [procedimentos lineares] -> afetando valor de variaveis de escopo local ou global em uma aplicação

### Orientação a Objetos
-> baseado no conceito de "objetos", que possuem atributos, e codigos, na forma de procedimentos [metodos].

## Classes
-> Toda a estrutura de codigo em Java é distribuido em arquivos `.java` denominados de [classes]

### As classes são compostas por : 
##### Identificador, Características, Comportamentos
* Classe(class) -> A estrutura que direciona a criação dos objetos de mesmo tipo.
* Identificador(identify) -> Proposito existencial dos objetos que serão criados.
* Caracteristicas(states) -> Conhecidos como atributos ou propriedades, é toda informação que representa o estado de um objeto.
* Comportamentos(behavior) -> Conhecido como ações [metodos], é toda parte comportamental que um objeto dispõe.
* Instanciar(new) -> É o ato de criar um objeto a partr da estrura definida em uma classe.

### Classificação das classes :
* Classe de modelo(model) -> Representam estrutura de domínio da aplicação [Cliente, Pedido, Nota Fiscal etc]
* Classe de serviço(service) -> Contém regras de negócio e validação do nosso sistema
* Classe de repositório(repository) -> Contém integração com banco de dados
* Classe de controller(controller) -> Possuem finalidade de disponibilizar uma conexão externa à nossa aplicação [http, web, webservicess]
* Classe utilitária(util) -> Contém recursos comuns à toda nossa aplicação

## Pacotes 
-> O mecanismo de Pacotes é uma forma de organização do projeto -> Sendo composto por diversas categorias de classes com finalidades diferentes o empacotamento é uma forma de deixar todas essas classes em um único nível de documentos -> Os Pacotes são subdiretórios a partir da pasta SRC do nosso projeto onde estão localizadas as classes da linguagem e novas que forem criadas para o projeto. Existem algumas convenções para criação de pacotes já utilizados no mercado : 
* Nomenclatura
  * Comercial : com.powersoft
  * Governamental : gov.powersoft
  * Código aberto : org.powersoft

  
* Organização das classes mediante a proposta de sua existencia
  * Model : Classes que representam a camada e modelo da aplicação ( Cliente, Pedido, NotaFiscal, Usuario )
  * Repository : Classes ou interfaces que possuem a finalidade de interagir com tabelas do banco de dados
  * Service  : Classes que contém regras de negócio do sistema ( ClienteService possui o método para validar o CPF do cliente cadastrado )
  * Controller : Classes que possuem a finalidade de disponibilizar os nossos recursos da aplicação para outras aplicações via padrão HTTP
  * View : Classes que possuem alguma interação com interfaces gráficas acessadas pelo usuário
  * Util : Pacote que contém classes utilitárias do sistema ( FormatadorNumeroUtil, ValidadorUtil ).
 

##### OBS :
-> Quando uma classe é organizada por pacotes, ela passa a ter duas identificações. O nome simples [proprio nome] e o nome qualificado [endereçamento do pacote + nome],  exemplo: Classe Usuario dentro do pacote `com.controle.acesso.model` tem o nome qualificado de `com.controle.acesso.model.Usuario`

### Package versu Import
-> Para a utilização de uma classe existente em outros pacotes, necessitamos realizar a importação das mesmas.

## Visibilidade dos recursos
-> Em Java, utilizamos três palavbtras reservadas e um conceito default ( sem palavra reservada ) para definir os quatro tipos de visibilidade de atributos, métodos e até mesmo classes, no que se refere ao acesso por outras classes.

* Modificador de acesso `public`
  * a
* a
  * a
* a
  * a
* a
  * a





