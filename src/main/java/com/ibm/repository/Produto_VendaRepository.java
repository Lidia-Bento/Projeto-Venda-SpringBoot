package com.ibm.repository;

import com.ibm.model.Produto_VendaEntity;
import com.ibm.model.VendaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Produto_VendaRepository extends CrudRepository<Produto_VendaEntity, Long> {
    Produto_VendaEntity findById(int id);
    List<Produto_VendaEntity> findAll();
    Produto_VendaEntity save(Produto_VendaEntity vendas);
    void deleteById(int id);
}
