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

    public int linha;
    public int coluna;
    public int camada;

    public Jogada(String entrada) {

        char[] coordenadas = new char[8];
        coordenadas[0] = entrada.charAt(1);
        coordenadas[1] = entrada.charAt(4);
        coordenadas[2] = entrada.charAt(7);

        linha = Character.getNumericValue(coordenadas[0]);
        coluna = Character.getNumericValue(coordenadas[1]);
        camada = Character.getNumericValue(coordenadas[2]);

    }
}
