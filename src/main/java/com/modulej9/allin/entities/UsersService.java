package com.modulej9.allin.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UsersService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Long getNextUserIdFromSequence() {
        return jdbcTemplate.queryForObject("SELECT nextval('users_user_id_seq')", Long.class);
    }
}