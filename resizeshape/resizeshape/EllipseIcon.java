package resizeshape; 

import java.awt.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;

public class EllipseIcon implements Icon {
    private int width; 
    private Color color; 

    public EllipseIcon(int size, Color color){
        this.width = size; 
        this.color = color; 
    }

    public int getIconWidth() {
        return width;
    }

    public int getIconHeight() {
        return getIconWidth();
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D)g;
        Ellipse2D.Double ellipse = new Ellipse2D.Double(x, y, width, width);
        
        g2.setColor(color);
        g2.fill(ellipse);
    }

} 
