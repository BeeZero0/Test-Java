/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosCRUD;

import Conexión.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import GuiCrud.Sistema;
import static GuiCrud.Sistema.ApellidosText;
import static GuiCrud.Sistema.CarreraText;
import static GuiCrud.Sistema.NombreText;
import static GuiCrud.Sistema.SemestreText;
import static GuiCrud.Sistema.StatusText;
import static GuiCrud.Sistema.TablaAlumnos;
import java.sql.Connection;

/**
 *
 * @author Vanessa
 */
public abstract class MetodosGenerales {
    Conexion co = new Conexion();
    Connection conect = co.conexion();
    
    public void FiltrarDatos(String valor) {
        String[] titulos = {"ID", "Nombre", "Apellidos", "Carrera", "Estatus", "Semestre"};
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String SQL = "select * from alumnos where nombre like '%"+valor+"%'";
        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idalumnos");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("apellidos");
                registros[3] = rs.getString("carrera");
                registros[4] = rs.getString("estatus");
                registros[5] = rs.getString("semestre");

                modelo.addRow(registros);

            }
            TablaAlumnos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error para mostrar datos" + e.getMessage());
        }
    }
    public void EliminarRegistro(){
    int filaSeleccionada = TablaAlumnos.getSelectedRow();
    try{
        String SQL = "delete from alumnos where idalumnos="+TablaAlumnos.getValueAt(filaSeleccionada, 0);
        
        Statement st = conect.createStatement();
        int n=st.executeUpdate(SQL);
        if(n>=0){
            JOptionPane.showMessageDialog(null,"Registro eliminado");
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error al eliminar registro"+e.getMessage());
    }
}
    public void ActualizarDatos() {
        try {
            String SQL = "update alumnos set nombre=?,apellidos=?,carrera=?,estatus=?,semestre=? where idalumnos=?";
            int FilaSeleccionado=TablaAlumnos.getSelectedRow();
            String fil = (String)TablaAlumnos.getValueAt(FilaSeleccionado, 0);
            PreparedStatement pst = conect.prepareStatement(SQL);
            pst.setString(1, NombreText.getText());
            pst.setString(2, ApellidosText.getText());

            int selec = CarreraText.getSelectedIndex();
            pst.setString(3, CarreraText.getItemAt(selec));

            int sele = StatusText.getSelectedIndex();
            pst.setString(4, StatusText.getItemAt(sele));

            pst.setInt(5, Integer.parseInt(SemestreText.getText()));
            pst.setString(6, fil);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de actualización " + e.getMessage());
        }
    }
    public void MostrarDatos() {
        String[] titulos = {"ID", "Nombre", "Apellidos", "Carrera", "Estatus", "Semestre"};
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String SQL = "select * from alumnos";
        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idalumnos");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("apellidos");
                registros[3] = rs.getString("carrera");
                registros[4] = rs.getString("estatus");
                registros[5] = rs.getString("semestre");

                modelo.addRow(registros);

            }
            TablaAlumnos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error para mostrar datos" + e.getMessage());
        }
    }

    public void Limpiar() {
        NombreText.setText("");
        ApellidosText.setText("");
        CarreraText.setSelectedItem(null);
        StatusText.setSelectedItem(null);
        SemestreText.setText("");
    }

    public void InsertarDatos() {
        try {
            String SQL = "insert into alumnos (nombre,apellidos,carrera,estatus,semestre) values (?,?,?,?,?)";
            PreparedStatement pst = conect.prepareStatement(SQL);
            pst.setString(1, NombreText.getText());
            pst.setString(2, ApellidosText.getText());

            int selec = CarreraText.getSelectedIndex();
            pst.setString(3, CarreraText.getItemAt(selec));

            int sele = StatusText.getSelectedIndex();
            pst.setString(4, StatusText.getItemAt(sele));

            pst.setInt(5, Integer.parseInt(SemestreText.getText()));

            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de registros " + e.getMessage());
        }
    }
}
