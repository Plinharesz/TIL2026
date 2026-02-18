The Stack class represents a last-in-first-out (LIFO) stack of objects. It extends class Vector with five operations that allow a vector to be treated as a stack. The usual push and pop operations are provided, as well as a method to peek at the top item on the stack, a method to test for whether the stack is empty, and a method to search the stack for an item and discover how far it is from the top.
When a stack is first created, it contains no items.
A more complete and consistent set of LIFO stack operations is provided by the Deque interface and its implementations, which should be used in preference to this class. For example:
Deque<Integer> stack = new ArrayDeque<Integer>();






`push(E item)`:
O que faz: Empilha. Coloca o item no topo da pilha.
Retorno: O próprio item que foi adicionado.

`pop()`:
O que faz: Desempilha. Remove o objeto no topo da pilha e o retorna para você usar.
Atenção: Se a pilha estiver vazia e você chamar pop(), o Java lança uma EmptyStackException (o programa quebra). Sempre verifique se não está vazia antes!

`peek()`:
O que faz: Espia. Olha o objeto no topo sem removê-lo. Ótimo para comparações (como no exercício dos parênteses).
Atenção: Também lança erro se a pilha estiver vazia.

`isEmpty()`:
O que faz: Retorna true se não houver nada na pilha, false se tiver algo.
Uso: Essencial para usar dentro de loops (while) ou antes de dar um pop.
size():
O que faz: Retorna o número inteiro de elementos na pilha.