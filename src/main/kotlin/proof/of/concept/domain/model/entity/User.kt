package proof.of.concept.domain.model.entity

import proof.of.concept.domain.model.UserStatus
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class User(
        @Id
    @GeneratedValue
    val id: Long,
        val name: String,
        val username: String,
        val email: String,
        val password: String,
        val status: UserStatus,
        val createdAt: LocalDate,
        val updatedAt: LocalDate?
)