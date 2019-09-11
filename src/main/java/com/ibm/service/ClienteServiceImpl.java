package com.ibm.service;

import com.ibm.model.ClienteEntity;
import com.ibm.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    ClienteRepository clienteRepository;
    @Override
    public ClienteEntity findById(int id){return clienteRepository.findById(id);}
    @Override
    public List<ClienteEntity> findAll(){return (List<ClienteEntity>) clienteRepository.findAll();}
    @Override
    public ClienteEntity save(ClienteEntity clientes){return clienteRepository.save(clientes);}
    @Override
    public void deleteById(int id){ clienteRepository.deleteById(id);}
}

