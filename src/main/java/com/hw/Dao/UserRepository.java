package com.hw.Dao;

import com.hw.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/**
 * Created by pandehua on 2017/6/27.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    User findFirstByUsername(String username);
}
