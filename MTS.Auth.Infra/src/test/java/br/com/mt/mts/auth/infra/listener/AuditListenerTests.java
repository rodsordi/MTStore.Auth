package br.com.mt.mts.auth.infra.listener;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Properties;

class AuditListenerTests {

    private AuthAuditListener auditoriaListener;

    @BeforeEach
    void beforeEach() {
        auditoriaListener = new AuthAuditListener(new Properties());
    }

    @Test
    void listen() {
        auditoriaListener.listen();
    }

}