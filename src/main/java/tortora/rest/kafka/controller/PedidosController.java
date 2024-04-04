package tortora.rest.kafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tortora.rest.kafka.data.PedidoData;
import tortora.rest.kafka.service.RegistraEventoService;

@RestController
public class PedidosController {

    private final RegistraEventoService service;

    public PedidosController(RegistraEventoService service) {
        this.service = service;
    }

    @PostMapping("/api/salvar-pedido")
    public ResponseEntity<String> salvarPedido(@RequestBody PedidoData pedidoData) {

        service.adicionarEvento("SalvarPedido", pedidoData);

        return ResponseEntity.ok("Sucesso");

    }

}
