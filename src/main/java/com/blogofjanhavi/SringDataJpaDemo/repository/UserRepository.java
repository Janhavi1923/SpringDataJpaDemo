package com.blogofjanhavi.SringDataJpaDemo.repository;

import com.blogofjanhavi.SringDataJpaDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByFirstName(String firstName);

    List<User> findByFirstNameAndLastName(String firstName, String LastName);
}
