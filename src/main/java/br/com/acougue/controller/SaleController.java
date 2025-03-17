package br.com.acougue.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acougue.model.Sale;
import br.com.acougue.model.SaleItem;
import br.com.acougue.service.SaleService;

@RestController
@RequestMapping("/vendas")
public class SaleController {

    private final SaleService saleService;

    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @GetMapping
    public List<Sale> listarTodas() {
        return saleService.listarTodas();
    }

    @GetMapping("/{id}")
    public Optional<Sale> buscarPorId(@PathVariable Long id) {
        return (Optional<Sale>) saleService.buscarPorId(id);
    }

    @PostMapping
    public Sale salvar(@RequestBody Sale sale) {
        return saleService.salvar(sale);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        if (((Optional<Sale>) saleService.buscarPorId(id)).isPresent()) {
            saleService.excluir(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
