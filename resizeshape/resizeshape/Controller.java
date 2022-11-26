package resizeshape; 

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        redraw(model.getShape(), model.getSize(), model.getColor());
    }

    public void control() {
        view.getRedButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                model.setColor(Color.RED);
                redraw(model.getShape(), model.getSize(), model.getColor());
            }
        });

        view.getBlueButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                model.setColor(Color.BLUE);
                redraw(model.getShape(), model.getSize(), model.getColor());
            }
        });

        view.getYellowButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                model.setColor(Color.YELLOW);
                redraw(model.getShape(), model.getSize(), model.getColor());
            }
        });

        view.getSlider().addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                model.setSize(((JSlider) e.getSource()).getValue());
                redraw(model.getShape(), model.getSize(), model.getColor());
            }
        });

        view.getRectangleButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                model.setShape("Rectangle");
                redraw(model.getShape(), model.getSize(), model.getColor());

            }
        });

        view.getTriangleButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                model.setShape("Triangle");
                redraw(model.getShape(), model.getSize(), model.getColor());

            }
        });

        view.getEllipseButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                model.setShape("Circle");
                redraw(model.getShape(), model.getSize(), model.getColor());

            }
        });

    }

    public void redraw(String shape, int size, Color color) {
        switch (shape) {
            case "Rectangle":
                view.getShapeLabel().setIcon(new MyRectangle(size, color));
                break;
            case "Circle":
                view.getShapeLabel().setIcon(new EllipseIcon(size, color));
                break;
            case "Triangle":
                view.getShapeLabel().setIcon(new TriangleIcon(size, color));
        }
    }
}
