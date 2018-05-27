
package Clases;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class Fondo extends javax.swing.JPanel { 

String imagen = ""; 

public Fondo(String imagen){ 
this.imagen = imagen; 
this.setSize(700,500); 
} 

@Override 
public void paint(Graphics g){ 
Dimension tamanio = getSize(); 
ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Imagenes/" + imagen)); 
g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null); 
setOpaque(false); 
super.paintComponent(g); 
}
} 