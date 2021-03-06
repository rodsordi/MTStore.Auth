package br.com.mt.store.auth.infra.outputadapter;

import br.com.mt.store.auth.domain.outputport.MessengerOutputPort;
import br.com.mt.store.commons.infra.kafka.KafkaDispatcher;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;

@Slf4j
@RequiredArgsConstructor
public class MessengerOutputAdapter<T> implements MessengerOutputPort<T> {

    private final KafkaDispatcher<T> kafkaDispatcher;

    @Override
    public void enviarMensagem(T mensagem) {
        try (kafkaDispatcher) {
            kafkaDispatcher.enviar(mensagem);
        } catch (ExecutionException e) {
            log.error(e.getMessage(), e);
        } catch (InterruptedException e) {
            log.error(e.getMessage(), e);
        }
    }

}
