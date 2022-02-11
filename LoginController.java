package de.ingeJavaTeam.web.gui;

import de.ingeJavaTeam.services.LoginService;

public class LoginController {
    LoginService loginService = new LoginService();

    public boolean checkLogin(String username, char[] password) {
        return loginService.checkLogin(username, password);
    }

}
