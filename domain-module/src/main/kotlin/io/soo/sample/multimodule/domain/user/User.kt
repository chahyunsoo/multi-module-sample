package io.soo.sample.multimodule.domain.user

import java.util.UUID

data class User(
    val id: UUID,
    val name: String
)