package br.com.mt.mts.auth.infra.message;

import br.com.mt.mts.auth.domain.User;
import br.com.mt.mts.auth.infra.kafka.KafkaDispatcher;
import br.com.mt.mts.auth.infra.kafka.Topic;

import java.util.Properties;

public class AuthMessage extends KafkaDispatcher<User> {

    public AuthMessage(Properties properties) {
        super(properties, Topic.MTS_AUTH_USER_AUTHENTICATION);
    }

    @Override
    protected String getChave(User user) {
        return String.valueOf(user.getId());
    }
}
