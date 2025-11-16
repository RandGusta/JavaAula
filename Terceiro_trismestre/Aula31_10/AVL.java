// ------------------------------
// CONCEITOS BÁSICOS
// ------------------------------

// O problema das BST é que, se os elementos são inseridos em ordem,
// a árvore degenera em uma lista.

// A AVL foi criada para resolver esse problema,
// garantindo que a árvore fique sempre balanceada.

// Cálculo do Fator de Balanceamento (FB):
// FB = altura(subárvore esquerda) - altura(subárvore direita)
// Para ser AVL:  -1 <= FB <= 1

// Interpretação:
// FB > 1  → árvore mais pesada à ESQUERDA
// FB < -1  → árvore mais pesada à DIREITA

// Definição de altura:
// Altura(node) = 1 + max(altura(left), altura(right))


// ------------------------------
// EXEMPLOS DE CÁLCULO DE ALTURA E FB
// ------------------------------
//
//    50
//   /  \
// NULL NULL
// Altura = 0
//
//
//    50
//   /  \
// NULL  80
// Altura(50) = 1 + max(-1, 0) = 1
//
//
//    50
//   /  \
// NULL  80
//        \
//         90
//
// Altura(90) = 0
// Altura(80) = 1 + max(-1, 0) = 1 → FB = -1
// Altura(50) = 1 + max(-1, 1) = 2 → FB = -2  (desbalanceado à direita)


// ------------------------------
// REGRAS PARA ROTAÇÕES
// ------------------------------

// Caso 1 — Desbalanceado à DIREITA (FB < -1):
// → verificar FB do filho à direita:
//    - se FB <= 0 → rotação simples À ESQUERDA
//    - se FB  > 0 → rotação dupla DIREITA-ESQUERDA


// Exemplo rotação simples à esquerda:
// (linha reta para direita)
//
//      50
//        \
//         80
//           \
//            90
//
// Após rotação:
//
//        80
//       /  \
//     50   90
//
// O filho da direita se torna a nova raiz.
// O que estava à ESQUERDA dessa nova raiz passa a ser filho direito da antiga raiz.


// Caso 2 — Desbalanceado à ESQUERDA (FB > 1):
// → verificar FB do filho à esquerda:
//    - se FB >= 0 → rotação simples À DIREITA
//    - se FB  < 0 → rotação dupla ESQUERDA-DIREITA


// Exemplo pesado para esquerda:
//
//      50
//     /
//   40
//
// FB = 1 → rotacionar à DIREITA


// ------------------------------
// RESUMO DAS DECISÕES
// ------------------------------
//
// FB < -1  → pesado à DIREITA  → rotacionar ESQUERDA
// FB >  1  → pesado à ESQUERDA → rotacionar DIREITA
//
// Na rotação simples:
// - Filho mais próximo se torna a nova raiz
// - Subárvore “do meio” troca de lado


// ------------------------------
// MÉTODOS (mantidos no final)
// ------------------------------


private int height(Node node){
    if(node == null) return -1;
    return node.height;
}

private int updateHeight(Node node){ // chamar toda vez que add ou remove
    int leftHeight = 1 + height(node.left);
    int rightHeight = 1 + height(node.right);
    return Math.max(leftHeight, rightHeight);
}

private int balanceFactor(Node node){
    return height(node.left) - height(node.right);
}

private Node rebalance(Node node){
    int fb = balanceFactor(node);
    if(fb < -1 && balanceFactor(node.right) <= 0){
        return rotateLeft(node);
    }
    // mais casos viriam aqui
    return node;
}

private Node rotateLeft(Node node){
    Node newRoot = node.right;
    Node leftRight = newRoot.left;

    newRoot.left = node;
    node.right = leftRight;

    // atualizar alturas aqui depois
    return newRoot;
}

public Node rotacionarAvore(Node node){
    Node newRoot = node.left;
    Node newRootLeft = newRoot.left;

    newRoot.left = node;
    node.right = newRootLeft;

    // atualizar altura
    return newRoot;
}
