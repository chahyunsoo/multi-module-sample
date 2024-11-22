package io.soo.sample.multimodule.storage.db.core

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
class UserEntity(
    @Id
    val id: UUID = UUID.randomUUID(),

    @Column
    var name: String = "",

    @Column
    var age: Long = 0L
) : BaseEntity() {

}