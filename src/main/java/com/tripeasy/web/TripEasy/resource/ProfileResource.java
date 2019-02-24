package com.tripeasy.web.TripEasy.resource;
import com.tripeasy.web.TripEasy.config.Config;
import com.tripeasy.web.TripEasy.entity.Profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author Shabzan
 *
 */
@Controller
/* @RequestMapping("/profile") */
public class ProfileResource {
 
    @Autowired
    private RestTemplate restTemplate;
 
    @RequestMapping("/signin")
    public String logIn() {
        return "Login";
    }
 
    @RequestMapping("/signUpPage")
    public String signup() {
        return "SignUp";
    }
 
    /*
     * @RequestMapping("/profile") public String profile() { return "Profile"; }
     */
 
    @RequestMapping("/signup")
    public String createProfile(@ModelAttribute Profile profile, Model model) {
        restTemplate.postForEntity("http://"+Config.PROFILE_SERVICE+":9090/profiles", profile, Profile.class);
        model.addAttribute("message", "success!");
        return "index";
    }
 
    @RequestMapping("/profiles")
    public String Profile(@ModelAttribute Profile profile, Model model) {
 
        ResponseEntity<Profile> profiles = restTemplate.getForEntity("http://"+Config.PROFILE_SERVICE+":9090/profiles/101",
                Profile.class);
        Profile profileOne = profiles.getBody();
        model.addAttribute("message", profileOne);
        return "Profile";
    }
 
    @RequestMapping("/update")
    public String updateform(Model model) {
        ResponseEntity<Profile> profiles = restTemplate.getForEntity("http://"+Config.PROFILE_SERVICE+":9090/profiles/101",
                Profile.class);
        Profile profile  = profiles.getBody();
        System.out.println(profile);
        model.addAttribute("profile", profile);
        return "profilePage";
 
    }
 
    @RequestMapping("/updateDetails")
    public String editProfile(@ModelAttribute Profile profile, Model model) {
 
        restTemplate.put("http://"+Config.PROFILE_SERVICE+":9090/profiles/101",profile, Profile.class);
 
        model.addAttribute("message", profile);
        return "Profile";
    }
 
}
 