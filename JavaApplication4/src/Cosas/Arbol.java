/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cosas;

import Principal.Personajes;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author arles96
 */
public class Arbol extends Personajes {
    
    //Atributos
    private boolean parar = false;
    private int width;
    private int heigth;
    private final Image imagen = new ImageIcon(getClass().getResource("/img/arbol.jpeg")).getImage();
    
    //Constructor

    public Arbol(int x, int y) {
        super(x, y);
    }
    
    // getter y setter

    public boolean isParar() {
        return parar;
    }

    public void setParar(boolean parar) {
        this.parar = parar;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
    
    // Metodos de administracion

    @Override
    public void paint(Graphics g) {
        
    }

    @Override
    public void run (){
        
    }
    
    
}
