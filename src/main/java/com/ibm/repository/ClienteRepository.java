package com.ibm.repository;

import com.ibm.model.ClienteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository  extends CrudRepository<ClienteEntity, Long>{
    ClienteEntity findById(int id);
    List<ClienteEntity> findAll();
    ClienteEntity save(ClienteEntity clientes);
    void deleteById(int id);
}
