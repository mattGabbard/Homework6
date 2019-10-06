/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mattg
 */
import javax.swing.JOptionPane;

public class Main2 {

    public static void main(String[] args) {

        String userInput_radius = JOptionPane.showInputDialog("Please input the radius.");
        double radius = Double.parseDouble(userInput_radius);

        Circle circle = new Circle();
        circle.Draw(radius);

        JOptionPane.showMessageDialog(null, "Diameter: " + circle.diameter()
                +  "\nCircumference: " + circle.circumference()
                + "\nArea: " + circle.area());
    }
}
