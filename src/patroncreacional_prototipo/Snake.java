/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroncreacional_prototipo;

import java.awt.Color;
import java.awt.Graphics;

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
    void dibujar(Graphics g) {
       g.setColor(Color.YELLOW);
    g.fillOval(getX() * 10, getY() * 10, 30, 30);

    // ID en negro
    g.setColor(Color.BLACK);
    g.drawString(String.valueOf(getId()), getX() * 10 + 12, getY() * 10 + 18);
    }
    
}
