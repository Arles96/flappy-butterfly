/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Principal.Personajes;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author arles96
 */
public class Mariposa extends Personajes{
    
    //Atributos
    private final int width = 30;
    private final int heigth = 50;
    private final Image imagen = null;
    
    
    //Constructor
    
    public Mariposa(int x, int y, Image imagen) {
        super(x, y, imagen);
    }
    
    // Metodos de admsnitracion

    @Override
    public void paint(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    
}