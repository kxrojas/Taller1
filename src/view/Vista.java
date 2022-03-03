package view;

import javax.swing.*;

public class Vista {

    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public int leerDato(String mensaje){
        String ms = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(ms);
    }

    public String leerString(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
}
