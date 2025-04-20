package com.fiap.docker.docker_fiap.repository

import com.fiap.docker.docker_fiap.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
}