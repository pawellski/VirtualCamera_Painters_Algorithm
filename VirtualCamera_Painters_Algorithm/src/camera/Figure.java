/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camera;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.paint.Color;

/**
 *
 * @author Paweł
 */
public class Figure {
    private String color;
    private List<Line3D> lines3D;
    private List<Line2D> lines2D;
    private double[] listOfX;
    private double[] listOfY;

    public Figure(String color, ArrayList<Line3D> lines) {
        this.lines3D = lines;
        this.listOfX = new double[lines.size()];
        this.listOfY = new double[lines.size()];
        this.color = color;
    }

    public List<Line3D> getLines3D() {
        return lines3D;
    }

    public List<Line2D> getLines2D() {
        return lines2D;
    }

    public void addLine3D(Line3D line) {
        lines3D.add(line);
    }

    public void addLine2D(Line2D line) {
        lines2D.add(line);
    }

    public void clearLines2D() {
        lines2D = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public void convertToTables() {
        for (int i = 0; i < lines2D.size(); i++) {
            listOfX[i] = lines2D.get(i).getPoint1().getX();
            listOfY[i] = lines2D.get(i).getPoint1().getY();
        }
    }

    public double[] getListOfX() {
        return listOfX;
    }

    public double[] getListOfY() {
        return listOfY;
    }

}
