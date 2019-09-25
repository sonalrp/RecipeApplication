/*package com.tcs.SpringBootRecipeApp.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.SpringBootRecipeApp.entity.Recipe;
import com.tcs.SpringBootRecipeApp.entity.User;
import com.tcs.SpringBootRecipeApp.service.UserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/recipe-portal"})
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> create(@Valid @RequestBody User user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<User> findById(@PathVariable("id") Long id){
    	Optional<User> stock = userService.findById(id);
        if (!stock.isPresent()) {
            //log.error("Id " + id + " is not existed");
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(stock.get());
    }

    @PutMapping(path = {"/{id}"})
    public User update(@PathVariable("id") int id, @RequestBody User user){
        user.setUser_id(id);
        return userService.save(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity<User> delete(@PathVariable("id") long id) {
    	 if (!userService.findById(id).isPresent()) {
             //log.error("Id " + id + " is not existed");
             ResponseEntity.badRequest().build();
         }

    	 userService.deleteById(id);
         return ResponseEntity.ok().build();
    }

    @GetMapping
    public List findAll(){
        return userService.findAll();
    }

}

*/