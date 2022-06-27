package br.com.mt.mts.auth.infra.message;

import br.com.mt.mts.auth.domain.Token;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

class TokenGeneratorMessageTests {

    private TokenGeneratorMessage geracaoTokenMessage;

    @BeforeEach
    void beforeEach() {
        geracaoTokenMessage = new TokenGeneratorMessage(new Properties());
    }

    @Test
    void enviar() throws ExecutionException, InterruptedException {
        var token = new Token();
        token.setJwt(UUID.randomUUID().toString());
        geracaoTokenMessage.enviar(token);
    }

}