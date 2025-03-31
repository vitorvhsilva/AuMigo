package br.com.aumigo.users.adapters.out.repository.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class AddressEntity {
    private String zipCode;
    private String city;
    private String state;
    private String neighborhood;
}
