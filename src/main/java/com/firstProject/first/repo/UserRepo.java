package com.firstProject.first.repo;

import com.firstProject.first.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * FROM USER WHERE ID = ?1",nativeQuery = true)          // @Query annotation takes precedence over named queries
    User getUserByUserID(String userId);
    @Query(value = "SELECT * FROM USER WHERE ID = ?1 AND ADDRESS = ?2", nativeQuery = true)
    User getUserByUserIDAndAddress(String userId, String address);
}
