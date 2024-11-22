package io.soo.sample.multimodule.controller

import io.soo.sample.multimodule.domain.user.User

data class UserResponse(
    val name: String
) {
    constructor(user: User) : this(user.name)
}