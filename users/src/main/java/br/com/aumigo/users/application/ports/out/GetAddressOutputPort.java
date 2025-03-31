package br.com.aumigo.users.application.ports.out;

import br.com.aumigo.users.application.core.domain.Address;

public interface GetAddressOutputPort {
    Address get(String zipCode);
}
