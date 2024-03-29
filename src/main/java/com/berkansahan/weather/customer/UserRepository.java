package com.berkansahan.weather.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author berkansahan
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}
