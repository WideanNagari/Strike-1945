/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Widean Nagari
 */
public class Pause extends javax.swing.JFrame {

    /**
     * Creates new form Pause
     */
    static Player p;
    static GameFrame g;
    static MainMenu m;
    static ArrayList<HighScores> high;
    static ArrayList<Player> player;
    static ArrayList<inGameData> data;
    public Pause(MainMenu main,Player p, GameFrame g, ArrayList<HighScores> h, ArrayList<Player> play, ArrayList<inGameData> d) {
        initComponents();
        high = h;
        data = d;
        m = main;
        this.player = play;
        this.p = p;
        this.g = g;
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/Pause.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(840, 80, 260, 120);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jButton1.setText("Resume");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(850, 340, 240, 50);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jButton2.setText("Status");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(850, 440, 240, 50);

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jButton3.setText("Upgrade");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(850, 540, 240, 50);

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jButton4.setText("Shop");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(850, 640, 240, 50);

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jButton5.setText("Save Game");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(850, 740, 240, 50);

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jButton6.setText("Main Menu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(850, 850, 240, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/menu.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1000);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 2099, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Status frame = new Status(this.p);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        HighScores hh = new HighScores(this.p.getNama(), this.p.getGold(), this.p.getSkor(), this.p.getLevel(),this.p.getPosisiSave());
        int ctr = 0;
        for (int i = 0; i < high.size(); i++) {
            if (high.get(i).getNama().equalsIgnoreCase(this.p.getNama())) {
                high.set(i, hh);ctr++;
            }
        }
        if (ctr==0) {
            high.add(hh);
        }
        if (this.player.get(p.getPosisiSave()).getNewp()==1) {
            this.player.get(p.getPosisiSave()).setRetryChance(1);
            this.p.setRetryChance(1);
            this.player.get(p.getPosisiSave()).setNewp(0);
        }
        try{
            FileOutputStream fo = new FileOutputStream("Highscore.txt");
            ObjectOutputStream out = new ObjectOutputStream(fo);
            out.writeObject(high);
            out.close();
            fo.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }  
        try{
            FileOutputStream fo = new FileOutputStream("Player.txt");
            ObjectOutputStream out = new ObjectOutputStream(fo);
            out.writeObject(player);
            out.close();
            fo.close();
        }catch(IOException ex){
            ex.printStackTrace();
        } 
        
        try{
            FileOutputStream fo = new FileOutputStream("Data.txt");
            ObjectOutputStream out = new ObjectOutputStream(fo);
            out.writeObject(data);
            out.close();
            fo.close();
        }catch(IOException ex){
            ex.printStackTrace();
        } 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Upgrade frame = new Upgrade(this.p);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Shop frame = new Shop(this.p);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        m.high = new ArrayList<>();
        m.p = new ArrayList<>();
        m.data = new ArrayList<>();
        
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
            m.high = (ArrayList<HighScores>)in.readObject();
            in.close();
            fin.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }catch(ClassNotFoundException ex2){
            ex2.printStackTrace();
        }
        
        File fi = new File("Player.txt");
        if(!fi.exists()) { 
            try{
                fi.createNewFile();
                try{
                    FileOutputStream fo = new FileOutputStream("Player.txt");
                    ObjectOutputStream out = new ObjectOutputStream(fo);
                    out.writeObject(p);
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
            FileInputStream fin = new FileInputStream("Player.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            m.p = (ArrayList<Player>)in.readObject();
            in.close();
            fin.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }catch(ClassNotFoundException ex2){
            ex2.printStackTrace();
        }
        
        File fil = new File("Data.txt");
        if(!fil.exists()) { 
            try{
                fil.createNewFile();
                try{
                    FileOutputStream fo = new FileOutputStream("Data.txt");
                    ObjectOutputStream out = new ObjectOutputStream(fo);
                    out.writeObject(data);
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
            FileInputStream fin = new FileInputStream("Data.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            m.data = (ArrayList<inGameData>)in.readObject();
            in.close();
            fin.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }catch(ClassNotFoundException ex2){
            ex2.printStackTrace();
        }
        g.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
        this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pause.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pause.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pause.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pause.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pause(m,p,g,high,player,data).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
