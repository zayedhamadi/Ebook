package security.security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import security.security.Entity.models.User;

import java.util.Optional;

public interface userRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}
