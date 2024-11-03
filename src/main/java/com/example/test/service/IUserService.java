package com.example.test.service;

import com.example.test.domain.dto.UserDto;

import java.util.List;

public interface IUserService {

    List<UserDto> getAllUsers();

    UserDto getUserById(Long id);

    UserDto createUser(UserDto userDTO);

    UserDto updateUser(Long id, UserDto userDto);

    void deleteUser(Long id);
}
