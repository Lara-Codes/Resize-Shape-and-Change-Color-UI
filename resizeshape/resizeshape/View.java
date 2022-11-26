package resizeshape; 

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Hashtable;

public class View {
    private JFrame mainFrame; 
    private JSlider slider; 

    private JLabel shapeLabel;

    private JButton ellipseButton; 
    private JButton rectangleButton; 
    private JButton triangleButton; 

    private JButton redButton;
    private JButton yellowButton;
    private JButton blueButton; 



    public View(){
        mainFrame = new JFrame("Shape, Width, and Color Control"); 
        mainFrame.getContentPane().setLayout(new GridLayout()); // Layout definition
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Default close operation
        mainFrame.setSize(1200, 600); // Set initial size
        mainFrame.setVisible(true); // Making frame visible (ex. if pop-up change visibility false - true)

        JPanel mainLeftPanel = new JPanel(new BorderLayout()); 
        JPanel mainRightPanel = new JPanel(new BorderLayout()); 

        //Initialize slider 
        slider = new JSlider(SwingConstants.HORIZONTAL, 0, 600, 50); 
        slider.setMajorTickSpacing(50);
        slider.setPaintLabels(true);

        Hashtable<Integer, JLabel> position = new Hashtable<Integer, JLabel>();
        for (int i = 0; i <= 600; i += 50)
            position.put(i, new JLabel("" + i));
        slider.setLabelTable(position);


        //Add to frame 
        mainFrame.getContentPane().add(mainLeftPanel, "West");
        mainFrame.getContentPane().add(mainRightPanel, "East");

        JPanel topLeftPanel = new JPanel(new BorderLayout());
        mainLeftPanel.add(topLeftPanel, "North"); 

        JLabel moveSliderText = new JLabel("Move slider to change width of the icon");
       
        moveSliderText.setBorder(new EmptyBorder(50, 10, 10, 10));

        topLeftPanel.add(moveSliderText, "North");
        topLeftPanel.add(slider);
        slider.setBorder(new EmptyBorder(10, 10, 10, 10));

        rectangleButton = new JButton("Rectangle");
        ellipseButton = new JButton("Ellipse");
        triangleButton = new JButton("Triangle");


        JPanel bottomLeftLeftPanel = new JPanel(); 
        bottomLeftLeftPanel.setLayout(new BoxLayout(bottomLeftLeftPanel, BoxLayout.Y_AXIS)); 

        mainLeftPanel.add(bottomLeftLeftPanel, "West");

        JLabel changeShapeText = new JLabel("Change shape");
        bottomLeftLeftPanel.setBorder(new EmptyBorder(200, 50, 0, 10));


        bottomLeftLeftPanel.add(changeShapeText);
        bottomLeftLeftPanel.add(rectangleButton);
        bottomLeftLeftPanel.add(ellipseButton);
        bottomLeftLeftPanel.add(triangleButton);

        rectangleButton.setPreferredSize(new Dimension(40, 40));
        ellipseButton.setPreferredSize(new Dimension(40, 40));
        triangleButton.setPreferredSize(new Dimension(40, 40));

        //Color buttons 
        JPanel bottomRightLeftPanel = new JPanel(); 
        bottomRightLeftPanel.setLayout(new BoxLayout(bottomRightLeftPanel, BoxLayout.Y_AXIS)); 
        JLabel changeColorText = new JLabel("Change color");
        bottomRightLeftPanel.setBorder(new EmptyBorder(200, 10, 0, 100));

        redButton = new JButton("Red");
        blueButton = new JButton("Blue");
        yellowButton = new JButton("Yellow");

        bottomRightLeftPanel.add(changeColorText);
        bottomRightLeftPanel.add(redButton);
        bottomRightLeftPanel.add(blueButton);
        bottomRightLeftPanel.add(yellowButton);

        mainLeftPanel.add(bottomRightLeftPanel, "East");

        //Default shape 
        shapeLabel = new JLabel("", SwingConstants.CENTER);
        mainRightPanel.add(shapeLabel);
    }

    public JButton getRedButton(){
        return redButton; 
    }

    public JButton getBlueButton(){
        return blueButton; 
    }

    public JButton getYellowButton(){
        return yellowButton; 
    }

    public JButton getEllipseButton(){
        return ellipseButton; 
    }

    public JButton getRectangleButton(){
        return rectangleButton;
    }

    public JButton getTriangleButton(){
        return triangleButton; 
    }

    public JSlider getSlider(){
        return slider; 
    }

    public JLabel getShapeLabel(){
        return shapeLabel; 
    }

}
