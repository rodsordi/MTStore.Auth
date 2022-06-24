package br.com.mt.mts.auth.infra.listener;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailDispatcherListenerTests {

    private EmailDispatcherListener disparadorEmailListener;

    @BeforeEach
    void beforeEach() {
        disparadorEmailListener = new EmailDispatcherListener();
    }

    @Test
    void listen() {
        disparadorEmailListener.listen();
    }

}