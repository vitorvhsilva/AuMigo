package br.com.aumigo.users.adapters.in.controller;

import br.com.aumigo.users.adapters.in.controller.dto.CreateUserInputDTO;
import br.com.aumigo.users.adapters.in.controller.dto.CreateUserOutputDTO;
import br.com.aumigo.users.application.core.domain.User;
import br.com.aumigo.users.application.ports.in.PersistUserInputPort;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
@AllArgsConstructor
public class UserController {
    private ModelMapper modelMapper;
    private PersistUserInputPort persistUser;

    @PostMapping
    public ResponseEntity<CreateUserOutputDTO> persistUser(@RequestBody @Valid CreateUserInputDTO dto){
        User user = modelMapper.map(dto, User.class);
        User persistedUser = persistUser.persist(user, dto.getZipCode());
        return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(persistedUser, CreateUserOutputDTO.class));
    }
}
