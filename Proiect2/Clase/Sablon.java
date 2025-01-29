package Proiect2.Clase;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sablon extends JFrame implements ActionListener {
    public Sablon() {
        GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getDefaultScreenDevice()
                .setFullScreenWindow(this);
        ImageIcon image = new ImageIcon("MortalKombat-main/Proiect2/Poze/download.jpg");
        setIconImage(image.getImage());
        setTitle("MORTAL KOMBAT DUMBRAVIOARA EDITION");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

    }
}
