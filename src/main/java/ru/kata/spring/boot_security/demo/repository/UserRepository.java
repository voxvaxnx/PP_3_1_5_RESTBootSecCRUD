package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.kata.spring.boot_security.demo.models.User;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query("SELECT u FROM User u JOIN FETCH u.roles WHERE u.eMail = :eMail")
    User getByeMail(String eMail);

    @Query("SELECT u FROM User u JOIN FETCH u.roles WHERE u.username = :username")
    User getByUsername(String username);
}
