/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Guille López
 */
public class creaRecta extends Polygon {
    public Color color = null;
    public int x = 0;
    public int y = 0;
    
    public creaRecta (int posX, int posY, Color _color){
        this.x = posX;
        this.y = posY;
        color = _color;
    }
    
    public void dibujate (Graphics2D g2, int posX, int posY, String grosor){
        g2.setColor(color);
        g2.setStroke(new BasicStroke(Float.parseFloat(grosor)));
        g2.drawLine(posX, posY, x, y);
        
        
    }
}
