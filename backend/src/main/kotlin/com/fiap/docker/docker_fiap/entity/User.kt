package com.fiap.docker.docker_fiap.entity

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "tb_user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String = "",
    val email: String = "",
    val birthDate: Date = Date(),
    val address: String = "",
)