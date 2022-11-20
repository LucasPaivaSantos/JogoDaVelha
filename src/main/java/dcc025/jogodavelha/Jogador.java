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
 
    public String nome;
    public String simbolo;

    public Jogador(String nome, String simbolo) {
        this.nome = nome;
        this.simbolo = simbolo;
    }
    
    public static Jogador insereJogador() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do novo jogador");
        String nomeNovoJogador = teclado.nextLine();
        System.out.println("Digite o símbolo do novo jogador");
        String simboloNovoJogador = teclado.nextLine();

        Jogador novoJogador = new Jogador(nomeNovoJogador, simboloNovoJogador);
        return novoJogador;
    }
}
