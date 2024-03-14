package org.example.service;

import org.example.dto.UserDto;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.modelmapper.ModelMapper;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository,ModelMapper modelMapper) {
        this.userRepository=userRepository;
        this.modelMapper=modelMapper;
    }

    @Override
    public List<UserDto> findAll() {
        return null;
    }

    @Override
    public UserDto findById(Long userId) {
        return null;
    }

    @Override
    public UserDto save(UserDto userDto) {
        User user=modelMapper.map(userDto,User.class);
        User savedUser =userRepository.save(user);
        UserDto savedUserDto=userRepository.save(savedUser,UserDto.class);
        return  savedUserDto;
    }

    @Override
    public UserDto update(long id, UserDto userDto) {
        return null;
    }

    @Override
    public UserDto partialUpdate(long id, UserDto userDto) {
        return null;
    }

    @Override
    public void deleteById(Long userId) {

    }
}
