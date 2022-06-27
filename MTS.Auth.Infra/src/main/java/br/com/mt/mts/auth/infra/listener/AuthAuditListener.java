package br.com.mt.mts.auth.infra.listener;

import br.com.mt.mts.auth.infra.kafka.KafkaListener;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Map;
import java.util.Properties;
import java.util.regex.Pattern;

@Slf4j
public class AuthAuditListener extends KafkaListener<String> {

    public AuthAuditListener(Properties properties) {
        super(properties, Pattern.compile("MTS_AUTH_.*"));
    }

    @Override
    protected Class<String> getType() {
        return String.class;
    }

    @Override
    protected Properties overrideCommonsProperties() {
        Properties properties = new Properties();
        properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        return properties;
    }

}
