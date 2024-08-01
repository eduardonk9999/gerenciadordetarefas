package com.gerenciadordetarefas.gerenciadordetarefas.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    // chamando a interface
    @Autowired
    private IUserRepository iUserRepository;

    @PostMapping("/")
    public UserModel create(@RequestBody UserModel userModel) {
       var user = this.iUserRepository.findByUsername(userModel.getUserName());

       if(user != null) {
           System.out.println("User já existe");
           return null;
       }

       var userCreated = this.iUserRepository.save(userModel);
        return userCreated;
    }
    
}