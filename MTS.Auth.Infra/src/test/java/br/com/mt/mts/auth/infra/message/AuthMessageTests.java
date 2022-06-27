package br.com.mt.mts.auth.infra.message;

import br.com.mt.mts.auth.domain.User;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Properties;
import java.util.Random;
import java.util.concurrent.ExecutionException;

class AuthMessageTests {

    private AuthMessage auditoriaKafka;

    @BeforeEach
    void beforeEach() {
        auditoriaKafka = new AuthMessage(properties());
    }

    @Test
    void enviarMensagem() throws ExecutionException, InterruptedException {
        User dto = new User();
        dto.setId(3l);
        dto.setNickname("Ratou");
        dto.setPassword("123456");
        dto.setName("Rodrigo");
        dto.setEmail("rodsordi@gmail.com");
        auditoriaKafka.enviar(dto);
    }

    private Properties properties() {
        Properties properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:30200");
        properties.setProperty(ProducerConfig.REQUEST_TIMEOUT_MS_CONFIG, "10000");
        properties.setProperty(ProducerConfig.DELIVERY_TIMEOUT_MS_CONFIG, "10000");
        properties.setProperty(ProducerConfig.TRANSACTION_TIMEOUT_CONFIG, "10000");
        properties.setProperty(ProducerConfig.TRANSACTION_TIMEOUT_DOC, "10000");
        return properties;
    }

}