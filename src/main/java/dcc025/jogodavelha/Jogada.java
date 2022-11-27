/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.jogodavelha;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Jogada {

    private Integer linha;
    private Integer coluna;
    private Integer camada;
//    private static List<String> jogadasUsadas = new ArrayList<>();

//    private Boolean validaJogada(String entrada) {
//        Boolean posicaoLivre;
//        for (String jogada : jogadasUsadas) {
//            posicaoLivre = entrada.equals(jogada);
//            if (!posicaoLivre) {
//                System.out.println("A posicao ja esta ocupada");
//                return false;
//            }
//        }
//        return true;
//    }

    private Jogada(String entrada) {
        String[] coordenadas = new String[3];

        coordenadas = entrada.split(",");
        if (Integer.parseInt(coordenadas[0]) < 4
                && Integer.parseInt(coordenadas[0]) > 0) {
            this.linha = Integer.valueOf(coordenadas[0]);
        }
        if (Integer.parseInt(coordenadas[1]) < 4
                && Integer.parseInt(coordenadas[1]) > 0) {
            this.coluna = Integer.valueOf(coordenadas[1]);
        }
        if (Integer.parseInt(coordenadas[2]) < 4
                && Integer.parseInt(coordenadas[2]) > 0) {
            this.camada = Integer.valueOf(coordenadas[2]);
        } else {
            System.out.println("Valores de entrada invalidos");
        }
    }

    public static Jogada cria(String entrada) {
        entrada = entrada.replaceAll(" ", "");
        entrada = entrada.replace("(", "");
        entrada = entrada.replace(")", "");
//        if (!entrada.matches("\\(\\d,\\d,\\d\\)")) {
//            return null;
//        }
//        jogadasUsadas.add(entrada);
        return new Jogada(entrada);
    }

    public Integer getLinha() {
        return this.linha;
    }

    public Integer getColuna() {
        return this.coluna;
    }

    public Integer getCamada() {
        return this.camada;
    }
}
