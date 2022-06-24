package br.com.mt.mts.auth.infra.message;

import br.com.mt.mts.auth.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.concurrent.ExecutionException;

class AuthMessageTests {

    private AuthMessage auditoriaKafka;

    @BeforeEach
    void beforeEach() {
        auditoriaKafka = new AuthMessage();
    }

    @Test
    void enviarMensagem() throws ExecutionException, InterruptedException {
        User dto = new User();
        dto.setId(new Random().nextLong());
        dto.setNickname("Ratou");
        dto.setPassword("123456");
        dto.setName("Rodrigo");
        dto.setEmail("rodsordi@gmail.com");
        auditoriaKafka.enviar(dto);
    }

}