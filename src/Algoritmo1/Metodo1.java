/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmo1;

import java.util.Scanner;

/**
 *
 * @author Vanessa
 */
public class Metodo1 {

    public void Metodo() {
        int[] arregloOrigen = this.SolicitarDatos();
        int[] array = new int[arregloOrigen.length];
        int derecha, izquierda;
        int mult = 1, mult2 = 1;
        int resultado = 0;

        for (int x = 0; x < arregloOrigen.length; x++) {
            derecha = x + 1;
            izquierda = x - 1;
            for (int y = derecha; y < arregloOrigen.length; y++) {
                mult = mult * arregloOrigen[y];
            }
            for (int z = izquierda; z >= 0; z--) {
                mult2 = mult2 * arregloOrigen[z];
            }
            resultado = mult * mult2;
            array[x] = resultado;
            System.out.print(array[x]+", ");
            mult = 1;
            mult2 = 1;
        }
    }
    public int[] SolicitarDatos() {
        int n;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cantidad total de dígitos a registrar: ");
        n = entrada.nextInt();

        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i+1) + " :");
            arreglo[i] = entrada.nextInt();
        }
        return arreglo;
    }
}
