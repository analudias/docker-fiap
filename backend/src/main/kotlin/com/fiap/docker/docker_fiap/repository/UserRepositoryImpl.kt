package com.fiap.docker.docker_fiap.repository

import com.fiap.docker.docker_fiap.entity.User
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
class UserRepositoryImpl(
    private val dbUserInterface: DBUserInterface
) : UserInterface {
    override fun save(user: User): User {
        return  dbUserInterface.save(user)
    }

    override fun findAll(): List<User> {
        return dbUserInterface.findAll()
    }

    override fun findById(id: Long): Optional<User?> {
        return dbUserInterface.findById(id)
    }

    override fun delete(user: User) {
        return dbUserInterface.delete(user)
    }
}