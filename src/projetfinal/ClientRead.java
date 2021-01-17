/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfinal;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author M-A
 */
public class ClientRead extends Thread {

    private final DatagramSocket datagramSocket;
    private JTextField affichage;

    public ClientRead(DatagramSocket datagramSocket, JTextField affichage) {
        this.datagramSocket = datagramSocket;
        this.affichage = affichage;
    }

    //lecture de tous les message envoyer par le serveur
    @Override
    public void run() {

        while (true) {
            byte[] buf = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(buf, 1024);
            try {
                datagramSocket.receive(datagramPacket);
                String message = new String(datagramPacket.getData());

                affichage.setText(message);

            } catch (IOException ex) {
                Logger.getLogger(ClientRead.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
