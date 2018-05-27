package Clases;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;

/**
 *
 * @author User
 */
public class Figura extends JComponent 
        implements MouseListener,MouseMotionListener {
    
   public Figura(){ // Metodo Constructor ( Crea el objeto , inicializa el objeto ( asigna propiedades a un objeto)
       setSize(55,55);
       addMouseListener(this);
       addMouseMotionListener(this);
   }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        setLocation(getWidth()/2,getHeight()/2);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}