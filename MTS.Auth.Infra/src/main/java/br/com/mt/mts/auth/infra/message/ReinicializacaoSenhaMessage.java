package br.com.mt.mts.auth.infra.message;

import br.com.mt.mts.auth.domain.User;
import br.com.mt.mts.auth.infra.kafka.KafkaDispatcher;
import br.com.mt.mts.auth.infra.kafka.Topic;

public class ReinicializacaoSenhaMessage extends KafkaDispatcher<User> {

    public ReinicializacaoSenhaMessage() {
        super(Topic.MTS_AUTH_PASS_REINITIALIZATION);
    }

    @Override
    protected String getChave(User user) {
        return String.valueOf(user.getId());
    }
}
