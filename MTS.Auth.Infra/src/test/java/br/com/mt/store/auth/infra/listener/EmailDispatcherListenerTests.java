package br.com.mt.store.auth.infra.listener;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Properties;

class EmailDispatcherListenerTests {

    private EmailDispatcherListener disparadorEmailListener;

    @BeforeEach
    void beforeEach() {
        disparadorEmailListener = new EmailDispatcherListener(new Properties());
    }

    @Test
    void listen() {
        disparadorEmailListener.listen();
    }

}