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

# Tipo Generico
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
  





