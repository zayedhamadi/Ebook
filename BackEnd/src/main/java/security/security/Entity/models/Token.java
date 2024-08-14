package security.security.Entity.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "_token")
@Entity
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String token;
    private LocalDateTime expiresAt,validatedAt,createdAt;

    @ManyToOne
    @JoinColumn(name = "userId",nullable = false)
    private User user;
}
