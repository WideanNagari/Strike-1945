/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.awt.event.WindowEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Widean Nagari
 */
public class HighScore extends javax.swing.JFrame {

    /**
     * Creates new form HighScore
     */
    static ArrayList<HighScores> high;
    int[] high2;
    String[] high3;
    public HighScore(ArrayList<HighScores> h) {
        initComponents();
        high = h;
        high2 = new int[high.size()];
        high3 = new String[high.size()];
        int ctr = 0;
        for (HighScores h2 : high) {
            high2[ctr] = h2.getSkor();
            high3[ctr] = h2.getNama();
            ctr++;
        }
        
        for (int i = 0; i < high.size(); i++) {
            for (int j = 0; j < high.size()-1; j++) {
                if (high2[j]<high2[j+1]) {
                    int c = high2[j];
                    high2[j]=high2[j+1];
                    high2[j+1] = c;
                    String c2 = high3[j];
                    high3[j]=high3[j+1];
                    high3[j+1] = c2;
                }
            }
        }
            for (HighScores hh : high) {
                if (hh.getSkor() == high2[0] && hh.getNama().equals(high3[0])) {
                    satu.setText(hh.getNama()+" - "+ hh.getSkor()+" - "+ hh.getUang()+" - "+ hh.getLevel());
                }else if (hh.getSkor() == high2[1] && hh.getNama().equals(high3[1])&&high.size()>1) {
                    dua.setText(hh.getNama()+" - "+ hh.getSkor()+" - "+ hh.getUang()+" - "+ hh.getLevel());
                }else if (hh.getSkor() == high2[2] && hh.getNama().equals(high3[2]) && high.size()>2) {
                    tiga.setText(hh.getNama()+" - "+ hh.getSkor()+" - "+ hh.getUang()+" - "+ hh.getLevel());
                }
            }
            
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dua = new javax.swing.JLabel();
        tiga = new javax.swing.JLabel();
        satu = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/High-Score2.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(720, 70, 500, 120);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/Back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(740, 810, 200, 75);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 80)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("3. ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(500, 590, 120, 110);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 80)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("2. ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(500, 410, 120, 110);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 80)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("1. ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(500, 250, 120, 110);

        dua.setFont(new java.awt.Font("Comic Sans MS", 1, 80)); // NOI18N
        dua.setForeground(new java.awt.Color(240, 240, 240));
        dua.setText("-");
        jPanel1.add(dua);
        dua.setBounds(660, 410, 1040, 110);

        tiga.setFont(new java.awt.Font("Comic Sans MS", 1, 80)); // NOI18N
        tiga.setForeground(new java.awt.Color(240, 240, 240));
        tiga.setText("-");
        jPanel1.add(tiga);
        tiga.setBounds(660, 600, 1060, 110);

        satu.setFont(new java.awt.Font("Comic Sans MS", 1, 80)); // NOI18N
        satu.setForeground(new java.awt.Color(240, 240, 240));
        satu.setText("-");
        jPanel1.add(satu);
        satu.setBounds(660, 250, 1030, 110);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/Reset.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1050, 810, 200, 75);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/Main Menu.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 2100, 1000);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 2100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        satu.setText("-");
        dua.setText("-");
        tiga.setText("-");
        high = new ArrayList<>();
        try{
            FileOutputStream fo = new FileOutputStream("Highscore.txt");
            ObjectOutputStream out = new ObjectOutputStream(fo);
            out.writeObject(high);
            out.close();
            fo.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }  
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(HighScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HighScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HighScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HighScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HighScore(high).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dua;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel satu;
    private javax.swing.JLabel tiga;
    // End of variables declaration//GEN-END:variables
}
