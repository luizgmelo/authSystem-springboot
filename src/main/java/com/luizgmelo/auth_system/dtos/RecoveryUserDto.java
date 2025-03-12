package com.luizgmelo.auth_system.dtos;

import com.luizgmelo.auth_system.models.Role;

import java.util.List;

public record RecoveryUserDto(
        Long id,
        String email,
        List<Role> roles
) {
}
