package com.example.security_stock.service;


import com.example.security_stock.dto.UserRequestDTO;
import com.example.security_stock.dto.UserResponseDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO createUser(UserRequestDTO request);
    UserResponseDTO getUserById(Integer id);
    List<UserResponseDTO> getAllUsers();
    void deleteUser(Integer id);
    UserResponseDTO assignRoleToUser(Integer userId, String roleName);
    UserResponseDTO updateUserStatus(Integer id, Boolean active);
}
