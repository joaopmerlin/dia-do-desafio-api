package com.example.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "monitoramento", path = "monitoramento")
public interface MonitoramentoData extends JpaRepository<Monitoramento, Long> {

    List<Monitoramento> findByUsuario(String usuario);
}
