package resizeshape; 

import java.awt.Color;
public class Model {

    private int size; 
    private String shape; 
    private Color color; 

    public Model(){
        size = 100; 
        shape = "Rectangle";
        color = Color.BLUE; 

    }
    public int getSize(){
        return size; 
    }

    public void setSize(int size){
        this.size = size; 
    }

    public String getShape(){
        return shape; 
    }

    public void setShape(String shape){
        this.shape = shape; 
    }

    public Color getColor(){
        return color; 
    }

    public void setColor(Color c){
        color = c; 
    }

}
