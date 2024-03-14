package org.example.repository;

import org.example.dto.UserDto;
import org.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    UserDto save(User savedUser, Class<UserDto> userDtoClass);
}
