package br.com.mt.mts.auth.infra.listener;

import br.com.mt.mts.auth.domain.User;
import br.com.mt.mts.auth.infra.kafka.KafkaListener;
import br.com.mt.mts.auth.infra.kafka.Topic;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailDispatcherListener extends KafkaListener<User> {

    public EmailDispatcherListener() {
        super(Topic.MTS_AUTH_PASS_REINITIALIZATION);
    }

    @Override
    protected Class<User> getType() {
        return User.class;
    }

}
