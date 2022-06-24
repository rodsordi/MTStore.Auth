package br.com.mt.mts.auth.infra.listener;

import br.com.mt.mts.auth.infra.kafka.KafkaListener;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Map;
import java.util.regex.Pattern;

@Slf4j
public class AuthAuditListener extends KafkaListener<String> {

    public AuthAuditListener() {
        super(Pattern.compile("MTS_AUTH_.*"));
    }

    @Override
    protected Class<String> getType() {
        return String.class;
    }

    @Override
    protected Map<String, String> overrideProperties() {
        return Map.of(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
    }

}
