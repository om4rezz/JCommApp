/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcommclient;

/**
 *
 * @author om4rezz
 */
public class JCommClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        services.Services.InitServices("http://localhost:9090");
        
    }
    
}
