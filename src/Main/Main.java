/*
* Main.java
* 18 september 2018
* Maurice (MGC) van Haperen
* v0.2
*/

package Main;

import BusinessLogic.ShapeManager;
import Presentation.Frame;
import Presentation.OverviewGUI;


public class Main {
    /**
     * Starts the program and setup the new Frame in the overviewFrame
     * @param args
     */

    public static void main(String args[]) {


        Frame overviewFrame = new Frame("VAT");
        overviewFrame.addPanel(new OverviewGUI(new ShapeManager()));


    }

}
