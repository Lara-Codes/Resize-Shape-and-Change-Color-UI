package resizeshape; 

import java.awt.*; 
import java.awt.geom.*; 
import javax.swing.*;

public class MyRectangle implements Icon{
    private int width; 
    public Color color; 

    public MyRectangle(int width, Color color){
        this.width = width; 
        this.color = color; 
    }

    public int getIconWidth(){
        return width; 
    }

    public int getIconHeight(){
        return getIconWidth(); 
    }

    public void paintIcon(Component c, Graphics g, int x, int y){
        Graphics2D g2 = (Graphics2D)g; 
        Rectangle2D.Double rectangle = new Rectangle2D.Double(x, y, width, width); 
        g2.setColor(color); 
        g2.fill(rectangle); 
    }
}