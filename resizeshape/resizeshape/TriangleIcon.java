package resizeshape; 

import java.awt.*;
import javax.swing.*;

public class TriangleIcon implements Icon {
    private int width; 
    private Color color; 


    public TriangleIcon(int size, Color color){
        this.width = size; 
        this.color = color; 
    }


    public int getIconWidth() {
        return width;
    }

    public int getIconHeight() {
        return getIconWidth();
    }

    public void paintIcon(Component c, Graphics g, int p, int q) {
        Graphics2D g2 = (Graphics2D) g;
        int[] x = {p, p + (width/2), p+width}; //x-coordinates of vertexes
        int[] y = {q+width, q, q+width}; //y coordinates of the vertexes
        Polygon triangle = new Polygon(x, y, 3);
        g2.setColor(color);
        g2.fill(triangle);
    }

} 
    

