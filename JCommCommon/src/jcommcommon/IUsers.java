/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcommcommon;

import java.util.List;
import java.util.Map;

/**
 *
 * @author om4rezz
 */
public interface IUsers {

    String ENDPOINT = "/users";

    int authenticate(String username, String password);

    String signup(String username, String password);

    Map<String, Object> getUser(int id);

    List<Map<String, Object>> searchUsers(String search);
}
