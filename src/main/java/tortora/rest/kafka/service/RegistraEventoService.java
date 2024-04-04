package tortora.rest.kafka.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class RegistraEventoService {

    private final KafkaTemplate<Object, Object> template;

    public RegistraEventoService(KafkaTemplate<Object, Object> template) {
        this.template = template;
    }

    public <T> void adicionarEvento(String topic, T dados) {
        template.send(topic, dados);
    }

}
