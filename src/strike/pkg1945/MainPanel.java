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
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
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
    ArrayEnemy<Enemy> daftarmusuh;
    ArrayList<Peluru> daftarpeluru;
    ArrayList<Peluru> pelurua;
    ArrayList<Peluru> pelurub;
    ArrayList<Peluru> peluruc;
    ArrayList<Peluru> pelurud;
    ArrayList<Peluru> pelurue;
    ArrayList<Peluru> peluruBoss;
    ArrayList<BufferedImage> pm;
    ArrayList<BufferedImage> km;
    Gambar gambar;
    GameFrame main;
    Player p;
    EnemyBoss boss;
    Peluru specialBullet;
    BufferedImage background; 
    BufferedImage background2; 
    Timer Tnormal;
    Timer Tplay;
    int count, ctr, ctrm,ctrm2,ctrboss,ctrjlabel2,ctrgo;
    int eagle,angel,shield,sack;
    boolean playing;
    EnemyAshpest ashpest;
    EnemyBlademorph blade;
    EnemyBlazelich lich;
    EnemyBlazewing wing;
    EnemyGlowstarKing king;
    BufferedImage pesawat,knalpot,pesawatBoss;
    public MainPanel(GameFrame main, Player pp) {
        initComponents();
        progressboss.setVisible(false);
        jLabel2.setVisible(false);
        gambar = new Gambar();
        p = pp;
        if (p instanceof PesawatLockheed) {pesawat = gambar.getGambar1(); knalpot = gambar.getGambarKnalpot1(0);}
        else if (p instanceof PesawatNorthtrop) {pesawat = gambar.getGambar2(); knalpot = gambar.getGambarKnalpot2(0);}
        else if (p instanceof PesawatThunderbold) {pesawat = gambar.getGambar3(); knalpot = gambar.getGambarKnalpot3(0);}
        ctrgo = 0;
        main.updateStatus(p,p.getHp(),p.getMaxhp(), p.getSkor(), p.getGold(),p.getLevel());
        this.playing = false;
        eagle=main.data.get(p.getPosisiSave()).getEagle();angel=main.data.get(p.getPosisiSave()).getAngel();
        shield=main.data.get(p.getPosisiSave()).getShield();sack=main.data.get(p.getPosisiSave()).getSack();
        ashpest = new EnemyAshpest();
        blade = new EnemyBlademorph();
        lich = new EnemyBlazelich();
        wing = new EnemyBlazewing();
        king = new EnemyGlowstarKing();
        ctrm = main.data.get(p.getPosisiSave()).getCtrm();ctrboss = main.data.get(p.getPosisiSave()).getCtrboss();
        ctrm2 = main.data.get(p.getPosisiSave()).getCtrm2();count = 3;
        daftarmusuh = main.data.get(p.getPosisiSave()).getE();
        boss = main.data.get(p.getPosisiSave()).getBoss();
        daftarpeluru = new ArrayList();
        peluruBoss = new ArrayList();
        pelurua = new ArrayList();
        pelurub = new ArrayList();
        peluruc = new ArrayList();
        pelurud = new ArrayList();
        pelurue = new ArrayList();
        pm = new ArrayList();
        km = new ArrayList();
        for (int i = 0; i < daftarmusuh.size(); i++) {
            if (daftarmusuh.get(i) instanceof EnemyAshpest) {pm.add(gambar.getAshpest());km.add(gambar.getKnalpot1(0));}
            else if (daftarmusuh.get(i) instanceof EnemyBlademorph) {pm.add(gambar.getMorph());km.add(gambar.getKnalpot2(0));}
            else if (daftarmusuh.get(i) instanceof EnemyBlazelich) {pm.add(gambar.getLich());km.add(gambar.getKnalpot3(0));}
            else if (daftarmusuh.get(i) instanceof EnemyBlazewing) {pm.add(gambar.getWing());km.add(gambar.getKnalpot4(0));}
            else if (daftarmusuh.get(i) instanceof EnemyGlowstarKing) {pm.add(gambar.getGlow());km.add(gambar.getKnalpot5(0));}
        }
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
                        ctr = main.data.get(p.getPosisiSave()).getCtr();
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
                                ctrm = 0;main.data.get(p.getPosisiSave()).setCtrm(ctrm);
                                for (int i = 0; i < p.getJumlahMusuh(); i++) {
                                    int rand = (int)(Math.random()*5);
                                    int randy = (int)(Math.random()*750);
                                    if (rand == 0) {
                                        daftarmusuh.add(new EnemyAshpest(1700,randy));
                                        pm.add(gambar.getAshpest());
                                        km.add(gambar.getKnalpot1(0));
                                    }else if (rand == 1) {
                                        daftarmusuh.add(new EnemyBlademorph(1700, randy));
                                        pm.add(gambar.getMorph());
                                        km.add(gambar.getKnalpot2(0));
                                    }else if (rand == 2) {
                                        daftarmusuh.add(new EnemyBlazelich(1700, randy));
                                        pm.add(gambar.getLich());
                                        km.add(gambar.getKnalpot3(0));
                                    }else if (rand == 3) {
                                        daftarmusuh.add(new EnemyBlazewing(1700, randy));
                                        pm.add(gambar.getWing());
                                        km.add(gambar.getKnalpot4(0));
                                    }else if (rand == 4) {
                                        daftarmusuh.add(new EnemyGlowstarKing(1700, randy));
                                        pm.add(gambar.getGlow());
                                        km.add(gambar.getKnalpot5(0));
                                    }
                                    if (p.getAngelBox()>0) {daftarmusuh.get(daftarmusuh.size()-1).setHp(daftarmusuh.get(daftarmusuh.size()-1).getHp()/2);}
                                }
                            }
                            ctrm++;main.data.get(p.getPosisiSave()).setCtrm(ctrm); 
                        }
                    }
                    if (p.getLevell()==5 && boss==null) {
                        boss = new EnemyBoss(p.getHp()*p.getBossKe(), 1920, 230);
                        pesawatBoss = gambar.getBoss(0);
                        progressboss.setMinimum(0);
                        progressboss.setMaximum(boss.getHp());
                        progressboss.setLocation(1970,100);
                        progressboss.setVisible(true);
                        progressboss.setValue(boss.getHp());
                        playing = false;
                        Tnormal.stop();
                        jLabel1.setText("BOSS ROUND!!!!");
                        jLabel1.setVisible(true);
                        main.data.get(p.getPosisiSave()).setBoss(boss);
                    }
                    if (ctrjlabel2>1) {
                        ctrjlabel2--;main.data.get(p.getPosisiSave()).setCtrjlabel2(ctrjlabel2);
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
                main.data.get(p.getPosisiSave()).setE(daftarmusuh);
                p.setCooldown(p.getCooldown()-1);
                for (int i = 0; i < daftarmusuh.size(); i++) {
                    if (playing) {
                        daftarmusuh.get(i).setCooldown(daftarmusuh.get(i).getCooldown()-1);
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
                        if (boss.getHp()>0) {pesawatBoss = boss.gantiAnimasi(gambar.getBoss(boss.getAnimasi()));}
                        else{pesawatBoss = boss.ledak(gambar.getGambarLedakBoss(boss.getAnimasi()));}
                        ctrboss = 0;main.data.get(p.getPosisiSave()).setCtrboss(ctrboss);
                    }if (boss.getCooldown()==0 && boss.getHp()>0 && playing) {
                        for (int i = 0; i < 3; i++) {
                            int rr = (int)(Math.random()*boss.getHeight()-70)+1;
                            peluruBoss.add(new Peluru(boss.getX(), boss.getY()+rr));
                        }
                        boss.setCooldown(boss.getCd());
                    }
                    main.data.get(p.getPosisiSave()).setBoss(boss);
                }
                for (int i = 0; i < daftarmusuh.size(); i++) {
                    if (daftarmusuh.get(i).getHp()>0 && playing) {
                        daftarmusuh.get(i).setX(daftarmusuh.get(i).getX()-daftarmusuh.get(i).getSpeed());
                    }else{
                        daftarmusuh.get(i).setMati(daftarmusuh.get(i).getMati()+1);
                    }
                    if (daftarmusuh.get(i).getX()<(-10)) {
                        daftarmusuh.get(i).setTabrak(2);
                        daftarmusuh.get(i).setHp(0);
                    }
                    if (daftarmusuh.get(i).getMati()==1) {
                        if (daftarmusuh.get(i).getTabrak() == 1) {
                            p.setSkor(p.getSkor()-2);
                        }else if (daftarmusuh.get(i).getTabrak() == 2) {
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
                            }else{p.setGold(p.getGold()+daftarmusuh.get(i).getGold());}
                            p.setSkor(p.getSkor()+daftarmusuh.get(i).getScore());
                            p.setSackofGold(p.getSackofGold()-1);
                            p.setEaglePotion(p.getEaglePotion()-1);
                            p.setShieldofCrystal(p.getShieldofCrystal()-1);
                        }
                        main.updateStatus(p,p.getHp(), p.getMaxhp(), p.getSkor(), p.getGold(), p.getLevel());
                    }
                    if (daftarmusuh.get(i).getCooldown()<=0 && daftarmusuh.get(i).getHp()>0 && playing) {
                            if (daftarmusuh.get(i) instanceof EnemyAshpest) {
                                pelurua.add(new Peluru(daftarmusuh.get(i).getX()+80, daftarmusuh.get(i).getY()+15));
                                ((EnemyAshpest) daftarmusuh.get(i)).setCooldown(((EnemyAshpest) daftarmusuh.get(i)).getCd());
                            }else if (daftarmusuh.get(i) instanceof EnemyBlademorph) {
                                pelurub.add(new Peluru(daftarmusuh.get(i).getX()+80, daftarmusuh.get(i).getY()+15));
                                ((EnemyBlademorph) daftarmusuh.get(i)).setCooldown(((EnemyBlademorph) daftarmusuh.get(i)).getCd());
                            }else if (daftarmusuh.get(i) instanceof EnemyBlazelich) {
                                peluruc.add(new Peluru(daftarmusuh.get(i).getX()+80, daftarmusuh.get(i).getY()+15));
                                ((EnemyBlazelich) daftarmusuh.get(i)).setCooldown(((EnemyBlazelich) daftarmusuh.get(i)).getCd());
                            }else if (daftarmusuh.get(i) instanceof EnemyBlazewing) {
                                pelurud.add(new Peluru(daftarmusuh.get(i).getX()+80, daftarmusuh.get(i).getY()+25));
                                ((EnemyBlazewing) daftarmusuh.get(i)).setCooldown(((EnemyBlazewing) daftarmusuh.get(i)).getCd());
                            }else if (daftarmusuh.get(i) instanceof EnemyGlowstarKing) {
                                pelurue.add(new Peluru(daftarmusuh.get(i).getX()+80, daftarmusuh.get(i).getY()+20));
                                ((EnemyGlowstarKing) daftarmusuh.get(i)).setCooldown(((EnemyGlowstarKing) daftarmusuh.get(i)).getCd());
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
                    for (int i = 0; i < daftarmusuh.size(); i++) {
                        if (daftarmusuh.get(i) instanceof EnemyAshpest) {
                            if (daftarmusuh.get(i).getHp()>0) {
                                km.set(i, ((EnemyAshpest)daftarmusuh.get(i)).gantiAnimasi(gambar.getKnalpot1(daftarmusuh.get(i).getAnimasi())));
                            }else{
                                if (daftarmusuh.get(i).getAnimasi()<11) {
                                    pm.set(i, ((EnemyAshpest)daftarmusuh.get(i)).ledak(gambar.getGambarLedakMusuh(daftarmusuh.get(i).getAnimasi())));
                                }
                            }
                        }else if (daftarmusuh.get(i) instanceof EnemyBlademorph) {
                            if (daftarmusuh.get(i).getHp()>0) {
                                km.set(i, ((EnemyBlademorph)daftarmusuh.get(i)).gantiAnimasi(gambar.getKnalpot1(daftarmusuh.get(i).getAnimasi())));
                            }else{
                                if (daftarmusuh.get(i).getAnimasi()<11) {
                                    pm.set(i, ((EnemyBlademorph)daftarmusuh.get(i)).ledak(gambar.getGambarLedakMusuh(daftarmusuh.get(i).getAnimasi())));
                                }
                            }
                        }else if (daftarmusuh.get(i) instanceof EnemyBlazelich) {
                            if (daftarmusuh.get(i).getHp()>0) {
                                km.set(i, ((EnemyBlazelich)daftarmusuh.get(i)).gantiAnimasi(gambar.getKnalpot1(daftarmusuh.get(i).getAnimasi())));
                            }else{
                                if (daftarmusuh.get(i).getAnimasi()<11) {
                                    pm.set(i, ((EnemyBlazelich)daftarmusuh.get(i)).ledak(gambar.getGambarLedakMusuh(daftarmusuh.get(i).getAnimasi())));
                                }
                            }
                        }else if (daftarmusuh.get(i) instanceof EnemyBlazewing) {
                            if (daftarmusuh.get(i).getHp()>0) {
                                km.set(i, ((EnemyBlazewing)daftarmusuh.get(i)).gantiAnimasi(gambar.getKnalpot1(daftarmusuh.get(i).getAnimasi())));
                            }else{
                                if (daftarmusuh.get(i).getAnimasi()<11) {
                                    pm.set(i, ((EnemyBlazewing)daftarmusuh.get(i)).ledak(gambar.getGambarLedakMusuh(daftarmusuh.get(i).getAnimasi())));
                                }
                            }
                        }else if (daftarmusuh.get(i) instanceof EnemyGlowstarKing) {
                            if (daftarmusuh.get(i).getHp()>0) {
                                km.set(i, ((EnemyGlowstarKing)daftarmusuh.get(i)).gantiAnimasi(gambar.getKnalpot1(daftarmusuh.get(i).getAnimasi())));
                            }else{
                                if (daftarmusuh.get(i).getAnimasi()<11) {
                                    pm.set(i, ((EnemyGlowstarKing)daftarmusuh.get(i)).ledak(gambar.getGambarLedakMusuh(daftarmusuh.get(i).getAnimasi())));
                                }
                            }
                        }
                    }
                    ctr = 0;main.data.get(p.getPosisiSave()).setCtr(ctr);
                }
                repaint();
                for (int i = 0; i < daftarmusuh.size(); i++) {
                    if (daftarmusuh.get(i).getHp()>=0) {
                        Rectangle bbMusuh = new Rectangle(daftarmusuh.get(i).getX(),daftarmusuh.get(i).getY(),daftarmusuh.get(i).getWidth(),daftarmusuh.get(i).getHeight());
                        for (Peluru peluru : daftarpeluru) {
                            if (peluru.getHp()>0) {
                                Rectangle bbPeluru = new Rectangle(peluru.getX(),peluru.getY(),peluru.getWidth(),peluru.getHeight());
                                if (bbMusuh.intersects(bbPeluru)) {
                                    daftarmusuh.get(i).setHp(daftarmusuh.get(i).getHp()-p.getAttack());
                                    peluru.setHp(0);
                                    repaint();
                                    break;
                                }
                            }
                        }
                        if (specialBullet!=null && specialBullet.getHp() > 0) {
                            Rectangle bbPeluru = new Rectangle(specialBullet.getX(),specialBullet.getY(),specialBullet.getWidth()*2,specialBullet.getHeight()*2);
                                if (bbMusuh.intersects(bbPeluru)) {
                                    daftarmusuh.get(i).setHp(daftarmusuh.get(i).getHp()-(p.getAttack()*3));
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
                        for (int i = 0; i < daftarmusuh.size(); i++) {
                            if (daftarmusuh.get(i).getHp()>0) {
                                Rectangle bbMusuh = new Rectangle(daftarmusuh.get(i).getX(),daftarmusuh.get(i).getY(),daftarmusuh.get(i).getWidth(),daftarmusuh.get(i).getHeight());
                                if (bbPlayer.intersects(bbMusuh)) {
                                    daftarmusuh.get(i).setHp(0);
                                    daftarmusuh.get(i).setTabrak(1);
                                    if ((daftarmusuh.get(i).getDamage()*2)>p.getDefend()) {
                                        p.setHp(p.getHp()-((daftarmusuh.get(i).getDamage()*2)-p.getDefend()));
                                    }
                                    main.updateStatus(p,p.getHp(),p.getMaxhp(), p.getSkor(), p.getGold(),p.getLevel());
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
                for (int i = 0; i < daftarmusuh.size(); i++) {
                    if (daftarmusuh.get(i).getHp() <= 0 && daftarmusuh.get(i).getAnimasi()>=11) {
                        pm.remove(i);
                        km.remove(i);
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
                    pesawatBoss = null;
                }
                if (playing) {
                    ctr++;main.data.get(p.getPosisiSave()).setCtr(ctr);
                }
                if (boss!=null) {ctrboss++;main.data.get(p.getPosisiSave()).setCtrboss(ctrboss);}
                if (p.getMusuhTerbunuh()==10) {
                    p.setAngelBox(p.getAngelBox()-1);
                    p.setMusuhTerbunuh(0);
                    p.setGold(p.getGold()+(1000*p.getLevel()));
                    p.setLevel(p.getLevel()+1);
                    if (p.getLevell()==5) {
                        p.setLevell(1);
                    }else{
                    p.setLevell(p.getLevell()+1);}
                    if (p.getLevel()%3==0) {
                        if (ctrm2>1) {
                            ctrm2--;main.data.get(p.getPosisiSave()).setCtrm2(ctrm2);
                        }else if(p.getJumlahMusuh()<5){
                            p.setJumlahMusuh(p.getJumlahMusuh()+1);
                        }
                    }
                    main.updateStatus(p,p.getHp(),p.getMaxhp(), p.getSkor(), p.getGold(),p.getLevel());
                }
                if (p.getHp() <= 0 && p.getAnimasi()>=13) {
                    playing = false;
                    Tnormal.stop();
                    if (ctrgo==20) {
                        ctrgo = 0;
                        if (jLabel1.getText().equals("GO!!!!!")) {jLabel1.setText("G");}
                        else if (jLabel1.getText().equals("G")) {jLabel1.setText("GA");}
                        else if (jLabel1.getText().equals("GA")) {jLabel1.setText("GAM");}
                        else if (jLabel1.getText().equals("GAM")) {jLabel1.setText("GAME");}
                        else if (jLabel1.getText().equals("GAME")) {jLabel1.setText("GAME ");}
                        else if (jLabel1.getText().equals("GAME ")) {jLabel1.setText("GAME O");}
                        else if (jLabel1.getText().equals("GAME O")) {jLabel1.setText("GAME OV");}
                        else if (jLabel1.getText().equals("GAME OV")) {jLabel1.setText("GAME OVE");}
                        else if (jLabel1.getText().equals("GAME OVE")) {jLabel1.setText("GAME OVER");}
                        else if (jLabel1.getText().equals("GAME OVER")) {jLabel1.setText("GAME OVER!");Tplay.stop();
                            if (p.getRetryChance()==1) {
                                if (JOptionPane.showConfirmDialog(null, "ingin mengulang permainan dari posisi save terakhir?","Restart",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {         
                                    main.player = new ArrayList<>();
                                    main.data = new ArrayEnemy<>();
                                    File fi = new File("Player.txt");
                                    try{
                                        FileInputStream fin = new FileInputStream("Player.txt");
                                        ObjectInputStream in = new ObjectInputStream(fin);
                                        main.player = (ArrayList<Player>)in.readObject();
                                        in.close();
                                        fin.close();
                                    }catch(IOException ex){
                                        ex.printStackTrace();
                                    }catch(ClassNotFoundException ex2){
                                        ex2.printStackTrace();
                                    }
                                    File fil = new File("Data.txt");
                                    try{
                                        FileInputStream fin = new FileInputStream("Data.txt");
                                        ObjectInputStream in = new ObjectInputStream(fin);
                                        main.data = (ArrayEnemy<inGameData<Enemy>>)in.readObject();
                                        in.close();
                                        fin.close();
                                    }catch(IOException ex){
                                        ex.printStackTrace();
                                    }catch(ClassNotFoundException ex2){
                                        ex2.printStackTrace();
                                    }
                                    p = main.player.get(main.posisi);
                                    p.setRetryChance(0);
                                    jLabel1.setText("Press PLAY to play!");
                                    progressboss.setVisible(false);
                                    jLabel2.setVisible(false);
                                    if (p instanceof PesawatLockheed) {pesawat = gambar.getGambar1(); knalpot = gambar.getGambarKnalpot1(0);}
                                    else if (p instanceof PesawatNorthtrop) {pesawat = gambar.getGambar2(); knalpot = gambar.getGambarKnalpot2(0);}
                                    else if (p instanceof PesawatThunderbold) {pesawat = gambar.getGambar3(); knalpot = gambar.getGambarKnalpot3(0);}
                                    main.updateStatus(p,p.getHp(),p.getMaxhp(), p.getSkor(), p.getGold(),p.getLevel());
                                    eagle=main.data.get(p.getPosisiSave()).getEagle();angel=main.data.get(p.getPosisiSave()).getAngel();
                                    shield=main.data.get(p.getPosisiSave()).getShield();sack=main.data.get(p.getPosisiSave()).getSack();
                                    ctrm = main.data.get(p.getPosisiSave()).getCtrm();ctrboss = main.data.get(p.getPosisiSave()).getCtrboss();
                                    ctrm2 = main.data.get(p.getPosisiSave()).getCtrm2();count = 3;
                                    daftarmusuh = main.data.get(p.getPosisiSave()).getE();
                                    boss = main.data.get(p.getPosisiSave()).getBoss();
                                    daftarpeluru = new ArrayList();
                                    peluruBoss = new ArrayList();
                                    pelurua = new ArrayList();
                                    pelurub = new ArrayList();
                                    peluruc = new ArrayList();
                                    pelurud = new ArrayList();
                                    pelurue = new ArrayList();
                                    pm = new ArrayList();
                                    km = new ArrayList();
                                    for (int i = 0; i < daftarmusuh.size(); i++) {
                                        if (daftarmusuh.get(i) instanceof EnemyAshpest) {pm.add(gambar.getAshpest());km.add(gambar.getKnalpot1(0));}
                                        else if (daftarmusuh.get(i) instanceof EnemyBlademorph) {pm.add(gambar.getMorph());km.add(gambar.getKnalpot2(0));}
                                        else if (daftarmusuh.get(i) instanceof EnemyBlazelich) {pm.add(gambar.getLich());km.add(gambar.getKnalpot3(0));}
                                        else if (daftarmusuh.get(i) instanceof EnemyBlazewing) {pm.add(gambar.getWing());km.add(gambar.getKnalpot4(0));}
                                        else if (daftarmusuh.get(i) instanceof EnemyGlowstarKing) {pm.add(gambar.getGlow());km.add(gambar.getKnalpot5(0));}
                                    }
                                    repaint();
                                    JOptionPane.showMessageDialog(null, "Selamat Bermain!");
                                }else{
                                    HighScores hh = new HighScores(p.getNama(), p.getGold(), p.getSkor(), p.getLevel(), p.getPosisiSave());
                                    int ctr = 0;
                                    for (int i = 0; i < main.high.size(); i++) {
                                        if (main.high.get(i).getNama().equalsIgnoreCase(p.getNama())) {
                                            main.high.set(i, hh);ctr++;
                                        }
                                    }
                                    if (ctr==0) {
                                        main.high.add(hh);
                                    }
                                    try{
                                        FileOutputStream fo = new FileOutputStream("Highscore.txt");
                                        ObjectOutputStream out = new ObjectOutputStream(fo);
                                        out.writeObject(main.high);
                                        out.close();
                                        fo.close();
                                    }catch(IOException ex){
                                        ex.printStackTrace();
                                    }
                                    main.player.remove(p.getPosisiSave());
                                    main.data.remove(p.getPosisiSave());
                                    JOptionPane.showMessageDialog(null, "Sampai Jumpa!");
                                    main.dispatchEvent(new WindowEvent(main,WindowEvent.WINDOW_CLOSING));
                                }
                            }else{
                                HighScores hh = new HighScores(p.getNama(), p.getGold(), p.getSkor(), p.getLevel(), p.getPosisiSave());
                                    int ctr = 0;
                                    for (int i = 0; i < main.high.size(); i++) {
                                        if (main.high.get(i).getNama().equalsIgnoreCase(p.getNama())) {
                                            main.high.set(i, hh);ctr++;
                                        }
                                    }
                                    if (ctr==0) {
                                        main.high.add(hh);
                                    }
                                    try{
                                        FileOutputStream fo = new FileOutputStream("Highscore.txt");
                                        ObjectOutputStream out = new ObjectOutputStream(fo);
                                        out.writeObject(main.high);
                                        out.close();
                                        fo.close();
                                    }catch(IOException ex){
                                        ex.printStackTrace();
                                    }
                                    main.m.p.remove(p.getPosisiSave());
                                    main.m.data.remove(p.getPosisiSave());
                                    JOptionPane.showMessageDialog(null, "Sampai Jumpa!");
                                    main.dispatchEvent(new WindowEvent(main,WindowEvent.WINDOW_CLOSING));
                            }
                        }
                        jLabel1.setVisible(true);
                    }
                    ctrgo++;
                }
                if (p.getEaglePotion()<=0 && eagle == 1) {
                    jLabel2.setText("Efek Eagle Potion Telah Habis!");
                    jLabel2.setVisible(true);
                    ctrjlabel2 = 2;eagle--;main.data.get(p.getPosisiSave()).setCtrjlabel2(ctrjlabel2);
                    main.data.get(p.getPosisiSave()).setEagle(eagle);
                    p.setAttack(p.getAttack()-500);
                }if (p.getShieldofCrystal()<=0 && shield == 1) {
                    jLabel2.setText("Efek Shield of Crystal Barrier Telah Habis!");
                    jLabel2.setVisible(true);
                    ctrjlabel2 = 2;shield--;main.data.get(p.getPosisiSave()).setCtrjlabel2(ctrjlabel2);
                    main.data.get(p.getPosisiSave()).setShield(shield);
                    p.setDefend(p.getDefend()-20);
                }if (p.getAngelBox()<=0 && angel == 1) {
                    jLabel2.setText("Efek Angel Box Telah Habis!");
                    jLabel2.setVisible(true);ctrjlabel2 = 2;main.data.get(p.getPosisiSave()).setCtrjlabel2(ctrjlabel2);
                    for (int i = 0; i < daftarmusuh.size(); i++) {
                        daftarmusuh.get(i).setHp(daftarmusuh.get(i).getHp()*2);
                    }
                    angel--;main.data.get(p.getPosisiSave()).setAngel(angel);
                }if (p.getSackofGold()<=0 && sack==1) {
                    jLabel2.setText("Efek Sack of Gold Telah Habis!");
                    jLabel2.setVisible(true);
                    ctrjlabel2 = 2;sack--;main.data.get(p.getPosisiSave()).setCtrjlabel2(ctrjlabel2);
                    main.data.get(p.getPosisiSave()).setSack(sack);
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
            g2.drawImage(pesawatBoss, boss.getX(), boss.getY(), boss.getWidth(),boss.getHeight(),this);
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
        
        for (int i = 0; i < daftarmusuh.size(); i++) {
            g2.drawImage(km.get(i), daftarmusuh.get(i).getX()+daftarmusuh.get(i).getXk(), daftarmusuh.get(i).getY()+daftarmusuh.get(i).getYk(), daftarmusuh.get(i).getWidth(),daftarmusuh.get(i).getHeight(),this);
            g2.drawImage(pm.get(i), daftarmusuh.get(i).getX(), daftarmusuh.get(i).getY(), daftarmusuh.get(i).getWidth(),daftarmusuh.get(i).getHeight(),this);
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
                    main.data.get(p.getPosisiSave()).setEagle(eagle);
                }else{
                    jLabel2.setText("No Eagle Potion Left!");
                }jLabel2.setVisible(true);ctrjlabel2 = 2;main.data.get(p.getPosisiSave()).setCtrjlabel2(ctrjlabel2);
            }else if (a == 'u') {
                if (p.getJumShieldofCrystal()>=1 && playing) {
                    p.setJumShieldofCrystal(p.getJumShieldofCrystal()-1);
                    jLabel2.setText("Shield of Crystal Barrier Activated! "+p.getJumShieldofCrystal()+" Left");
                    p.setShieldofCrystal(5);
                    p.setDefend(p.getDefend()+20); shield = 1;
                    main.data.get(p.getPosisiSave()).setShield(shield);
                }else{
                    jLabel2.setText("No Shield of Crystal Barrier Left!");
                }jLabel2.setVisible(true);ctrjlabel2 = 2;main.data.get(p.getPosisiSave()).setCtrjlabel2(ctrjlabel2);
            }else if (a == 'i') {
                if (p.getJumSackofGold()>=1 && playing) {
                    p.setJumSackofGold(p.getJumSackofGold()-1);
                    jLabel2.setText("Sack of Gold Activated! "+p.getJumSackofGold()+" Left");
                    p.setSackofGold(5);sack = 1;
                    main.data.get(p.getPosisiSave()).setSack(sack);
                }else{
                    jLabel2.setText("No Sack of Gold Left!");
                }jLabel2.setVisible(true);ctrjlabel2 = 2;main.data.get(p.getPosisiSave()).setCtrjlabel2(ctrjlabel2);
            }else if (a == 'o') {
                if (p.getJumMassiveSalve()>=1 && playing) {
                    p.setJumMassiveSalve(p.getJumMassiveSalve()-1);
                    jLabel2.setText("Massive Heal Activated! " + p.getJumMassiveSalve()+" Left");
                    p.setHp(p.getHp()+500);
                    if (p.getHp()>p.getMaxhp()) {p.setHp(p.getMaxhp());}
                }else{
                    jLabel2.setText("No Massive Heal Left!");
                }jLabel2.setVisible(true);ctrjlabel2 = 2;main.data.get(p.getPosisiSave()).setCtrjlabel2(ctrjlabel2);
            }else if (a == 'p') {
                if (p.getJumAngelBox()>=1 && playing) {
                    p.setJumAngleBox(p.getJumAngelBox()-1);
                    jLabel2.setText("Angel Box Activated! "+p.getJumAngelBox()+" Left!");
                    p.setAngelBox(3);angel = 1;
                    main.data.get(p.getPosisiSave()).setAngel(angel);
                    for (int i = 0; i < daftarmusuh.size(); i++) {
                        daftarmusuh.get(i).setHp(daftarmusuh.get(i).getHp()/2);
                    }
                }else{
                    jLabel2.setText("No Angel Box Left!");
                }jLabel2.setVisible(true);ctrjlabel2 = 2;main.data.get(p.getPosisiSave()).setCtrjlabel2(ctrjlabel2);
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
