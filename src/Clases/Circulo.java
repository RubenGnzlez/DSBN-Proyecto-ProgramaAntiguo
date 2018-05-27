package Clases;

import java.awt.Graphics;

/**
 *
 * @author User
 */
public class Circulo extends Figura {

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        g.drawOval(0, 0, getWidth()-1, getHeight()-1);
    }
    
    
}
