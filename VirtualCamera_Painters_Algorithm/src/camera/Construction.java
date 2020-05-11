/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camera;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Paweł
 */
public class Construction {

    private ArrayList<Figure> figures;

    public Construction(String adress) {
        try {
            ReadFile readFile = new ReadFile(adress);
            figures = readFile.load();
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found!");
        } catch (IOException e) {
            System.out.println("Wrong format of file!");
        }
        sortFigures();
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void sortFigures() {
        for (Figure figure : figures) {
            figure.searchCentroid();
        }
        Collections.sort(figures);
    }
}
