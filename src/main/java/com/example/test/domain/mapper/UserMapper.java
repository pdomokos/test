package com.example.test.domain.mapper;

import com.example.test.domain.dto.UserDto;
import com.example.test.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto userDTO);

}
