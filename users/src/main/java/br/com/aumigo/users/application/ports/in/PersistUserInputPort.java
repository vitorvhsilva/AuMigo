package br.com.aumigo.users.application.ports.in;

import br.com.aumigo.users.application.core.domain.User;

public interface PersistUserInputPort {
    User persist(User user, String zipCode);
}
