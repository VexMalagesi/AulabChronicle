package it.aulab.aulab_chronicle.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    @NotEmpty(message = "Il nome non deve essere vuoto")
    private String firstName;
    @NotEmpty(message = "Il cognome non deve essere vuoto")
    private String lastName;
    @NotEmpty(message = "L'email non deve essere vuota")
    @Email
    private String email;
    @NotEmpty(message = "La password non deve essere vuota")
    private String password;
}
