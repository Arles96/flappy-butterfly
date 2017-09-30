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
public class Ave extends Personajes{
    
    //Atributos
    
    public final static Image imagen1 = null;
    public final static Image imagen2 = null;
    private boolean parar = false;
    private final int width = 100;
    private final int heigth = 70;
    
    
    //Constructor

    public Ave(int x, int y, Image imagen) {
        super(x, y, imagen);
    }
    
    //getter y setter

    public boolean isParar() {
        return parar;
    }

    public void setParar(boolean parar) {
        this.parar = parar;
    }
    
    //metodos de administracion

    @Override
    public void paint(Graphics g) {
        
    }
    
    @Override
    public void run (){
        
    }
    
    
        
}
