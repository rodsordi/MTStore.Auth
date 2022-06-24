package br.com.mt.mts.auth.infra.listener;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AuditListenerTests {

    private AuthAuditListener auditoriaListener;

    @BeforeEach
    void beforeEach() {
        auditoriaListener = new AuthAuditListener();
    }

    @Test
    void listen() {
        auditoriaListener.listen();
    }

}