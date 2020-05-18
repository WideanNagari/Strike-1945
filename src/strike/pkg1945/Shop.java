/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author Widean Nagari
 */
public class Shop extends javax.swing.JFrame {
    /**
     * Creates new form Shop
     */    
    static Player p;
    AngelBox box2;
    EaglePotion potion2;
    MassiveSalve salve2;
    SackofGold sack2;
    ShieldofCrystalBarrier shield2;
    public Shop(Player p) {
        initComponents();
        box2 = new AngelBox();
        potion2 = new EaglePotion();
        salve2 = new MassiveSalve();
        sack2 = new SackofGold();
        shield2 = new ShieldofCrystalBarrier();
        this.p = p;
        potion.setText(p.getJumEaglePotion()+"");
        shield.setText(p.getJumShieldofCrystal()+"");
        heal.setText(p.getJumMassiveSalve()+"");
        sack.setText(p.getJumSackofGold()+"");
        box.setText(p.getJumAngelBox()+"");
        gold.setText(p.getGold()+"");
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        gold = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        potion = new javax.swing.JLabel();
        shield = new javax.swing.JLabel();
        heal = new javax.swing.JLabel();
        sack = new javax.swing.JLabel();
        box = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/Shop.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(870, 80, 220, 120);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/Back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1630, 840, 200, 75);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/box.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1020, 420, 140, 130);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/gold.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1020, 190, 140, 130);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/shield.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(130, 410, 170, 130);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/heal.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 610, 140, 140);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/potion.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(150, 200, 140, 140);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Shield of Crystal Barrier");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(330, 420, 380, 42);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Eagle's Potion");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(330, 200, 220, 42);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Massive Heal");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(330, 610, 220, 42);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Sack of Gold");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(1180, 200, 220, 42);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Angel's Box (Special Item)");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(1180, 420, 410, 42);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Effect : +500 Attack Point dealt for the next 10 monsters");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(330, 250, 580, 28);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Effect : +20 Defend Point (until 10 monsters killed)");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(330, 470, 580, 28);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Effect : +500 HP");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(330, 660, 180, 28);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Effect : 200 gold earned while killing next 10 monsters");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(1180, 250, 580, 28);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Effect : Monster's HP/2 and Monster's Attack/2");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(1180, 470, 490, 30);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("for the next 3 levels");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(1260, 500, 210, 30);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton2.setText("2500 Gold");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1610, 420, 160, 50);

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton3.setText("1000 Gold");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1600, 200, 160, 50);

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton4.setText("1200 Gold");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(740, 200, 160, 50);

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton5.setText("700 Gold");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(740, 420, 160, 50);

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton6.setText("500 Gold");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(740, 600, 160, 50);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setText("Gold :");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(840, 860, 140, 60);

        gold.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        gold.setForeground(new java.awt.Color(240, 240, 240));
        gold.setText("0");
        jPanel1.add(gold);
        gold.setBounds(980, 860, 620, 60);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(240, 240, 240));
        jLabel21.setText("Owned :");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(330, 710, 130, 42);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(240, 240, 240));
        jLabel22.setText("Owned :");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(330, 300, 130, 42);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(240, 240, 240));
        jLabel23.setText("Owned :");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(1180, 540, 130, 42);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(240, 240, 240));
        jLabel24.setText("Owned :");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(1180, 300, 130, 42);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(240, 240, 240));
        jLabel25.setText("Owned :");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(330, 520, 130, 42);

        potion.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        potion.setForeground(new java.awt.Color(240, 240, 240));
        potion.setText("0");
        jPanel1.add(potion);
        potion.setBounds(480, 300, 160, 42);

        shield.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        shield.setForeground(new java.awt.Color(240, 240, 240));
        shield.setText("0");
        jPanel1.add(shield);
        shield.setBounds(480, 520, 130, 42);

        heal.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        heal.setForeground(new java.awt.Color(240, 240, 240));
        heal.setText("0");
        jPanel1.add(heal);
        heal.setBounds(480, 710, 130, 42);

        sack.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        sack.setForeground(new java.awt.Color(240, 240, 240));
        sack.setText("0");
        jPanel1.add(sack);
        sack.setBounds(1320, 300, 130, 42);

        box.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        box.setForeground(new java.awt.Color(240, 240, 240));
        box.setText("0");
        jPanel1.add(box);
        box.setBounds(1320, 540, 130, 42);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/menu.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 2100, 1000);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (p.getGold()>=potion2.getHarga()) {
            p.setJumEaglePotion(p.getJumEaglePotion()+1);
            p.setGold(p.getGold()-potion2.getHarga());
            potion.setText(p.getJumEaglePotion()+"");
            gold.setText(p.getGold()+"");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (p.getGold()>=shield2.getHarga()) {
            p.setJumShieldofCrystal(p.getJumShieldofCrystal()+1);
            p.setGold(p.getGold()-shield2.getHarga());
            shield.setText(p.getJumShieldofCrystal()+"");
            gold.setText(p.getGold()+"");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       if (p.getGold()>=salve2.getHarga()) {
            p.setJumMassiveSalve(p.getJumMassiveSalve()+1);
            p.setGold(p.getGold()-salve2.getHarga());
            heal.setText(p.getJumMassiveSalve()+"");
            gold.setText(p.getGold()+"");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (p.getGold()>=sack2.getHarga()) {
            p.setJumSackofGold(p.getJumSackofGold()+1);
            p.setGold(p.getGold()-sack2.getHarga());
            sack.setText(p.getJumSackofGold()+"");
            gold.setText(p.getGold()+"");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (p.getGold()>=box2.getHarga()) {
            p.setJumAngleBox(p.getJumAngelBox()+1);
            p.setGold(p.getGold()-box2.getHarga());
            box.setText(p.getJumAngelBox()+"");
            gold.setText(p.getGold()+"");
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
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shop(p).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel box;
    private javax.swing.JLabel gold;
    private javax.swing.JLabel heal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel potion;
    private javax.swing.JLabel sack;
    private javax.swing.JLabel shield;
    // End of variables declaration//GEN-END:variables
}
