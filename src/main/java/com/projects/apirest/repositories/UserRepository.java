package com.projects.apirest.repositories;

import com.projects.apirest.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
