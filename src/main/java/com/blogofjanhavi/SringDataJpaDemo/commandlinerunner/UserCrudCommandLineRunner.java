package com.blogofjanhavi.SringDataJpaDemo.commandlinerunner;
import com.blogofjanhavi.SringDataJpaDemo.model.User;
import com.blogofjanhavi.SringDataJpaDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.Id;

import java.util.List;

@Component
public class UserCrudCommandLineRunner implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Is UserCrudCommandLineRunner working?");

        User user1= new User("Roy","JohnSon");
        userRepository.save(user1);

        User user2= new User("Boy","TohnSon");
        userRepository.save(user2);

        userRepository.save(new User("Amit", "Jaiswal"));

        userRepository.save(new User("Divy", "Prakash"));
        userRepository.save(new User("Divy", "Motu"));


        List<User> user=userRepository.findByFirstName("Divy");
       System.out.println("User with first name divy"+ user);

       user = userRepository.findByFirstNameAndLastName("Divy","Motu");

        System.out.println("User with first name divy"+ user);

        /*List<User> user=userRepository.findAll();

        System.out.println("Before deletion" +user);

        userRepository.delete(user1);
        user=userRepository.findAll();

        System.out.println("After deletion" +user);

        // update

        user2.setFirstName("janhavi");
        userRepository.save(user2);
        user=userRepository.findAll();
        System.out.println("After updation" +user);*/

    }
}
