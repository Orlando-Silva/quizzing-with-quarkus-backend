package proof.of.concept.infra.repository

import io.quarkus.hibernate.orm.panache.PanacheRepository
import proof.of.concept.domain.model.entity.User
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class UserRepository : PanacheRepository<User> {


}