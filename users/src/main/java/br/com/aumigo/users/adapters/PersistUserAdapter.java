package br.com.aumigo.users.adapters;

import br.com.aumigo.users.adapters.out.repository.UserRepository;
import br.com.aumigo.users.adapters.out.repository.entity.UserEntity;
import br.com.aumigo.users.application.core.domain.Address;
import br.com.aumigo.users.application.core.domain.User;
import br.com.aumigo.users.application.ports.out.PersistUserOutputPort;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class PersistUserAdapter implements PersistUserOutputPort {
    private UserRepository userRepository;
    private ModelMapper modelMapper;

    @Override
    public User persist(User user) {
        UserEntity entity = modelMapper.map(user, UserEntity.class);
        entity = userRepository.save(entity);
        User persistedUser = modelMapper.map(entity, User.class);
        user.setAddress(modelMapper.map(entity.getAddress(), Address.class));
        return persistedUser;
    }
}
