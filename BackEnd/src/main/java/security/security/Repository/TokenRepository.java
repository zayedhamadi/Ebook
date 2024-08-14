package security.security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import security.security.Entity.models.Token;

import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Long> {
    Optional<Token> findByToken(String token);
}


