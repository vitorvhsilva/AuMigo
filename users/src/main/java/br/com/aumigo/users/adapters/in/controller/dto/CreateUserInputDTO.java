package br.com.aumigo.users.adapters.in.controller.dto;

import br.com.aumigo.users.application.core.domain.Gender;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateUserInputDTO {
    @NotBlank @Size(min = 3)
    private String firstName;
    @NotBlank @Size(min = 3)
    private String lastName;
    @NotBlank @Size(min = 3)
    private String username;
    @Email
    private String email;
    @NotBlank @Size(min = 8)
    private String password;
    @NotNull @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;
    @NotNull
    private Gender gender;
    @NotBlank
    private String zipCode;
}
