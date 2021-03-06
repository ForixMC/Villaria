package fr.forix.Villaria;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class FenetreDuJeu {

    public static Long heure=0L,minute=0L,jour=1L;

    public static Long ouvriers=2L;

    public static Long ouvriermax=2L;

    public static double diamantsD = 0;
    public static Long argent = 1000L, nourriture = 500L, habitants = 0L, charbon=0L, fer=0L, pétrol=0L, diamants=0L, planches=0L, béton=0L;
    public static Long maisons=0L, immeubles=0L, magasins=0L, CC=0L, industries=0L;
    public static Long parceolien=0L, centralecharbon=0L, centralefioul=0L, parcsolaire=0L, centralenucleaire=0L, chateau=0L, STP=0L, STG=0L, ferme=0L;
    public static Long maisonr=50L, immeubler=300L, magasinr=50L, CCr=1000L, industrier=500L;
    public static Long silocharbon=0L, silofer=0L, reservoirpetrol=0L, coffrediamant=0L;

    public static Long rmaison=(maisons*maisonr), rimmeuble=(immeubles*immeubler), rmagasin=(magasins*magasinr), rCC=(CC*CCr), rindustrie=(industries*industrier);
    public static Long minecharbon=0L, minefer=0L, puitpetrole=0L, raffinerie=0L, usinechimique=0L;
    public static Long revenustot=(rmaison+rimmeuble+rmagasin+rCC+rindustrie);

    public static boolean PauseIsOn;

    public static JFrame f = new JFrame();
    public static JComboBox combo3 = new JComboBox();
    public static JComboBox combo4 = new JComboBox();
    public static JButton acheterouvrier = new JButton("Acheter un Ouvrier 10 Diams");
    public static JButton temps = new JButton("S");
    public static JPanel container = new JPanel();
    public static JPanel bas = new JPanel();
    public static JComboBox combo = new JComboBox();
    public static JComboBox combo2 = new JComboBox();
    public static JLabel argentD = new JLabel(argent+" $");
    public static JButton pause = new JButton("Pause");
    public static JLabel maison = new JLabel("Maisons: "+maisons);
    public static JLabel immeuble = new JLabel("Immeubles: "+immeubles);
    public static JLabel magasin = new JLabel("Magasins: "+magasins);
    public static JLabel CentreCommercial = new JLabel("Centre Commercials: "+CC);
    public static JLabel industrie = new JLabel("Industries: "+industries);
    public static JLabel NB = new JLabel("Batiments:");
    public static JLabel PE = new JLabel("Parc éolien: "+parceolien);
    public static JLabel CCH = new JLabel("Centrales à Charbon: "+centralecharbon);
    public static JLabel CF = new JLabel("Centrales à Fioul: "+centralefioul);
    public static JLabel PS = new JLabel("Parcs Solaire: "+parcsolaire);
    public static JLabel CN = new JLabel("Centrales Nucléaire: "+centralenucleaire);
    public static JLabel CHE = new JLabel("Chateaux d'eau: "+chateau);
    public static JLabel PSP = new JLabel("Petites Stations de Pompage: "+STP);
    public static JLabel GSP = new JLabel("Grandes Stations de Pompage: "+STG);
    public static JLabel F = new JLabel("Fermes: "+ferme);
    public static JLabel revenus = new JLabel("Revenus");
    public static JLabel revenustotal = new JLabel("Revenus journalier : "+revenustot);
    public static JLabel nbrh = new JLabel("Habitants: "+habitants);
    public static JProgressBar bar = new JProgressBar();
    public static JLabel Louvriers = new JLabel("Ouvriers disponibles: "+ouvriers);
    public static JLabel MC = new JLabel("Mines à charbon: "+minecharbon);
    public static JLabel MF = new JLabel("Mines à fer: "+minefer);
    public static JLabel PP = new JLabel("Puits de pétrole: "+puitpetrole);
    public static JLabel UC = new JLabel("Usines Chimiques: "+usinechimique);
    public static JLabel RF = new JLabel("Raffineries: "+raffinerie);
    public static JLabel charbonL = new JLabel("Charbon: "+charbon);
    public static JLabel pétroleL = new JLabel("Bidons de Pétrole: "+pétrol);
    public static JLabel ferL = new JLabel("Minerais: "+fer);
    public static JLabel diamantL = new JLabel("Diamants: "+diamants);
    public static JLabel stockage = new JLabel("Entrepôt");
    public static JPanel Ouvriers = new JPanel();

    public static JTabbedPane onglet;

    public FenetreDuJeu(){
        f.setSize(1080, 630);
        f.setTitle("Villaria");
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        bas.setLayout(null);
        container.setLayout(null);
        bas.setBounds(0, 540, 1074, 61);
        bas.setBorder(BorderFactory.createLineBorder(Color.black));

        JPanel ArgentP = new JPanel();
        ArgentP.setLayout(null);
        ArgentP.setBounds(875 ,540, 198, 30);
        ArgentP.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        container.add(ArgentP);

        Font police1 = new Font("Tahomas", Font.BOLD, 20);
        argentD.setBounds(65, 5, 130, 20);
        argentD.setFont(police1);
        argentD.setForeground(Color.GREEN);
        ArgentP.setBackground(Color.GRAY);
        ArgentP.add(argentD);

        JPanel NombreBatiments = new JPanel();
        NombreBatiments.setLayout(null);
        NombreBatiments.setBounds(0, 30, 360, 510);
        NombreBatiments.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        NombreBatiments.setBackground(Color.BLUE);

        NB.setBounds(0, 0, 360, 40);
        NB.setHorizontalAlignment(JLabel.CENTER);
        NombreBatiments.add(NB);

        immeuble.setBounds(10, 80, 200, 20);
        NombreBatiments.add(immeuble);

        magasin.setBounds(10, 110, 200, 20);
        NombreBatiments.add(magasin);

        CentreCommercial.setBounds(10, 140, 200, 20);
        NombreBatiments.add(CentreCommercial);

        industrie.setBounds(10, 170, 200, 20);
        NombreBatiments.add(industrie);

        maison.setBounds(10, 50, 200, 20);
        NombreBatiments.add(maison);

        PE.setBounds(10, 200, 200, 20);
        NombreBatiments.add(PE);

        CCH.setBounds(10, 230, 200, 20);
        NombreBatiments.add(CCH);

        CF.setBounds(10, 260, 200, 20);
        NombreBatiments.add(CF);

        PS.setBounds(10, 290, 200, 20);
        NombreBatiments.add(PS);

        CN.setBounds(10, 320, 200, 20);
        NombreBatiments.add(CN);

        CHE.setBounds(10, 350, 200, 20);
        NombreBatiments.add(CHE);

        PSP.setBounds(10, 380, 200, 20);
        NombreBatiments.add(PSP);

        GSP.setBounds(10, 410, 200, 20);
        NombreBatiments.add(GSP);

        F.setBounds(10, 440, 200, 20);
        NombreBatiments.add(F);

        container.add(NombreBatiments);

        JPanel Revenus = new JPanel();
        Revenus.setBounds(360, 30, 360, 510);
        Revenus.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        Revenus.setBackground(Color.CYAN);
        Revenus.setLayout(null);
        container.add(Revenus);

        revenus.setBounds(150, 5, 200, 30);
        Revenus.add(revenus);

        revenustotal.setBounds(10, 50, 200, 30);
        Revenus.add(revenustotal);


        Ouvriers.setLayout(null);
        Ouvriers.setBounds(720, 30, 355, 255);
        Ouvriers.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        Ouvriers.setBackground(Color.MAGENTA);
        container.add(Ouvriers);
        bar.setMaximum(500);
        bar.setMinimum(0);
        bar.setStringPainted(true);
        Louvriers.setBounds(105, 5, 200, 20);
        Ouvriers.add(Louvriers);
        bar.setBounds(80, 30, 250, 20);
        Ouvriers.add(bar);
        bar.setVisible(false);

        JPanel Entrepot = new JPanel();
        Entrepot.setLayout(null);
        Entrepot.setBounds(720, 285, 360, 255);
        Entrepot.setBorder(BorderFactory.createLineBorder(Color.PINK));
        Entrepot.setBackground(Color.PINK);
        container.add(Entrepot);
        stockage.setBounds(150, 5, 100, 20);
        Entrepot.add(stockage);
        charbonL.setBounds(15, 30, 200, 20);
        Entrepot.add(charbonL);
        ferL.setBounds(15, 55, 200, 20);
        Entrepot.add(ferL);
        pétroleL.setBounds(15, 80, 200, 20);
        Entrepot.add(pétroleL);
        diamantL.setBounds(15, 105, 200, 20);
        Entrepot.add(diamantL);

        JPanel haut = new JPanel();
        haut.setBounds(0, 0, 1080, 30);
        haut.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
        haut.setBackground(Color.ORANGE);
        haut.setLayout(new BorderLayout());
        haut.add(pause, BorderLayout.WEST);
        pause.setBackground(Color.YELLOW);
        container.add(haut);

        Montre();

        //Partie Construction batiments


        //Partie Construction besoins

        String[] Civil = {"Maison 500$", "Immeuble 5000$", "Magasin 600$", "Centre Commercial 10000$", "Industrie 400$"};
        combo = new JComboBox(Civil);
        combo.addActionListener(new ItemAction());
        combo.setForeground(Color.blue);

        String[] Production = {"Parc éolien 1000$", "Centrale à Charbon 5000$", "Centrale à Fioul 15000$", "Parc Solaire 15000$", "Centrale Nucléaire 50000$", "Chateau d'eau 700$", "Petite Station de Pompage 1500$", "Grande Station de Pompage 5000$", "Ferme 400$"};
        combo2 = new JComboBox(Production);
        combo2.addActionListener(new ItemAction2());
        combo2.setForeground(Color.blue);

        String[] Traitement = {"Mine à charbon 5000$", "Mine à Fer 5500$", "Puit de pétrole 4000$", "Raffinerie 10000$", "Usine Chimique 50000$"};
        combo3 = new JComboBox(Traitement);
        combo3.addActionListener(new ItemAction3());
        combo3.setForeground(Color.blue);

        String[] Stockage = {"Silo à Charbon 1000$", "Silo à Fer 1000", "Réservoir à Pétrole 2000$", "Coffre à Diamants 8000$"};
        combo4 = new JComboBox(Stockage);
        combo4.addActionListener(new ItemAction4());
        combo4.setForeground(Color.blue);

        Font font = new Font("Tahomas", Font.BOLD, 20);
        nbrh.setFont(font);
        nbrh.setBounds(680, 0, 200, 61);
        bas.add(nbrh);

        acheterouvrier.setBounds(875, 30, 198, 30);
        bas.add(acheterouvrier);
        acheterouvrier.addActionListener(new acheterouvrierL());
        pause.addActionListener(new pauseL());

        container.add(bas);

        MenuBasDuJeu[] tPan = {new MenuBasDuJeu(Color.GRAY), new MenuBasDuJeu(Color.BLACK)};

        onglet = new JTabbedPane();
        int i = 0;
        for(MenuBasDuJeu pan : tPan){
            if (i == 0) {
                onglet.add(("Construction"), pan);
                i++;
            } else if (i == 1) {
                onglet.add(("Minage"), pan);
                i--;
            }
        }
        onglet.setBounds(90, 0, 540, 60);
        bas.add(onglet);

        f.setContentPane(container);
        f.setVisible(true);

    }

    public void Montre(){
        //La Partie du timer:
        int delais=1;
        ActionListener tache_timer;
        final JLabel Label1 = new JLabel(heure+":"+minute);
        final JLabel Journée = new JLabel("Jour "+jour);

        //Action réalisé par le timer:
        tache_timer= new ActionListener()
        {
            public void actionPerformed(ActionEvent e1)
            {
                minute++;
                if(minute==60)
                {
                    minute=0L;
                    heure++;
                }
                if(heure==24)
                {
                    heure=0L;
                    jour++;
                    if(maisons >= 1){
                        argent = argent + (maisonr*maisons);
                        argentD.setText(argent+" $");
                    }

                    if (immeubles >= 1){
                        argent = argent + (immeubler*immeubles);
                        argentD.setText(argent+" $");
                    }

                    if(magasins >= 1){
                        argent = argent + (magasinr*magasins);
                        argentD.setText(argent+" $");
                    }

                    if(CC >=1){
                        argent = argent+(CCr*CC);
                        argentD.setText(argent+" $");
                    }

                    if(industries >= 1){
                        argent = argent+(CCr*CC);
                        argentD.setText(argent+" $");
                    }

                    if(minecharbon >= 1)
                        charbon = charbon + (minecharbon*10);

                    if(minefer >= 1)
                        fer = fer+(minefer*10);

                    if (puitpetrole >= 1)
                        pétrol = pétrol+(puitpetrole*5);

                    if(usinechimique >= 1 && usinechimique < 10)
                        diamantsD = diamantsD + (usinechimique * 0.1);

                    if (usinechimique >= 10) {
                        diamantsD = diamantsD + (usinechimique * 0.1);
                        diamants = (long)diamantsD;
                        diamantsD = 0;
                    }

                    if (diamantsD == 1) {
                        diamants = (long) diamantsD;
                        diamantsD = 0;
                    }
                }

                Label1.setText(heure+":"+minute);/* rafraichir le label */
                Journée.setText("Jour "+jour);
            }
        };
        final Timer timer1= new Timer(delais, tache_timer);

        temps.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String texte;
                texte=temps.getText();
                if(texte.compareTo("S")==0)
                {
                    temps.setText("P");
                    timer1.start();
                }
                else if(texte.compareTo("P")==0)
                {
                    temps.setText("S");
                    timer1.stop();
                }
            }
        });
        temps.setBounds(0, 575, 80, 25);
        container.add(temps);
        Font police = new Font("Tahomas", Font.BOLD, 20);
        Label1.setFont(police);
        Label1.setBounds(20, 540, 60, 20);
        container.add(Label1);
        Journée.setBounds(15, 555, 70, 20);
        container.add(Journée);

    }

    public static Thread maisont;
    public static Thread maisont1;

    public static Thread immeublet;
    public static Thread immeublet1;

    public static Thread magasint;
    public static Thread magasint1;

    public static Thread usinet;
    public static Thread usinet1;

    public static Thread cct;
    public static Thread cct1;

    public static Thread parceolient;
    public static Thread parceolient1;

    public static Thread centralecharbont;
    public static Thread centralecharbont1;

    public static Thread centralefioult;
    public static Thread centralefioult1;

    public static Thread parcsolairet;
    public static Thread parcsolairet1;

    public static Thread centralenucléairet;
    public static Thread centralenucléairet1;

    public static Thread chateauet;
    public static Thread chateauet1;

    public static Thread PSPt;
    public static Thread PSPt1;

    public static Thread GSPt;
    public static Thread GSPt1;

    private int b = 30;

    public void maison(){
        maisons++;
        habitants += 10;
        maison.setText("Maisons: " + maisons);
        nbrh.setText("Habitants : " + habitants);
        argent -= 500;
        argentD.setText(argent+" $");
        habitants = habitants + 30;
        rmaison = (maisons * maisonr);
        revenustot = (rmaison + rimmeuble + rmagasin + rCC + rindustrie);
        revenustotal.setText("Revenus journalier : " + revenustot);
    }

    public void immeuble(){
        immeubles++;
        habitants += 100;
        immeuble.setText("Immeubles: " + immeubles);
        nbrh.setText("Habitants : " + habitants);
        argent -= 5000;
        argentD.setText(argent + " $");
        rimmeuble = (immeubles * immeubler);
        revenustot = (rmaison + rimmeuble + rmagasin + rCC + rindustrie);
        revenustotal.setText("Revenus journalier : " + revenustot);
    }

    public void magasin(){
        magasins++;
        magasin.setText("Magasins: "+magasins);
        argent -= 600;
        argentD.setText(argent+" $");
        rmagasin=(magasins*magasinr);
        revenustot=(rmaison+rimmeuble+rmagasin+rCC+rindustrie);
        revenustotal.setText("Revenus journalier : "+revenustot);
    }

    public void CC(){
        CC++;
        CentreCommercial.setText("Centres Commercials: "+CC);
        argent -= 10000;
        argentD.setText(argent+" $");
        rCC=(CC*CCr);
        revenustot=(rmaison+rimmeuble+rmagasin+rCC+rindustrie);
        revenustotal.setText("Revenus journalier : "+revenustot);
    }

    public void industrie(){
        industries++;
        industrie.setText("Industries: "+industries);
        argent -= 400;
        argentD.setText(argent+" $");
        rindustrie=(industries*industrier);
        revenustot=(rmaison+rimmeuble+rmagasin+rCC+rindustrie);
        revenustotal.setText("Revenus journalier : "+revenustot);
    }

    public void parceolien(){
        parceolien++;
        PE.setText("Parcs éolien: "+parceolien);
        argent -=1000;
        argentD.setText(argent+" $");
    }

    public void centralecharbon(){
        centralecharbon++;
        CCH.setText("Centrales à Charbon: "+centralecharbon);
        argent = argent - 5000;
        argentD.setText(argent+" $");
    }

    public void centralefioul(){
        centralefioul++;
        CF.setText("Centrales à Fioul: "+centralefioul);
        argent = argent-15000;
        argentD.setText(argent+" $");
    }

    public void parcsolaire(){
        parcsolaire++;
        PS.setText("Parcs Solaire: "+parcsolaire);
        argent = argent-15000;
        argentD.setText(argent+" $");
    }

    public void centralenucleaire(){
        centralenucleaire++;
        CN.setText("Centrales Nucléaire: "+centralenucleaire);
        argent = argent-50000;
        argentD.setText(argent+" $");
    }

    public void chateau(){
        chateau++;
        CHE.setText("Chateaux d'eau: "+chateau);
        argent = argent-700;
        argentD.setText(argent+" $");
    }

    public void PSP(){
        STP++;
        PSP.setText("Petites Stations de Pompage: "+STP);
        argent = argent-1500;
        argentD.setText(argent+" $");
    }

    public void GSP(){
        STG++;
        GSP.setText("Grandes Stations de Pompage: "+GSP);
        argent = argent-5000;
        argentD.setText(argent+" $");
    }

    class ItemAction implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if(combo.getSelectedItem() == "Maison 500$"){
                if(argent >= 500) {
                    if (ouvriers >= 1) {
                        if (ouvriermax == ouvriers) {
                            bar.setVisible(true);
                            maisont = new Thread() {

                                public void run() {
                                    ouvriers -= 1;
                                    Louvriers.setText("Ouvriers disponible: " + ouvriers);

                                    for (int val = 0; val <= 500; val++) {
                                        bar.setValue(val);

                                        try {
                                            maisont.sleep(10);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                    bar.setValue(0);
                                    ouvriers += 1;
                                    Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                    maison();

                                    bar.setVisible(false);
                                }
                            };
                            maisont.start();

                        } else {
                            System.out.println("dans le else");
                            JProgressBar bor = new JProgressBar();
                            bor.setMinimum(0);
                            bor.setMaximum(500);
                            b += 30;
                            bor.setBounds(80, b, 250, 20);
                            System.out.println(b);
                            Ouvriers.add(bor);

                            maisont1 = new Thread() {

                                public void run() {

                                    ouvriers -= 1;
                                    Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                    for (int val = 0; val <= 500; val++) {
                                        bor.setValue(val);

                                        try {
                                            maisont.sleep(10);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                    bar.setValue(0);
                                    ouvriers += 1;
                                    Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                    bor.setVisible(false);
                                    b -= 30;
                                    Ouvriers.add(bor);
                                    maison();
                                }
                            };
                            maisont1.start();
                        }

                    } else {
                        JOptionPane jop3 = new JOptionPane();
                        ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                        jop3.showMessageDialog(null, "Il n'y a plus d'ouvriers disponible !", "Pas assez d'ouvriers", JOptionPane.ERROR_MESSAGE, img);

                    }
                }else {
                    System.out.println("pas assez d'argent");
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Pas assez d'argent", "Erreur", JOptionPane.ERROR_MESSAGE, img);
                }
            }

            if(combo.getSelectedItem() == "Immeuble 5000$"){
                if(habitants >= 500) {
                    if(argent >= 5000) {
                        if (ouvriers >= 1) {
                            if (ouvriermax == ouvriers) {
                                System.out.println("dans le normal");

                                bar.setVisible(true);
                                immeublet = new Thread() {

                                    public void run() {

                                        ouvriers -= 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        for (int val = 0; val <= 500; val++) {
                                            bar.setValue(val);

                                            try {
                                                maisont.sleep(10);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        bar.setValue(0);
                                        ouvriers += 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        immeuble();

                                        bar.setVisible(false);
                                    }
                                };
                                immeublet.start();

                            } else {
                                System.out.println("dans le else");
                                JProgressBar bor = new JProgressBar();
                                bor.setMinimum(0);
                                bor.setMaximum(500);
                                bor.setBounds(80, b, 250, 20);
                                b += 30;
                                Ouvriers.add(bor);

                                immeublet1 = new Thread() {

                                    public void run() {

                                        ouvriers -= 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);

                                        for (int val = 0; val <= 500; val++) {
                                            bor.setValue(val);

                                            try {
                                                maisont.sleep(10);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        bor.setValue(0);
                                        ouvriers += 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        immeuble();

                                        bor.setVisible(false);
                                    }
                                };
                                immeublet1.start();

                            }

                        } else {
                            JOptionPane jop3 = new JOptionPane();
                            ImageIcon img = new ImageIcon("C:/Users/Games/Villaria/ressources/dollar.jpg");
                            jop3.showMessageDialog(null, "Il n'y a plus d'ouvriers disponible !", "Pas assez d'ouvriers", JOptionPane.ERROR_MESSAGE, img);

                        }
                    } else {
                        JOptionPane jop3 = new JOptionPane();
                        ImageIcon img = new ImageIcon("C:/Users/Games/Villaria/ressources/dollar.jpg");
                        jop3.showMessageDialog(null, "Pas assez d'argent", "Erreur", JOptionPane.ERROR_MESSAGE, img);
                    }
                } else {
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("C:/Users/Games/Villaria/ressources/dollar.jpg");
                    jop3.showMessageDialog(null, "Vous avez besoin de minimum 1000 habitants pour construire un immeuble", "Pas assez d'habitants", JOptionPane.ERROR_MESSAGE, img);
                }
            }

            if(combo.getSelectedItem() == "Magasin 600$"){
                if(argent >= 600) {
                    if (ouvriers >= 1) {
                        if (ouvriermax == ouvriers) {
                            System.out.println("dans le normal");

                            bar.setVisible(true);
                            magasint = new Thread() {

                                public void run() {

                                    ouvriers -= 1;
                                    Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                    for (int val = 0; val <= 500; val++) {
                                        bar.setValue(val);

                                        try {
                                            maisont.sleep(10);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                    bar.setValue(0);
                                    ouvriers += 1;
                                    Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                    magasin();

                                    bar.setVisible(false);
                                }
                            };
                            magasint.start();

                        } else {
                            String bruh;
                            System.out.println("dans le else");
                            JProgressBar bor = new JProgressBar();
                            bor.setMinimum(0);
                            bor.setMaximum(500);
                            bor.setBounds(80, b, 250, 20);
                            b += 30;
                            Ouvriers.add(bor);

                            magasint1 = new Thread() {

                                public void run() {

                                    ouvriers -= 1;
                                    Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                    for (int val = 0; val <= 500; val++) {
                                        bor.setValue(val);

                                        try {
                                            maisont.sleep(10);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                    bor.setValue(0);
                                    ouvriers += 1;
                                    Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                    magasin();

                                    bor.setVisible(false);
                                }
                            };
                            magasint1.start();

                        }

                    } else {
                        JOptionPane jop3 = new JOptionPane();
                        ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                        jop3.showMessageDialog(null, "Il n'y a plus d'ouvriers disponible !", "Pas assez d'ouvriers", JOptionPane.ERROR_MESSAGE, img);

                    }
                }else{
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Pas assez d'argent", "Erreur", JOptionPane.ERROR_MESSAGE, img);
                }
            }

            if(combo.getSelectedItem() == "Centre Commercial 10000$"){
                if(habitants >= 5000) {
                    if (argent >= 10000) {
                        if (ouvriers >= 1) {
                            if (ouvriermax == ouvriers) {
                                System.out.println("dans le normal");

                                bar.setVisible(true);
                                cct = new Thread() {

                                    public void run() {

                                        ouvriers -= 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        for (int val = 0; val <= 500; val++) {
                                            bar.setValue(val);

                                            try {
                                                maisont.sleep(10);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        bar.setValue(0);
                                        ouvriers += 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        CC();

                                        bar.setVisible(false);
                                    }
                                };
                                cct.start();

                            } else {
                                System.out.println("dans le else");
                                JProgressBar bor = new JProgressBar();
                                bor.setMinimum(0);
                                bor.setMaximum(500);
                                bor.setBounds(80, b, 250, 20);
                                b += 30;
                                Ouvriers.add(bor);

                                cct1 = new Thread() {

                                    public void run() {

                                        ouvriers -= 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        for (int val = 0; val <= 500; val++) {
                                            bor.setValue(val);

                                            try {
                                                maisont.sleep(10);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        bor.setValue(0);
                                        ouvriers += 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        CC();

                                        bor.setVisible(false);
                                    }
                                };
                                cct1.start();

                            }

                        } else {
                            JOptionPane jop3 = new JOptionPane();
                            ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                            jop3.showMessageDialog(null, "Il n'y a plus d'ouvriers disponible !", "Pas assez d'ouvriers", JOptionPane.ERROR_MESSAGE, img);

                        }
                    }else{
                        JOptionPane jop3 = new JOptionPane();
                        ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                        jop3.showMessageDialog(null, "Pas assez d'argent", "Erreur", JOptionPane.ERROR_MESSAGE, img);
                    }
                }else{
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de minimum 5000 habitants pour construire un Centre Commercial", "Pas assez d'habitants", JOptionPane.ERROR_MESSAGE, img);
                }
            }

            if(combo.getSelectedItem() == "Industrie 400$") {
                if (argent >= 400) {
                    if (ouvriers >= 1) {
                        if (ouvriermax == ouvriers) {
                            System.out.println("dans le normal");

                            bar.setVisible(true);
                            usinet = new Thread() {

                                public void run() {

                                    ouvriers -= 1;
                                    Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                    for (int val = 0; val <= 500; val++) {
                                        bar.setValue(val);

                                        try {
                                            maisont.sleep(10);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                    bar.setValue(0);
                                    ouvriers += 1;
                                    Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                    bar.setVisible(false);
                                    industrie();
                                }
                            };
                            usinet.start();

                        } else {
                            System.out.println("dans le else");
                            JProgressBar bor = new JProgressBar();
                            bor.setMinimum(0);
                            bor.setMaximum(500);
                            bor.setBounds(80, b, 250, 20);
                            b += 30;
                            Ouvriers.add(bor);

                            usinet1 = new Thread() {

                                public void run() {

                                    ouvriers -= 1;
                                    Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                    for (int val = 0; val <= 500; val++) {
                                        bor.setValue(val);

                                        try {
                                            maisont.sleep(10);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                    bor.setValue(0);
                                    ouvriers += 1;
                                    Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                    industrie();

                                    bor.setVisible(false);
                                }
                            };
                            usinet1.start();

                        }

                    } else {
                        JOptionPane jop3 = new JOptionPane();
                        ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                        jop3.showMessageDialog(null, "Il n'y a plus d'ouvriers disponible !", "Pas assez d'ouvriers", JOptionPane.ERROR_MESSAGE, img);

                    }
                }else{
                    System.out.println("pas assez d'argent");
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Pas assez d'argent", "Erreur", JOptionPane.ERROR_MESSAGE, img);
                }
            }
        }
    }

    class ItemAction2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.println("ActionListener : action sur " + combo2.getSelectedItem());

            if(combo2.getSelectedItem() == "Parc éolien 1000$"){
                if (argent >= 1000) {
                    if (ouvriers >= 1) {
                        if (ouvriermax == ouvriers) {
                            System.out.println("dans le normal");

                            bar.setVisible(true);
                            parceolient = new Thread() {

                                public void run() {

                                    ouvriers -= 1;
                                    Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                    for (int val = 0; val <= 500; val++) {
                                        bar.setValue(val);

                                        try {
                                            maisont.sleep(10);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                    bar.setValue(0);
                                    ouvriers += 1;
                                    Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                    bar.setVisible(false);
                                    parceolien();
                                }
                            };
                            parceolient.start();

                        } else {
                            System.out.println("dans le else");
                            JProgressBar bor = new JProgressBar();
                            bor.setMinimum(0);
                            bor.setMaximum(500);
                            bor.setBounds(80, b, 250, 20);
                            b += 30;
                            Ouvriers.add(bor);

                            parceolient1 = new Thread() {

                                public void run() {

                                    ouvriers -= 1;
                                    Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                    for (int val = 0; val <= 500; val++) {
                                        bor.setValue(val);

                                        try {
                                            maisont.sleep(10);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                    bor.setValue(0);
                                    ouvriers += 1;
                                    Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                    parceolien();

                                    bor.setVisible(false);
                                }
                            };
                            parceolient1.start();

                        }

                    } else {
                        JOptionPane jop3 = new JOptionPane();
                        ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                        jop3.showMessageDialog(null, "Il n'y a plus d'ouvriers disponible !", "Pas assez d'ouvriers", JOptionPane.ERROR_MESSAGE, img);

                    }
                }else{
                    System.out.println("pas assez d'argent");
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Pas assez d'argent", "Erreur", JOptionPane.ERROR_MESSAGE, img);
                }

            }

            if(combo2.getSelectedItem() == "Centrale à Charbon 5000$"){

                if(habitants >= 500){
                    if (argent >= 5000) {
                        if (ouvriers >= 1) {
                            if (ouvriermax == ouvriers) {
                                System.out.println("dans le normal");

                                bar.setVisible(true);
                                centralecharbont = new Thread() {

                                    public void run() {

                                        ouvriers -= 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        for (int val = 0; val <= 500; val++) {
                                            bar.setValue(val);

                                            try {
                                                maisont.sleep(10);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        bar.setValue(0);
                                        ouvriers += 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        bar.setVisible(false);
                                        centralecharbon();
                                    }
                                };
                                centralecharbont.start();

                            } else {
                                System.out.println("dans le else");
                                JProgressBar bor = new JProgressBar();
                                bor.setMinimum(0);
                                bor.setMaximum(500);
                                bor.setBounds(80, b, 250, 20);
                                b += 30;
                                Ouvriers.add(bor);

                                centralecharbont1 = new Thread() {

                                    public void run() {

                                        ouvriers -= 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        for (int val = 0; val <= 500; val++) {
                                            bor.setValue(val);

                                            try {
                                                maisont.sleep(10);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        bor.setValue(0);
                                        ouvriers += 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        centralecharbon();

                                        bor.setVisible(false);
                                    }
                                };
                                centralecharbont1.start();

                            }

                        } else {
                            JOptionPane jop3 = new JOptionPane();
                            ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                            jop3.showMessageDialog(null, "Il n'y a plus d'ouvriers disponible !", "Pas assez d'ouvriers", JOptionPane.ERROR_MESSAGE, img);

                        }
                    }else{
                        System.out.println("pas assez d'argent");
                        JOptionPane jop3 = new JOptionPane();
                        ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                        jop3.showMessageDialog(null, "Pas assez d'argent", "Erreur", JOptionPane.ERROR_MESSAGE, img);
                    }
                }else{
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de minimum 500 habitants pour construire une Centrale à Charbon", "Pas assez d'habitants", JOptionPane.ERROR_MESSAGE, img);
                }
            }

            if(combo2.getSelectedItem() == "Centrale à Fioul 15000$"){

                if(habitants >= 500){
                    if (argent >= 5000) {
                        if (ouvriers >= 1) {
                            if (ouvriermax == ouvriers) {
                                System.out.println("dans le normal");

                                bar.setVisible(true);
                                centralefioult = new Thread() {

                                    public void run() {

                                        ouvriers -= 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        for (int val = 0; val <= 500; val++) {
                                            bar.setValue(val);

                                            try {
                                                maisont.sleep(10);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        bar.setValue(0);
                                        ouvriers += 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        bar.setVisible(false);
                                        centralefioul();
                                    }
                                };
                                centralefioult.start();

                            } else {
                                System.out.println("dans le else");
                                JProgressBar bor = new JProgressBar();
                                bor.setMinimum(0);
                                bor.setMaximum(500);
                                bor.setBounds(80, b, 250, 20);
                                b += 30;
                                Ouvriers.add(bor);

                                centralefioult1 = new Thread() {

                                    public void run() {

                                        ouvriers -= 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        for (int val = 0; val <= 500; val++) {
                                            bor.setValue(val);

                                            try {
                                                maisont.sleep(10);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        bor.setValue(0);
                                        ouvriers += 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        centralefioul();

                                        bor.setVisible(false);
                                    }
                                };
                                centralefioult1.start();

                            }

                        } else {
                            JOptionPane jop3 = new JOptionPane();
                            ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                            jop3.showMessageDialog(null, "Il n'y a plus d'ouvriers disponible !", "Pas assez d'ouvriers", JOptionPane.ERROR_MESSAGE, img);

                        }
                    }else{
                        System.out.println("pas assez d'argent");
                        JOptionPane jop3 = new JOptionPane();
                        ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                        jop3.showMessageDialog(null, "Pas assez d'argent", "Erreur", JOptionPane.ERROR_MESSAGE, img);
                    }
                }else{
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de minimum 500 habitants pour construire une Centrale à Charbon", "Pas assez d'habitants", JOptionPane.ERROR_MESSAGE, img);
                }
            }

            if(combo2.getSelectedItem() == "Parc Solaire 15000$"){

                if(habitants >= 500){
                    if (argent >= 5000) {
                        if (ouvriers >= 1) {
                            if (ouvriermax == ouvriers) {
                                System.out.println("dans le normal");

                                bar.setVisible(true);
                                parcsolairet = new Thread() {

                                    public void run() {

                                        ouvriers -= 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        for (int val = 0; val <= 500; val++) {
                                            bar.setValue(val);

                                            try {
                                                maisont.sleep(10);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        bar.setValue(0);
                                        ouvriers += 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        bar.setVisible(false);
                                        parcsolaire();
                                    }
                                };
                                parcsolairet.start();

                            } else {
                                System.out.println("dans le else");
                                JProgressBar bor = new JProgressBar();
                                bor.setMinimum(0);
                                bor.setMaximum(500);
                                bor.setBounds(80, b, 250, 20);
                                b += 30;
                                Ouvriers.add(bor);

                                parcsolairet1 = new Thread() {

                                    public void run() {

                                        ouvriers -= 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        for (int val = 0; val <= 500; val++) {
                                            bor.setValue(val);

                                            try {
                                                maisont.sleep(10);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        bor.setValue(0);
                                        ouvriers += 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        parcsolaire();

                                        bor.setVisible(false);
                                    }
                                };
                                parcsolairet1.start();

                            }

                        } else {
                            JOptionPane jop3 = new JOptionPane();
                            ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                            jop3.showMessageDialog(null, "Il n'y a plus d'ouvriers disponible !", "Pas assez d'ouvriers", JOptionPane.ERROR_MESSAGE, img);

                        }
                    }else{
                        System.out.println("pas assez d'argent");
                        JOptionPane jop3 = new JOptionPane();
                        ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                        jop3.showMessageDialog(null, "Pas assez d'argent", "Erreur", JOptionPane.ERROR_MESSAGE, img);
                    }
                }else{
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de minimum 500 habitants pour construire une Centrale à Charbon", "Pas assez d'habitants", JOptionPane.ERROR_MESSAGE, img);
                }
            }

            if(combo2.getSelectedItem() == "Centrale Nucléaire 50000$"){

                if(habitants >= 500){
                    if (argent >= 5000) {
                        if (ouvriers >= 1) {
                            if (ouvriermax == ouvriers) {
                                System.out.println("dans le normal");

                                bar.setVisible(true);
                                centralenucléairet = new Thread() {

                                    public void run() {

                                        ouvriers -= 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        for (int val = 0; val <= 500; val++) {
                                            bar.setValue(val);

                                            try {
                                                maisont.sleep(10);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        bar.setValue(0);
                                        ouvriers += 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        bar.setVisible(false);
                                        centralenucleaire();
                                    }
                                };
                                centralenucléairet.start();

                            } else {
                                System.out.println("dans le else");
                                JProgressBar bor = new JProgressBar();
                                bor.setMinimum(0);
                                bor.setMaximum(500);
                                bor.setBounds(80, b, 250, 20);
                                b += 30;
                                Ouvriers.add(bor);

                                centralenucléairet1 = new Thread() {

                                    public void run() {

                                        ouvriers -= 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        for (int val = 0; val <= 500; val++) {
                                            bor.setValue(val);

                                            try {
                                                maisont.sleep(10);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        bor.setValue(0);
                                        ouvriers += 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        centralenucleaire();

                                        bor.setVisible(false);
                                    }
                                };
                                centralenucléairet1.start();

                            }

                        } else {
                            JOptionPane jop3 = new JOptionPane();
                            ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                            jop3.showMessageDialog(null, "Il n'y a plus d'ouvriers disponible !", "Pas assez d'ouvriers", JOptionPane.ERROR_MESSAGE, img);

                        }
                    }else{
                        System.out.println("pas assez d'argent");
                        JOptionPane jop3 = new JOptionPane();
                        ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                        jop3.showMessageDialog(null, "Pas assez d'argent", "Erreur", JOptionPane.ERROR_MESSAGE, img);
                    }
                }else{
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de minimum 500 habitants pour construire une Centrale à Charbon", "Pas assez d'habitants", JOptionPane.ERROR_MESSAGE, img);
                }
            }

            if(combo2.getSelectedItem() == "Chateau d'eau 700$"){
                if(habitants >= 500){
                    if (argent >= 5000) {
                        if (ouvriers >= 1) {
                            if (ouvriermax == ouvriers) {
                                System.out.println("dans le normal");

                                bar.setVisible(true);
                                chateauet = new Thread() {

                                    public void run() {

                                        ouvriers -= 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        for (int val = 0; val <= 500; val++) {
                                            bar.setValue(val);

                                            try {
                                                maisont.sleep(10);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        bar.setValue(0);
                                        ouvriers += 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        bar.setVisible(false);
                                        chateau();
                                    }
                                };
                                chateauet.start();

                            } else {
                                System.out.println("dans le else");
                                JProgressBar bor = new JProgressBar();
                                bor.setMinimum(0);
                                bor.setMaximum(500);
                                bor.setBounds(80, b, 250, 20);
                                b += 30;
                                Ouvriers.add(bor);

                                chateauet1 = new Thread() {

                                    public void run() {

                                        ouvriers -= 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        for (int val = 0; val <= 500; val++) {
                                            bor.setValue(val);

                                            try {
                                                maisont.sleep(10);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        bor.setValue(0);
                                        ouvriers += 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        chateau();

                                        bor.setVisible(false);
                                    }
                                };
                                chateauet1.start();

                            }

                        } else {
                            JOptionPane jop3 = new JOptionPane();
                            ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                            jop3.showMessageDialog(null, "Il n'y a plus d'ouvriers disponible !", "Pas assez d'ouvriers", JOptionPane.ERROR_MESSAGE, img);

                        }
                    }else{
                        System.out.println("pas assez d'argent");
                        JOptionPane jop3 = new JOptionPane();
                        ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                        jop3.showMessageDialog(null, "Pas assez d'argent", "Erreur", JOptionPane.ERROR_MESSAGE, img);
                    }
                }else{
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de minimum 500 habitants pour construire une Centrale à Charbon", "Pas assez d'habitants", JOptionPane.ERROR_MESSAGE, img);
                }
            }

            if(combo2.getSelectedItem() == "Petite Station de Pompage 1500$"){

                if(habitants >= 500){
                    if (argent >= 5000) {
                        if (ouvriers >= 1) {
                            if (ouvriermax == ouvriers) {
                                System.out.println("dans le normal");

                                bar.setVisible(true);
                                PSPt = new Thread() {

                                    public void run() {

                                        ouvriers -= 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        for (int val = 0; val <= 500; val++) {
                                            bar.setValue(val);

                                            try {
                                                maisont.sleep(10);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        bar.setValue(0);
                                        ouvriers += 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        bar.setVisible(false);
                                        PSP();
                                    }
                                };
                                PSPt.start();

                            } else {
                                System.out.println("dans le else");
                                JProgressBar bor = new JProgressBar();
                                bor.setMinimum(0);
                                bor.setMaximum(500);
                                bor.setBounds(80, b, 250, 20);
                                b += 30;
                                Ouvriers.add(bor);

                                PSPt1 = new Thread() {

                                    public void run() {

                                        ouvriers -= 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        for (int val = 0; val <= 500; val++) {
                                            bor.setValue(val);

                                            try {
                                                maisont.sleep(10);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        bor.setValue(0);
                                        ouvriers += 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        PSP();

                                        bor.setVisible(false);
                                    }
                                };
                                PSPt1.start();

                            }

                        } else {
                            JOptionPane jop3 = new JOptionPane();
                            ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                            jop3.showMessageDialog(null, "Il n'y a plus d'ouvriers disponible !", "Pas assez d'ouvriers", JOptionPane.ERROR_MESSAGE, img);

                        }
                    }else{
                        System.out.println("pas assez d'argent");
                        JOptionPane jop3 = new JOptionPane();
                        ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                        jop3.showMessageDialog(null, "Pas assez d'argent", "Erreur", JOptionPane.ERROR_MESSAGE, img);
                    }
                }else{
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de minimum 500 habitants pour construire une Centrale à Charbon", "Pas assez d'habitants", JOptionPane.ERROR_MESSAGE, img);
                }
            }

            if(combo2.getSelectedItem() == "Grande Station de Pompage 5000$"){

                if(habitants >= 500){
                    if (argent >= 5000) {
                        if (ouvriers >= 1) {
                            if (ouvriermax == ouvriers) {
                                System.out.println("dans le normal");

                                bar.setVisible(true);
                                GSPt = new Thread() {

                                    public void run() {

                                        ouvriers -= 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        for (int val = 0; val <= 500; val++) {
                                            bar.setValue(val);

                                            try {
                                                maisont.sleep(10);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        bar.setValue(0);
                                        ouvriers += 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        bar.setVisible(false);
                                        GSP();
                                    }
                                };
                                GSPt.start();

                            } else {
                                System.out.println("dans le else");
                                JProgressBar bor = new JProgressBar();
                                bor.setMinimum(0);
                                bor.setMaximum(500);
                                bor.setBounds(80, b, 250, 20);
                                b += 30;
                                Ouvriers.add(bor);

                                GSPt1 = new Thread() {

                                    public void run() {

                                        ouvriers -= 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        for (int val = 0; val <= 500; val++) {
                                            bor.setValue(val);

                                            try {
                                                maisont.sleep(10);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        bor.setValue(0);
                                        ouvriers += 1;
                                        Louvriers.setText("Ouvriers disponible: " + ouvriers);
                                        GSP();

                                        bor.setVisible(false);
                                    }
                                };
                                GSPt1.start();

                            }

                        } else {
                            JOptionPane jop3 = new JOptionPane();
                            ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                            jop3.showMessageDialog(null, "Il n'y a plus d'ouvriers disponible !", "Pas assez d'ouvriers", JOptionPane.ERROR_MESSAGE, img);

                        }
                    }else{
                        System.out.println("pas assez d'argent");
                        JOptionPane jop3 = new JOptionPane();
                        ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                        jop3.showMessageDialog(null, "Pas assez d'argent", "Erreur", JOptionPane.ERROR_MESSAGE, img);
                    }
                }else{
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de minimum 500 habitants pour construire une Centrale à Charbon", "Pas assez d'habitants", JOptionPane.ERROR_MESSAGE, img);
                }
            }
        }

    }

    class ItemAction3 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (combo3.getSelectedItem() == "Mine à charbon 5000$"){
                if(habitants >= 200){
                    if(argent >= 5000){
                        minecharbon++;
                        MC.setText("Mines à charbon: "+minecharbon);
                        argent -= 5000;
                        argentD.setText(argent+" $");
                    } else{
                        JOptionPane jop3 = new JOptionPane();
                        ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                        jop3.showMessageDialog(null, "Pas assez d'argent", "Erreur", JOptionPane.ERROR_MESSAGE, img);
                    }
                } else{
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de minimum 200 habitants pour construire une Mine à Charbon !", "Pas assez d'habitants", JOptionPane.ERROR_MESSAGE, img);
                }
            }

            if (combo3.getSelectedItem() == "Mine à fer 5500$"){
                if (habitants >= 500){
                    if (argent >= 5500){
                        minefer++;
                        MF.setText("Mines à fer: "+minefer);
                        argent -= 5500;
                        argentD.setText(argent+" $");
                    } else{
                        JOptionPane jop3 = new JOptionPane();
                        ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                        jop3.showMessageDialog(null, "Pas assez d'argent", "Erreur", JOptionPane.ERROR_MESSAGE, img);
                    }
                } else{
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de minimum 500 habitants pour construire une Mine à fer !", "Pas assez d'habitants", JOptionPane.ERROR_MESSAGE, img);
                }
            }

            if (combo3.getSelectedItem() == "Puit de pétrole 4000$"){
                if (habitants >= 1000 && argent >= 4000){
                    puitpetrole++;
                    PP.setText("Puits de pétrole: "+puitpetrole);
                    argent -= 4000;
                    argentD.setText(argent+" $");
                } else if(argent < 4000){
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Pas assez d'argent", "Erreur", JOptionPane.ERROR_MESSAGE, img);
                } else if (habitants < 1000){
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de minimum 1000 habitants pour construire un Puit de Pétrole !", "Pas assez d'habitants", JOptionPane.ERROR_MESSAGE, img);
                }
            }

            if(combo3.getSelectedItem() == "Raffinerie 10000$"){
                if (habitants >= 1200 && argent >= 10000){
                    raffinerie++;
                    RF.setText("Raffineries: "+raffinerie);
                    argent -= 10000;
                    argentD.setText(argent+" $");
                } else if (argent < 10000){
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Pas assez d'argent", "Erreur", JOptionPane.ERROR_MESSAGE, img);
                } else if (habitants < 1200){
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de minimum 1200 habitants pour construire une Raffinerie ! !", "Pas assez d'habitants", JOptionPane.ERROR_MESSAGE, img);
                }
            }

            if(combo3.getSelectedItem() == "Usine Chimique 50000$"){
                if (habitants >= 5000 && argent >= 50000){
                    usinechimique++;
                    UC.setText("Usines chimique: "+usinechimique);
                    argent -= 50000;
                    argentD.setText(argent+" $");
                } else if (argent < 50000){
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Pas assez d'argent", "Erreur", JOptionPane.ERROR_MESSAGE, img);
                } else if (habitants < 5000){
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de minimum 5000 habitants pour construire une Usine Chimique ! !", "Pas assez d'habitants", JOptionPane.ERROR_MESSAGE, img);
                }
            }
        }
    }

    class ItemAction4 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(combo4.getSelectedItem() == "Silo à Charbon 1000$"){
                if(habitants >= 100 && industries >= 5 && argent >= 1000){
                    silocharbon++;
                    argent-= 1000;
                    argentD.setText(argent+" $");
                } else if (habitants < 100){
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de minimum 100 habitants pour construire une Usine Chimique !", "Pas assez d'habitants", JOptionPane.ERROR_MESSAGE, img);
                } else if (industries < 5){
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin d'un minimum de 5 industries !", "Pas assez d'industries", JOptionPane.ERROR_MESSAGE, img);
                } else if (argent < 5000){
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de 1000$ pour construire ce batiment !", "Pas assez d'argent", JOptionPane.ERROR_MESSAGE, img);
                }
            }

            if (combo4.getSelectedItem() == "Silo à Fer 1000$"){
                if (habitants >= 200 && industries >= 10 && argent >= 1000){

                } else if (habitants < 200){
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de minimum 200 habitants pour construire une Usine Chimique !", "Pas assez d'habitants", JOptionPane.ERROR_MESSAGE, img);
                } else if (industries < 10) {
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin d'un minimum de 10 industries !", "Pas assez d'industries", JOptionPane.ERROR_MESSAGE, img);
                } else if (argent < 1000){
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de 1000$ pour construire ce batiment !", "Pas assez d'argent", JOptionPane.ERROR_MESSAGE, img);
                }
            }

            if (combo4.getSelectedItem() == "Réservoir à Pétrole 2000$"){
                if (habitants >= 400 && industries >= 30 && argent >= 2000){

                } else if (habitants < 400){
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de minimum 400 habitants pour construire une Usine Chimique !", "Pas assez d'habitants", JOptionPane.ERROR_MESSAGE, img);
                } else if (industries < 30){
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin d'un minimum de 30 industries !", "Pas assez d'industries", JOptionPane.ERROR_MESSAGE, img);
                } else if (argent < 2000){
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de 2000$ pour construire ce batiment !", "Pas assez d'argent", JOptionPane.ERROR_MESSAGE, img);
                }
            }

            if (combo4.getSelectedItem() == "Coffre à Diamants 8000$"){
                if (habitants >= 2000 && industries >= 100 && argent >= 8000){

                } else if (habitants < 2000){
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de minimum 2000 habitants pour construire une Usine Chimique !", "Pas assez d'habitants", JOptionPane.ERROR_MESSAGE, img);
                } else if (industries < 100){
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin d'un minimum de 100 industries !", "Pas assez d'industries", JOptionPane.ERROR_MESSAGE, img);
                } else if (argent < 8000){
                    JOptionPane jop3 = new JOptionPane();
                    ImageIcon img = new ImageIcon("/images/finance-634901_960_720.png");
                    jop3.showMessageDialog(null, "Vous avez besoin de 8000$ pour construire ce batiment !", "Pas assez d'argent", JOptionPane.ERROR_MESSAGE, img);
                }
            }
        }
    }

}
