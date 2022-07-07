package br.com.mt.store.auth.infra.message;

import br.com.mt.store.auth.domain.User;
import br.com.mt.store.commons.infra.kafka.KafkaDispatcher;
import br.com.mt.store.commons.infra.kafka.Topic;

import java.util.Properties;

public class AccountCreationMessage extends KafkaDispatcher<User> {

    public AccountCreationMessage(Properties properties) {
        super(properties, Topic.MTS_AUTH_ACCOUNT_CREATION);
    }

    @Override
    protected String getChave(User user) {
        return String.valueOf(user.getId());
    }
}
