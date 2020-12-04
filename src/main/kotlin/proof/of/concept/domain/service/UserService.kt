package proof.of.concept.domain.service

import proof.of.concept.domain.model.data.CreateUserData
import proof.of.concept.domain.model.entity.User
import proof.of.concept.infra.repository.UserRepository
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject

@ApplicationScoped
class UserService {

    @Inject
    private lateinit var userRepository: UserRepository

    fun createUser(data: CreateUserData) : User {
        TODO()
    }

}