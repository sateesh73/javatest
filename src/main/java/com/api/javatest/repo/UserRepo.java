package com.api.javatest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.javatest.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
