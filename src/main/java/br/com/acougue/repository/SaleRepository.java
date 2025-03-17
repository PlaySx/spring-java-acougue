package br.com.acougue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.acougue.model.Sale;
import br.com.acougue.model.SaleItem;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{

	 List<Sale> saveAll(List<Sale> sales);

	Sale save(Sale sale);

}
