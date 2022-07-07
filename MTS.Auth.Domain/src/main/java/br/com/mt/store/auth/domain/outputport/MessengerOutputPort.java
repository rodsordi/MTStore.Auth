package br.com.mt.store.auth.domain.outputport;

public interface MessengerOutputPort<T> {

    void enviarMensagem(T t);

}
