package com.example.demo.controllers;

import com.example.demo.dao.ClientDAO;
import com.example.demo.dao.UserDAO;
import com.example.demo.models.Client;
import com.example.demo.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:4200"})
public class MainController {

//    private UserDAO userDAO;
//
//    public MainController(UserDAO userDAO) {
//        this.userDAO = userDAO;
//    }
//
//    @GetMapping("/users")
//    public List<User> users() {
//        List<User> all = userDAO.findAll();
//        return all;
//    }
//
//    @PostMapping("/user")
//    public void saveUser(@RequestBody User user) {
//        System.out.println(user);
//        userDAO.save(user);
//
//    }
//
//    @GetMapping("/users/{id}")
//    public User getUser(@PathVariable int id) {
//        User user = userDAO.findById(id).get();
//        return user;
//    }


    //        postmapping('/clients') записвает клиента в бд
//        getmapping('/clients') - возвращает всех клиентов в бд

    private ClientDAO clientDAO;

    public MainController (ClientDAO clientDAO) {
        this.clientDAO = clientDAO;

    }

    @GetMapping ("/clients")
    public List<Client> clients() {
        List<Client> all = clientDAO.findAll();
        return all;
    }

        @PostMapping("/clients")
    public void saveClient(@RequestBody Client client) {
        System.out.println(client);
        clientDAO.save(client);

    }
}


