package com.example.user.service.UserService.repositories;

import com.example.user.service.UserService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String>
{
}
