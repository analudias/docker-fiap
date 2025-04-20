package com.fiap.docker.docker_fiap.controller

import com.fiap.docker.docker_fiap.entity.User
import com.fiap.docker.docker_fiap.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun findAllUsers(): ResponseEntity<List<User>> = ResponseEntity.ok(userService.findAllUsers())
}