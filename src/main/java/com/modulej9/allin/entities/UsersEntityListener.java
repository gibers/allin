package com.modulej9.allin.entities;

import jakarta.persistence.PrePersist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsersEntityListener {

    private static UsersService usersService;

    @Autowired
    public void setUserService(UsersService usersService) {
        UsersEntityListener.usersService = usersService;
    }

    @PrePersist
    public void prePersist(UsersEntity user) {
        if (user.getUserId() == null) {
            user.setUserId(usersService.getNextUserIdFromSequence());
        }
    }
}