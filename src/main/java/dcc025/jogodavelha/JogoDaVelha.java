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

    public static Boolean vencedorLinha(Camada camadaTeste, Jogador jogadorTeste) {
        Boolean vitoria = false;
        char[] confere = new char[3];
        for (int i = 0; i < camadaTeste.getTamanho(); i++) {
            confere[i] = ' ';
        }
        for (int i = 0; i < camadaTeste.getTamanho(); i++) {
            confere[i] = camadaTeste.casas[0][i];
        }
        if ((confere[0] == jogadorTeste.getSimbolo()) && ((confere[1] == jogadorTeste.getSimbolo()) && (confere[2] == jogadorTeste.getSimbolo()))) {
            vitoria = true;
        }
        System.out.println("no vetor confere os simbolos são: " + confere[0] + confere[1] + confere[2]);
        return vitoria;
    }

    /*public Boolean vencedorColuna(){    //camada
        
    }
    public Boolean vencedorDiagonalPrincipal(){ //camada
        
    }
    public Boolean vencedorDiagonalSecundaria(){    //camada
        
    }
    public Boolean verificaVencedor(){ //matriz
        for(int camada; camada < 3;){
            for(int coluna){
                for(int linha)
            }
        }
    }*/
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

        Jogador jogador1 = new Jogador("bot", 'X');
        jogador1 = insereJogador();
        Jogador jogador2 = new Jogador("bot", 'X');
        jogador2 = insereJogador();

        int vezDeJogar = 0;
        Scanner teclado = new Scanner(System.in);
        String proximaJogada = "";
        while ((!vencedorLinha(camada1, jogador1))
                && (!vencedorLinha(camada1, jogador2))
                && (!vencedorLinha(camada2, jogador1))
                && (!vencedorLinha(camada2, jogador2))
                && (!vencedorLinha(camada3, jogador1))
                && (!vencedorLinha(camada3, jogador2))) {
            //  vez do primeiro jogador
            if (vezDeJogar == 0) {
                System.out.println("Vez de " + jogador1.getNome() + "\n" + "Digite a posicao que deseja jogar no formato (linha, coluna, camada):");
                proximaJogada = teclado.nextLine();
                Jogada jogada = Jogada.cria(proximaJogada);
                System.out.println("JOGADA  FOI:\n"
                        + " linha: " + jogada.getLinha() + " coluna: " + jogada.getColuna() + " camada: " + jogada.getCamada());
                switch (jogada.getCamada()) {
                    case 1:
                        camada1.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] = jogador1.getSimbolo();
                        break;
                    case 2:
                        camada2.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] = jogador1.getSimbolo();
                        break;
                    case 3:
                        camada3.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] = jogador1.getSimbolo();
                        break;
                    default:
                        break;
                }
                imprimePartida(camada1, camada2, camada3);
                vezDeJogar = 1;
            }
            //  vez do segundo jogador
            if (vezDeJogar == 1) {
                System.out.println("Vez de " + jogador2.getNome() + "\n" + "Digite a posicao que deseja jogar no formato (linha, coluna, camada):");
                proximaJogada = teclado.nextLine();
                Jogada jogada = Jogada.cria(proximaJogada);
                System.out.println("JOGADA  FOI \n"
                        + " linha: " + jogada.getLinha() + " coluna: " + jogada.getColuna() + " camada: " + jogada.getCamada());
                switch (jogada.getCamada()) {
                    case 1:
                        camada1.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] = jogador2.getSimbolo();
                        break;
                    case 2:
                        camada2.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] = jogador2.getSimbolo();
                        break;
                    case 3:
                        camada3.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] = jogador2.getSimbolo();
                        break;
                    default:
                        break;
                }
                imprimePartida(camada1, camada2, camada3);
                vezDeJogar = 0;
            }
        }
        System.out.println("parabens voce venceu");
    }
}
