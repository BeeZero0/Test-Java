/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Algoritmo1.Metodo1;
import GuiCrud.MenuPrincipal;
import Raccoon.GuiPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Vanessa
 */
public class Menu {

    public void MenuProgramas() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el programa que desea ejecutar \n 1. Algoritmo 1 \n 2. Algoritmo 2 \n 3. Raccoon \n 4. CRUD"));
        switch (num) {
            case 1:
                Metodo1 x = new Metodo1();
                x.Metodo();
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Algoritmo no terminado a tiempo");

                break;
            case 3:
                GuiPrincipal y = new GuiPrincipal();
                y.setVisible(true);
                break;
            case 4:
                MenuPrincipal z = new MenuPrincipal();
                z.setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Seleccion incorrecta, por favor intente de nuevo.");
        }
    }

}
