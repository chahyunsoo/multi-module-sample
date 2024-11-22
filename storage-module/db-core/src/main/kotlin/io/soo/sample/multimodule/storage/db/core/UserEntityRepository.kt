package io.soo.sample.multimodule.storage.db.core

import io.soo.sample.multimodule.domain.user.User
import io.soo.sample.multimodule.domain.user.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
internal class UserEntityRepository(
    private val userJpaRepository: UserJpaRepository
) : UserRepository {
    override fun add(name: String): UUID {
        return userJpaRepository.save(
            UserEntity(name = name)
        ).id!!
    }

    override fun read(id: UUID): User? {
        return userJpaRepository.findByIdOrNull(id)?.let {
            User(
                id = it.id!!,
                name = it.name
            )
        }
    }
}