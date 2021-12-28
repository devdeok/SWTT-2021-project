package com.foss.project.repository;

import com.foss.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Long>{

    @Query(value = "SELECT user_name FROM `user` WHERE user_id=:user_id", nativeQuery = true)
    String 사용자이름조회(@Param("user_id") long user_id);

}
