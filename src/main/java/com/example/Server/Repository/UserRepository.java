package com.example.Server.Repository;

import com.example.Server.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface UserRepository extends JpaRepository<User,Integer> {



}
