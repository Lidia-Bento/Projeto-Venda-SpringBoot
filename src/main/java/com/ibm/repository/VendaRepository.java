package com.ibm.repository;

import com.ibm.model.Produto_VendaEntity;
import com.ibm.model.VendaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendaRepository extends CrudRepository<VendaEntity, Long > {
        VendaEntity findById(int id);
        List<VendaEntity> findAll();
        VendaEntity save(VendaEntity vendas);
        void deleteById(int id);
}
