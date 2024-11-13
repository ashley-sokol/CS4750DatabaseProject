package com.example.cs4750databaseproject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.cs4750databaseproject.repository.*;
import com.example.cs4750databaseproject.model.*;
//User API should include creating, deleting, or updating a user's email or password,

@CrossOrigin
@RestController
@RequestMapping("/api")
public class UserController {
    UserRepository userrepository;

    @PostMapping("/user")
    public ResponseEntity<User> createPatient(@RequestBody User user) {
           if (userrepository.findUserByEmail(user.getUserEmail()) != null)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
           User createdUser = userrepository.save(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    

}
