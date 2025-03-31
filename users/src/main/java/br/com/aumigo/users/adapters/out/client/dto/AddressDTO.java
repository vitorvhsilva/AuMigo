package br.com.aumigo.users.adapters.out.client.dto;

import lombok.Data;

@Data
public class AddressDTO {
    private String cep;
    private String bairro;
    private String localidade;
    private String estado;
}
