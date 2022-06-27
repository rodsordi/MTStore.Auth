package br.com.mt.mts.auth.infra.message;

import br.com.mt.mts.auth.domain.Token;
import br.com.mt.mts.auth.infra.kafka.KafkaDispatcher;
import br.com.mt.mts.auth.infra.kafka.Topic;

import java.util.Properties;

public class TokenGeneratorMessage extends KafkaDispatcher<Token> {

    public TokenGeneratorMessage(Properties properties) {
        super(properties, Topic.MTS_AUTH_TOKEN_GENERATION);
    }

    @Override
    protected String getChave(Token token) {
        return token.getJwt();
    }
}
