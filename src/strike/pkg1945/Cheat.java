/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author Asus
 */
public class Cheat extends javax.swing.JFrame {

    /**
     * Creates new form Cheat
     */
    static Player p;
    public Cheat(Player p) {
        initComponents();
        this.p=p;
        //Current Status
        attack.setText("Current Attack : "+p.getAttack());
        max.setText("Current Max HP : "+p.getMaxhp());
        hp.setText("Current HP : "+p.getHp());
        defend.setText("Current Defend : "+p.getDefend());
        bullet.setText("Current Bullet : "+p.getJumlahpeluru());
        gold.setText("Current Gold : "+p.getGold());
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gold = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        attack = new javax.swing.JLabel();
        max = new javax.swing.JLabel();
        hp = new javax.swing.JLabel();
        defend = new javax.swing.JLabel();
        bullet = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jlabel15 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jlabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/CHEAT.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(840, 10, 330, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/Attack.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(460, 110, 120, 120);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/Defend.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(460, 530, 130, 128);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/Bullet.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(460, 670, 124, 124);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/Hp.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(460, 390, 120, 122);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/heal.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(450, 250, 130, 130);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/gold.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(450, 800, 130, 150);

        gold.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        gold.setForeground(new java.awt.Color(240, 240, 240));
        gold.setText("Current Gold : 0");
        jPanel1.add(gold);
        gold.setBounds(610, 880, 880, 40);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Increase Attack");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(600, 120, 320, 40);

        attack.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        attack.setForeground(new java.awt.Color(240, 240, 240));
        attack.setText("Current Attack : 0");
        jPanel1.add(attack);
        attack.setBounds(600, 180, 840, 40);

        max.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        max.setForeground(new java.awt.Color(240, 240, 240));
        max.setText("Current Max HP : 0");
        jPanel1.add(max);
        max.setBounds(610, 310, 840, 40);

        hp.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        hp.setForeground(new java.awt.Color(240, 240, 240));
        hp.setText("Current HP : 0");
        jPanel1.add(hp);
        hp.setBounds(610, 460, 850, 40);

        defend.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        defend.setForeground(new java.awt.Color(240, 240, 240));
        defend.setText("Current Defend : 0");
        jPanel1.add(defend);
        defend.setBounds(610, 600, 840, 40);

        bullet.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        bullet.setForeground(new java.awt.Color(240, 240, 240));
        bullet.setText("Current Bullet : 0");
        jPanel1.add(bullet);
        bullet.setBounds(610, 750, 890, 40);

        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(980, 120, 520, 50);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Change Max HP");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(610, 250, 320, 50);

        jlabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jlabel15.setForeground(new java.awt.Color(240, 240, 240));
        jlabel15.setText("Increase Bullet");
        jPanel1.add(jlabel15);
        jlabel15.setBounds(610, 690, 320, 40);

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(240, 240, 240));
        jLabel24.setText("Increase Gold");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(610, 820, 320, 40);

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Change Hp");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(610, 390, 200, 60);

        jlabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jlabel14.setForeground(new java.awt.Color(240, 240, 240));
        jlabel14.setText("Increase Defend");
        jPanel1.add(jlabel14);
        jlabel14.setBounds(610, 540, 320, 40);

        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(980, 260, 520, 50);

        jTextField6.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(980, 690, 520, 50);

        jTextField5.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(980, 540, 520, 50);

        jTextField4.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(980, 400, 520, 50);

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(980, 820, 520, 50);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/Back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 50, 205, 80);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton2.setText("Confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1540, 120, 130, 50);

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton3.setText("Confirm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1540, 260, 130, 50);

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton4.setText("Confirm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(1540, 400, 130, 50);

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton5.setText("Confirm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(1540, 540, 130, 50);

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton6.setText("Confirm");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(1540, 690, 130, 50);

        jButton7.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton7.setText("Confirm");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(1540, 820, 130, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/menu.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1010);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String y = "";
        for (int i = 0; i < jTextField2.getText().length(); i++) {
            if(jTextField2.getText().charAt(i) >= '0' && jTextField2.getText().charAt(i) <= '9' ){
                y += jTextField2.getText().charAt(i);
            }
        }
        if(!jTextField2.getText().equals(null)&&y.length()>0){
            int x = Integer.parseInt(y);
            p.setAttack(p.getAttack()+x);
            attack.setText("Current Attack : "+p.getAttack());
        }            jTextField2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String y = "";
        for (int i = 0; i < jTextField3.getText().length(); i++) {
            if(jTextField3.getText().charAt(i) >= '0' && jTextField3.getText().charAt(i) <= '9' ){
                y += jTextField3.getText().charAt(i);
            }
        }
        if(!jTextField3.getText().equals(null)&&y.length()>0){
            int x = Integer.parseInt(y);
            p.setMaxhp(x);
            max.setText("Current Max HP : "+p.getMaxhp());
        }            jTextField3.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String y = "";
        for (int i = 0; i < jTextField4.getText().length(); i++) {
            if(jTextField4.getText().charAt(i) >= '0' && jTextField4.getText().charAt(i) <= '9' ){
                y += jTextField4.getText().charAt(i);
            }
        }
        if(!jTextField4.getText().equals(null)&&y.length()>0){
            int x = Integer.parseInt(y);
            if(x<=p.getMaxhp()){
                p.setHp(x);
            }else{
                p.setHp(p.getMaxhp());
            }
            hp.setText("Current HP : "+p.getHp());
    }            jTextField4.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String y = "";
        for (int i = 0; i < jTextField5.getText().length(); i++) {
            if(jTextField5.getText().charAt(i) >= '0' && jTextField5.getText().charAt(i) <= '9' ){
                y += jTextField5.getText().charAt(i);
            }
        }
        if(!jTextField5.getText().equals(null)&&y.length()>0){
            int x = Integer.parseInt(y);
            p.setDefend(p.getDefend()+x);
            defend.setText("Current Defend : "+p.getDefend());
        }            jTextField5.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String y = "";
        for (int i = 0; i < jTextField6.getText().length(); i++) {
            if(jTextField6.getText().charAt(i) >= '0' && jTextField6.getText().charAt(i) <= '9' ){
                y += jTextField6.getText().charAt(i);
            }
        }
        if(!jTextField6.getText().equals(null)&&y.length()>0){
            int x = Integer.parseInt(y);    
            p.setJumlahpeluru(p.getJumlahpeluru()+x);
                if(p.getJumlahpeluru()>7){
                    p.setJumlahpeluru(7);
                }
            bullet.setText("Current Bullet : "+p.getJumlahpeluru());
        }            jTextField6.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String y = "";
        for (int i = 0; i < jTextField1.getText().length(); i++) {
            if(jTextField1.getText().charAt(i) >= '0' && jTextField1.getText().charAt(i) <= '9' ){
                y += jTextField1.getText().charAt(i);
            }
        }
        if(!jTextField1.getText().equals(null)&&y.length()>0){
            int x = Integer.parseInt(y);
            p.setGold(p.getGold()+x);
            gold.setText("Current Gold : "+p.getGold());
        }            jTextField1.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cheat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cheat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cheat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cheat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cheat(p).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attack;
    private javax.swing.JLabel bullet;
    private javax.swing.JLabel defend;
    private javax.swing.JLabel gold;
    private javax.swing.JLabel hp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel jlabel14;
    private javax.swing.JLabel jlabel15;
    private javax.swing.JLabel max;
    // End of variables declaration//GEN-END:variables
}
