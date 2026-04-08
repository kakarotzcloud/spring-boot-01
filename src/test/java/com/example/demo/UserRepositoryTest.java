package com.example.demo.repository;

import com.example.demo.model.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    void testSaveAndFind() {
        User user = new User("Test", "test@example.com");

        repository.save(user);

        List<User> users = repository.findAll();

        assertThat(users).isNotEmpty();
        assertThat(users.get(0).getName()).isEqualTo("Test");
    }
}