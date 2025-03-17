package br.com.acougue.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.acougue.model.Sale;
import br.com.acougue.repository.SaleRepository;

@Service
public class SaleService {

    @Autowired
    private static SaleRepository saleRepository;

    public static List<Sale> listarTodas() {
        return saleRepository.findAll();
    }

    public Object buscarPorId(Long id) {
        return saleRepository.findById(id);
    }

    public Sale salvar(Sale sale) {
        return saleRepository.save(sale);
    }

    public void excluir(Long id) {
        saleRepository.deleteById(id);
    }
}

