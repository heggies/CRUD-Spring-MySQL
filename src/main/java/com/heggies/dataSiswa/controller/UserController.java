/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heggies.dataSiswa.controller;

import com.heggies.dataSiswa.domain.User;
import com.heggies.dataSiswa.service.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author heggies
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserDao userDao;
    
    @RequestMapping(value = "/loggedin",method = RequestMethod.GET)
    public User getUserLoggedIn(){
        return null;
    }
}
