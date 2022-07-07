package br.com.mt.store.auth.infra.listener;

import br.com.mt.store.auth.domain.User;
import br.com.mt.store.commons.infra.kafka.KafkaListener;
import br.com.mt.store.commons.infra.kafka.Topic;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Properties;

class AuthListenerTests {

    private AuthListener authListener;

    @BeforeEach
    void beforeEach() {
        authListener = new AuthListener(properties());
    }

    @Test
    void listen() {
        authListener.listen();
    }

    private Properties properties() {
        Properties properties = new Properties();
        properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:30200");
        return properties;
    }

}

class AuthListener extends KafkaListener<User> {

    public AuthListener(Properties properties) {
        super(properties, Topic.MTS_AUTH_USER_AUTHENTICATION);
    }

    @Override
    protected Class<User> getType() {
        return User.class;
    }

}