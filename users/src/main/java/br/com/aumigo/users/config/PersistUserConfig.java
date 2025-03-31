package br.com.aumigo.users.config;

import br.com.aumigo.users.application.core.usecase.PersistUserUseCase;
import br.com.aumigo.users.application.ports.out.GetAddressOutputPort;
import br.com.aumigo.users.application.ports.out.PersistUserOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistUserConfig {
    @Bean
    public PersistUserUseCase persistUserUseCase(
            PersistUserOutputPort persistUserOutputPort,
            GetAddressOutputPort getAddressOutputPort
    ) {
        return new PersistUserUseCase(persistUserOutputPort, getAddressOutputPort);
    }
}
