package br.com.mt.store.auth.infra.listener;

import br.com.mt.store.auth.domain.User;
import br.com.mt.store.commons.infra.kafka.KafkaListener;
import br.com.mt.store.commons.infra.kafka.Topic;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

@Slf4j
public class EmailDispatcherListener extends KafkaListener<User> {

    public EmailDispatcherListener(Properties properties) {
        super(properties, Topic.MTS_AUTH_PASS_REINITIALIZATION);
    }

    @Override
    protected Class<User> getType() {
        return User.class;
    }

}
