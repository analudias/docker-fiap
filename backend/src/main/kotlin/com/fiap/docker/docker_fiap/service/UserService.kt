package com.fiap.docker.docker_fiap.service

import com.fiap.docker.docker_fiap.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {

    fun findAllUsers() = userRepository.findAll()

}