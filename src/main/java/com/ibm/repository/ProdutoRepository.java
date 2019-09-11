package com.ibm.repository;

import com.ibm.model.ProdutoEntity;
import com.ibm.model.Produto_VendaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends CrudRepository<ProdutoEntity, Long> {
    ProdutoEntity findById(int id);
    List<ProdutoEntity> findAll();
    ProdutoEntity save(ProdutoEntity produto);
    void deleteById(int id);
}
