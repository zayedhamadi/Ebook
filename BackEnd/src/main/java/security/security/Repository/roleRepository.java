package security.security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import security.security.Entity.models.Role;

import java.util.Optional;

public interface roleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
