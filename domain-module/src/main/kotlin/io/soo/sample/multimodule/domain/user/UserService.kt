package io.soo.sample.multimodule.domain.user

import org.springframework.stereotype.Service
import java.util.UUID

@Service
class UserService(
    private val userWriter: UserWriter,
    private val userReader: UserReader
) {
    fun add(name: String): Long {
        return userWriter.add(name)
    }

    fun read(id: UUID): User {
        return userReader.read(id)
    }
}