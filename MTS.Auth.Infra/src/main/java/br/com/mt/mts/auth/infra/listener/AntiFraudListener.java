package br.com.mt.mts.auth.infra.listener;

import br.com.mt.mts.auth.domain.Token;
import br.com.mt.mts.auth.infra.kafka.KafkaListener;
import br.com.mt.mts.auth.infra.kafka.Topic;

import java.util.Properties;

public class AntiFraudListener extends KafkaListener<Token> {

    public AntiFraudListener(Properties properties) {
        super(properties, Topic.MTS_AUTH_TOKEN_GENERATION);
    }

    @Override
    protected Class<Token> getType() {
        return Token.class;
    }
}
