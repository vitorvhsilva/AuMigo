package br.com.aumigo.users.application.core.usecase;

import br.com.aumigo.users.application.core.domain.User;
import br.com.aumigo.users.application.ports.in.PersistUserInputPort;
import br.com.aumigo.users.application.ports.out.GetAddressOutputPort;
import br.com.aumigo.users.application.ports.out.PersistUserOutputPort;

import java.time.LocalDate;

public class PersistUserUseCase implements PersistUserInputPort {

    private PersistUserOutputPort persistUser;
    private GetAddressOutputPort getAddress;

    public PersistUserUseCase(PersistUserOutputPort persistUser, GetAddressOutputPort getAddress) {
        this.persistUser = persistUser;
        this.getAddress = getAddress;
    }

    @Override
    public User persist(User user, String zipCode) {
        user.setAccountCreationDate(LocalDate.now());
        user.setDescription("");
        user.setAddress(getAddress.get(zipCode));
        return persistUser.persist(user);
    }
}
