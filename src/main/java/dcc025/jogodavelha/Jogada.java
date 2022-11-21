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
        char[] coordenadas = new char[7];
        coordenadas[0] = entrada.charAt(1);
        coordenadas[1] = entrada.charAt(3);
        coordenadas[2] = entrada.charAt(5);

        this.linha = Character.getNumericValue(coordenadas[0]);
        this.coluna = Character.getNumericValue(coordenadas[1]);
        this.camada = Character.getNumericValue(coordenadas[2]);
    }

    public static Jogada cria(String entrada) {
        entrada = entrada.replaceAll(" ", "");
        if (!entrada.matches("\\(\\d,\\d,\\d\\)")) {
            return null;
        }
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
