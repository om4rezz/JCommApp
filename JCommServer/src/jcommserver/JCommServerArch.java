/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcommserver;

import client.Client;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author om4rezz
 */
public class JCommServerArch extends Thread {

    private String serverHost;
    private Integer serverPort;

    public JCommServerArch(String serverHost, Integer serverPort) {
        this.serverHost = serverHost;
        this.serverPort = serverPort;
    }

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
    }

}
