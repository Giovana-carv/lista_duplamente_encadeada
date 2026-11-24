package com.lista_dupla_encadeada;

public class Main {

    public static void main(String[] args) {

        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        System.out.println("===== ETAPA 1 =====");

        lista.inserir("Homer");
        lista.inserir("Marge");

        lista.exibir();

        System.out.println("\n===== ETAPA 2 =====");

        lista.esvaziar();

        lista.exibir();

        System.out.println("\n===== ETAPA 3 =====");

        lista.inserir("Homer");
        lista.inserirPosicao("Bart", 0);
        lista.inserirPosicao("Moll", 1);

        lista.exibir();

        System.out.println("\n===== ETAPA 4 =====");

        lista.esvaziar();

        lista.exibir();

        System.out.println("\n===== ETAPA 5 =====");

        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.inserirInicio("Lisa");

        lista.exibir();

        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("\n===== ETAPA 6 =====");

        lista.esvaziar();

        lista.exibir();

        System.out.println("\n===== ETAPA 7 =====");

        lista.inserir("Homer");
        lista.inserir("Maggie");
        lista.inserirPosicao("Bart", 0);
        lista.inserirPosicao("Marge", 1);

        lista.exibir();

        System.out.println("Lisa está na lista? " + lista.contem("Lisa"));

        System.out.println("\n===== ETAPA 8 =====");

        lista.esvaziar();

        lista.exibir();

        System.out.println("\n===== ETAPA 9 =====");

        lista.inserir("Homer");
        lista.inserir("Bart");

        lista.exibir();

        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("\n===== ETAPA 10 =====");

        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));

        lista.exibir();

        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("\n===== ETAPA 11 =====");

        lista.esvaziar();

        lista.exibir();

        System.out.println("\n===== ETAPA 12 =====");

        lista.inserirInicio("Homer");
        lista.inserirInicio("Bart");
        lista.inserir("Marge");
        lista.inserirPosicao("Maggie", 1);
        lista.inserirInicio("Ned Flanders");
        lista.inserir("Sr. Burns");

        lista.exibir();

        System.out.println("\n===== ETAPA 13 =====");

        lista.removerFim();

        lista.exibir();

        System.out.println("\n===== ETAPA 14 =====");

        lista.removerPosicao(1);

        lista.exibir();

        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("\n===== ETAPA 15 =====");

        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));

        lista.exibir();

        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("\n===== ETAPA 16 =====");

        lista.removerInicio();

        lista.exibir();

        System.out.println("Tamanho: " + lista.tamanho());


        System.out.println("\n===== ETAPA 17 =====");

        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));

        lista.exibir();

        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("\n===== ETAPA 18 =====");

        lista.esvaziar();

        lista.exibir();

        System.out.println("Tamanho: " + lista.tamanho());
    }
}