package com.fiap.docker.docker_fiap

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DockerFiapApplication

fun main(args: Array<String>) {
	runApplication<DockerFiapApplication>(*args)
}
