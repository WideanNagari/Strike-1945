/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        File f = new File("Highscore.txt");
        if(!f.exists()) { 
            try{
                f.createNewFile();
                try{
                    FileOutputStream fo = new FileOutputStream("Highscore.txt");
                    ObjectOutputStream out = new ObjectOutputStream(fo);
                    out.writeObject(high);
                    out.close();
                    fo.close();
                }catch(IOException ex){
                    ex.printStackTrace();
                }      
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        try{
            FileInputStream fin = new FileInputStream("Highscore.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            high = (ArrayList<HighScores>)in.readObject();
            in.close();
            fin.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }catch(ClassNotFoundException ex2){
            ex2.printStackTrace();
        }
        
        ArrayList<Player> p = new ArrayList<Player>();
        MainMenu main = new MainMenu(high,p);
        main.pack();
        main.setLocationRelativeTo(null);
        main.setVisible(true);
    }
}
