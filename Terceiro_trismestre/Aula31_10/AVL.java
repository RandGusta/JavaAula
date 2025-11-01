// BTS --> problema de que se for elementos em ordem vira uma lista 
// AVL foi feita para resolver esse problema
// faço o calculo do fator de balanceamentO(FB)
// -1 <= FB <= 1 para ser AVL;  FB = Hl - Hr
// quando temos um fator de balanceamento NEGATIVO temos a árvore pesada a DIREITA
// Altura = H = 1 + max(Hl, Hr)
//        50
//       /  \    --> árvore com altura 1
//     NULL NULL  

//        50
//       /  \     --> árvore com altura 2
//     NULL  80   --> começamos a calcular a altura pela subarvore
//

//        50      --> altura = 2; FB = -2;
//       /  \     
//     NULL  80   --> altura = 1; FB = -1;
//            \
//             90 --> altura = 0; FB = 0;


// se estiver pesado para direita pego o filho da DIREIta do Node que está desbalanceado --> aplicamos a rotação a esquerda 
//        50     \      --> se traçarmos uma linha aos nodes que queremos mexer --> rotação simples
//       /  \     \  
//     NULL  80    \ 
//          /  \    \ 
//       temp   90   \


// Após a rotação
//        80      
//       /  \     
//     50    90   
//       \
//       temp    


//        50 --> altura = 1; FB = 1 --> Pois tende pra Esquerda então é positivo 
//       /  \    
//     40   NULL 

// FB < 0 --> rotação a esquerda
// FB >= 0 --> rotação a direita








