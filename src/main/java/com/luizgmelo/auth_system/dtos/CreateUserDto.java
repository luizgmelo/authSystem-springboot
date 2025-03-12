package com.luizgmelo.auth_system.dtos;

import com.luizgmelo.auth_system.models.RoleName;

public record CreateUserDto(
        String email,
        String password,
        RoleName role
) {
}
