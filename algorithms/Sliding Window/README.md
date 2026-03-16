# Sliding Window

Técnica algorítmica utilizada para otimizar problemas que envolvem a iteração sobre coleções (arrays ou strings) em busca de sub-arrays ou sub-strings contíguos que satisfaçam uma condição específica. O padrão substitui loops aninhados redundantes, reduzindo a complexidade de tempo tipicamente de $O(N^2)$ para $O(N)$. A janela (window) é mantida por dois ponteiros, geralmente `left` e `right`.

Existem duas variações principais:
1. **Fixed Window:** O tamanho da janela (diferença entre `right` e `left`) permanece constante.
2. **Dynamic Window:** A janela expande (incrementando `right`) e contrai (incrementando `left`) dinamicamente com base em uma condição.

## Implementation (Dynamic Window Example)

Problema: Encontrar o comprimento mínimo de um sub-array contíguo cuja soma seja maior ou igual a um `targetSum`.

```java
public class SlidingWindowPattern {

    public static int minSubArrayLen(int targetSum, int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int minLength = Integer.MAX_VALUE;
        int currentWindowSum = 0;
        int left = 0;

        // O ponteiro 'right' expande a janela iterando pelo array
        for (int right = 0; right < arr.length; right++) {
            currentWindowSum += arr[right];

            // Condição atingida: tenta contrair a janela pelo ponteiro 'left'
            while (currentWindowSum >= targetSum) {
                // Atualiza o resultado com o menor tamanho de janela encontrado
                minLength = Math.min(minLength, right - left + 1);
                
                // Remove o elemento da esquerda do estado atual e encolhe a janela
                currentWindowSum -= arr[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
```

## Edge Cases & Common Pitfalls

* **Input Validation:** Sempre validar se a estrutura de dados é nula ou vazia antes de iniciar a iteração (`arr == null || arr.length == 0`).
* **No Valid Window:** Garantir que o algoritmo retorne um valor default apropriado (como `0` ou `-1`) caso nenhuma janela satisfaça a condição (daí a checagem final de `Integer.MAX_VALUE`).
* **Off-by-One Errors:** Erros comuns ao calcular o comprimento da janela. A fórmula correta com índices inclusivos baseados em zero é sempre `right - left + 1`.
* **Desincronização de Estado:** Esquecer de remover ou decrementar o valor de `arr[left]` do estado de controle (seja uma variável de soma, um `HashMap` de frequências, ou um `HashSet`) antes de incrementar o ponteiro `left`.

## Time and Space Complexity

* **Time Complexity:** $O(N)$. Apesar da existência de um loop `while` aninhado dentro de um loop `for`, cada elemento do array é processado no máximo duas vezes: uma vez ao ser incluído na janela pelo ponteiro `right` e uma vez ao ser excluído pelo ponteiro `left`.
* **Space Complexity:** $O(1)$ para algoritmos que mantêm apenas variáveis primitivas de estado (como acumuladores de soma). A complexidade pode aumentar para $O(K)$ ou $O(N)$ em cenários que exigem estruturas de dados auxiliares, como um `HashMap`, para rastrear a frequência de caracteres distintos dentro da janela atual.