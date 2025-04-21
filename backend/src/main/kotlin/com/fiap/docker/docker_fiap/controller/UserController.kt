package com.fiap.docker.docker_fiap.controller

import com.fiap.docker.docker_fiap.entity.User
import com.fiap.docker.docker_fiap.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun findAllUsers(): ResponseEntity<List<User>> = ResponseEntity.ok(userService.findAllUsers())

    @PostMapping
    fun createUser(@RequestBody user: User): ResponseEntity<User>{
        val savedUser = userService.createUser(user)
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser)
    }

    @PutMapping("/{id}")
    fun updateUserById(
        @PathVariable id: Long,
        @RequestBody updatedUser: User
    ): ResponseEntity<User> =
        userService.updateUser(id, updatedUser)
            ?.let { ResponseEntity.ok(it) }
            ?:ResponseEntity.notFound().build()

    @DeleteMapping("/{id}")
    fun deleteUserById(@PathVariable id: Long): ResponseEntity<Void> =
        userService.deleteById(id)
            ?.let { ResponseEntity.noContent().build() }
            ?: ResponseEntity.notFound().build()
}