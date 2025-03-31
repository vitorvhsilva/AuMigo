package br.com.aumigo.users.application.ports.out;

import br.com.aumigo.users.application.core.domain.User;

public interface PersistUserOutputPort {
    User persist(User user);
}
