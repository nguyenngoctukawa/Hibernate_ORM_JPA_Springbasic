package org.example;

import HibernateDAO.UserDAO;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<UsersEntity> Us = UserDAO. getAllUsersEntityList();
        for (UsersEntity item : Us){
            System.out.println(item .toString());

        }
    }
}