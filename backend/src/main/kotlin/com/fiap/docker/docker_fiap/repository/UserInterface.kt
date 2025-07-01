package com.fiap.docker.docker_fiap.repository

import com.fiap.docker.docker_fiap.entity.User
import java.util.Optional

interface UserInterface {
    fun save(user: User): User
    fun findAll(): List<User>
    fun findById(id: Long): Optional<User?>
    fun delete(user: User)
}