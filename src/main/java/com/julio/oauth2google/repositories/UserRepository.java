package com.julio.oauth2google.repositories;

import com.julio.oauth2google.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
