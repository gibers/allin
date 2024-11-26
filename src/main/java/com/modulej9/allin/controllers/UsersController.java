package com.modulej9.allin.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.modulej9.allin.dto.UsersDto;
import com.modulej9.allin.entities.UsersEntity;
import com.modulej9.allin.repositories.UsersRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    private final UsersRepository usersRepository;

    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/users/{userid}")
    public UsersDto getUsers(@PathVariable Long userid) {
        ObjectMapper mapper = new ObjectMapper();
        UsersEntity byUserId = this.usersRepository.findByUserId(userid);
        return mapper.convertValue(byUserId, UsersDto.class);
    }

    @PostMapping("/users")
    public UsersDto addUsers(@RequestBody UsersDto usersDto) {
        ObjectMapper mapper = new ObjectMapper();
        UsersEntity usersEntity = mapper.convertValue(usersDto, UsersEntity.class);
        UsersEntity usersEntitySaved = this.usersRepository.save(usersEntity);
        return mapper.convertValue(usersEntitySaved, UsersDto.class);
    }

}
