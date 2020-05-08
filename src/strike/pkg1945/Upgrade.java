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
 * @author Widean Nagari
 */
public class Upgrade extends javax.swing.JFrame {

    /**
     * Creates new form Upgrade
     */
    static Player p;
    public Upgrade(Player p) {
        initComponents();
        this.p = p;
        Hp.setText(p.getHp()+"/"+p.getMaxhp());
        Attack.setText(p.getAttack()+"");
        Defend.setText(p.getDefend()+"");
        Bullet.setText(p.getJumlahpeluru()+"");
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tombolattack = new javax.swing.JButton();
        tombolbullet = new javax.swing.JButton();
        tomboldefend = new javax.swing.JButton();
        tombolhp = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Hp = new javax.swing.JLabel();
        Attack = new javax.swing.JLabel();
        Defend = new javax.swing.JLabel();
        Bullet = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        gold = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/Upgrade.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(790, 80, 380, 120);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/Back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1590, 860, 200, 75);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/Attack.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 530, 120, 120);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/Bullet.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1080, 520, 130, 130);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/Defend.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1080, 310, 130, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strike/pkg1945/Gambar/Hp.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 320, 120, 120);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("+500 Hp");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(350, 320, 180, 50);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("+100 Attack Point");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(350, 530, 330, 40);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("+1 Bullet");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(1230, 520, 170, 40);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("+5 Defend Point");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1230, 310, 300, 51);

        tombolattack.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        tombolattack.setText("250 Gold");
        tombolattack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolattackActionPerformed(evt);
            }
        });
        jPanel1.add(tombolattack);
        tombolattack.setBounds(690, 530, 250, 50);

        tombolbullet.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        tombolbullet.setText("500 Gold");
        tombolbullet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolbulletActionPerformed(evt);
            }
        });
        jPanel1.add(tombolbullet);
        tombolbullet.setBounds(1530, 520, 250, 50);

        tomboldefend.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        tomboldefend.setText("300 Gold");
        tomboldefend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomboldefendActionPerformed(evt);
            }
        });
        jPanel1.add(tomboldefend);
        tomboldefend.setBounds(1530, 310, 250, 50);

        tombolhp.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        tombolhp.setText("350 Gold");
        tombolhp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolhpActionPerformed(evt);
            }
        });
        jPanel1.add(tombolhp);
        tombolhp.setBounds(680, 320, 250, 50);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Hp     :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(370, 390, 150, 50);

        Hp.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        Hp.setForeground(new java.awt.Color(240, 240, 240));
        Hp.setText("1500/1500");
        jPanel1.add(Hp);
        Hp.setBounds(540, 390, 500, 50);

        Attack.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        Attack.setForeground(new java.awt.Color(240, 240, 240));
        Attack.setText("50");
        jPanel1.add(Attack);
        Attack.setBounds(540, 590, 500, 50);

        Defend.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        Defend.setForeground(new java.awt.Color(240, 240, 240));
        Defend.setText("10");
        jPanel1.add(Defend);
        Defend.setBounds(1470, 380, 200, 40);

        Bullet.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        Bullet.setForeground(new java.awt.Color(240, 240, 240));
        Bullet.setText("1/7");
        jPanel1.add(Bullet);
        Bullet.setBounds(1480, 580, 200, 50);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Defend :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(1290, 380, 160, 40);

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Bullet   :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(1290, 580, 170, 50);

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Attack :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(370, 590, 150, 50);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Gold :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(860, 810, 150, 60);

        gold.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        gold.setForeground(new java.awt.Color(240, 240, 240));
        gold.setText("0");
        jPanel1.add(gold);
        gold.setBounds(1040, 810, 500, 60);

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
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

    private void tombolhpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolhpActionPerformed
        String uang = "";
        for (int i = 0; i < tombolhp.getText().length(); i++) {
            if(tombolhp.getText().charAt(i) >= '0' && tombolhp.getText().charAt(i) <= '9' ){
                uang += tombolhp.getText().charAt(i);
            }
        }
        int harga = Integer.parseInt(uang);
        if (p.getGold()>=harga) {
            p.setGold(p.getGold()-harga);
            p.setHp(p.getHp()+500);
            p.setMaxhp(p.getMaxhp()+500);
            p.setLevelhp(p.getLevelhp()+1);
            tombolhp.setText((harga*p.getLevelhp())+"");
            Hp.setText(p.getHp()+"/"+p.getMaxhp());
            gold.setText(p.getGold()+"");
        }
    }//GEN-LAST:event_tombolhpActionPerformed

    private void tombolattackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolattackActionPerformed
        String uang = "";
        for (int i = 0; i < tombolattack.getText().length(); i++) {
            if(tombolattack.getText().charAt(i) >= '0' && tombolattack.getText().charAt(i) <= '9' ){
                uang += tombolattack.getText().charAt(i);
            }
        }
        int harga = Integer.parseInt(uang);
        if (p.getGold()>=harga) {
            p.setGold(p.getGold()-harga);
            p.setAttack(p.getAttack()+100);
            p.setLevelattack(p.getLevelattack()+1);
            tombolattack.setText((harga*p.getLevelattack())+"");
            Attack.setText(p.getAttack()+"");
            gold.setText(p.getGold()+"");
        }
    }//GEN-LAST:event_tombolattackActionPerformed

    private void tomboldefendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomboldefendActionPerformed
        String uang = "";
        for (int i = 0; i < tomboldefend.getText().length(); i++) {
            if(tomboldefend.getText().charAt(i) >= '0' && tomboldefend.getText().charAt(i) <= '9' ){
                uang += tomboldefend.getText().charAt(i);
            }
        }
        int harga = Integer.parseInt(uang);
        if (p.getGold()>=harga) {
            p.setGold(p.getGold()-harga);
            p.setDefend(p.getDefend()+5);
            p.setLeveldefend(p.getLeveldefend()+1);
            tomboldefend.setText((harga*p.getLeveldefend())+"");
            Defend.setText(p.getDefend()+"");
            gold.setText(p.getGold()+"");
        }
    }//GEN-LAST:event_tomboldefendActionPerformed

    private void tombolbulletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolbulletActionPerformed
        String uang = "";
        for (int i = 0; i < tombolbullet.getText().length(); i++) {
            if(tombolbullet.getText().charAt(i) >= '0' && tombolbullet.getText().charAt(i) <= '9' ){
                uang += tombolbullet.getText().charAt(i);
            }
        }
        int harga = Integer.parseInt(uang);
        if (p.getGold()>=harga && p.jumlahpeluru < 7) {
            p.setGold(p.getGold()-harga);
            p.setJumlahpeluru(p.getJumlahpeluru()+1);
            tombolbullet.setText((harga*p.getJumlahpeluru())+"");
            Bullet.setText(p.getJumlahpeluru()+"/7");
            gold.setText(p.getGold()+"");
        }
    }//GEN-LAST:event_tombolbulletActionPerformed

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
            java.util.logging.Logger.getLogger(Upgrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Upgrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Upgrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Upgrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Upgrade(p).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Attack;
    private javax.swing.JLabel Bullet;
    private javax.swing.JLabel Defend;
    private javax.swing.JLabel Hp;
    private javax.swing.JLabel gold;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton tombolattack;
    private javax.swing.JButton tombolbullet;
    private javax.swing.JButton tomboldefend;
    private javax.swing.JButton tombolhp;
    // End of variables declaration//GEN-END:variables
}
