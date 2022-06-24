package br.com.mt.mts.auth.domain.service;

import br.com.mt.mts.auth.domain.User;
import br.com.mt.mts.auth.domain.outputport.MessengerOutputPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class AuditService {
    private final MessengerOutputPort messengerOutputPort;

    public void enviarMensagemDeUsuarioAutenticado(User dto) {
        messengerOutputPort.enviarMensagem(dto);
    }

}
