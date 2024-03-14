package org.example.service;

import org.example.dto.UserDto;

import java.util.List;

public interface UserService {

    public List<UserDto> findAll();

    public UserDto findById(Long userId);
    public UserDto save(UserDto userDto);
    public UserDto update(long id,UserDto userDto);
    public UserDto partialUpdate(long id,UserDto userDto);

    public void deleteById(Long userId);
}
