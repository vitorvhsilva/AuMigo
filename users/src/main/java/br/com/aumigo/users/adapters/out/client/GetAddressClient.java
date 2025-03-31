package br.com.aumigo.users.adapters.out.client;

import br.com.aumigo.users.adapters.out.client.dto.AddressDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "GetAddressClient",
        url = "${vitorhsilva.client.address.url}")
public interface GetAddressClient {
    @GetMapping("/{zipCode}/json")
    AddressDTO find(@PathVariable("zipCode") String zipCode);
}
