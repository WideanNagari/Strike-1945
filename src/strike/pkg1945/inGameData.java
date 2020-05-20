/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Widean Nagari
 */
public class inGameData implements Serializable{
    private ArrayList<Enemy> e;

    public inGameData() {
        this.e = new ArrayList();
    }

    public ArrayList<Enemy> getE() {
        return e;
    }

    public void setE(ArrayList<Enemy> e) {
        this.e = e;
    }
    
}
