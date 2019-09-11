package com.ibm.service;

import com.ibm.model.ClienteEntity;
import com.ibm.model.VendaEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VendaService {
    VendaEntity findById(int id);
    List<VendaEntity> findAll();
    VendaEntity save(VendaEntity vendas);
    void deleteById(int id);
}
