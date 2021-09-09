package com.simbirsoft.christmastoysstore.repository;

import com.simbirsoft.christmastoysstore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloWorldRepository extends JpaRepository<User, Long> {

}
