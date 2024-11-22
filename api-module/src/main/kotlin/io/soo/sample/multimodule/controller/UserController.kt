package io.soo.sample.multimodule.controller

import io.soo.sample.multimodule.domain.user.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
class UserController(
    private val userService: UserService
) {
    @PostMapping("v1/users")
    fun addUser(
        @RequestBody request: UserRequest
    ): NewUserResponse {
        return NewUserResponse(userService.add(request.name))
    }

    @GetMapping("v1/users/{userId}")
    fun findUser(
        @PathVariable userId: UUID
    ): UserResponse {
        return UserResponse(userService.read(userId))
    }
}