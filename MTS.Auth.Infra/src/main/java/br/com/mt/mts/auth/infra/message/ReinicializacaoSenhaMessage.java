package br.com.mt.mts.auth.infra.message;

import br.com.mt.mts.auth.domain.User;
import br.com.mt.mts.auth.infra.kafka.KafkaDispatcher;
import br.com.mt.mts.auth.infra.kafka.Topic;

import java.util.Properties;

public class ReinicializacaoSenhaMessage extends KafkaDispatcher<User> {

    public ReinicializacaoSenhaMessage(Properties properties) {
        super(properties, Topic.MTS_AUTH_PASS_REINITIALIZATION);
    }

    @Override
    protected String getChave(User user) {
        return String.valueOf(user.getId());
    }
}
