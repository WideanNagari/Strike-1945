/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.swing.Timer;
/**
 *
 * @author Widean Nagari
 */
public class MainPanel extends javax.swing.JPanel implements KeyListener, MouseListener{

    /**
     * Creates new form MainPanel
     */
    ArrayList<Enemy> daftarmusuh;
//    ArrayList<Peluru> daftarpeluru;
    GameFrame main;
    NewGame n;
    Player p;
    BufferedImage background; 
    BufferedImage background2; 
    Timer Tnormal;
    Timer Tplay;
    int count = 3,waktu, ctr = 0;
    boolean playing = false;
    public MainPanel(GameFrame main, NewGame n) {
        initComponents();
        this.n = n;
        if (n.newp = true) {
            p = n.p.get(n.p.size()-1);
        }
        daftarmusuh = new ArrayList();
        this.main = main;
        this.addKeyListener(this);
        this.addMouseListener(this);
        try{
            this.background = ImageIO.read(new File("./Background/common.jpg"));
            this.background2 = ImageIO.read(new File("./Background/boss.jpg"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        Tnormal = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (count>=0) {
                    jLabel1.setVisible(true);
                    if (count == 0) {
                        jLabel1.setText("GO!!!!!");
                        Tplay.start();
                        ctr = 0;
                    }else{
                        jLabel1.setText(count+"");
                    }
                    count--;
                }else{
                    if (playing==false) {
                        jLabel1.setVisible(false);
                        playing = true;
                    }else{
                        waktu++;
//                        main.updateStatus(waktu, p.skor, p.nyawa);
                        int rand = (int)(Math.random()*5);
                        int randy = (int)(Math.random()*750);
                        if (rand == 0) {
                            daftarmusuh.add(new EnemyAshpest(1700,randy));
                        }else if (rand == 1) {
                            daftarmusuh.add(new EnemyBlademorph(1700, randy));
                        }else if (rand == 2) {
                            daftarmusuh.add(new EnemyBlazelich(1700, randy));
                        }else if (rand == 3) {
                            daftarmusuh.add(new EnemyBlazewing(1700, randy));
                        }else if (rand == 4) {
                            daftarmusuh.add(new EnemyGlowstarKing(1700, randy));
                        }
                    }
                }
            }
        });
        Tplay = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
//                for (Peluru peluru : daftarpeluru) {
//                    if (peluru.y<0) {
//                        peluru.mati();
//                    }
//                    peluru.gerak(0);
//                }
                for (Enemy musuh : daftarmusuh) {
                    if (musuh.getHp()>0) {
                        musuh.setX(musuh.getX()-musuh.getSpeed());;
//                        if (musuh.y>800) {
//                            p.skor-=5;
//                            musuh.mati();
//                        }
                    }else{
//                        musuh.durasiMati--;
                    }
                }
                if (ctr == 5) {
                    p.gantiAnimasi();
                    for (Enemy musuh : daftarmusuh) {
                        musuh.gantiAnimasi();
                    }
                    ctr = 0;
                }
                repaint();
//                for (Musuh musuh : daftarmusuh) {
//                    if (musuh.nyawa>=0) {
//                        Rectangle bbMusuh = new Rectangle(musuh.x,musuh.y,musuh.width,musuh.height);
//                        for (Peluru peluru : daftarpeluru) {
//                            if (peluru.nyawa>0) {
//                                Rectangle bbPeluru = new Rectangle(peluru.x,peluru.y,peluru.width,peluru.height);
//                                if (bbMusuh.intersects(bbPeluru)) {
//                                    musuh.mati();
//                                    peluru.mati();
//                                    repaint();
//                                    p.skor+=10;
//                                    ayah.updateStatus(waktu, p.skor, p.nyawa);
//                                    break;
//                                }
//                            }
//                        }
//                    }
//                }
                //pengecekan musuh nabrak saya
//                        Rectangle bbPlayer = new Rectangle(p.x,p.y,p.width,p.height);
//                        for (Musuh musuh : daftarmusuh) {
//                            if (musuh.nyawa>0) {
//                                Rectangle bbMusuh = new Rectangle(musuh.x,musuh.y,musuh.width,musuh.height);
//                                if (bbPlayer.intersects(bbMusuh)) {
//                                    musuh.mati();
//                                    p.ketabrak();
//                                    ayah.updateStatus(waktu, p.skor, p.nyawa);
//                                    if (p.nyawa <= 0) {
//                                        lagiMain = false;
//                                        tNormal.stop();
//                                        tPlay.stop();
//                                        jLabel1.setText("GAME OVER");
//                                        jLabel1.setVisible(true);
//                                    }
//                                    repaint();
//                                    break;
//                                }
//                            }
//                        }
                
//                Iterator<Peluru> iPeluru = daftarpeluru.iterator();
//                while(iPeluru.hasNext()){
//                    Peluru cek = iPeluru.next();
//                    if (cek.nyawa == 0) {
//                        iPeluru.remove();
//                    }
//                }
//                Iterator<Enemy> iMusuh = daftarmusuh.iterator();
//                while(iMusuh.hasNext()){
//                    Enemy cek = iMusuh.next();
//                    if (cek.nyawa == 0 && cek.durasiMati<=0) {
//                        iMusuh.remove();
//                    }
//                }
                ctr++;
            }
        });
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics g2 = (Graphics2D) g;
        
        g2.drawImage(background, 0, 0, 1920,900,this);
        
        g2.drawImage(p.getGambar2(), p.getX()-p.getXk(), p.getY()-p.getYk(), p.getWidth()+20,p.getHeight()+20,this);
        g2.drawImage(p.getGambar(), p.getX(), p.getY(), p.getWidth(),p.getHeight(),this);
        
        for (Enemy musuh : daftarmusuh) {
            g2.drawImage(musuh.getGambar2(), musuh.getX()+musuh.getXk(), musuh.getY()+musuh.getYk(), musuh.getWidth()/2,musuh.getHeight()/2,this);
            g2.drawImage(musuh.getGambar(), musuh.getX(), musuh.getY(), musuh.getWidth(),musuh.getHeight(),this);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(240, 0, 0));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Press PLAY to play!");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(372, 372, 372))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("type");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("press");
        if(playing ==  true){
            if(e.getKeyCode() == 87 && p.y > 0){
                // atas
                p.gerak(0);
                repaint();
            }
            if(e.getKeyCode() == 68 && p.x < 1700){
                // kanan
                p.gerak(1);
                repaint();
            }
            if(e.getKeyCode() == 83 && p.y < 750){
                // bawah
                p.gerak(2);
                repaint();
            }
            if(e.getKeyCode() == 65 && p.x > 5){
                // kiri
                p.gerak(3);
                repaint();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("release");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("pressmouse");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("release mouse");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("exited");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
