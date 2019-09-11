package com.ibm.service;

import com.ibm.model.Produto_VendaEntity;
import com.ibm.repository.Produto_VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Produto_VendaServiceImpl implements Produto_VendaService {
    @Autowired
    Produto_VendaRepository produto_vendaRepository;
    @Override
    public Produto_VendaEntity findById(int id){return produto_vendaRepository.findById(id);}
    @Override
    public List<Produto_VendaEntity> findAll(){return (List<Produto_VendaEntity>) produto_vendaRepository.findAll();}
    @Override
    public Produto_VendaEntity save(Produto_VendaEntity produtos){return produto_vendaRepository.save(produtos);}
    @Override
    public void deleteById(int id){produto_vendaRepository.deleteById(id);}
}
