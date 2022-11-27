/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package dcc025.jogodavelha;

import static dcc025.jogodavelha.Jogador.insereJogador;
import static dcc025.jogodavelha.Jogador.insereBot;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class JogoDaVelha {

    public static Integer vencedorLinha(Camada[] todasCamadas, Jogador jogador1, Jogador jogador2) {

        char[] confere = new char[3];
        for (int i = 0; i < 3; i++) {
            confere[i] = ' ';
        }
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {

                    confere[i] = todasCamadas[k].casas[j][i];
//                System.out.println("no vetor confere os simbolos são: " + confere[0] + confere[1] + confere[2]);
                    if ((confere[0] == jogador1.getSimbolo()) && ((confere[1] == jogador1.getSimbolo()) && (confere[2] == jogador1.getSimbolo()))) {
                        return 1;
                    } else if ((confere[0] == jogador2.getSimbolo()) && ((confere[1] == jogador2.getSimbolo()) && (confere[2] == jogador2.getSimbolo()))) {
                        return 2;
                    }
                }
            }
        }
        return 0;
    }

    public static Integer vencedorColuna(Camada[] todasCamadas, Jogador jogador1, Jogador jogador2) {
        char[] confere = new char[3];
        for (int i = 0; i < 3; i++) {
            confere[i] = ' ';
        }
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {

                    confere[i] = todasCamadas[k].casas[i][j];
//                System.out.println("no vetor confere os simbolos são: " + confere[0] + confere[1] + confere[2]);
                    if ((confere[0] == jogador1.getSimbolo()) && ((confere[1] == jogador1.getSimbolo()) && (confere[2] == jogador1.getSimbolo()))) {
                        return 1;
                    } else if ((confere[0] == jogador2.getSimbolo()) && ((confere[1] == jogador2.getSimbolo()) && (confere[2] == jogador2.getSimbolo()))) {
                        return 2;
                    }
                }
            }
        }
        return 0;
    }

    public static Integer vencedorDiagonalPrincipal(Camada[] todasCamadas, Jogador jogador1, Jogador jogador2) {
        char[] confere = new char[3];
        for (int i = 0; i < 3; i++) {
            confere[i] = ' ';
        }
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {

                    confere[i] = todasCamadas[k].casas[i][i];
//                System.out.println("no vetor confere os simbolos são: " + confere[0] + confere[1] + confere[2]);
                    if ((confere[0] == jogador1.getSimbolo()) && ((confere[1] == jogador1.getSimbolo()) && (confere[2] == jogador1.getSimbolo()))) {
                        return 1;
                    } else if ((confere[0] == jogador2.getSimbolo()) && ((confere[1] == jogador2.getSimbolo()) && (confere[2] == jogador2.getSimbolo()))) {
                        return 2;
                    }
                }
            }
        }
        return 0;
    }

    public static Integer vencedorDiagonalSecundaria(Camada[] todasCamadas, Jogador jogador1, Jogador jogador2) {
        char[] confere = new char[3];
        for (int i = 0; i < 3; i++) {
            confere[i] = ' ';
        }
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {

                    if (i + j == 3 - 1) {
                        confere[i] = todasCamadas[k].casas[j][i];
                    }
//                System.out.println("no vetor confere os simbolos são: " + confere[0] + confere[1] + confere[2]);
                    if ((confere[0] == jogador1.getSimbolo()) && ((confere[1] == jogador1.getSimbolo()) && (confere[2] == jogador1.getSimbolo()))) {
                        return 1;
                    } else if ((confere[0] == jogador2.getSimbolo()) && ((confere[1] == jogador2.getSimbolo()) && (confere[2] == jogador2.getSimbolo()))) {
                        return 2;
                    }
                }
            }
        }
        return 0;
    }

    public static void imprimePartida(Camada camada1, Camada camada2, Camada camada3) {
        System.out.println("-Camada 1-");
        camada1.imprimeCamada();
        System.out.println("-Camada 2-");
        camada2.imprimeCamada();
        System.out.println("-Camada 3-");
        camada3.imprimeCamada();
    }

//    public static Boolean posicaoLivre(Camada[] todasCamadas) {
//        for (int k = 0; k < 3; k++) {
//            for (int j = 0; j < 3; j++) {
//                for (int i = 0; i < 3; i++) {
//                    if (todasCamadas[k].casas[i][j] == '-') {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
    public static void main(String[] args) {
        Camada[] todasCamadas = new Camada[3];
        Camada camada1 = new Camada();
        Camada camada2 = new Camada();
        Camada camada3 = new Camada();
        todasCamadas[0] = camada1;
        todasCamadas[1] = camada2;
        todasCamadas[2] = camada3;

        System.out.println("Digite o modo de jogo\nJxJ - para dois jogadores, ou JxB - para jogar contra o bot");
        Scanner teclado = new Scanner(System.in);
        String modoJogo;
        modoJogo = teclado.nextLine();
        if (modoJogo.equals("JxJ")) {

            imprimePartida(camada1, camada2, camada3);

            Jogador jogador1 = new Jogador("bot", 'X');
            jogador1 = insereJogador();
            Jogador jogador2 = new Jogador("bot", 'X');
            jogador2 = insereJogador();

            int vezDeJogar = 0;

            String proximaJogada = "";
            while ((vencedorLinha(todasCamadas, jogador1, jogador2) == 0)
                    && (vencedorLinha(todasCamadas, jogador1, jogador2) == 0)
                    && (vencedorDiagonalPrincipal(todasCamadas, jogador1, jogador2) == 0)
                    && (vencedorDiagonalSecundaria(todasCamadas, jogador1, jogador2) == 0)) {

                //  vez do primeiro jogador
                if (vezDeJogar == 0) {
                    if (vencedorLinha(todasCamadas, jogador1, jogador2) == 1) {
                        System.out.println("PARABÉNS!! " + jogador1.getNome() + " você venceu!");
                        return;
                    } else if (vencedorLinha(todasCamadas, jogador1, jogador2) == 2) {
                        System.out.println("PARABÉNS!! " + jogador2.getNome() + " você venceu!");
                        return;
                    }
                    System.out.println("Vez de " + jogador1.getNome() + "\n" + "Digite a posicao que deseja jogar no formato (linha, coluna, camada):");
                    proximaJogada = teclado.nextLine();
                    Jogada jogada = Jogada.cria(proximaJogada);
                    System.out.println("JOGADA  FOI:\n"
                            + " linha: " + jogada.getLinha() + " coluna: " + jogada.getColuna() + " camada: " + jogada.getCamada());
                    switch (jogada.getCamada()) {
                        case 1:
                            if (camada1.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] == '-') {
                                camada1.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] = jogador1.getSimbolo();
                                vezDeJogar = 1;
                            } else {
                                System.out.println("\n\nPosicao ocupada!");
                            }
                            break;
                        case 2:
                            if (camada2.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] == '-') {
                                camada2.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] = jogador1.getSimbolo();
                                vezDeJogar = 1;
                            } else {
                                System.out.println("\n\nPosicao ocupada!");
                            }
                            break;
                        case 3:
                            if (camada3.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] == '-') {
                                camada3.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] = jogador1.getSimbolo();
                                vezDeJogar = 1;
                            } else {
                                System.out.println("\n\nPosicao ocupada!");
                            }
                            break;
                        default:
                            break;
                    }
                    imprimePartida(camada1, camada2, camada3);
                }
                //  vez do segundo jogador
                if (vezDeJogar == 1) {
                    if (vencedorLinha(todasCamadas, jogador1, jogador2) == 1) {
                        System.out.println("PARABÉNS!! " + jogador1.getNome() + " você venceu!");
                        return;
                    } else if (vencedorLinha(todasCamadas, jogador1, jogador2) == 2) {
                        System.out.println("PARABÉNS!! " + jogador2.getNome() + " você venceu!");
                        return;
                    }
                    System.out.println("Vez de " + jogador2.getNome() + "\n" + "Digite a posicao que deseja jogar no formato (linha, coluna, camada):");
                    proximaJogada = teclado.nextLine();
                    Jogada jogada = Jogada.cria(proximaJogada);
                    System.out.println("JOGADA  FOI \n"
                            + " linha: " + jogada.getLinha() + " coluna: " + jogada.getColuna() + " camada: " + jogada.getCamada());
                    switch (jogada.getCamada()) {
                        case 1:
                            if (camada1.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] == '-') {
                                camada1.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] = jogador2.getSimbolo();
                                vezDeJogar = 0;
                            } else {
                                System.out.println("\n\nPosicao ocupada!");
                            }
                            break;
                        case 2:
                            if (camada2.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] == '-') {
                                camada2.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] = jogador2.getSimbolo();
                                vezDeJogar = 0;
                            } else {
                                System.out.println("\n\nPosicao ocupada!");
                            }
                            break;
                        case 3:
                            if (camada3.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] == '-') {
                                camada3.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] = jogador2.getSimbolo();
                                vezDeJogar = 0;
                            } else {
                                System.out.println("\n\nPosicao ocupada!");
                            }
                            break;
                        default:
                            break;
                    }
                    imprimePartida(camada1, camada2, camada3);
                }
            }
            System.out.println("FIM DE JOGO");
        } else if (modoJogo.equals("JxB")) {
            imprimePartida(camada1, camada2, camada3);

            Jogador jogador1 = new Jogador("bot", 'X');
            jogador1 = insereJogador();
            Jogador jogador2 = new Jogador("bot", 'X');
            jogador2 = insereBot();
            int vezDeJogar = 0;

            String proximaJogada = "";
            while ((vencedorLinha(todasCamadas, jogador1, jogador2) == 0)
                    && (vencedorLinha(todasCamadas, jogador1, jogador2) == 0)
                    && (vencedorDiagonalPrincipal(todasCamadas, jogador1, jogador2) == 0)
                    && (vencedorDiagonalSecundaria(todasCamadas, jogador1, jogador2) == 0)) {

                //  vez do primeiro jogador
                if (vezDeJogar == 0) {
                    if (vencedorLinha(todasCamadas, jogador1, jogador2) == 1) {
                        System.out.println("PARABÉNS!! " + jogador1.getNome() + " você venceu!");
                        return;
                    } else if (vencedorLinha(todasCamadas, jogador1, jogador2) == 2) {
                        System.out.println("PARABÉNS!! " + jogador2.getNome() + " você venceu!");
                        return;
                    }
                    System.out.println("Vez de " + jogador1.getNome() + "\n" + "Digite a posicao que deseja jogar no formato (linha, coluna, camada):");
                    proximaJogada = teclado.nextLine();
                    Jogada jogada = Jogada.cria(proximaJogada);
                    System.out.println("JOGADA  FOI:\n"
                            + " linha: " + jogada.getLinha() + " coluna: " + jogada.getColuna() + " camada: " + jogada.getCamada());
                    switch (jogada.getCamada()) {
                        case 1:
                            if (camada1.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] == '-') {
                                camada1.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] = jogador1.getSimbolo();
                                vezDeJogar = 1;
                            } else {
                                System.out.println("\n\nPosicao ocupada!");
                            }
                            break;
                        case 2:
                            if (camada2.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] == '-') {
                                camada2.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] = jogador1.getSimbolo();
                                vezDeJogar = 1;
                            } else {
                                System.out.println("\n\nPosicao ocupada!");
                            }
                            break;
                        case 3:
                            if (camada3.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] == '-') {
                                camada3.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] = jogador1.getSimbolo();
                                vezDeJogar = 1;
                            } else {
                                System.out.println("\n\nPosicao ocupada!");
                            }
                            break;
                        default:
                            break;
                    }
                    imprimePartida(camada1, camada2, camada3);
                }
                //  vez do segundo jogador
                if (vezDeJogar == 1) {
                    if (vencedorLinha(todasCamadas, jogador1, jogador2) == 1) {
                        System.out.println("PARABÉNS!! " + jogador1.getNome() + " você venceu!");
                        return;
                    } else if (vencedorLinha(todasCamadas, jogador1, jogador2) == 2) {
                        System.out.println("PARABÉNS!! " + jogador2.getNome() + " você venceu!");
                        return;
                    }
                    System.out.println("Vez de " + jogador2.getNome() + "\n" + "Digite a posicao que deseja jogar no formato (linha, coluna, camada):");
                    int linha = (int) (Math.random() * (3 - 1) + 1);
                    int coluna = (int) (Math.random() * (3 - 1) + 1);
                    int camada = (int) (Math.random() * (3 - 1) + 1);
                    proximaJogada = Integer.toString(linha) + "," + Integer.toString(coluna) + "," + Integer.toString(camada);
                    Jogada jogada = Jogada.cria(proximaJogada);
                    System.out.println("JOGADA  FOI \n"
                            + " linha: " + jogada.getLinha() + " coluna: " + jogada.getColuna() + " camada: " + jogada.getCamada());
                    switch (jogada.getCamada()) {
                        case 1:
                            if (camada1.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] == '-') {
                                camada1.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] = jogador2.getSimbolo();
                                vezDeJogar = 0;
                            } else {
                                System.out.println("\n\nPosicao ocupada!");
                            }
                            break;
                        case 2:
                            if (camada2.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] == '-') {
                                camada2.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] = jogador2.getSimbolo();
                                vezDeJogar = 0;
                            } else {
                                System.out.println("\n\nPosicao ocupada!");
                            }
                            break;
                        case 3:
                            if (camada3.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] == '-') {
                                camada3.casas[jogada.getLinha() - 1][jogada.getColuna() - 1] = jogador2.getSimbolo();
                                vezDeJogar = 0;
                            } else {
                                System.out.println("\n\nPosicao ocupada!");
                            }
                            break;
                        default:
                            break;
                    }
                    imprimePartida(camada1, camada2, camada3);
                }
            }
            System.out.println("FIM DE JOGO");
        }
    }
}
