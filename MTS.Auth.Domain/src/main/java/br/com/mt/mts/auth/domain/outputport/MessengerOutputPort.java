package br.com.mt.mts.auth.domain.outputport;

public interface MessengerOutputPort<T> {

    void enviarMensagem(T t);

}
