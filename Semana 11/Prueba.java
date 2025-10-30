import javax.swing.*;
import java.awt.*;

public class Prueba {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Formulario");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);
            frame.setLayout(new FlowLayout());

            JButton boton = new JButton("Presionar");
            boton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Botón pulsado"));

            frame.add(boton);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}