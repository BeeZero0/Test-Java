/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosCRUD;

import Conexión.Conexion;
import static GuiCrud.SistemaProfesores.TablaProfesores;
import java.sql.Connection;
import GuiCrud.SistemaProfesores;
import static GuiCrud.SistemaProfesores.ApellidosText;
import static GuiCrud.SistemaProfesores.AreaText;
import static GuiCrud.SistemaProfesores.NombreText;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vanessa
 */
public class MetodosProfesores extends MetodosGenerales {

   // Conexion co = new Conexion();
    //Connection conect = co.conexion();

    public void FiltrarDatos(String valor) {
        String[] titulos = {"ID", "Nombre", "Apellidos", "Área"};
        String[] registros = new String[4];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String SQL = "select * from profesores where nombre like '%" + valor + "%'";
        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idprofesores");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("apellidos");
                registros[3] = rs.getString("area");

                modelo.addRow(registros);

            }
            TablaProfesores.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error para mostrar datos" + e.getMessage());
        }
    }

    public void EliminarRegistro() {
        int filaSeleccionada = TablaProfesores.getSelectedRow();
        try {
            String SQL = "delete from profesores where idprofesores=" + TablaProfesores.getValueAt(filaSeleccionada, 0);

            Statement st = conect.createStatement();
            int n = st.executeUpdate(SQL);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro" + e.getMessage());
        }
    }
    
    public void ActualizarDatos() {
        try {
            String SQL = "update profesores set nombre=?,apellidos=?,area=? where idprofesores=?";
            int FilaSeleccionado=TablaProfesores.getSelectedRow();
            String fil = (String)TablaProfesores.getValueAt(FilaSeleccionado, 0);
            PreparedStatement pst = conect.prepareStatement(SQL);
            pst.setString(1, NombreText.getText());
            pst.setString(2, ApellidosText.getText());

            int selec = AreaText.getSelectedIndex();
            pst.setString(3, AreaText.getItemAt(selec));

            pst.setString(4, fil);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de actualización " + e.getMessage());
        }
    }
    public void MostrarDatos() {
        String[] titulos = {"ID", "Nombre", "Apellidos", "Área"};
        String[] registros = new String[4];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String SQL = "select * from profesores";
        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idprofesores");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("apellidos");
                registros[3] = rs.getString("area");


                modelo.addRow(registros);

            }
            TablaProfesores.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error para mostrar datos" + e.getMessage());
        }
    }
    public void Limpiar() {
        NombreText.setText("");
        ApellidosText.setText("");
        AreaText.setSelectedItem(null);
    }
    public void InsertarDatos() {
        try {
            String SQL = "insert into profesores (nombre,apellidos,area) values (?,?,?)";
            PreparedStatement pst = conect.prepareStatement(SQL);
            pst.setString(1, NombreText.getText());
            pst.setString(2, ApellidosText.getText());

            int selec = AreaText.getSelectedIndex();
            pst.setString(3, AreaText.getItemAt(selec));

            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de registros " + e.getMessage());
        }
    }
}
