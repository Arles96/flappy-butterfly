/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cosas;

import Principal.Personajes;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author arles96
 */
public class Flores extends Personajes{
    
    //Atributos
    private boolean para = false;
    private int width;
    private int heigth;
    private final Image imagen = null;
    
    //Constructor

    public Flores(int x, int y, Image imagen) {
        super(x, y, imagen);
    }
    
    // getter y setter

    public boolean isPara() {
        return para;
    }

    public void setPara(boolean para) {
        this.para = para;
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
    
    // Metodso de administracion

    @Override
    public void paint(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
