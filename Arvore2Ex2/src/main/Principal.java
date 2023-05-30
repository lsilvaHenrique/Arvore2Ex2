package main;

import br.edu.fateczl.arvoreint.*;

public class Principal {
    public static void main(String[] args) {
        // Criação da árvore
        Arvore arvore = new Arvore();
        arvore.insert(12);
        arvore.insert(16);
        arvore.insert(4);
        arvore.insert(2);
        arvore.insert(8);
        arvore.insert(6);

        // Determinação do nível do nó com valor 6
        try {
            arvore.search(6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


