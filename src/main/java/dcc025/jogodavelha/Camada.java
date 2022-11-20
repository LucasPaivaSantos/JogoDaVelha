/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.jogodavelha;

/**
 *
 * @author lucas
 */
public class Camada {

    public String casas[][];
    private final int tamanho = 3;

    public Camada() {
        casas = new String[tamanho][tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                casas[i][j] = "-";
            }
        }
    }
    

    public void imprimeCamada() {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(" " + this.casas[i][j] + " ");
            }
        System.out.println("");
        }
    }
}
