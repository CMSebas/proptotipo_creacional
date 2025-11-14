/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroncreacional_prototipo;

/**
 *
 * @author Sebas3101
 */
public class Comida extends ElementosSnake{
    private static int contador = 0;

    public Comida(int x, int y) {
        super("comidaBase",++contador, x, y);
    }

    

    @Override
    void dibujar() {
        System.out.println("Comida ID " + getId() + " en posición (" + getX() + ", " + getY() + ")");
    }

    


    
}
