package io.soo.sample.multimodule.storage.db.core

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
internal class UserEntity(
    @Column
    var name: String = "",
) : BaseEntity() {

    @Id
    val id: UUID = UUID.randomUUID()
}