package com.fiap.docker.docker_fiap.service

import com.fiap.docker.docker_fiap.entity.User
import com.fiap.docker.docker_fiap.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {

    fun findAllUsers() = userRepository.findAll()

    fun createUser(user: User) = userRepository.save(user)

    fun updateUser(id: Long, updatedUser: User): User? {
        return userRepository.findById(id).orElse(null)
            ?.let { existingUser ->
                val userToUpdate = existingUser.copy(
                    name = updatedUser.name,
                    email = updatedUser.email,
                    birthDate = updatedUser.birthDate,
                    address = updatedUser.address
                )
                userRepository.save(userToUpdate)
            }
    }

    fun deleteById(id: Long): User? {
        return userRepository.findById(id).orElse(null)
            ?.let { user ->
                userRepository.delete(user)
                user
            }
    }



}