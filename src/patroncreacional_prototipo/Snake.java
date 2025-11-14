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
public class Snake extends ElementosSnake {
    private static int contador = 0;

    public Snake(int x, int y) {
        super("segmento", ++contador, x, y);
    }

    @Override
    void dibujar() {
        System.out.println("Comida ID" + getId() + " en posición (" + getX() + "," + getY() + ")\""); //To change body of generated methods, choose Tools | Templates.
    }
    
}
