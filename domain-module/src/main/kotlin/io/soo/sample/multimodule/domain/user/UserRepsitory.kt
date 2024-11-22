package io.soo.sample.multimodule.domain.user

import java.util.*

interface UserRepository {
    fun add(name: String): UUID
    fun read(id: UUID): User?
}