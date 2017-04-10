/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.caucho.hessian.client.HessianProxyFactory;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jcommcommon.IMessages;
import jcommcommon.IUsers;

/**
 *
 * @author om4rezz
 */
public class Services {

    private static IUsers USERS;
    private static IMessages MESSAGES;
    
    public static void InitServices(String host) {
        try {
            HessianProxyFactory hpf = new HessianProxyFactory();
            hpf.setOverloadEnabled(true);
            
            USERS = (IUsers) hpf.create(IUsers.class, host+IUsers.ENDPOINT);
            MESSAGES = (IMessages)hpf.create(IMessages.class, IMessages.ENDPOINT);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * @return the USERS
     */
    public static IUsers getUSERS() {
        return USERS;
    }

    /**
     * @return the MESSAGES
     */
    public static IMessages getMESSAGES() {
        return MESSAGES;
    }
}
