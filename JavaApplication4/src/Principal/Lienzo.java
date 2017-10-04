/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Cosas.Arbol;
import Cosas.Flores;
import Personajes.Ave;
import Personajes.Mariposa;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author arles96
 */
public class Lienzo extends javax.swing.JPanel {

    //Atributos
    private ArrayList<Ave> aves = new ArrayList();
    private ArrayList<Arbol> arboles = new ArrayList();
    private ArrayList<Flores> flores = new ArrayList();
    private Mariposa mariposa;
    
    
    //Constructor
    
    public Lienzo() {
        initComponents();
        configuraciones();
    }
    
    //Metodos de admisnitracion
    
    private void configuraciones(){
        
    }
    
    @Override
    public void paint (Graphics g){
        g.drawImage(new ImageIcon(getClass().getResource("/img/paisaje.jpeg")).getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
        g.setColor(Color.red);
        g.fillOval(50, 50, 150, 150);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
