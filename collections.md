# Collections

## Definição
> É uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade. Esses elementos precisam ser [OBJETOS]

> Podem ter coleções homogêneas e heterogêneas.

> O nícleo principal das coleções é formado por interfaces que permitem manipular a coleção independente do nível de detalhes que elas representam.

> 4 grandes tipos de coleções :
*1. `List` (Lista)
*2. `Set` (Conjunto)
*3. `Queue` (Fila)
*4. `Map` (Mapa)
> Embora a interface `Map` não seja filha direta da interface `Collection` ela também é considerada uma coleção devido à sua função

> TODAS as interfaces e classes são encontradas dentro do pacote [package] `java.util` 

## Tipo Generico
> É uma classe genérica ou uma interface que é parametrizada em relação a tipos.

> É possível usarmos o Diamond Operator a partir do JAVA 7, no contexto de tipos genéricos em Jvaa para inferir automaticamente o tipo com base no contexto.

> Usando Tipos Genericos em uma `public class Box{}` usamos `public class Box<T>{}` onde `<T>` representa " Tipe "

> Os nomes de parâmetros de tipo mais comuns :

  * E - Elemento (Exclusivamente usado pelo java Collections Framework)
  * K - Chave
  * N - Número
  * T - Tipo
  * V - valor
  * S, U, V, etc. - 2º, 3º, 4º tipos

  ## Comparable X Comparator

  ##### Comparable
  *Fornece uma única sequencia de ordenação, ou seja, podemos ordenar a coleção com base em um único elemento, como id, nome e preço.
  *Afeta a classe original, ou seja, a classe original é modificada.
  *Fornece o método `compareTo()` para ordenar elementos
  *Está presente no pacote `java.lang`
  *podemos ordenar os elemento da lista do tipo `comparable` usando método `Collections.sort(List)`

  #### Comparator
  *Fornece o método `compare()`para ordenar elementos.
  * O `comparator` fornece múltiplas sequências de ordenação, ou seja, podemos ordenar a coleção com base em múltiplos elementos, com base emmúltiplos elementos como id, nome, preço etc.
  * O comparator não afeta a classe original,  ou seja, a classe original não é modificada.
  * `comparator está presente no pacote `java.util`
  *  Podemos ordnar os elementos da lista do tipo `comparator` usando o metodo `Colleftions.sort(List, Comparator)`

  #### Collections
  *Classe utilitária do Java para operações com coleções.
  * Fornece metodos para ordenação, busca, manipulação e sincronização de coleções.
  * O metodo `sort()` é usado para ordenar uma lista em ordem ascendente.
  * O metodo `sort()` em conjunto com `Collections.reverseOrder()` permite ordenar em ordem descendente

## LIST
> É uma coleção ordenada que permite inclusão de elementos duplicados

> As classes de implementação comuns são `ArrayList` e `LinkedList`

> A lista se assemelha a uma Matriz com comportamento dinâmico, permitindo adicionar ou remover elementos

> A interface `List` fornece métodos úteis para adicionar elementos em posições específicas, remover ou substituir elementos com índice e obter sublistas usando índices

> A classe `Collections` fornece algoritmos úteis para a manipulação de `List`. Commo ordenação (sort), embaralhamento(shuffle), reversão(reverse) e busca binária (binarySearch)

##### ArrayList:
> Implementação da interface `List` que armazena os elementos em uma estrutura de array redimensionável. Isso significa que ele pode crescer automaticamente à medida que novos elementos são adicionados. A principal vantagem do Array list é o acesso a elementos por meio de índices, que permite recuperar um elemento específico de forma eficiente. No entanto, adiocionar ou remover elementos no meio da lista pode ser um processo mais longo pois é necessário realocar elementos na lista.
##### LinkedList:
>É uma implementação do da interface `List` que armazena os elementos em uma lista duplamente vinculada. cada elemento contem referências patra o elemento anterior e o próximo da lista. A primcipal vantagem é a adição e remoção de elementos no início e final da lista pius não é necessário realocar elementos. No entanto, ter acesso a elementos no meioi da lista pode ser um processo mais longo pela necessidade de iterar a lista até o elemento desejado.
##### Vector:
> Implementação antiga da interface `List` que se assemelha ao `Arraylist`, mas é sincronizada, ou seja é thread-safe. Isso significa que várias threads podem manipular um objeto Vectorao mesmmo tempo sem causar problemas de ocorrência. No entanto essa sincronização adiciona uma sobrecarga de desempenho, tornando o vector menos eficiênte que o `ArrayList` em cenários que desempenho não é um problema.





