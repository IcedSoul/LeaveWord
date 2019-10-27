package com.leaveword.repository;

import com.leaveword.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author guoxiaofeng
 */
public interface UserRepository extends JpaRepository<User,Integer> {
    /**
     * Find user by name
     * @param userName name
     * @return query result
     */
    User findByUserName(String userName);
}
