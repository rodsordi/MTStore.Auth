package br.com.mt.mts.auth.infra.listener;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AntiFraudListenerTests {

    private AntiFraudListener antiFraudeListener;

    @BeforeEach
    void beforeEach() {
        antiFraudeListener = new AntiFraudListener();
    }

    @Test
    void listen() {
        antiFraudeListener.listen();
    }

}