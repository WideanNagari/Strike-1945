/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.util.ArrayList;

/**
 *
 * @author Widean Nagari
 */
public class Strike1945 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<HighScores> high = new ArrayList<HighScores>();
        ArrayList<Player> p = new ArrayList<Player>();
        MainMenu main = new MainMenu(high,p);
        main.pack();
        main.setLocationRelativeTo(null);
        main.setVisible(true);
    }
}
