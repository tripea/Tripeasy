package com.tripeasy.web.TripEasy.loginservice;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
