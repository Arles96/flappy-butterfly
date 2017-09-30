/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author arles96
 */
public abstract class Personajes extends Thread{
    
    protected int x;
    protected int y;
    protected Image imagen;

    public Personajes(int x, int y) {
        super();
        this.x = x;
        this.y = y;
        this.imagen = null;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
    
    public abstract void paint (Graphics g);    
    
}
