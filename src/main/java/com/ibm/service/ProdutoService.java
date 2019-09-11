package com.ibm.service;

import com.ibm.model.ProdutoEntity;
import com.ibm.model.VendaEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProdutoService {
    ProdutoEntity findById(int id);
    List<ProdutoEntity> findAll();
    ProdutoEntity save(ProdutoEntity produtos);
    void deleteById(int id);
}
