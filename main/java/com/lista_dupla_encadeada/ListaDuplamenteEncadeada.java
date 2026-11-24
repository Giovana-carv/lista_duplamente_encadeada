package com.lista_dupla_encadeada;

public class ListaDuplamenteEncadeada {

    No inicio;
    No fim;

    public ListaDuplamenteEncadeada() {

        this.inicio = null;
        this.fim = null;
    }

    public void inserir(String valor) {

        No novoNo = new No(valor);

        if (inicio == null) {

            inicio = novoNo;
            fim = novoNo;

        } else {

            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public void inserirInicio(String valor) {

        No novoNo = new No(valor);

        if (inicio == null) {

            inicio = novoNo;
            fim = novoNo;

        } else {

            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
    }

    public void inserirPosicao(String valor, int posicao) {

        if (posicao < 0 || posicao > tamanho()) {
            return;
        }

        if (posicao == 0) {

            inserirInicio(valor);
            return;
        }

        if (posicao == tamanho()) {

            inserir(valor);
            return;
        }

        No novoNo = new No(valor);
        No atual = inicio;

        for (int i = 0; i < posicao; i++) {

            atual = atual.proximo;
        }

        novoNo.anterior = atual.anterior;
        novoNo.proximo = atual;

        atual.anterior.proximo = novoNo;
        atual.anterior = novoNo;
    }

    public void exibir() {

        No atual = inicio;

        while (atual != null) {

            System.out.print(atual.valor + " ");

            atual = atual.proximo;
        }

        System.out.println();
    }


    public void exibirInverso() {

        No atual = fim;

        while (atual != null) {

            System.out.print(atual.valor + " ");

            atual = atual.anterior;
        }

        System.out.println();
    }


    public void remover(String valor) {

        No atual = inicio;

        while (atual != null) {

            if (atual.valor.equals(valor)) {

                if (atual.anterior != null) {

                    atual.anterior.proximo = atual.proximo;

                } else {

                    inicio = atual.proximo;
                }

                if (atual.proximo != null) {

                    atual.proximo.anterior = atual.anterior;

                } else {

                    fim = atual.anterior;
                }

                atual = null;
                return;
            }

            atual = atual.proximo;
        }
    }

    public void removerInicio() {

        if (inicio == null) {
            return;
        }

        if (inicio == fim) {

            inicio = null;
            fim = null;

        } else {

            inicio = inicio.proximo;
            inicio.anterior = null;
        }
    }


    public void removerFim() {

        if (fim == null) {
            return;
        }

        if (inicio == fim) {

            inicio = null;
            fim = null;

        } else {

            fim = fim.anterior;
            fim.proximo = null;
        }
    }

    public void removerPosicao(int posicao) {

        if (posicao < 0 || posicao >= tamanho()) {
            return;
        }

        if (posicao == 0) {

            removerInicio();
            return;
        }

        if (posicao == tamanho() - 1) {

            removerFim();
            return;
        }

        No atual = inicio;

        for (int i = 0; i < posicao; i++) {

            atual = atual.proximo;
        }

        atual.anterior.proximo = atual.proximo;
        atual.proximo.anterior = atual.anterior;

        atual = null;
    }

    public boolean contem(String valor) {

        No atual = inicio;

        while (atual != null) {

            if (atual.valor.equals(valor)) {
                return true;
            }

            atual = atual.proximo;
        }

        return false;
    }

    public int tamanho() {

        int contador = 0;
        No atual = inicio;

        while (atual != null) {

            contador++;

            atual = atual.proximo;
        }

        return contador;
    }

    public void esvaziar() {

        inicio = null;
        fim = null;
    }
}