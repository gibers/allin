package com.modulej9.allin.repositories;

import com.modulej9.allin.entities.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Long> {

    UsersEntity findByUsername(String username);
    UsersEntity findByEmail(String email);
    UsersEntity findByUserId(Long userId);

}
