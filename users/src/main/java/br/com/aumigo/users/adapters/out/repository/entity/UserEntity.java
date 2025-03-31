package br.com.aumigo.users.adapters.out.repository.entity;

import br.com.aumigo.users.application.core.domain.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserEntity {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String username;
    private String description;
    @Column(unique = true)
    private String email;
    private String password;
    private LocalDate birthDate;
    private LocalDate accountCreationDate;
    @Embedded
    private AddressEntity address;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
}
