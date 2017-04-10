/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcommcommon;

/**
 *
 * @author om4rezz
 */
public interface R {

    static interface Users {

        String id = "id";
        String className = "User";
        String username = "un";
        String firstName = "fn";
        String lastName = "ln";
        String password = "pw";
        String role = "role";
        String host = "host";
    }

    static interface Messages {

        String id = "id";
        String className = "Message";
        String content = "content";
        String sentWhen = "sentWhen";
    }

}
