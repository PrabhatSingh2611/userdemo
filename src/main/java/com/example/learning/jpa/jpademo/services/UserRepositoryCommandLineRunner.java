package com.example.learning.jpa.jpademo.services;

import com.example.learning.jpa.jpademo.entities.User;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log = (Logger) LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);


    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... arg0) throws Exception {
        User user = new User("Jill","Joker");
        //New user is created : User [id=1, name=Jack, role=Admin]
        userRepository.save(user);

        Optional<User> userWithIdOne = userRepository.findById(1L);
        log.info("User is retrieved"+ user);

        List<User> users = userRepository.findAll();
        log.info("All users : "+users);



    }
}
