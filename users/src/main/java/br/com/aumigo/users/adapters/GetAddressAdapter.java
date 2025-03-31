package br.com.aumigo.users.adapters;

import br.com.aumigo.users.adapters.out.client.GetAddressClient;
import br.com.aumigo.users.adapters.out.client.dto.AddressDTO;
import br.com.aumigo.users.application.core.domain.Address;
import br.com.aumigo.users.application.ports.out.GetAddressOutputPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GetAddressAdapter implements GetAddressOutputPort {
    private GetAddressClient client;

    @Override
    public Address get(String zipCode) {
        AddressDTO dto = client.find(zipCode);
        return new Address(dto.getCep(), dto.getLocalidade(), dto.getEstado(), dto.getBairro());
    }
}
