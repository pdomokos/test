package com.example.test.domain.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDto {

    private Long id;
    private String name;
    private String email;

}
