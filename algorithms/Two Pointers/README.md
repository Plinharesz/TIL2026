#  Two Pointers (Dois Ponteiros)

##  Resumo da Técnica
O padrão **Two Pointers** envolve o uso de dois ponteiros (índices) para percorrer uma estrutura de dados (geralmente arrays, strings ou listas encadeadas) de forma coordenada.

O objetivo principal é **reduzir a complexidade de tempo**, evitando loops aninhados. Em vez de percorrer o array repetidamente para cada elemento ($O(n^2)$), processamos os dados em uma única passagem (ou poucas passagens) linear ($O(n)$).

---

##  Quando utilizar?
Fique atento a estes sinais nos enunciados do LeetCode:

1.  **Array Ordenado:** Se o problema envolve buscar pares em um array *sorted* (ordenado), 90% das vezes a solução é Two Pointers ou Binary Search.
2.  **Busca de Pares/Triplas:** Encontrar dois ou três números que somam um valor alvo (`target`).
3.  **In-place Operations:** Mover elementos, remover duplicatas ou inverter partes de um array sem usar memória extra ($O(1)$ space).
4.  **Palíndromos:** Verificar ou construir strings simétricas.

---

## ️ Variações Principais

### 1. Convergentes (Left & Right)
Um ponteiro começa no início (`left = 0`) e outro no final (`right = n-1`). Eles se movem em direção ao centro até se encontrarem.

* **Uso típico:** Validar palíndromos, encontrar pares de soma em arrays ordenados (Two Sum II), Container With Most Water.
* **Lógica Base:**
    ```python
    left, right = 0, len(nums) - 1
    
    while left < right:
        if condicao_de_sucesso:
            return true
        elif precisa_aumentar_valor:
            left += 1
        else: # precisa_diminuir_valor
            right -= 1
    ```

### 2. Lento e Rápido (Slow & Fast / Tortoise & Hare)
Ambos começam no início, mas movem-se em velocidades diferentes. O `fast` geralmente avança 1 ou 2 passos à frente.

* **Uso típico:** Detectar ciclos em Linked Lists, encontrar o meio de uma lista, remover duplicatas de array ordenado (in-place).
* **Lógica Base (Remover Duplicatas):**
    ```python
    slow = 0
    for fast in range(len(nums)):
        if nums[fast] != nums[slow]:
            slow += 1
            nums[slow] = nums[fast]
    return slow + 1
    ```

### 3. Merge de Arrays
Usado quando temos dois arrays ordenados e precisamos combiná-los. Cada array tem seu próprio ponteiro.
* **Uso típico:** Merge Sorted Array, Merge Sort (fase de conquista).

---

## 🧠 Complexidade Típica

* **Tempo:** $O(n)$ - Na maioria dos casos, percorremos a estrutura apenas uma vez (ou um número constante de vezes).
* **Espaço:** $O(1)$ - A grande vantagem dessa técnica é não precisar de estruturas auxiliares como HashMaps ou Arrays extras.

---

## ⚠️ Armadilhas Comuns (Fique Atento)

1.  **Condição de Parada (`while`):**
    * Deve ser `left < right` ou `left <= right`?
    * *Dica:* Se o elemento do meio precisa ser verificado (ex: palíndromo com número ímpar de letras), use `<=`. Se os ponteiros nunca devem cruzar ou sobrepor para o mesmo par, use `<`.
2.  **Arrays Não Ordenados:**
    * Para problemas como "3Sum" ou "Two Sum II", se o array não estiver ordenado, a técnica de convergir ponteiros **não funciona**. Lembre-se de ordenar o array antes ($O(n \log n)$) se o problema permitir.
3.  **Off-by-one Errors:** Cuidado ao incrementar/decrementar índices para não acessar posições inválidas (IndexOutOfBound).

---

## 📝 Check-list de Estudos (NeetCode Roadmap)
Exercícios essenciais para dominar essa categoria:

- [ ] **Valid Palindrome** (Fácil - Intro perfeita à técnica Convergente)
- [ ] **Two Sum II - Input Array Is Sorted** (Médio - O clássico do array ordenado)
- [ ] **3Sum** (Médio - Extensão do Two Sum, requer cuidado com duplicatas)
- [ ] **Container With Most Water** (Médio - Lógica gananciosa com ponteiros)
- [ ] **Trapping Rain Water** (Difícil - O "chefão" dessa categoria)

---

> *"A otimização vem de descartar o impossível. Se o array está ordenado e a soma atual é maior que o alvo, eu **sei** que preciso diminuir o ponteiro da direita. Não é um 'chute', é uma certeza matemática."*