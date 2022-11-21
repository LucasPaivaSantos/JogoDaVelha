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

    public char casas[][];
    private final int tamanho = 3;

    public Camada() {
        casas = new char[tamanho][tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                casas[i][j] = '-';
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

    public int getTamanho() {
        return tamanho;
    }
    
    
}
