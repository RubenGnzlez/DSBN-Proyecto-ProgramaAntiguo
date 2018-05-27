package Clases;

import java.awt.Graphics;

public class Cruz extends Figura {

    @Override
    public void paint(Graphics grphcs) {
        grphcs.drawLine(0, 0, getWidth(), getHeight());
        grphcs.drawLine(0, getHeight(), getWidth(), 0);
    }


}
