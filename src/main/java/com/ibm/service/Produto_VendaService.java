package com.ibm.service;

import com.ibm.model.Produto_VendaEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Produto_VendaService {
    Produto_VendaEntity findById(int id);
    List<Produto_VendaEntity> findAll();
    Produto_VendaEntity save(Produto_VendaEntity nome);
    void deleteById(int id);
}
