package br.com.aumigo.users.adapters.in.controller.dto;

import br.com.aumigo.users.application.core.domain.Address;
import br.com.aumigo.users.application.core.domain.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateUserOutputDTO {
    private String userId;
    private String firstName;
    private String lastName;
    private String username;
    private String description;
    private String email;
    private String password;
    private LocalDate birthDate;
    private LocalDate accountCreationDate;
    private Gender gender;
    private Address address;
}
