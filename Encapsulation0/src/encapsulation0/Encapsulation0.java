/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation0;

import java.util.Scanner;

class BoxComponets {

    double boxWidth;
    double boxLength;
    double boxHeight;
    

    public double getBoxWidth() {
        return boxWidth;
    }

    public double getBoxLength() {
        return boxLength;
    }

    public double getBoxHeight() {
        return boxHeight;
    }

    public void setBoxWidth(double boxWidth) {
        this.boxWidth = boxWidth;
    }

    public void setBoxLength(double boxLength) {
        this.boxLength = boxLength;
    }

    public void setBoxHeight(double boxHeight) {
        this.boxHeight = boxHeight;
    }

}

/**
 *
 * @author Thien
 */
public class Encapsulation0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        BoxComponets bc = new BoxComponets();
        double w = bc.boxWidth;
        double l = bc.boxLength;
        double h = bc.boxHeight;
        
        
        
        
        System.out.println("Enter the width: ");
        w = sc.nextDouble();
        System.out.println("Enter the length: ");
        l = sc.nextDouble();
        System.out.println("Enter the height: ");
        h = sc.nextDouble();
        double result = w*l*h;
        System.out.println("The volume of this box is " + result);
    }

}
