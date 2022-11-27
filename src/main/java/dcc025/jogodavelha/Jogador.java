/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.jogodavelha;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Jogador {

    private String nome;
    private char simbolo;

    public Jogador(String nome, char simbolo) {
        this.nome = nome;
        this.simbolo = simbolo;
    }

    public static Jogador insereJogador() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do novo jogador");
        String nomeNovoJogador = teclado.nextLine();
        System.out.println("Digite o símbolo do novo jogador");
        char simboloNovoJogador = teclado.nextLine().charAt(0);

        Jogador novoJogador = new Jogador(nomeNovoJogador, simboloNovoJogador);
        return novoJogador;
    }

    public static Jogador insereBot() {
        System.out.println("Jogando contra o bot");
        String nomeNovoJogador = "Bot";
        char simboloNovoJogador = 'X';
        Jogador novoJogador = new Jogador(nomeNovoJogador, simboloNovoJogador);
        return novoJogador;
    }

    public String getNome() {
        return nome;
    }

    public char getSimbolo() {
        return simbolo;
    }

}
