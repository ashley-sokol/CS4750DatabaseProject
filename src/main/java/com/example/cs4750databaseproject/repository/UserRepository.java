package com.example.cs4750databaseproject.repository;

import com.example.cs4750databaseproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByEmail(String user_email);
    Void updateUserByUserID(long user_id);
}
