
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erik3
 */
public class BackgroundImage extends JPanel{
    
private Image imagen;


    @Override
    protected void paintComponent(Graphics g) {
       // Asegúrate de que la ruta sea correcta dentro de tus paquetes
        imagen = new ImageIcon(getClass().getResource("LogingFarmacia.png")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false); // Permite ver lo que hay detrás
        super.paintComponent(g);
    }

}
