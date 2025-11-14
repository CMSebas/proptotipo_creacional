/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroncreacional_prototipo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sebas3101
 */
public abstract class ElementosSnake implements Cloneable {
    private String tipoElemento;
    private int id;
    private int x;
    private int y;
    abstract void dibujar();

    public ElementosSnake(String tipoElemento, int id, int x, int y) {
        this.tipoElemento = tipoElemento;
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public String getTipoElemento() {
        return tipoElemento;
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setTipoElemento(String tipoElemento) {
        this.tipoElemento = tipoElemento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

   
    
    public ElementosSnake clone(){
        try {
            return (ElementosSnake) super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
        
    }
    
}
