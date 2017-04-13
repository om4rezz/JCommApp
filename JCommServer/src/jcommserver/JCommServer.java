/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcommserver;

import jcommcommon.IMessages;
import jcommcommon.IUsers;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.NetworkTrafficSelectChannelConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import services.MessagesService;
import services.UsersService;

/**
 *
 * @author om4rezz
 */
public class JCommServer {

    public static int port;
    private static Server server;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        port = 9090;
     
        // init the database connection
        
        initServer();
    }

    private static void initServices(ServletContextHandler webApp) {
        webApp.addServlet(MessagesService.class, IMessages.ENDPOINT);
        webApp.addServlet(UsersService.class, IUsers.ENDPOINT);
    }
    
    private static void initServer() {
        try {
            server = new Server();
            NetworkTrafficSelectChannelConnector connector = new NetworkTrafficSelectChannelConnector(server);
            connector.setPort(port);
            server.addConnector(connector);

            ServletContextHandler webApp = new ServletContextHandler(server, "");
            server.setHandler(webApp);
            initServices(webApp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
