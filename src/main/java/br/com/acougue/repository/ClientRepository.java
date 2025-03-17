package br.com.acougue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.acougue.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
