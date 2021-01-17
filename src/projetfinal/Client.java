package projetfinal;

import java.awt.Font;
import java.awt.Image;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marca
 */
public class Client extends javax.swing.JFrame {

    /**
     * Creates new form Client
     */
    private final Icon blancGrand = new ImageIcon("src\\grandes\\ball-0.png");

    private final Icon blancMoyen = new ImageIcon("src\\moyennes\\ball-0.png");

    //grande image
    private final Icon b1 = new ImageIcon("src\\grandes\\ball-1.png");
    private final Icon b2 = new ImageIcon("src\\grandes\\ball-2.png");
    private final Icon b3 = new ImageIcon("src\\grandes\\ball-3.png");
    private final Icon b4 = new ImageIcon("src\\grandes\\ball-4.png");
    private final Icon b5 = new ImageIcon("src\\grandes\\ball-5.png");

    //image moyenne
    private final Icon m1 = new ImageIcon("src\\moyennes\\ball-1.png");
    private final Icon m2 = new ImageIcon("src\\moyennes\\ball-2.png");
    private final Icon m3 = new ImageIcon("src\\moyennes\\ball-3.png");
    private final Icon m4 = new ImageIcon("src\\moyennes\\ball-4.png");
    private final Icon m5 = new ImageIcon("src\\moyennes\\ball-5.png");

    private String message;
  
    private ClientUDP clientUDP;

    private int numero;

    private int points;
  

    // initialiser tous les images et label ceux par defaut
    public Client() {
        initComponents();

        this.lq1.setFont(new Font("serif", Font.BOLD, 20));
        this.lq2.setFont(new Font("serif", Font.BOLD, 20));
        this.lq3.setFont(new Font("serif", Font.BOLD, 20));
        this.lq4.setFont(new Font("serif", Font.BOLD, 20));
        this.lq5.setFont(new Font("serif", Font.BOLD, 20));
        this.lq6.setFont(new Font("serif", Font.BOLD, 20));
        this.lSolution.setFont(new Font("serif", Font.BOLD, 20));

        this.lq1_1.setText("");
        this.lq1_2.setText("");
        this.lq1_3.setText("");
        this.lq1_4.setText("");
        this.lq1_5.setText("");

        this.lq2_1.setText("");
        this.lq2_2.setText("");
        this.lq2_3.setText("");
        this.lq2_4.setText("");
        this.lq2_5.setText("");

        this.lq3_1.setText("");
        this.lq3_2.setText("");
        this.lq3_3.setText("");
        this.lq3_4.setText("");
        this.lq3_5.setText("");

        this.lq4_1.setText("");
        this.lq4_2.setText("");
        this.lq4_3.setText("");
        this.lq4_4.setText("");
        this.lq4_5.setText("");

        this.lq5_1.setText("");
        this.lq5_2.setText("");
        this.lq5_3.setText("");
        this.lq5_4.setText("");
        this.lq5_5.setText("");

        this.lq6_1.setText("");
        this.lq6_2.setText("");
        this.lq6_3.setText("");
        this.lq6_4.setText("");
        this.lq6_5.setText("");

        this.v1_1.setText("");
        this.v1_2.setText("");
        this.v1_3.setText("");
        this.v1_4.setText("");
        this.v1_5.setText("");

        this.v2_1.setText("");
        this.v2_2.setText("");
        this.v2_3.setText("");
        this.v2_4.setText("");
        this.v2_5.setText("");

        this.v3_1.setText("");
        this.v3_2.setText("");
        this.v3_3.setText("");
        this.v3_4.setText("");
        this.v3_5.setText("");

        this.v4_1.setText("");
        this.v4_2.setText("");
        this.v4_3.setText("");
        this.v4_4.setText("");
        this.v4_5.setText("");

        this.v5_1.setText("");
        this.v5_2.setText("");
        this.v5_3.setText("");
        this.v5_4.setText("");
        this.v5_5.setText("");

        this.v6_1.setText("");
        this.v6_2.setText("");
        this.v6_3.setText("");
        this.v6_4.setText("");
        this.v6_5.setText("");

        this.op1.setText("");
        this.op2.setText("");
        this.op3.setText("");
        this.op4.setText("");
        this.op5.setText("");
        this.op1.setIcon(new ImageIcon("src\\grandes\\ball-1.png"));
        this.op2.setIcon(new ImageIcon("src\\grandes\\ball-2.png"));
        this.op3.setIcon(new ImageIcon("src\\grandes\\ball-3.png"));
        this.op4.setIcon(new ImageIcon("src\\grandes\\ball-4.png"));
        this.op5.setIcon(new ImageIcon("src\\grandes\\ball-5.png"));

        this.r1.setText("");
        this.r2.setText("");
        this.r3.setText("");
        this.r4.setText("");
        this.r5.setText("");

        this.lError.setText("");

        Reset();

        btnEffacer.setEnabled(false);
        btnRejouer.setEnabled(false);
        btnValider.setEnabled(false);

        txtVisibleFalse.setVisible(false);

    }

    //reinitialiser le form a l'etat d'aurigine
    private void Reset() {

        lq1_1.setEnabled(true);
        lq1_2.setEnabled(true);
        lq1_3.setEnabled(true);
        lq1_4.setEnabled(true);
        lq1_5.setEnabled(true);

        this.lq1_1.setIcon(blancGrand);
        this.lq1_2.setIcon(blancGrand);
        this.lq1_3.setIcon(blancGrand);
        this.lq1_4.setIcon(blancGrand);
        this.lq1_5.setIcon(blancGrand);

        this.lq2_1.setIcon(blancGrand);
        this.lq2_2.setIcon(blancGrand);
        this.lq2_3.setIcon(blancGrand);
        this.lq2_4.setIcon(blancGrand);
        this.lq2_5.setIcon(blancGrand);

        this.lq3_1.setIcon(blancGrand);
        this.lq3_2.setIcon(blancGrand);
        this.lq3_3.setIcon(blancGrand);
        this.lq3_4.setIcon(blancGrand);
        this.lq3_5.setIcon(blancGrand);

        this.lq4_1.setIcon(blancGrand);
        this.lq4_2.setIcon(blancGrand);
        this.lq4_3.setIcon(blancGrand);
        this.lq4_4.setIcon(blancGrand);
        this.lq4_5.setIcon(blancGrand);

        this.lq5_1.setIcon(blancGrand);
        this.lq5_2.setIcon(blancGrand);
        this.lq5_3.setIcon(blancGrand);
        this.lq5_4.setIcon(blancGrand);
        this.lq5_5.setIcon(blancGrand);

        this.lq6_1.setIcon(blancGrand);
        this.lq6_2.setIcon(blancGrand);
        this.lq6_3.setIcon(blancGrand);
        this.lq6_4.setIcon(blancGrand);
        this.lq6_5.setIcon(blancGrand);

        this.v1_1.setIcon(blancMoyen);
        this.v1_2.setIcon(blancMoyen);
        this.v1_3.setIcon(blancMoyen);
        this.v1_4.setIcon(blancMoyen);
        this.v1_5.setIcon(blancMoyen);

        this.v2_1.setIcon(blancMoyen);
        this.v2_2.setIcon(blancMoyen);
        this.v2_3.setIcon(blancMoyen);
        this.v2_4.setIcon(blancMoyen);
        this.v2_5.setIcon(blancMoyen);

        this.v3_1.setIcon(blancMoyen);
        this.v3_2.setIcon(blancMoyen);
        this.v3_3.setIcon(blancMoyen);
        this.v3_4.setIcon(blancMoyen);
        this.v3_5.setIcon(blancMoyen);

        this.v4_1.setIcon(blancMoyen);
        this.v4_2.setIcon(blancMoyen);
        this.v4_3.setIcon(blancMoyen);
        this.v4_4.setIcon(blancMoyen);
        this.v4_5.setIcon(blancMoyen);

        this.v5_1.setIcon(blancMoyen);
        this.v5_2.setIcon(blancMoyen);
        this.v5_3.setIcon(blancMoyen);
        this.v5_4.setIcon(blancMoyen);
        this.v5_5.setIcon(blancMoyen);

        this.v6_1.setIcon(blancMoyen);
        this.v6_2.setIcon(blancMoyen);
        this.v6_3.setIcon(blancMoyen);
        this.v6_4.setIcon(blancMoyen);
        this.v6_5.setIcon(blancMoyen);

        this.r1.setIcon(blancGrand);
        this.r2.setIcon(blancGrand);
        this.r3.setIcon(blancGrand);
        this.r4.setIcon(blancGrand);
        this.r5.setIcon(blancGrand);

        lq2_1.setEnabled(false);
        lq2_2.setEnabled(false);
        lq2_3.setEnabled(false);
        lq2_4.setEnabled(false);
        lq2_5.setEnabled(false);

        lq3_1.setEnabled(false);
        lq3_2.setEnabled(false);
        lq3_3.setEnabled(false);
        lq3_4.setEnabled(false);
        lq3_5.setEnabled(false);

        lq4_1.setEnabled(false);
        lq4_2.setEnabled(false);
        lq4_3.setEnabled(false);
        lq4_4.setEnabled(false);
        lq4_5.setEnabled(false);

        lq5_1.setEnabled(false);
        lq5_2.setEnabled(false);
        lq5_3.setEnabled(false);
        lq5_4.setEnabled(false);
        lq5_5.setEnabled(false);

        lq6_1.setEnabled(false);
        lq6_2.setEnabled(false);
        lq6_3.setEnabled(false);
        lq6_4.setEnabled(false);
        lq6_5.setEnabled(false);

        numero = 0;

        points = 0;

       lbDolards.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lError = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        op1 = new javax.swing.JLabel();
        op3 = new javax.swing.JLabel();
        op2 = new javax.swing.JLabel();
        op4 = new javax.swing.JLabel();
        btnValider = new javax.swing.JButton();
        btnEffacer = new javax.swing.JButton();
        btnRejouer = new javax.swing.JButton();
        op5 = new javax.swing.JLabel();
        btnConnection = new javax.swing.JButton();
        txtIp = new javax.swing.JTextField();
        txtPort = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIpServer = new javax.swing.JTextField();
        txtPortServer = new javax.swing.JTextField();
        txtVisibleFalse = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lq1 = new javax.swing.JLabel();
        lq1_1 = new javax.swing.JLabel();
        lq1_2 = new javax.swing.JLabel();
        lq1_3 = new javax.swing.JLabel();
        lq1_4 = new javax.swing.JLabel();
        lq2_4 = new javax.swing.JLabel();
        lq2_3 = new javax.swing.JLabel();
        lq2_2 = new javax.swing.JLabel();
        lq2_1 = new javax.swing.JLabel();
        lq2 = new javax.swing.JLabel();
        lq3_4 = new javax.swing.JLabel();
        lq3_3 = new javax.swing.JLabel();
        lq3_2 = new javax.swing.JLabel();
        lq3_1 = new javax.swing.JLabel();
        lq3 = new javax.swing.JLabel();
        lq4_4 = new javax.swing.JLabel();
        lq4_3 = new javax.swing.JLabel();
        lq4_2 = new javax.swing.JLabel();
        lq4_1 = new javax.swing.JLabel();
        lq4 = new javax.swing.JLabel();
        lq5_4 = new javax.swing.JLabel();
        lq5_3 = new javax.swing.JLabel();
        lq5_2 = new javax.swing.JLabel();
        lq5_1 = new javax.swing.JLabel();
        lq5 = new javax.swing.JLabel();
        lq6_4 = new javax.swing.JLabel();
        lq6_3 = new javax.swing.JLabel();
        lq6_2 = new javax.swing.JLabel();
        lq6_1 = new javax.swing.JLabel();
        lq6 = new javax.swing.JLabel();
        lq1_5 = new javax.swing.JLabel();
        lq2_5 = new javax.swing.JLabel();
        lq3_5 = new javax.swing.JLabel();
        lq4_5 = new javax.swing.JLabel();
        lq5_5 = new javax.swing.JLabel();
        lq6_5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        v1_1 = new javax.swing.JLabel();
        v1_4 = new javax.swing.JLabel();
        v1_2 = new javax.swing.JLabel();
        v1_5 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        v6_5 = new javax.swing.JLabel();
        v6_2 = new javax.swing.JLabel();
        v6_1 = new javax.swing.JLabel();
        v6_4 = new javax.swing.JLabel();
        v5_5 = new javax.swing.JLabel();
        v5_2 = new javax.swing.JLabel();
        v5_1 = new javax.swing.JLabel();
        v5_4 = new javax.swing.JLabel();
        v4_5 = new javax.swing.JLabel();
        v4_2 = new javax.swing.JLabel();
        v4_1 = new javax.swing.JLabel();
        v4_4 = new javax.swing.JLabel();
        v3_5 = new javax.swing.JLabel();
        v3_2 = new javax.swing.JLabel();
        v3_1 = new javax.swing.JLabel();
        v3_4 = new javax.swing.JLabel();
        v2_5 = new javax.swing.JLabel();
        v2_2 = new javax.swing.JLabel();
        v2_1 = new javax.swing.JLabel();
        v2_4 = new javax.swing.JLabel();
        v1_3 = new javax.swing.JLabel();
        v2_3 = new javax.swing.JLabel();
        v3_3 = new javax.swing.JLabel();
        v4_3 = new javax.swing.JLabel();
        v5_3 = new javax.swing.JLabel();
        v6_3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lSolution = new javax.swing.JLabel();
        r1 = new javax.swing.JLabel();
        r2 = new javax.swing.JLabel();
        r3 = new javax.swing.JLabel();
        r4 = new javax.swing.JLabel();
        r5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbPoint = new javax.swing.JLabel();
        lbDolards = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setText("Master Mind");

        lError.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(251, 251, 251))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(lError)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lError)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));

        op1.setText("jLabel3");

        op3.setText("jLabel4");

        op2.setText("jLabel5");

        op4.setText("jLabel6");

        btnValider.setText("Valider");
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderActionPerformed(evt);
            }
        });

        btnEffacer.setText("Effacer");
        btnEffacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEffacerActionPerformed(evt);
            }
        });

        btnRejouer.setText("Rejouer");
        btnRejouer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejouerActionPerformed(evt);
            }
        });

        op5.setText("jLabel1");

        btnConnection.setText("Connection");
        btnConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectionActionPerformed(evt);
            }
        });

        txtIp.setText("10.4.221.20");

        txtPort.setText("4045");

        jLabel1.setText("ip");

        jLabel3.setText("port");

        jLabel4.setText("server ip");

        jLabel5.setText("server port");

        txtIpServer.setText("10.4.221.20");

        txtPortServer.setText("1045");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtPort))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPortServer)
                            .addComponent(txtIpServer)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 96, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(op1)
                            .addComponent(op2)
                            .addComponent(op3)
                            .addComponent(op4)
                            .addComponent(op5)
                            .addComponent(btnRejouer)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnEffacer)
                                .addComponent(btnValider))
                            .addComponent(btnConnection))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtIp, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtVisibleFalse, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(op1)
                .addGap(18, 18, 18)
                .addComponent(op2)
                .addGap(18, 18, 18)
                .addComponent(op3)
                .addGap(18, 18, 18)
                .addComponent(op4)
                .addGap(18, 18, 18)
                .addComponent(op5)
                .addGap(28, 28, 28)
                .addComponent(btnValider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(txtIpServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addComponent(txtPortServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEffacer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRejouer)
                .addGap(54, 54, 54)
                .addComponent(btnConnection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(txtVisibleFalse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));

        lq1.setText("1");

        lq1_1.setText("jLabel8");
        lq1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq1_1MouseClicked(evt);
            }
        });

        lq1_2.setText("jLabel9");
        lq1_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq1_2MouseClicked(evt);
            }
        });

        lq1_3.setText("jLabel10");
        lq1_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq1_3MouseClicked(evt);
            }
        });

        lq1_4.setText("jLabel11");
        lq1_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq1_4MouseClicked(evt);
            }
        });

        lq2_4.setText("jLabel11");
        lq2_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq2_4MouseClicked(evt);
            }
        });

        lq2_3.setText("jLabel10");
        lq2_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq2_3MouseClicked(evt);
            }
        });

        lq2_2.setText("jLabel9");
        lq2_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq2_2MouseClicked(evt);
            }
        });

        lq2_1.setText("jLabel8");
        lq2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq2_1MouseClicked(evt);
            }
        });

        lq2.setText("2");

        lq3_4.setText("jLabel11");
        lq3_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq3_4MouseClicked(evt);
            }
        });

        lq3_3.setText("jLabel10");
        lq3_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq3_3MouseClicked(evt);
            }
        });

        lq3_2.setText("jLabel9");
        lq3_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq3_2MouseClicked(evt);
            }
        });

        lq3_1.setText("jLabel8");
        lq3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq3_1MouseClicked(evt);
            }
        });

        lq3.setText("3");

        lq4_4.setText("jLabel11");
        lq4_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq4_4MouseClicked(evt);
            }
        });

        lq4_3.setText("jLabel10");
        lq4_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq4_3MouseClicked(evt);
            }
        });

        lq4_2.setText("jLabel9");
        lq4_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq4_2MouseClicked(evt);
            }
        });

        lq4_1.setText("jLabel8");
        lq4_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq4_1MouseClicked(evt);
            }
        });

        lq4.setText("4");

        lq5_4.setText("jLabel11");
        lq5_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq5_4MouseClicked(evt);
            }
        });

        lq5_3.setText("jLabel10");
        lq5_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq5_3MouseClicked(evt);
            }
        });

        lq5_2.setText("jLabel9");
        lq5_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq5_2MouseClicked(evt);
            }
        });

        lq5_1.setText("jLabel8");
        lq5_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq5_1MouseClicked(evt);
            }
        });

        lq5.setText("5");

        lq6_4.setText("jLabel11");
        lq6_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq6_4MouseClicked(evt);
            }
        });

        lq6_3.setText("jLabel10");
        lq6_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq6_3MouseClicked(evt);
            }
        });

        lq6_2.setText("jLabel9");
        lq6_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq6_2MouseClicked(evt);
            }
        });

        lq6_1.setText("jLabel8");
        lq6_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq6_1MouseClicked(evt);
            }
        });

        lq6.setText("6");

        lq1_5.setText("jLabel11");
        lq1_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq1_5MouseClicked(evt);
            }
        });

        lq2_5.setText("jLabel11");
        lq2_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq2_5MouseClicked(evt);
            }
        });

        lq3_5.setText("jLabel11");
        lq3_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq3_5MouseClicked(evt);
            }
        });

        lq4_5.setText("jLabel11");
        lq4_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq4_5MouseClicked(evt);
            }
        });

        lq5_5.setText("jLabel11");
        lq5_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq5_5MouseClicked(evt);
            }
        });

        lq6_5.setText("jLabel11");
        lq6_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lq6_5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lq1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lq1_1)
                        .addGap(18, 18, 18)
                        .addComponent(lq1_2)
                        .addGap(18, 18, 18)
                        .addComponent(lq1_3)
                        .addGap(18, 18, 18)
                        .addComponent(lq1_4)
                        .addGap(18, 18, 18)
                        .addComponent(lq1_5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lq2)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(lq2_1)
                                .addGap(18, 18, 18)
                                .addComponent(lq2_2)
                                .addGap(18, 18, 18)
                                .addComponent(lq2_3)
                                .addGap(18, 18, 18)
                                .addComponent(lq2_4)
                                .addGap(18, 18, 18)
                                .addComponent(lq2_5))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lq3)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(lq3_1)
                                .addGap(18, 18, 18)
                                .addComponent(lq3_2)
                                .addGap(18, 18, 18)
                                .addComponent(lq3_3)
                                .addGap(18, 18, 18)
                                .addComponent(lq3_4)
                                .addGap(18, 18, 18)
                                .addComponent(lq3_5))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lq4)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(lq4_1)
                                .addGap(18, 18, 18)
                                .addComponent(lq4_2)
                                .addGap(18, 18, 18)
                                .addComponent(lq4_3)
                                .addGap(18, 18, 18)
                                .addComponent(lq4_4)
                                .addGap(18, 18, 18)
                                .addComponent(lq4_5))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lq5)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(lq5_1)
                                .addGap(18, 18, 18)
                                .addComponent(lq5_2)
                                .addGap(18, 18, 18)
                                .addComponent(lq5_3)
                                .addGap(18, 18, 18)
                                .addComponent(lq5_4)
                                .addGap(18, 18, 18)
                                .addComponent(lq5_5))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lq6)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(lq6_1)
                                .addGap(18, 18, 18)
                                .addComponent(lq6_2)
                                .addGap(18, 18, 18)
                                .addComponent(lq6_3)
                                .addGap(18, 18, 18)
                                .addComponent(lq6_4)
                                .addGap(18, 18, 18)
                                .addComponent(lq6_5)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lq1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lq1_1)
                    .addComponent(lq1_2)
                    .addComponent(lq1_3)
                    .addComponent(lq1_4)
                    .addComponent(lq1_5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lq2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lq2_1)
                    .addComponent(lq2_2)
                    .addComponent(lq2_3)
                    .addComponent(lq2_4)
                    .addComponent(lq2_5))
                .addGap(18, 18, 18)
                .addComponent(lq3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lq3_1)
                    .addComponent(lq3_2)
                    .addComponent(lq3_3)
                    .addComponent(lq3_4)
                    .addComponent(lq3_5))
                .addGap(18, 18, 18)
                .addComponent(lq4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lq4_1)
                    .addComponent(lq4_2)
                    .addComponent(lq4_3)
                    .addComponent(lq4_4)
                    .addComponent(lq4_5))
                .addGap(18, 18, 18)
                .addComponent(lq5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lq5_1)
                    .addComponent(lq5_2)
                    .addComponent(lq5_3)
                    .addComponent(lq5_4)
                    .addComponent(lq5_5))
                .addGap(18, 18, 18)
                .addComponent(lq6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lq6_1)
                    .addComponent(lq6_2)
                    .addComponent(lq6_3)
                    .addComponent(lq6_4)
                    .addComponent(lq6_5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        v1_1.setText("jLabel41");

        v1_4.setText("jLabel42");

        v1_2.setText("jLabel43");

        v1_5.setText("jLabel44");

        v6_5.setText("jLabel44");

        v6_2.setText("jLabel43");

        v6_1.setText("jLabel41");

        v6_4.setText("jLabel42");

        v5_5.setText("jLabel44");

        v5_2.setText("jLabel43");

        v5_1.setText("jLabel41");

        v5_4.setText("jLabel42");

        v4_5.setText("jLabel44");

        v4_2.setText("jLabel43");

        v4_1.setText("jLabel41");

        v4_4.setText("jLabel42");

        v3_5.setText("jLabel44");

        v3_2.setText("jLabel43");

        v3_1.setText("jLabel41");

        v3_4.setText("jLabel42");

        v2_5.setText("jLabel44");

        v2_2.setText("jLabel43");

        v2_1.setText("jLabel41");

        v2_4.setText("jLabel42");

        v1_3.setText("jLabel1");

        v2_3.setText("jLabel7");

        v3_3.setText("jLabel8");

        v4_3.setText("jLabel9");

        v5_3.setText("jLabel10");

        v6_3.setText("jLabel11");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(v3_1)
                    .addComponent(v4_1)
                    .addComponent(v6_1)
                    .addComponent(v1_1)
                    .addComponent(v2_1)
                    .addComponent(v5_1)
                    .addComponent(v1_2)
                    .addComponent(v2_2)
                    .addComponent(v3_2)
                    .addComponent(v4_2)
                    .addComponent(v5_2)
                    .addComponent(v6_2))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(v6_4)
                            .addComponent(v5_4)
                            .addComponent(v6_3)
                            .addComponent(v1_3)
                            .addComponent(v2_3)
                            .addComponent(v4_3)
                            .addComponent(v5_3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(v2_5)
                            .addComponent(v1_5)
                            .addComponent(v6_5)
                            .addComponent(v5_5)
                            .addComponent(v4_5)))
                    .addComponent(v1_4)
                    .addComponent(v2_4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(v3_3)
                        .addGap(25, 25, 25)
                        .addComponent(v3_5))
                    .addComponent(v3_4)
                    .addComponent(v4_4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 107, Short.MAX_VALUE)
                    .addComponent(jLabel63)
                    .addGap(0, 107, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v1_1)
                    .addComponent(v1_5)
                    .addComponent(v1_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v1_2)
                    .addComponent(v1_4))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v2_1)
                    .addComponent(v2_5)
                    .addComponent(v2_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v2_2)
                    .addComponent(v2_4))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v3_1)
                    .addComponent(v3_5)
                    .addComponent(v3_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v3_2)
                    .addComponent(v3_4))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v4_1)
                    .addComponent(v4_5)
                    .addComponent(v4_3))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(v4_2)
                    .addComponent(v4_4))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v5_1)
                    .addComponent(v5_5)
                    .addComponent(v5_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v5_2)
                    .addComponent(v5_4))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v6_1)
                    .addComponent(v6_5)
                    .addComponent(v6_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v6_2)
                    .addComponent(v6_4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 288, Short.MAX_VALUE)
                    .addComponent(jLabel63)
                    .addGap(0, 288, Short.MAX_VALUE)))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));

        lSolution.setText("Solution");

        r1.setText("jLabel8");

        r2.setText("jLabel9");

        r3.setText("jLabel10");

        r4.setText("jLabel11");

        r5.setText("jLabel11");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Point");

        lbPoint.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbPoint.setText("0");

        lbDolards.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbDolards.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(r1)
                .addGap(18, 18, 18)
                .addComponent(r2)
                .addGap(18, 18, 18)
                .addComponent(r3)
                .addGap(18, 18, 18)
                .addComponent(r4)
                .addGap(18, 18, 18)
                .addComponent(r5)
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lSolution)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPoint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDolards)
                .addGap(70, 70, 70))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSolution)
                    .addComponent(jLabel6)
                    .addComponent(lbPoint)
                    .addComponent(lbDolards))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1)
                    .addComponent(r2)
                    .addComponent(r3)
                    .addComponent(r4)
                    .addComponent(r5))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //le changement de couleur de tous les images avec les labels
    private void lq1_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq1_1MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq1_1);
    }//GEN-LAST:event_lq1_1MouseClicked

    private void lq1_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq1_2MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq1_2);
    }//GEN-LAST:event_lq1_2MouseClicked

    private void lq1_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq1_3MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq1_3);
    }//GEN-LAST:event_lq1_3MouseClicked

    private void lq1_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq1_4MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq1_4);
    }//GEN-LAST:event_lq1_4MouseClicked

    private void lq1_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq1_5MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq1_5);
    }//GEN-LAST:event_lq1_5MouseClicked

    private void lq2_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq2_1MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq2_1);
    }//GEN-LAST:event_lq2_1MouseClicked

    private void lq2_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq2_2MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq2_2);
    }//GEN-LAST:event_lq2_2MouseClicked

    private void lq2_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq2_3MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq2_3);
    }//GEN-LAST:event_lq2_3MouseClicked

    private void lq2_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq2_4MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq2_4);
    }//GEN-LAST:event_lq2_4MouseClicked

    private void lq2_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq2_5MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq2_5);
    }//GEN-LAST:event_lq2_5MouseClicked

    private void lq3_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq3_1MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq3_1);
    }//GEN-LAST:event_lq3_1MouseClicked

    private void lq3_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq3_2MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq3_2);
    }//GEN-LAST:event_lq3_2MouseClicked

    private void lq3_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq3_3MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq3_3);
    }//GEN-LAST:event_lq3_3MouseClicked

    private void lq3_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq3_4MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq3_4);
    }//GEN-LAST:event_lq3_4MouseClicked

    private void lq3_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq3_5MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq3_5);
    }//GEN-LAST:event_lq3_5MouseClicked

    private void lq4_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq4_1MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq4_1);
    }//GEN-LAST:event_lq4_1MouseClicked

    private void lq4_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq4_2MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq4_2);
    }//GEN-LAST:event_lq4_2MouseClicked

    private void lq4_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq4_3MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq4_3);
    }//GEN-LAST:event_lq4_3MouseClicked

    private void lq4_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq4_4MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq4_4);
    }//GEN-LAST:event_lq4_4MouseClicked

    private void lq4_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq4_5MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq4_5);
    }//GEN-LAST:event_lq4_5MouseClicked

    private void lq5_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq5_1MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq5_1);
    }//GEN-LAST:event_lq5_1MouseClicked

    private void lq5_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq5_2MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq5_2);
    }//GEN-LAST:event_lq5_2MouseClicked

    private void lq5_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq5_3MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq5_3);
    }//GEN-LAST:event_lq5_3MouseClicked

    private void lq5_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq5_4MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq5_4);
    }//GEN-LAST:event_lq5_4MouseClicked

    private void lq5_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq5_5MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq5_5);
    }//GEN-LAST:event_lq5_5MouseClicked

    private void lq6_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq6_1MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq6_1);
    }//GEN-LAST:event_lq6_1MouseClicked

    private void lq6_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq6_2MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq6_2);
    }//GEN-LAST:event_lq6_2MouseClicked

    private void lq6_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq6_3MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq6_3);
    }//GEN-LAST:event_lq6_3MouseClicked

    private void lq6_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq6_4MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq6_4);
    }//GEN-LAST:event_lq6_4MouseClicked

    private void lq6_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lq6_5MouseClicked
        // TODO add your handling code here:
        ChangerCouleur(lq6_5);
    }//GEN-LAST:event_lq6_5MouseClicked

    //Effacer la ligne de bouton selectionner
    private void btnEffacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEffacerActionPerformed
        // TODO add your handling code here:
        switch (numero) {
            case 0:
                this.lq1_1.setIcon(blancGrand);
                this.lq1_2.setIcon(blancGrand);
                this.lq1_3.setIcon(blancGrand);
                this.lq1_4.setIcon(blancGrand);
                this.lq1_5.setIcon(blancGrand);
                break;
            case 1:
                this.lq2_1.setIcon(blancGrand);
                this.lq2_2.setIcon(blancGrand);
                this.lq2_3.setIcon(blancGrand);
                this.lq2_4.setIcon(blancGrand);
                this.lq2_5.setIcon(blancGrand);
                break;
            case 2:
                this.lq3_1.setIcon(blancGrand);
                this.lq3_2.setIcon(blancGrand);
                this.lq3_3.setIcon(blancGrand);
                this.lq3_4.setIcon(blancGrand);
                this.lq3_5.setIcon(blancGrand);
                break;
            case 4:
                this.lq4_1.setIcon(blancGrand);
                this.lq4_2.setIcon(blancGrand);
                this.lq4_3.setIcon(blancGrand);
                this.lq4_4.setIcon(blancGrand);
                this.lq4_5.setIcon(blancGrand);
                break;
            case 5:
                this.lq5_1.setIcon(blancGrand);
                this.lq5_2.setIcon(blancGrand);
                this.lq5_3.setIcon(blancGrand);
                this.lq5_4.setIcon(blancGrand);
                this.lq5_5.setIcon(blancGrand);
                break;
            case 6:
                this.lq6_1.setIcon(blancGrand);
                this.lq6_2.setIcon(blancGrand);
                this.lq6_3.setIcon(blancGrand);
                this.lq6_4.setIcon(blancGrand);
                this.lq6_5.setIcon(blancGrand);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnEffacerActionPerformed

    //rejouer. changer la solution de boules
    private void btnRejouerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejouerActionPerformed
        // TODO add your handling code here:
        Reset();
        btnValider.setEnabled(true);
        clientUDP.sendMessage("r", txtIpServer.getText(), Integer.parseInt(txtPortServer.getText()));
    }//GEN-LAST:event_btnRejouerActionPerformed

    //valider si les boule sont bien placer
    private int cpt = 0;
    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
        // TODO add your handling code here:
        numero++;
        cpt = 0;

        message = "";

        int fin = 0;

        String answer;
        switch (numero) {
            case 1:
                Validation(lq1_1);
                Validation(lq1_2);
                Validation(lq1_3);
                Validation(lq1_4);
                Validation(lq1_5);

                if (cpt >= 10) {
                    //envoie de message au server
                    clientUDP.sendMessage(message, txtIpServer.getText(), Integer.parseInt(txtPortServer.getText()));

                    //delais
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    //reponse du serveur afficher dans un textbox invisible
                    answer = txtVisibleFalse.getText();

                    String splitAnswer[] = answer.split("/");

                    //validation
                    if (splitAnswer[0].equals("t")) {
                        afficherBonneBoule(lq1_1, v1_1);
                        fin++;
                    }
                    if (splitAnswer[1].equals("t")) {
                        afficherBonneBoule(lq1_2, v1_2);
                        fin++;
                    }
                    if (splitAnswer[2].equals("t")) {
                        afficherBonneBoule(lq1_3, v1_3);
                        fin++;
                    }
                    if (splitAnswer[3].equals("t")) {
                        afficherBonneBoule(lq1_4, v1_4);
                        fin++;
                    }
                    if (splitAnswer[4].equals("t")) {
                        afficherBonneBoule(lq1_5, v1_5);
                        fin++;
                    }
                    //les points
                    if (fin == 5) {
                        points += 6;
                    } else if (fin == 4) {
                        points += 5;
                    } else if (fin == 3) {
                        points += 4;
                    } else if (fin == 2) {
                        points += 3;
                    } else if (fin == 1) {
                        points += 2;
                    }
                
                    //affichage de la deuxieme ligne
                    lq2_1.setEnabled(true);
                    lq2_2.setEnabled(true);
                    lq2_3.setEnabled(true);
                    lq2_4.setEnabled(true);
                    lq2_5.setEnabled(true);
                } else {
                    numero--;
                }

                break;
                //Tous cela est repeter 6 fois pour chaque ligne dans le jeux
            case 2:

                Validation(lq2_1);
                Validation(lq2_2);
                Validation(lq2_3);
                Validation(lq2_4);
                Validation(lq2_5);
                if (cpt >= 10) {
                    clientUDP.sendMessage(message, txtIpServer.getText(), Integer.parseInt(txtPortServer.getText()));

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    answer = txtVisibleFalse.getText();
//                    System.out.println(answer);

                    String splitAnswer[] = answer.split("/");
                    if (splitAnswer[0].equals("t")) {
                        afficherBonneBoule(lq2_1, v2_1);
                        fin++;
                    }
                    if (splitAnswer[1].equals("t")) {
                        afficherBonneBoule(lq2_2, v2_2);
                        fin++;
                    }
                    if (splitAnswer[2].equals("t")) {
                        afficherBonneBoule(lq2_3, v2_3);
                        fin++;
                    }
                    if (splitAnswer[3].equals("t")) {
                        afficherBonneBoule(lq2_4, v2_4);
                        fin++;
                    }
                    if (splitAnswer[4].equals("t")) {
                        afficherBonneBoule(lq2_5, v2_5);
                        fin++;
                    }
                    if (fin == 5) {
                        points += 5;
                    } else if (fin == 4) {
                        points += 4;
                    } else if (fin == 3) {
                        points += 3;
                    } else if (fin == 2) {
                        points += 2;
                    } else if (fin == 1) {
                        points += 1;
                    }
//                    lq2_1.setEnabled(false);
//                    lq2_2.setEnabled(false);
//                    lq2_3.setEnabled(false);
//                    lq2_4.setEnabled(false);
//                    lq2_5.setEnabled(false);

                    lq3_1.setEnabled(true);
                    lq3_2.setEnabled(true);
                    lq3_3.setEnabled(true);
                    lq3_4.setEnabled(true);
                    lq3_5.setEnabled(true);
                } else {
                    numero--;
                }
                break;
            case 3:
                Validation(lq3_1);
                Validation(lq3_2);
                Validation(lq3_3);
                Validation(lq3_4);
                Validation(lq3_5);
                if (cpt >= 10) {
                    clientUDP.sendMessage(message, txtIpServer.getText(), Integer.parseInt(txtPortServer.getText()));

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    answer = txtVisibleFalse.getText();
//                    System.out.println(answer);

                    String splitAnswer[] = answer.split("/");
                    if (splitAnswer[0].equals("t")) {
                        afficherBonneBoule(lq3_1, v3_1);
                        fin++;
                    }
                    if (splitAnswer[1].equals("t")) {
                        afficherBonneBoule(lq3_2, v3_2);
                        fin++;
                    }
                    if (splitAnswer[2].equals("t")) {
                        afficherBonneBoule(lq3_3, v3_3);
                        fin++;
                    }
                    if (splitAnswer[3].equals("t")) {
                        afficherBonneBoule(lq3_4, v3_4);
                        fin++;
                    }
                    if (splitAnswer[4].equals("t")) {
                        afficherBonneBoule(lq3_5, v3_5);
                        fin++;
                    }
                    if (fin == 5) {
                        points += 4;
                    } else if (fin == 4) {
                        points += 3;
                    } else if (fin == 3) {
                        points += 2;
                    } else if (fin == 2) {
                        points += 1;
                    }
//                    lq3_1.setEnabled(false);
//                    lq3_2.setEnabled(false);
//                    lq3_3.setEnabled(false);
//                    lq3_4.setEnabled(false);
//                    lq3_5.setEnabled(false);

                    lq4_1.setEnabled(true);
                    lq4_2.setEnabled(true);
                    lq4_3.setEnabled(true);
                    lq4_4.setEnabled(true);
                    lq4_5.setEnabled(true);
                } else {
                    numero--;
                }
                break;
            case 4:
                Validation(lq4_1);
                Validation(lq4_2);
                Validation(lq4_3);
                Validation(lq4_4);
                Validation(lq4_5);
                if (cpt >= 10) {
                    clientUDP.sendMessage(message, txtIpServer.getText(), Integer.parseInt(txtPortServer.getText()));

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    answer = txtVisibleFalse.getText();
//                    System.out.println(answer);

                    String splitAnswer[] = answer.split("/");
                    if (splitAnswer[0].equals("t")) {
                        afficherBonneBoule(lq4_1, v4_1);
                        fin++;
                    }
                    if (splitAnswer[1].equals("t")) {
                        afficherBonneBoule(lq4_2, v4_2);
                        fin++;
                    }
                    if (splitAnswer[2].equals("t")) {
                        afficherBonneBoule(lq4_3, v4_3);
                        fin++;
                    }
                    if (splitAnswer[3].equals("t")) {
                        afficherBonneBoule(lq4_4, v4_4);
                        fin++;
                    }
                    if (splitAnswer[4].equals("t")) {
                        afficherBonneBoule(lq4_5, v4_5);
                        fin++;
                    }

                    if (fin == 5) {
                        points += 3;
                    } else if (fin == 4) {
                        points += 2;
                    } else if (fin == 3) {
                        points += 1;
                    }
//                    lq4_1.setEnabled(false);
//                    lq4_2.setEnabled(false);
//                    lq4_3.setEnabled(false);
//                    lq4_4.setEnabled(false);
//                    lq4_5.setEnabled(false);

                    lq5_1.setEnabled(true);
                    lq5_2.setEnabled(true);
                    lq5_3.setEnabled(true);
                    lq5_4.setEnabled(true);
                    lq5_5.setEnabled(true);
                } else {
                    numero--;
                }
                break;
            case 5:
                Validation(lq5_1);
                Validation(lq5_2);
                Validation(lq5_3);
                Validation(lq5_4);
                Validation(lq5_5);
                if (cpt >= 10) {
                    clientUDP.sendMessage(message, txtIpServer.getText(), Integer.parseInt(txtPortServer.getText()));

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    answer = txtVisibleFalse.getText();
//                    System.out.println(answer);

                    String splitAnswer[] = answer.split("/");
                    if (splitAnswer[0].equals("t")) {
                        afficherBonneBoule(lq5_1, v5_1);
                        fin++;
                    }
                    if (splitAnswer[1].equals("t")) {
                        afficherBonneBoule(lq5_2, v5_2);
                        fin++;
                    }
                    if (splitAnswer[2].equals("t")) {
                        afficherBonneBoule(lq5_3, v5_3);
                        fin++;
                    }
                    if (splitAnswer[3].equals("t")) {
                        afficherBonneBoule(lq5_4, v5_4);
                        fin++;
                    }
                    if (splitAnswer[4].equals("t")) {
                        afficherBonneBoule(lq5_5, v5_5);
                        fin++;
                    }
                    if (fin == 5) {
                        points += 2;
                    } else if (fin == 4) {
                        points += 1;
                    }
//                    lq5_1.setEnabled(false);
//                    lq5_2.setEnabled(false);
//                    lq5_3.setEnabled(false);
//                    lq5_4.setEnabled(false);
//                    lq5_5.setEnabled(false);

                    lq6_1.setEnabled(true);
                    lq6_2.setEnabled(true);
                    lq6_3.setEnabled(true);
                    lq6_4.setEnabled(true);
                    lq6_5.setEnabled(true);
                } else {
                    numero--;
                }
                break;
            case 6:
                Validation(lq6_1);
                Validation(lq6_2);
                Validation(lq6_3);
                Validation(lq6_4);
                Validation(lq6_5);
                if (cpt >= 10) {
                    clientUDP.sendMessage(message, txtIpServer.getText(), Integer.parseInt(txtPortServer.getText()));

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    answer = txtVisibleFalse.getText();
//                    System.out.println(answer);

                    String splitAnswer[] = answer.split("/");
                    if (splitAnswer[0].equals("t")) {
                        afficherBonneBoule(lq6_1, v6_1);
                        fin++;
                    }
                    if (splitAnswer[1].equals("t")) {
                        afficherBonneBoule(lq6_2, v6_2);
                        fin++;
                    }
                    if (splitAnswer[2].equals("t")) {
                        afficherBonneBoule(lq6_3, v6_3);
                        fin++;
                    }
                    if (splitAnswer[3].equals("t")) {
                        afficherBonneBoule(lq6_4, v6_4);
                        fin++;
                    }
                    if (splitAnswer[4].equals("t")) {
                        afficherBonneBoule(lq6_5, v6_5);
                        fin++;
                    }
                    if (fin == 5) {
                        points += 1;
                    }
                    // 6 rate. changement de fin a 5 pour afficher le solutionaire
                    fin = 5;
                    btnValider.setEnabled(false);
                } else {
                    numero--;
                }
                break;
        }
        
        //si le compte fin est a 5 affichage du solutionaire
        if (fin == 5) {
            System.err.println("fin");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            clientUDP.sendMessage("v", txtIpServer.getText(), Integer.parseInt(txtPortServer.getText()));
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
//            System.out.println(txtVisibleFalse.getText());
            String split[] = txtVisibleFalse.getText().split("/");
            fin(r1, split[0]);
            fin(r2, split[1]);
            fin(r3, split[2]);
            fin(r4, split[3]);
            fin(r5, split[4]);
        }
       
        //compter et afficher les points et dollars
        lbPoint.setText(String.valueOf(points));
         try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        int calDollar = 10 * points;
        System.err.println("c" + calDollar);
        lbDolards.setText(String.valueOf(calDollar));
    }//GEN-LAST:event_btnValiderActionPerformed

    //afficher les boules du solutionnaire
    private void fin(JLabel label, String num) {
        if (num.equals("1")) {
            label.setIcon(b1);
        } else if (num.equals("2")) {
            label.setIcon(b2);
        } else if (num.equals("3")) {
            label.setIcon(b3);
        } else if (num.equals("4")) {
            label.setIcon(b4);
        } else if (num.equals("5")) {
            label.setIcon(b5);
        }
    }

    //afficher les boules pour chaque ligne du jeux
    private void afficherBonneBoule(JLabel labelG, JLabel labelM) {
        if (labelG.getIcon() == b1) {
            labelM.setIcon(m1);
        } else if (labelG.getIcon() == b2) {
            labelM.setIcon(m2);
        } else if (labelG.getIcon() == b3) {
            labelM.setIcon(m3);
        } else if (labelG.getIcon() == b4) {
            labelM.setIcon(m4);
        } else if (labelG.getIcon() == b5) {
            labelM.setIcon(m5);
        }
    }

    //se connecter au serveur
    private void btnConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectionActionPerformed
        // TODO add your handling code here:

        clientUDP = new ClientUDP(txtIp.getText(), Integer.parseInt(txtPort.getText()), txtVisibleFalse);
        clientUDP.start();
        btnEffacer.setEnabled(true);
        btnRejouer.setEnabled(true);
        btnValider.setEnabled(true);
    }//GEN-LAST:event_btnConnectionActionPerformed

    
    private void Validation(JLabel label) {
        if (ConvertImageIntoString(label).equals("error")) {
          //Ces element sont passer
        } else if (!label.getIcon().toString().equals(blancGrand.toString())) {

            message += ConvertImageIntoString(label) + "/";

        }
    }

    //Convertie les elements en une chaine pour l'envoyer au serveur
    private String ConvertImageIntoString(JLabel label) {
        if (label.getIcon().toString().equals(b1.toString())) {
            cpt++;
            return "1";
        } else if (label.getIcon().toString().equals(b2.toString())) {
            cpt++;
            return "2";
        } else if (label.getIcon().toString().equals(b3.toString())) {
            cpt++;
            return "3";
        } else if (label.getIcon().toString().equals(b4.toString())) {
            cpt++;
            return "4";
        } else if (label.getIcon().toString().equals(b5.toString())) {
            cpt++;
            return "5";
        } else {
            return "error";
        }
    }

    //change la couleurs des boulles
    private void ChangerCouleur(JLabel label) {
        if (label.getIcon().toString().equals(blancGrand.toString())) {
            label.setIcon(b1);
        } else if (label.getIcon().toString().equals(b1.toString())) {
            label.setIcon(b2);
        } else if (label.getIcon().toString().equals(b2.toString())) {
            label.setIcon(b3);
        } else if (label.getIcon().toString().equals(b3.toString())) {
            label.setIcon(b4);
        } else if (label.getIcon().toString().equals(b4.toString())) {
            label.setIcon(b5);
        } else if (label.getIcon().toString().equals(b5.toString())) {
            label.setIcon(b1);
        }
    }

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
            java.util.logging.Logger.getLogger(Client.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnection;
    private javax.swing.JButton btnEffacer;
    private javax.swing.JButton btnRejouer;
    private javax.swing.JButton btnValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lError;
    private javax.swing.JLabel lSolution;
    private javax.swing.JLabel lbDolards;
    private javax.swing.JLabel lbPoint;
    private javax.swing.JLabel lq1;
    private javax.swing.JLabel lq1_1;
    private javax.swing.JLabel lq1_2;
    private javax.swing.JLabel lq1_3;
    private javax.swing.JLabel lq1_4;
    private javax.swing.JLabel lq1_5;
    private javax.swing.JLabel lq2;
    private javax.swing.JLabel lq2_1;
    private javax.swing.JLabel lq2_2;
    private javax.swing.JLabel lq2_3;
    private javax.swing.JLabel lq2_4;
    private javax.swing.JLabel lq2_5;
    private javax.swing.JLabel lq3;
    private javax.swing.JLabel lq3_1;
    private javax.swing.JLabel lq3_2;
    private javax.swing.JLabel lq3_3;
    private javax.swing.JLabel lq3_4;
    private javax.swing.JLabel lq3_5;
    private javax.swing.JLabel lq4;
    private javax.swing.JLabel lq4_1;
    private javax.swing.JLabel lq4_2;
    private javax.swing.JLabel lq4_3;
    private javax.swing.JLabel lq4_4;
    private javax.swing.JLabel lq4_5;
    private javax.swing.JLabel lq5;
    private javax.swing.JLabel lq5_1;
    private javax.swing.JLabel lq5_2;
    private javax.swing.JLabel lq5_3;
    private javax.swing.JLabel lq5_4;
    private javax.swing.JLabel lq5_5;
    private javax.swing.JLabel lq6;
    private javax.swing.JLabel lq6_1;
    private javax.swing.JLabel lq6_2;
    private javax.swing.JLabel lq6_3;
    private javax.swing.JLabel lq6_4;
    private javax.swing.JLabel lq6_5;
    private javax.swing.JLabel op1;
    private javax.swing.JLabel op2;
    private javax.swing.JLabel op3;
    private javax.swing.JLabel op4;
    private javax.swing.JLabel op5;
    private javax.swing.JLabel r1;
    private javax.swing.JLabel r2;
    private javax.swing.JLabel r3;
    private javax.swing.JLabel r4;
    private javax.swing.JLabel r5;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtIpServer;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtPortServer;
    private javax.swing.JTextField txtVisibleFalse;
    private javax.swing.JLabel v1_1;
    private javax.swing.JLabel v1_2;
    private javax.swing.JLabel v1_3;
    private javax.swing.JLabel v1_4;
    private javax.swing.JLabel v1_5;
    private javax.swing.JLabel v2_1;
    private javax.swing.JLabel v2_2;
    private javax.swing.JLabel v2_3;
    private javax.swing.JLabel v2_4;
    private javax.swing.JLabel v2_5;
    private javax.swing.JLabel v3_1;
    private javax.swing.JLabel v3_2;
    private javax.swing.JLabel v3_3;
    private javax.swing.JLabel v3_4;
    private javax.swing.JLabel v3_5;
    private javax.swing.JLabel v4_1;
    private javax.swing.JLabel v4_2;
    private javax.swing.JLabel v4_3;
    private javax.swing.JLabel v4_4;
    private javax.swing.JLabel v4_5;
    private javax.swing.JLabel v5_1;
    private javax.swing.JLabel v5_2;
    private javax.swing.JLabel v5_3;
    private javax.swing.JLabel v5_4;
    private javax.swing.JLabel v5_5;
    private javax.swing.JLabel v6_1;
    private javax.swing.JLabel v6_2;
    private javax.swing.JLabel v6_3;
    private javax.swing.JLabel v6_4;
    private javax.swing.JLabel v6_5;
    // End of variables declaration//GEN-END:variables
}
