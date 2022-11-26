/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.jogodavelha;

/**
 *
 * @author lucas
 */
public class Jogada {

    private final Integer linha;
    private final Integer coluna;
    private final Integer camada;

    private Jogada(String entrada) {
        String[] coordenadas = new String[3];

        coordenadas = entrada.split(",");
        this.linha = Integer.valueOf(coordenadas[0]);
        this.coluna = Integer.valueOf(coordenadas[1]);
        this.camada = Integer.valueOf(coordenadas[2]);
    }

    public static Jogada cria(String entrada) {
        entrada = entrada.replaceAll(" ", "");
        entrada = entrada.replace("(", "");
        entrada = entrada.replace(")", "");
//        if (!entrada.matches("\\(\\d,\\d,\\d\\)")) {
//            return null;
//        }
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
