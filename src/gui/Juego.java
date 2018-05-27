package gui;

import Cajas.Cerrar;
import Clases.Ganador;
import Clases.Figura;
import Clases.Cruz;
import Clases.Circulo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Juego extends javax.swing.JFrame implements Runnable {

    int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0, p7 = 0, p8 = 0, p9 = 0;
    int Contador = 1;
    char ps1 , ps2, ps3 , ps4 , ps5 , ps6 , ps7 , ps8 , ps9 ;
    String ganador;
    Figura figu = null;// Aqui se aplica el polimorfismo a un objeto
    Ganador gan = new Ganador();
    Thread hilo;
    
    public Juego() {
        initComponents();
        setLocationRelativeTo(null);
        ImageIcon image= new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen3.png"));
        setIconImage(image.getImage());
        hilo = new Thread(this);
        hilo.start();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttnJuegoNuevo = new javax.swing.JButton();
        pnlPanel = new javax.swing.JPanel();
        pnlPunto1 = new javax.swing.JPanel();
        pnlPunto4 = new javax.swing.JPanel();
        pnlPunto7 = new javax.swing.JPanel();
        pnlPunto2 = new javax.swing.JPanel();
        pnlPunto5 = new javax.swing.JPanel();
        pnlPunto8 = new javax.swing.JPanel();
        pnlPunto3 = new javax.swing.JPanel();
        pnlPunto6 = new javax.swing.JPanel();
        pnlPunto9 = new javax.swing.JPanel();
        lblJugador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Juego");

        bttnJuegoNuevo.setText("Juego nuevo");
        bttnJuegoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnJuegoNuevoActionPerformed(evt);
            }
        });

        pnlPunto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPunto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPunto1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlPunto1Layout = new javax.swing.GroupLayout(pnlPunto1);
        pnlPunto1.setLayout(pnlPunto1Layout);
        pnlPunto1Layout.setHorizontalGroup(
            pnlPunto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlPunto1Layout.setVerticalGroup(
            pnlPunto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlPunto4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPunto4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPunto4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlPunto4Layout = new javax.swing.GroupLayout(pnlPunto4);
        pnlPunto4.setLayout(pnlPunto4Layout);
        pnlPunto4Layout.setHorizontalGroup(
            pnlPunto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlPunto4Layout.setVerticalGroup(
            pnlPunto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlPunto7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPunto7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPunto7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlPunto7Layout = new javax.swing.GroupLayout(pnlPunto7);
        pnlPunto7.setLayout(pnlPunto7Layout);
        pnlPunto7Layout.setHorizontalGroup(
            pnlPunto7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlPunto7Layout.setVerticalGroup(
            pnlPunto7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlPunto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPunto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPunto2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlPunto2Layout = new javax.swing.GroupLayout(pnlPunto2);
        pnlPunto2.setLayout(pnlPunto2Layout);
        pnlPunto2Layout.setHorizontalGroup(
            pnlPunto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlPunto2Layout.setVerticalGroup(
            pnlPunto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlPunto5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPunto5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPunto5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlPunto5Layout = new javax.swing.GroupLayout(pnlPunto5);
        pnlPunto5.setLayout(pnlPunto5Layout);
        pnlPunto5Layout.setHorizontalGroup(
            pnlPunto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlPunto5Layout.setVerticalGroup(
            pnlPunto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlPunto8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPunto8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPunto8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlPunto8Layout = new javax.swing.GroupLayout(pnlPunto8);
        pnlPunto8.setLayout(pnlPunto8Layout);
        pnlPunto8Layout.setHorizontalGroup(
            pnlPunto8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlPunto8Layout.setVerticalGroup(
            pnlPunto8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlPunto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPunto3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPunto3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlPunto3Layout = new javax.swing.GroupLayout(pnlPunto3);
        pnlPunto3.setLayout(pnlPunto3Layout);
        pnlPunto3Layout.setHorizontalGroup(
            pnlPunto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlPunto3Layout.setVerticalGroup(
            pnlPunto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlPunto6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPunto6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPunto6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlPunto6Layout = new javax.swing.GroupLayout(pnlPunto6);
        pnlPunto6.setLayout(pnlPunto6Layout);
        pnlPunto6Layout.setHorizontalGroup(
            pnlPunto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlPunto6Layout.setVerticalGroup(
            pnlPunto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlPunto9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPunto9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPunto9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlPunto9Layout = new javax.swing.GroupLayout(pnlPunto9);
        pnlPunto9.setLayout(pnlPunto9Layout);
        pnlPunto9Layout.setHorizontalGroup(
            pnlPunto9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlPunto9Layout.setVerticalGroup(
            pnlPunto9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlPanelLayout = new javax.swing.GroupLayout(pnlPanel);
        pnlPanel.setLayout(pnlPanelLayout);
        pnlPanelLayout.setHorizontalGroup(
            pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addComponent(pnlPunto7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlPunto8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlPunto9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addComponent(pnlPunto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlPunto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlPunto6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addComponent(pnlPunto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlPunto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlPunto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        pnlPanelLayout.setVerticalGroup(
            pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlPunto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlPunto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlPunto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlPunto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlPunto6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlPunto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlPunto7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPunto8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPunto9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        lblJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador.setText("Jugador: 1 es tu turno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttnJuegoNuevo)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnJuegoNuevo)
                    .addComponent(lblJugador))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlPunto1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPunto1MousePressed
        if (p1 == 0) {
            if (Contador % 2 == 0) {
                figu = new Circulo();
                lblJugador.setText("Jugador: 1 es tu turno ");
                ps1='O';
            } else {
                figu = new Cruz();
                lblJugador.setText("Jugador: 2 es tu turno");
                ps1='X';
            }
            Contador += 1;
            if (figu != null) {
                figu.setLocation(
                        figu.getWidth() / 2,
                        figu.getHeight() / 2);
                pnlPunto1.add(figu);
                pnlPunto1.repaint();
                p1 = 1;
            }
        }
    }//GEN-LAST:event_pnlPunto1MousePressed

    private void pnlPunto2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPunto2MousePressed
        if (p2 == 0) {
            if (Contador % 2 == 0) {
                figu = new Circulo();
                lblJugador.setText("Jugador: 1 es tu turno");
                ps2='O';
            } else {
                figu = new Cruz();
                lblJugador.setText("Jugador: 2 es tu turno");
                ps2='X';
            }
            Contador += 1;
            if (figu != null) {
                figu.setLocation(
                        figu.getWidth() / 2,
                        figu.getHeight() / 2);
                pnlPunto2.add(figu);
                pnlPunto2.repaint();
                p2 = 1;
            }
        }
    }//GEN-LAST:event_pnlPunto2MousePressed

    private void pnlPunto3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPunto3MousePressed
        if (p3 == 0) {
            if (Contador % 2 == 0) {
                figu = new Circulo();
                lblJugador.setText("Jugador: 1 es tu turno");
                ps3='O';
            } else {
                figu = new Cruz();
                lblJugador.setText("Jugador: 2 es tu turno");
                ps3='X';
            }
            Contador += 1;
            if (figu != null) {
                figu.setLocation(
                        figu.getWidth() / 2,
                        figu.getHeight() / 2);
                pnlPunto3.add(figu);
                pnlPunto3.repaint();
                p3 = 1;
            }
        }
    }//GEN-LAST:event_pnlPunto3MousePressed

    private void pnlPunto4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPunto4MousePressed
        if (p4 == 0) {
            if (Contador % 2 == 0) {
                figu = new Circulo();
                lblJugador.setText("Jugador: 1 es tu turno");
                ps4='O';
            } else {
                figu = new Cruz();
                lblJugador.setText("Jugador: 2 es tu turno");
                ps4='X';
            }
            Contador += 1;
            if (figu != null) {
                figu.setLocation(
                        figu.getWidth() / 2,
                        figu.getHeight() / 2);
                pnlPunto4.add(figu);
                pnlPunto4.repaint();
                p4 = 1;
            }
        }
    }//GEN-LAST:event_pnlPunto4MousePressed

    private void pnlPunto5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPunto5MousePressed
        if (p5 == 0) {
            if (Contador % 2 == 0) {
                figu = new Circulo();
                lblJugador.setText("Jugador: 1 es tu turno");
                ps5='O';
            } else {
                figu = new Cruz();
                lblJugador.setText("Jugador: 2 es tu turno");
                ps5='X';
            }
            Contador += 1;
            if (figu != null) {
                figu.setLocation(
                        figu.getWidth() / 2,
                        figu.getHeight() / 2);
                pnlPunto5.add(figu);
                pnlPunto5.repaint();
                p5 = 1;
            }
        }
    }//GEN-LAST:event_pnlPunto5MousePressed

    private void pnlPunto6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPunto6MousePressed
        if (p6 == 0) {
            if (Contador % 2 == 0) {
                figu = new Circulo();
                lblJugador.setText("Jugador: 1 es tu turno");
                ps6='O';
            } else {
                figu = new Cruz();
                lblJugador.setText("Jugador: 2 es tu turno");
                ps6='X';
            }
            Contador += 1;
            if (figu != null) {
                figu.setLocation(
                        figu.getWidth() / 2,
                        figu.getHeight() / 2);
                pnlPunto6.add(figu);
                pnlPunto6.repaint();
                p6 = 1;
            }
        }
    }//GEN-LAST:event_pnlPunto6MousePressed

    private void pnlPunto7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPunto7MousePressed
        if (p7 == 0) {
            if (Contador % 2 == 0) {
                figu = new Circulo();
                lblJugador.setText("Jugador: 1 es tu turno");
                ps7='O';
            } else {
                figu = new Cruz();
                lblJugador.setText("Jugador: 2 es tu turno");
                ps7='X';
            }
            Contador += 1;
            if (figu != null) {
                figu.setLocation(
                        figu.getWidth() / 2,
                        figu.getHeight() / 2);
                pnlPunto7.add(figu);
                pnlPunto7.repaint();
                p7 = 1;
            }
        }
    }//GEN-LAST:event_pnlPunto7MousePressed

    private void pnlPunto8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPunto8MousePressed
        if (p8 == 0) {
            if (Contador % 2 == 0) {
                figu = new Circulo();
                lblJugador.setText("Jugador: 1 es tu turno");
                ps8='O';
            } else {
                figu = new Cruz();
                lblJugador.setText("Jugador: 2 es tu turno");
                ps8='X';
            }
            Contador += 1;
            if (figu != null) {
                figu.setLocation(
                        figu.getWidth() / 2,
                        figu.getHeight() / 2);
                pnlPunto8.add(figu);
                pnlPunto8.repaint();
                p8 = 1;
            }
        }
    }//GEN-LAST:event_pnlPunto8MousePressed

    private void pnlPunto9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPunto9MousePressed
        if (p9 == 0) {
            if (Contador % 2 == 0) {
                figu = new Circulo();
                lblJugador.setText("Jugador: 1 es tu turno");
                ps9='O';
            } else {
                figu = new Cruz();
                lblJugador.setText("Jugador: 2 es tu turno");
                ps9='X';
            }
            Contador += 1;
            if (figu != null) {
                figu.setLocation(
                        figu.getWidth() / 2,
                        figu.getHeight() / 2);
                pnlPunto9.add(figu);
                pnlPunto9.repaint();
                p9 = 1;
            }
        }
    }//GEN-LAST:event_pnlPunto9MousePressed

    private void bttnJuegoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnJuegoNuevoActionPerformed
                    if(Cerrar.preguntar("¿Realmente deseas un juego nuevo?")){
                          p1 = 0;p2 = 0;p3 = 0;p4 = 0;p5 = 0;p6 = 0;p7 = 0;p8 = 0;p9 = 0;
                    ps1 = '-';ps2 = '-';ps3 = '-';
                    ps4 = '-';ps5 = '-';ps6 = '-';
                    ps7 = '-';ps8 = '-';ps9 = '-';
                    Contador = 1;
                    lblJugador.setText("Jugador: 1 es tu turno");
                    pnlPunto1.removeAll();pnlPunto2.removeAll();pnlPunto3.removeAll();
                    pnlPunto4.removeAll();pnlPunto5.removeAll();pnlPunto6.removeAll();
                    pnlPunto7.removeAll();pnlPunto8.removeAll();pnlPunto9.removeAll();
                    pnlPanel.repaint();
                    }     
    }//GEN-LAST:event_bttnJuegoNuevoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnJuegoNuevo;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JPanel pnlPanel;
    private javax.swing.JPanel pnlPunto1;
    private javax.swing.JPanel pnlPunto2;
    private javax.swing.JPanel pnlPunto3;
    private javax.swing.JPanel pnlPunto4;
    private javax.swing.JPanel pnlPunto5;
    private javax.swing.JPanel pnlPunto6;
    private javax.swing.JPanel pnlPunto7;
    private javax.swing.JPanel pnlPunto8;
    private javax.swing.JPanel pnlPunto9;
    // End of variables declaration//GEN-END:variables

    @Override
     public void run() {
    while(true){
                try {
                    System.out.println();
                    if(Contador >= 5){
                      Thread.sleep(500);
                      String resu = gan.Winner(ps1, ps2, ps3, ps4, ps5, ps6, ps7, ps8, ps9);
                      if(resu == null){
                          if(Contador>9){
                           JOptionPane.showMessageDialog(null, "El juego ha terminado en empate");
                    p1 = 0;p2 = 0;p3 = 0;p4 = 0;p5 = 0;p6 = 0;p7 = 0;p8 = 0;p9 = 0;
                    ps1 = '-';ps2 = '-';ps3 = '-';
                    ps4 = '-';ps5 = '-';ps6 = '-';
                    ps7 = '-';ps8 = '-';ps9 = '-';
                    Contador = 1;
                    lblJugador.setText("Jugador: 1 es tu turno");
                    pnlPunto1.removeAll();pnlPunto2.removeAll();pnlPunto3.removeAll();
                    pnlPunto4.removeAll();pnlPunto5.removeAll();pnlPunto6.removeAll();
                    pnlPunto7.removeAll();pnlPunto8.removeAll();pnlPunto9.removeAll();
                    pnlPanel.repaint();
                          }
                      }else{
                          JOptionPane.showMessageDialog(null, "El ganador es: "+ resu);
                    p1 = 0;p2 = 0;p3 = 0;p4 = 0;p5 = 0;p6 = 0;p7 = 0;p8 = 0;p9 = 0;
                    ps1 = '-';ps2 = '-';ps3 = '-';
                    ps4 = '-';ps5 = '-';ps6 = '-';
                    ps7 = '-';ps8 = '-';ps9 = '-';
                    Contador = 1;
                    lblJugador.setText("Jugador: 1 es tu turno");
                    pnlPunto1.removeAll();pnlPunto2.removeAll();pnlPunto3.removeAll();
                    pnlPunto4.removeAll();pnlPunto5.removeAll();pnlPunto6.removeAll();
                    pnlPunto7.removeAll();pnlPunto8.removeAll();pnlPunto9.removeAll();
                    pnlPanel.repaint();
                      }
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }

}
