package com.ibm.service;

import com.ibm.model.VendaEntity;
import com.ibm.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaServiceImpl implements VendaService {
    @Autowired
    VendaRepository vendaRepository;
    @Override
    public VendaEntity findById(int id){return vendaRepository.findById(id);}
    @Override
    public List<VendaEntity> findAll(){return (List<VendaEntity>) vendaRepository.findAll();}
    @Override
    public VendaEntity save(VendaEntity vendas){return vendaRepository.save(vendas);}
    @Override
    public void deleteById(int id) {vendaRepository.deleteById(id);}
}
