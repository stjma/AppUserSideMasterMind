/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfinal;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author M-A
 */
public class ClientUDP extends Thread {

    private final String ipLocal;
    private final int localPort;
    private JTextField affichage;
    private ClientWrite threadWrite;

    public ClientUDP(String ipLocal, int localPort, JTextField affichage) {
        this.ipLocal = ipLocal;
        this.localPort = localPort;
        this.affichage = affichage;

    }

    private ClientRead clientRead;
    //sert a partir le thread lecture et ecriture
    @Override
    public void run() {
        try {
            SocketAddress socketAddress = new InetSocketAddress(InetAddress.getByName(ipLocal), localPort);

            DatagramSocket datagramSocket = new DatagramSocket(socketAddress);
            
            // create and start thread (read and write)
            clientRead = new ClientRead(datagramSocket, affichage);
            new Thread(clientRead).start();
            threadWrite = new ClientWrite(datagramSocket);


        } catch (SocketException ex) {
            Logger.getLogger(ClientUDP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(ClientUDP.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Envoyer les message au serveur
    public void sendMessage(String message, String ip, int port) {
        threadWrite.send(message, ip, port);

    }

}
