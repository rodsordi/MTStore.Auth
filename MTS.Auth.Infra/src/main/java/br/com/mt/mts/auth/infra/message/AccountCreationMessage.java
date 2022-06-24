package br.com.mt.mts.auth.infra.message;

import br.com.mt.mts.auth.domain.User;
import br.com.mt.mts.auth.infra.kafka.KafkaDispatcher;
import br.com.mt.mts.auth.infra.kafka.Topic;

public class AccountCreationMessage extends KafkaDispatcher<User> {

    public AccountCreationMessage() {
        super(Topic.MTS_AUTH_ACCOUNT_CREATION);
    }

    @Override
    protected String getChave(User user) {
        return String.valueOf(user.getId());
    }
}
