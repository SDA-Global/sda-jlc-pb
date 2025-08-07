package com.sda.global.user_service.repository;

import com.sda.global.user_service.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer> {

    UserDetails getUserByUserId(Integer userId);
}
