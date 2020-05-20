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
import javax.swing.JPanel;
import javax.swing.JProgressBar;
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
    ArrayList<Peluru> daftarpeluru;
    ArrayList<Peluru> pelurua;
    ArrayList<Peluru> pelurub;
    ArrayList<Peluru> peluruc;
    ArrayList<Peluru> pelurud;
    ArrayList<Peluru> pelurue;
    ArrayList<Peluru> peluruBoss;
    Gambar gambar;
    GameFrame main;
    NewGame n;
    Player p;
    EnemyBoss boss;
    Peluru specialBullet;
    BufferedImage background; 
    BufferedImage background2; 
    Timer Tnormal;
    Timer Tplay;
    int count = 3, ctr, ctrm,ctrm2,ctrboss,ctrjlabel2;
    int eagle,angel,shield,sack;
    boolean playing = false;
    EnemyAshpest ashpest;
    EnemyBlademorph blade;
    EnemyBlazelich lich;
    EnemyBlazewing wing;
    EnemyGlowstarKing king;
    BufferedImage pesawat,knalpot;
    public MainPanel(GameFrame main, NewGame n) {
        initComponents();
        progressboss.setVisible(false);
        jLabel2.setVisible(false);
        eagle=0;angel=0;shield=0;sack=0;
        gambar = new Gambar();
        this.n = n;
        if (n.newp = true) {
            p = n.p.get(n.p.size()-1);
        }
        if (p instanceof PesawatLockheed) {pesawat = gambar.getGambar1(); knalpot = gambar.getGambarKnalpot1(0);}
        else if (p instanceof PesawatNorthtrop) {pesawat = gambar.getGambar2(); knalpot = gambar.getGambarKnalpot2(0);}
        else if (p instanceof PesawatThunderbold) {pesawat = gambar.getGambar3(); knalpot = gambar.getGambarKnalpot3(0);}
        main.updateStatus(p,p.getHp(),p.getMaxhp(), p.getSkor(), p.getGold(),p.getLevel());
        ashpest = new EnemyAshpest();
        blade = new EnemyBlademorph();
        lich = new EnemyBlazelich();
        wing = new EnemyBlazewing();
        king = new EnemyGlowstarKing();
        ctrm = 5;ctrboss = 0;ctrm2 = 5;
        daftarmusuh = new ArrayList();
        daftarpeluru = new ArrayList();
        peluruBoss = new ArrayList();
        pelurua = new ArrayList();
        pelurub = new ArrayList();
        peluruc = new ArrayList();
        pelurud = new ArrayList();
        pelurue = new ArrayList();
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
                main.updateStatus(p,p.getHp(),p.getMaxhp(), p.getSkor(), p.getGold(),p.getLevel());
                if (count>=0) {
                    jLabel1.setVisible(true);
                    if (count == 0) {
                        jLabel1.setText("GO!!!!!");
                        ctr = 0;
                    }else{
                        jLabel1.setText(count+"");
                    }
                    count--;
                }else{
                    if (playing==false) {
                        jLabel1.setVisible(false);
                        playing = true;
                        Tplay.start();
                    }else{
                        if (p.getLevell()!=5) {
                            if (ctrm == ctrm2) {
                                ctrm = 0;
                                for (int i = 0; i < p.getJumlahMusuh(); i++) {
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
                                    if (p.getAngelBox()>0) {daftarmusuh.get(daftarmusuh.size()-1).setHp(daftarmusuh.get(daftarmusuh.size()-1).getHp()/2);}
                                }
                            }
                            ctrm++;  
                        }
                    }
                    if (p.getLevell()==5 && boss==null) {
                        boss = new EnemyBoss(p.getHp()*p.getBossKe(), 1920, 230);
                        progressboss.setMinimum(0);
                        progressboss.setMaximum(boss.getHp());
                        progressboss.setLocation(1970,100);
                        progressboss.setVisible(true);
                        progressboss.setValue(boss.getHp());
                        playing = false;
                        Tnormal.stop();
                        jLabel1.setText("BOSS ROUND!!!!");
                        jLabel1.setVisible(true);
                    }
                    if (ctrjlabel2>1) {
                        ctrjlabel2--;
                    }else{
                        jLabel2.setVisible(false);
                    }
                }
            }
        });
        Tplay = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
                p.setCooldown(p.getCooldown()-1);
                for (Enemy enemy : daftarmusuh) {
                    if (playing) {
                        enemy.setCooldown(enemy.getCooldown()-1);
                    }
                }
                for (Peluru peluru : daftarpeluru) {
                    if (peluru.getX()>1900) {peluru.setHp(0);}
                    if (playing) {peluru.gerakP();}
                }
                if (specialBullet!=null && playing) {
                    if (specialBullet.getX()>1900) {specialBullet = null;}
                    else{specialBullet.gerakP();}
                }
                if (playing) {
                    for (Peluru peluru : pelurua) {
                        if (peluru.getX()<0) {
                            peluru.setHp(0);
                        }peluru.gerakM();
                    }for (Peluru peluru : pelurub) {
                        if (peluru.getX()<0) {
                            peluru.setHp(0);
                        }peluru.gerakM();
                    }for (Peluru peluru : peluruc) {
                        if (peluru.getX()<0) {
                            peluru.setHp(0);
                        }peluru.gerakM();
                    }for (Peluru peluru : pelurud) {
                        if (peluru.getX()<0) {
                            peluru.setHp(0);
                        }peluru.gerakM();
                    }for (Peluru peluru : pelurue) {
                        if (peluru.getX()<0) {
                            peluru.setHp(0);
                        }peluru.gerakM();
                    }for (Peluru peluru : peluruBoss) {
                        if (peluru.getX()<0) {
                            peluru.setHp(0);
                        }peluru.gerakB();
                    }
                }
                if (boss!=null) {
                    if (playing) {
                        boss.setCooldown(boss.getCooldown()-1);
                    }if (boss.getX()>1400) {
                        boss.setX(boss.getX()-1);
                        progressboss.setLocation(boss.getX()+100, 200);
                        if (boss.getX()==1400) {
                            count = 3;
                            Tnormal.start();
                        }
                    }else{progressboss.setLocation(1500,200);}
                    if (ctrboss == 15) {
                        boss.gantiAnimasi();
                        ctrboss = 0;
                    }if (boss.getCooldown()==0 && boss.getHp()>0 && playing) {
                        for (int i = 0; i < 3; i++) {
                            int rr = (int)(Math.random()*boss.getHeight()-70)+1;
                            peluruBoss.add(new Peluru(boss.getX(), boss.getY()+rr));
                        }
                        boss.setCooldown(boss.getCd());
                    }
                }
                for (Enemy musuh : daftarmusuh) {
                    if (musuh.getHp()>0 && playing) {
                        musuh.setX(musuh.getX()-musuh.getSpeed());
                    }else{
                        musuh.setMati(musuh.getMati()+1);
                    }
                    if (musuh.getX()<(-10)) {
                        musuh.setTabrak(2);
                        musuh.setHp(0);
                    }
                    if (musuh.getMati()==1) {
                        if (musuh.getTabrak() == 1) {
                            p.setSkor(p.getSkor()-2);
                        }else if (musuh.getTabrak() == 2) {
                            p.setSkor(p.getSkor()-1);
                        }else{
                            p.setMusuhTerbunuh(p.getMusuhTerbunuh()+1);
                            p.setEfek(p.getEfek()+1);
                            if (p instanceof PesawatThunderbold) {
                                ((PesawatThunderbold)p).specialEffect();
                            }else if (p instanceof PesawatNorthtrop) {
                                ((PesawatNorthtrop)p).specialEffect();
                            }
                            if (p.getSackofGold()>0) {p.setGold(p.getGold()+200);
                            }else{p.setGold(p.getGold()+musuh.getGold());}
                            p.setSkor(p.getSkor()+musuh.getScore());
                            p.setSackofGold(p.getSackofGold()-1);
                            p.setEaglePotion(p.getEaglePotion()-1);
                            p.setShieldofCrystal(p.getShieldofCrystal()-1);
                        }
                        main.updateStatus(p,p.getHp(), p.getMaxhp(), p.getSkor(), p.getGold(), p.getLevel());
                    }
                    if (musuh.getCooldown()<=0 && musuh.getHp()>0 && playing) {
                            if (musuh instanceof EnemyAshpest) {
                                pelurua.add(new Peluru(musuh.getX()+80, musuh.getY()+15));
                                ((EnemyAshpest) musuh).setCooldown(((EnemyAshpest) musuh).getCd());
                            }else if (musuh instanceof EnemyBlademorph) {
                                pelurub.add(new Peluru(musuh.getX()+80, musuh.getY()+15));
                                ((EnemyBlademorph) musuh).setCooldown(((EnemyBlademorph) musuh).getCd());
                            }else if (musuh instanceof EnemyBlazelich) {
                                peluruc.add(new Peluru(musuh.getX()+80, musuh.getY()+15));
                                ((EnemyBlazelich) musuh).setCooldown(((EnemyBlazelich) musuh).getCd());
                            }else if (musuh instanceof EnemyBlazewing) {
                                pelurud.add(new Peluru(musuh.getX()+80, musuh.getY()+25));
                                ((EnemyBlazewing) musuh).setCooldown(((EnemyBlazewing) musuh).getCd());
                            }else if (musuh instanceof EnemyGlowstarKing) {
                                pelurue.add(new Peluru(musuh.getX()+80, musuh.getY()+20));
                                ((EnemyGlowstarKing) musuh).setCooldown(((EnemyGlowstarKing) musuh).getCd());
                            }
                            repaint();
                    }
                }
                if (ctr == 8 && playing) {
                    if (p instanceof PesawatLockheed) {
                        if (p.getHp()>0) {
                            knalpot = p.gantiAnimasi(gambar.getGambarKnalpot1(p.getAnimasi()));
                        }else{
                            if (p.getAnimasi()<=13) {
                                if (p.getAnimasi()==13) {
                                    pesawat = null;
                                }else{
                                pesawat = p.ledak(gambar.getGambarLedak(p.getAnimasi()));}}
                        }
                    }
                    else if (p instanceof PesawatNorthtrop) {
                        if (p.getHp()>0) {
                            knalpot = p.gantiAnimasi(gambar.getGambarKnalpot2(p.getAnimasi()));
                        }else{
                            if (p.getAnimasi()<=13) {
                                if (p.getAnimasi()==13) {
                                    pesawat = null;
                                }else{
                                pesawat = p.ledak(gambar.getGambarLedak(p.getAnimasi()));}}
                        }
                    }
                    else if (p instanceof PesawatThunderbold) {
                        if (p.getHp()>0) {
                            knalpot = p.gantiAnimasi(gambar.getGambarKnalpot3(p.getAnimasi()));
                        }else{
                            if (p.getAnimasi()<=13) {
                                if (p.getAnimasi()==13) {
                                    pesawat = null;
                                }else{
                                pesawat = p.ledak(gambar.getGambarLedak(p.getAnimasi()));}}
                        }
                    }
                    for (Enemy musuh : daftarmusuh) {
                        musuh.gantiAnimasi();
                    }
                    ctr = 0;
                }
                repaint();
                for (Enemy musuh : daftarmusuh) {
                    if (musuh.getHp()>=0) {
                        Rectangle bbMusuh = new Rectangle(musuh.getX(),musuh.getY(),musuh.getWidth(),musuh.getHeight());
                        for (Peluru peluru : daftarpeluru) {
                            if (peluru.getHp()>0) {
                                Rectangle bbPeluru = new Rectangle(peluru.getX(),peluru.getY(),peluru.getWidth(),peluru.getHeight());
                                if (bbMusuh.intersects(bbPeluru)) {
                                    musuh.setHp(musuh.getHp()-p.getAttack());
                                    peluru.setHp(0);
                                    repaint();
                                    break;
                                }
                            }
                        }
                        if (specialBullet!=null && specialBullet.getHp() > 0) {
                            Rectangle bbPeluru = new Rectangle(specialBullet.getX(),specialBullet.getY(),specialBullet.getWidth()*2,specialBullet.getHeight()*2);
                                if (bbMusuh.intersects(bbPeluru)) {
                                    musuh.setHp(musuh.getHp()-(p.getAttack()*3));
                                    specialBullet.setHp(0);
                                    repaint();
                                }
                        }
                    }
                }
                if (boss!=null && playing) {
                    Rectangle Boss = new Rectangle(boss.getX(),boss.getY(),boss.getWidth(),boss.getHeight()-70);
                        for (Peluru peluru : daftarpeluru) {
                            if (peluru.getHp()>0) {
                                Rectangle bbPeluru = new Rectangle(peluru.getX(),peluru.getY(),peluru.getWidth(),peluru.getHeight());
                                if (Boss.intersects(bbPeluru)) {
                                    boss.setHp(boss.getHp()-p.getAttack());
                                    progressboss.setValue(boss.getHp());
                                    peluru.setHp(0);
                                    repaint();
                                    break;
                                }
                            }
                        }
                        if (specialBullet!=null && specialBullet.getHp() > 0) {
                            Rectangle bbPeluru = new Rectangle(specialBullet.getX(),specialBullet.getY(),specialBullet.getWidth()*2,specialBullet.getHeight()*2);
                                if (Boss.intersects(bbPeluru)) {
                                    specialBullet.setHp(0);
                                    boss.setHp(boss.getHp()-(p.getAttack()*3));
                                    progressboss.setValue(boss.getHp());
                                    repaint();
                                }
                        }
                }
                        Rectangle bbPlayer = new Rectangle(p.getX(),p.getY(),p.getWidth(),p.getHeight());
                        for (Enemy m : daftarmusuh) {
                            if (m.getHp()>0) {
                                Rectangle bbMusuh = new Rectangle(m.getX(),m.getY(),m.getWidth(),m.getHeight());
                                if (bbPlayer.intersects(bbMusuh)) {
                                    m.setHp(0);
                                    m.setTabrak(1);
                                    if ((m.getDamage()*2)>p.getDefend()) {
                                        p.setHp(p.getHp()-((m.getDamage()*2)-p.getDefend()));
                                    }
                                    main.updateStatus(p,p.getHp(),p.getMaxhp(), p.getSkor(), p.getGold(),p.getLevel());
//                                    if (p.getHp() <= 0) {
//                                        playing = false;
//                                        Tnormal.stop();
//                                        Tplay.stop();
//                                        jLabel1.setText("GAME OVER");
//                                        jLabel1.setVisible(true);
//                                    }
                                    repaint();
                                    break;
                                }
                            }
                        }
                        for (Peluru peluru : pelurua) {
                            if (peluru.getHp()>0) {
                                Rectangle Peluru = new Rectangle(peluru.getX(),peluru.getY(),peluru.getWidth(),peluru.getHeight());
                                if (Peluru.intersects(bbPlayer)) {
                                    if (p.getDefend()<ashpest.getDamage()) {
                                        int rr = (int)(Math.random()*100)+1;
                                        if (rr>p.getChancemiss()) {
                                            if (p.getAngelBox()>0) {
                                                p.setHp(p.getHp()-((ashpest.getDamage()/2)-p.getDefend()));
                                            }else{p.setHp(p.getHp()-(ashpest.getDamage()-p.getDefend()));}
                                        }
                                    }
                                    peluru.setHp(0);
                                    main.updateStatus(p,p.getHp(),p.getMaxhp(), p.getSkor(), p.getGold(),p.getLevel());
                                    repaint();
                                    break;
                                }
                            }
                        }for (Peluru peluru : pelurub) {
                            if (peluru.getHp()>0) {
                                Rectangle Peluru = new Rectangle(peluru.getX(),peluru.getY(),peluru.getWidth(),peluru.getHeight());
                                if (Peluru.intersects(bbPlayer)) {
                                    if (p.getDefend()<blade.getDamage()) {
                                        int rr = (int)(Math.random()*100)+1;
                                        if (rr>p.getChancemiss()) {
                                            if (p.getAngelBox()>0) {
                                                p.setHp(p.getHp()-((blade.getDamage()/2)-p.getDefend()));
                                            }else{p.setHp(p.getHp()-(blade.getDamage()-p.getDefend()));}
                                        }
                                    }
                                    peluru.setHp(0);
                                    main.updateStatus(p,p.getHp(),p.getMaxhp(), p.getSkor(), p.getGold(),p.getLevel());
                                    repaint();
                                    break;
                                }
                            }
                        }for (Peluru peluru : peluruc) {
                            if (peluru.getHp()>0) {
                                Rectangle Peluru = new Rectangle(peluru.getX(),peluru.getY(),peluru.getWidth(),peluru.getHeight());
                                if (Peluru.intersects(bbPlayer)) {
                                    if (p.getDefend()<lich.getDamage()) {
                                        int rr = (int)(Math.random()*100)+1;
                                        if (rr>p.getChancemiss()) {
                                            if (p.getAngelBox()>0) {
                                                p.setHp(p.getHp()-((lich.getDamage()/2)-p.getDefend()));
                                            }else{p.setHp(p.getHp()-(lich.getDamage()-p.getDefend()));}
                                        }
                                    }
                                    peluru.setHp(0);
                                    main.updateStatus(p,p.getHp(),p.getMaxhp(), p.getSkor(), p.getGold(),p.getLevel());
                                    repaint();
                                    break;
                                }
                            }
                        }for (Peluru peluru : pelurud) {
                            if (peluru.getHp()>0) {
                                Rectangle Peluru = new Rectangle(peluru.getX(),peluru.getY(),peluru.getWidth(),peluru.getHeight());
                                if (Peluru.intersects(bbPlayer)) {
                                    if (p.getDefend()<wing.getDamage()) {
                                        int rr = (int)(Math.random()*100)+1;
                                        if (rr>p.getChancemiss()) {
                                            if (p.getAngelBox()>0) {
                                                p.setHp(p.getHp()-((wing.getDamage()/2)-p.getDefend()));
                                            }else{p.setHp(p.getHp()-(wing.getDamage()-p.getDefend()));}
                                        }
                                    }
                                    peluru.setHp(0);
                                    main.updateStatus(p,p.getHp(),p.getMaxhp(), p.getSkor(), p.getGold(),p.getLevel());
                                    repaint();
                                    break;
                                }
                            }
                        }for (Peluru peluru : pelurue) {
                            if (peluru.getHp()>0) {
                                Rectangle Peluru = new Rectangle(peluru.getX(),peluru.getY(),peluru.getWidth(),peluru.getHeight());
                                if (Peluru.intersects(bbPlayer)) {
                                    if (p.getDefend()<king.getDamage()) {
                                        int rr = (int)(Math.random()*100)+1;
                                        if (rr>p.getChancemiss()) {
                                            if (p.getAngelBox()>0) {
                                                p.setHp(p.getHp()-((king.getDamage()/2)-p.getDefend()));
                                            }else{p.setHp(p.getHp()-(king.getDamage()-p.getDefend()));}
                                        }
                                    }
                                    peluru.setHp(0);
                                    main.updateStatus(p,p.getHp(),p.getMaxhp(), p.getSkor(), p.getGold(),p.getLevel());
                                    repaint();
                                    break;
                                }
                            }
                        }for (Peluru peluru : peluruBoss) {
                            if (peluru.getHp()>0) {
                                Rectangle Peluru = new Rectangle(peluru.getX(),peluru.getY(),peluru.getWidth(),peluru.getHeight());
                                if (Peluru.intersects(bbPlayer)) {
                                    int rr2 = (int)(Math.random()*90)+10;
                                    if (p.getDefend()<rr2) {
                                        int rr = (int)(Math.random()*100)+1;
                                        if (rr>p.getChancemiss()) {
                                            if (p.getAngelBox()>0) {
                                                p.setHp(p.getHp()-((rr2/2)-p.getDefend()));
                                            }else{p.setHp(p.getHp()-(rr2-p.getDefend()));}
                                        }
                                    }
                                    peluru.setHp(0);
                                    main.updateStatus(p,p.getHp(),p.getMaxhp(), p.getSkor(), p.getGold(),p.getLevel());
                                    repaint();
                                    break;
                                }
                            }
                        }
                        
                Iterator<Peluru> P = daftarpeluru.iterator();
                while(P.hasNext()){
                    Peluru cek = P.next();
                    if (cek.getHp() == 0) {
                        if (cek.getAnimasi() == 6) {
                            P.remove();
                        }else{
                            cek.gantiAnimasi();
                        }
                    }
                }
                if (specialBullet!=null && specialBullet.getHp()==0) {
                    if (specialBullet.getAnimasi() == 6) {
                        specialBullet = null;
                    }else{
                        specialBullet.gantiAnimasi();
                    }
                }
                Iterator<Peluru> Pa = pelurua.iterator();
                while(Pa.hasNext()){
                    Peluru cek = Pa.next();
                    if (cek.getHp() == 0) {
                        if (cek.getAnimasi() == 6) {
                            Pa.remove();
                        }else{
                            cek.gantiAnimasi();
                        }
                    }
                }
                Iterator<Peluru> Pb = pelurub.iterator();
                while(Pb.hasNext()){
                    Peluru cek = Pb.next();
                    if (cek.getHp() == 0) {
                        if (cek.getAnimasi() == 6) {
                            Pb.remove();
                        }else{
                            cek.gantiAnimasi();
                        }
                    }
                }
                Iterator<Peluru> Pc = peluruc.iterator();
                while(Pc.hasNext()){
                    Peluru cek = Pc.next();
                    if (cek.getHp() == 0) {
                        if (cek.getAnimasi() == 6) {
                            Pc.remove();
                        }else{
                            cek.gantiAnimasi();
                        }
                    }
                }
                Iterator<Peluru> Pd = pelurud.iterator();
                while(Pd.hasNext()){
                    Peluru cek = Pd.next();
                    if (cek.getHp() == 0) {
                        if (cek.getAnimasi() == 6) {
                            Pd.remove();
                        }else{
                            cek.gantiAnimasi();
                        }
                    }
                }
                Iterator<Peluru> Pe = pelurue.iterator();
                while(Pe.hasNext()){
                    Peluru cek = Pe.next();
                    if (cek.getHp() == 0) {
                        if (cek.getAnimasi() == 6) {
                            Pe.remove();
                        }else{
                            cek.gantiAnimasi();
                        }
                    }
                }
                Iterator<Peluru> Pboss = peluruBoss.iterator();
                while(Pboss.hasNext()){
                    Peluru cek = Pboss.next();
                    if (cek.getHp() == 0) {
                        if (cek.getAnimasi() == 6) {
                            Pboss.remove();
                        }else{
                            cek.gantiAnimasi();
                        }
                    }
                }
                Iterator<Enemy> M = daftarmusuh.iterator();
                while(M.hasNext()){
                    Enemy cek = M.next();
                    if (cek.getHp() <= 0 && cek.getAnimasi()>=11) {
                        M.remove();
                    }
                }
                if (p.getHp()<=0) {
                    p.setMati(p.getMati()+1);
                    p.setHp(0);
                }
                if (boss!=null && boss.getHp() <= 0 && boss.getAnimasi() >= 15) {
                    boss = null;
                    p.setGold(p.getGold()+1500);
                    p.setSkor(p.getSkor()+100);
                    main.updateStatus(p,p.getHp(),p.getMaxhp(), p.getSkor(), p.getGold(),p.getLevel());
                    p.setMusuhTerbunuh(1);
                    p.setAngelBox(0);
                    p.setBossKe(p.getBossKe()+1);
                    progressboss.setVisible(false);
                }
                if (playing) {
                    ctr++;
                }
                if (boss!=null) {ctrboss++;}
                if (p.getMusuhTerbunuh()==10) {
                    p.setAngelBox(p.getAngelBox()-1);
                    p.setMusuhTerbunuh(0);
                    p.setGold(p.getGold()+1000);
                    p.setLevel(p.getLevel()+1);
                    if (p.getLevell()==5) {
                        p.setLevell(1);
                    }else{
                    p.setLevell(p.getLevell()+1);}
                    if (p.getLevel()%3==0) {
                        if (ctrm2>1) {
                            ctrm2--;
                        }else if(p.getJumlahMusuh()<5){
                            p.setJumlahMusuh(p.getJumlahMusuh()+1);
                        }
                    }
                    main.updateStatus(p,p.getHp(),p.getMaxhp(), p.getSkor(), p.getGold(),p.getLevel());
                }
                if (p.getEaglePotion()<=0 && eagle == 1) {
                    jLabel2.setText("Efek Eagle Potion Telah Habis!");
                    jLabel2.setVisible(true);
                    ctrjlabel2 = 2;eagle--;
                    p.setAttack(p.getAttack()-500);
                }if (p.getShieldofCrystal()<=0 && shield == 1) {
                    jLabel2.setText("Efek Shield of Crystal Barrier Telah Habis!");
                    jLabel2.setVisible(true);
                    ctrjlabel2 = 2;shield--;
                    p.setDefend(p.getDefend()-20);
                }if (p.getAngelBox()<=0 && angel == 1) {
                    jLabel2.setText("Efek Angel Box Telah Habis!");
                    jLabel2.setVisible(true);ctrjlabel2 = 2;
                    for (Enemy enemy : daftarmusuh) {
                        enemy.setHp(enemy.getHp()*2);
                    }
                    angel--;
                }if (p.getSackofGold()<=0 && sack==1) {
                    jLabel2.setText("Efek Sack of Gold Telah Habis!");
                    jLabel2.setVisible(true);
                    ctrjlabel2 = 2;sack--;
                }
            }
        });
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics g2 = (Graphics2D) g;
        
        if (p.getLevell() == 5) {
            g2.drawImage(background2, 0, 0, 1920,900,this);
        }else{
            g2.drawImage(background, 0, 0, 1920,900,this);}
        
        for (Peluru pp : daftarpeluru) {
            g2.drawImage(pp.getGambarP(), pp.getX(), pp.getY(), pp.getWidth(),pp.getHeight(),this);
        }
        if (specialBullet!=null) {
            g2.drawImage(specialBullet.getGambarP(), specialBullet.getX(), specialBullet.getY(), specialBullet.getWidth()*2,specialBullet.getHeight()*2,this);
        }
        for (Peluru pp : peluruBoss) {
            g2.drawImage(pp.getGambarB(), pp.getX(), pp.getY(), pp.getWidth()*2,pp.getHeight()*2,this);
        }
        if (boss!=null) {
            g2.drawImage(boss.getGambar(), boss.getX(), boss.getY(), boss.getWidth(),boss.getHeight(),this);
        }
        for (Peluru pp : pelurua) {
            g2.drawImage(pp.getGambarM(), pp.getX(), pp.getY(), pp.getWidth(),pp.getHeight(),this);
        }for (Peluru pp : pelurub) {
            g2.drawImage(pp.getGambarM(), pp.getX(), pp.getY(), pp.getWidth(),pp.getHeight(),this);
        }for (Peluru pp : peluruc) {
            g2.drawImage(pp.getGambarM(), pp.getX(), pp.getY(), pp.getWidth(),pp.getHeight(),this);
        }for (Peluru pp : pelurud) {
            g2.drawImage(pp.getGambarM(), pp.getX(), pp.getY(), pp.getWidth(),pp.getHeight(),this);
        }for (Peluru pp : pelurue) {
            g2.drawImage(pp.getGambarM(), pp.getX(), pp.getY(), pp.getWidth(),pp.getHeight(),this);
        }
        
        g2.drawImage(knalpot, p.getX()-p.getXk(), p.getY()-p.getYk(), p.getWidth()+20,p.getHeight()+20,this);
        g2.drawImage(pesawat, p.getX(), p.getY(), p.getWidth(),p.getHeight(),this);
        
        for (Enemy musuh : daftarmusuh) {
            g2.drawImage(musuh.getGambar2(), musuh.getX()+musuh.getXk(), musuh.getY()+musuh.getYk(), musuh.getWidth(),musuh.getHeight(),this);
            g2.drawImage(musuh.getGambar(), musuh.getX(), musuh.getY(), musuh.getWidth(),musuh.getHeight(),this);
        }
        if (boss!=null) {progressboss.setLocation(boss.getX()+100, 200);}
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
        jLabel2 = new javax.swing.JLabel();
        progressboss = new javax.swing.JProgressBar();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(240, 0, 0));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Press PLAY to play!");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("x");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(progressboss, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(progressboss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
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
            char a = e.getKeyChar();
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
            if (a == 'C') {
                Tnormal.stop();
                Tplay.stop();
                playing = false;
                Cheat frame = new Cheat(this.p);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }else if (a == 'y') {
                if (p.getJumEaglePotion()>=1 && playing) {
                    p.setJumEaglePotion(p.getJumEaglePotion()-1);
                    jLabel2.setText("Eagle Potion Activated! "+p.getJumEaglePotion()+" Left");
                    p.setEaglePotion(5);
                    p.setAttack(p.getAttack()+500);eagle = 1;
                }else{
                    jLabel2.setText("No Eagle Potion Left!");
                }jLabel2.setVisible(true);ctrjlabel2 = 2;
            }else if (a == 'u') {
                if (p.getJumShieldofCrystal()>=1 && playing) {
                    p.setJumShieldofCrystal(p.getJumShieldofCrystal()-1);
                    jLabel2.setText("Shield of Crystal Barrier Activated! "+p.getJumShieldofCrystal()+" Left");
                    p.setShieldofCrystal(5);
                    p.setDefend(p.getDefend()+20); shield = 1;
                }else{
                    jLabel2.setText("No Shield of Crystal Barrier Left!");
                }jLabel2.setVisible(true);ctrjlabel2 = 2;
            }else if (a == 'i') {
                if (p.getJumSackofGold()>=1 && playing) {
                    p.setJumSackofGold(p.getJumSackofGold()-1);
                    jLabel2.setText("Sack of Gold Activated! "+p.getJumSackofGold()+" Left");
                    p.setSackofGold(5);sack = 1;
                }else{
                    jLabel2.setText("No Sack of Gold Left!");
                }jLabel2.setVisible(true);ctrjlabel2 = 2;
            }else if (a == 'o') {
                if (p.getJumMassiveSalve()>=1 && playing) {
                    p.setJumMassiveSalve(p.getJumMassiveSalve()-1);
                    jLabel2.setText("Massive Heal Activated! " + p.getJumMassiveSalve()+" Left");
                    p.setHp(p.getHp()+500);
                    if (p.getHp()>p.getMaxhp()) {p.setHp(p.getMaxhp());}
                }else{
                    jLabel2.setText("No Massive Heal Left!");
                }jLabel2.setVisible(true);ctrjlabel2 = 2;
            }else if (a == 'p') {
                if (p.getJumAngelBox()>=1 && playing) {
                    p.setJumAngleBox(p.getJumAngelBox()-1);
                    jLabel2.setText("Angel Box Activated! "+p.getJumAngelBox()+" Left!");
                    p.setAngelBox(3);angel = 1;
                    for (Enemy enemy : daftarmusuh) {
                        enemy.setHp(enemy.getHp()/2);
                    }
                }else{
                    jLabel2.setText("No Angel Box Left!");
                }jLabel2.setVisible(true);ctrjlabel2 = 2;
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
        if (p.getCooldown()<=0 && playing == true) {
            if (p instanceof PesawatLockheed) {
                int y = ((PesawatLockheed)p).specialEffect();
                int y1,y2;
                if (p.getJumlahpeluru()%2==1) {y1 = 50;y2 = 65;}
                else{y1 = 45;y2 = 60;}
                for (int i = 0; i < p.getJumlahpeluru(); i++) {
                    if (y == 1 && specialBullet == null) {
                        specialBullet = new Peluru(p.getX()+160, p.getY()+35);
                    }else{
                        if (i%2==0) {
                            daftarpeluru.add(new Peluru(p.getX()+160, p.getY()+y1));
                            y1-=15;
                        }else{
                            daftarpeluru.add(new Peluru(p.getX()+160, p.getY()+y2));
                            y2+=15;
                        }
                    }
                }
            }else if (p instanceof PesawatThunderbold) {
                int y1,y2;
                if (p.getJumlahpeluru()%2==1) {y1 = 50;y2 = 65;}
                else{y1 = 45;y2 = 60;}
                for (int i = 0; i < p.getJumlahpeluru(); i++) {
                    if (i%2==0) {
                        daftarpeluru.add(new Peluru(p.getX()+110, p.getY()+y1));
                        y1-=15;
                    }else{
                        daftarpeluru.add(new Peluru(p.getX()+110, p.getY()+y2));
                        y2+=15;
                    }
                }
            }else{
                int y1,y2;
                if (p.getJumlahpeluru()%2==1) {y1 = 50;y2 = 65;}
                else{y1 = 45;y2 = 60;}
                for (int i = 0; i < p.getJumlahpeluru(); i++) {
                    if (i%2==0) {
                        daftarpeluru.add(new Peluru(p.getX()+160, p.getY()+y1));
                        y1-=15;
                    }else{
                        daftarpeluru.add(new Peluru(p.getX()+160, p.getY()+y2));
                        y2+=15;
                    }
                }
            }
            p.setCooldown(p.getCd());
            repaint();
        }
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar progressboss;
    // End of variables declaration//GEN-END:variables
}
