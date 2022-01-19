package com.example.learning.jpa.jpademo.services;


import com.example.learning.jpa.jpademo.entities.User;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.logging.Logger;

public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log = (Logger) LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);


    @Autowired
    private UserDaoService userDaoService;

    @Override
    public void run(String... arg0) throws Exception {
        User user = new User("Manish","Analyst");
        //New user is created : User [id=1, name=Jack, role=Admin]
        long insert= userDaoService.insert(user);
        log.info("New user created"+ user);



    }
}
