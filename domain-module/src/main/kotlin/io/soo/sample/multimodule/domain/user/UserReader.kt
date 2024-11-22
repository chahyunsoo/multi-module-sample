package io.soo.sample.multimodule.domain.user

import org.springframework.stereotype.Component
import java.util.*
import kotlin.NoSuchElementException

@Component
class UserReader(
    private val userRepository: UserRepository
) {
    fun read(id: UUID): User{
        return userRepository.read(id) ?: throw NoSuchElementException()
    }

}