package com.faeddalberto.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagementService implements UserManagement {

    @RequestMapping("/addUser")
    @Override
    public void addUser(@RequestParam(value="jsonUser") String jsonUser) {

    }

    @RequestMapping("/deleteUser")
    @Override
    public void deleteUser(@RequestParam(value="username") String username) {

    }

    @RequestMapping("/searchUser")
    @Override
    public void searchUser(@RequestParam(value="username") String username) {

    }
}
