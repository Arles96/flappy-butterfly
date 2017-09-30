/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Principal.Personajes;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;



/**
 *
 * @author arles96
 */
public class Ave extends Personajes{
    
    //Atributos
    
    private final Image imagen1 = new ImageIcon(getClass().getResource("/img/pajaro1.jpeg")).getImage();
    private final Image imagen2 = new ImageIcon(getClass().getResource("/img/pajaro2.jpeg")).getImage();
    private boolean parar = false;
    private final int width = 100;
    private final int heigth = 70;
    
    
    //Constructor

    public Ave(int x, int y) {
        super(x, y);
        super.imagen = imagen1;
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
