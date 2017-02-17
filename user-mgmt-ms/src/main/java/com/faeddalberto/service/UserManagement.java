package com.faeddalberto.service;

public interface UserManagement {

    public void addUser(String jsonUser);

    public void deleteUser(String username);

    public void searchUser(String username);
}
