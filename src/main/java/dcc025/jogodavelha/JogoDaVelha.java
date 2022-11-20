/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package dcc025.jogodavelha;

import static dcc025.jogodavelha.Jogador.insereJogador;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class JogoDaVelha {

    public static void imprimePartida(Camada camada1, Camada camada2, Camada camada3) {
        System.out.println("-Camada 1-");
        camada1.imprimeCamada();
        System.out.println("-Camada 2-");
        camada2.imprimeCamada();
        System.out.println("-Camada 3-");
        camada3.imprimeCamada();
    }

    public static void main(String[] args) {
        Camada camada1 = new Camada();
        Camada camada2 = new Camada();
        Camada camada3 = new Camada();
        imprimePartida(camada1, camada2, camada3);

        Jogador jogador1 = new Jogador("bot", "X");
        jogador1 = insereJogador();
        Jogador jogador2 = new Jogador("bot", "X");
        jogador2 = insereJogador();

        int vezDeJogar = 0;
        Scanner teclado = new Scanner(System.in);
        String proximaJogada = "";
        if (vezDeJogar == 0) {
            System.out.println("Vez de " + jogador1.nome + "\n" + "Digite a posicao que deseja jogar no formato (linha, coluna, camada):");
            proximaJogada = teclado.nextLine();
            Jogada jogada = new Jogada(proximaJogada);
            System.out.println("ESSA FOI A JOGADA \n"
                    + " linha: " + jogada.linha + " coluna: " + jogada.coluna + " camada: " + jogada.camada);
            if (jogada.camada == 1) {
                camada1.casas[jogada.linha-1][jogada.coluna-1] = jogador1.simbolo;
            } else if (jogada.camada == 2) {
                camada1.casas[jogada.linha-1][jogada.coluna-1] = jogador1.simbolo;
            }
            if (jogada.camada == 3) {
                camada1.casas[jogada.linha-1][jogada.coluna-1] = jogador1.simbolo;
            }
            imprimePartida(camada1, camada2, camada3);
            vezDeJogar = 1;
        }
        if (vezDeJogar == 1) {
            System.out.println("Vez de " + jogador2.nome + "\n" + "Digite a posicao que deseja jogar no formato (linha, coluna, camada):");
            vezDeJogar = 0;
        }
    }
}
