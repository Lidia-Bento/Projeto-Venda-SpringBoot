package com.ibm.service;

import com.ibm.model.ProdutoEntity;
import com.ibm.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService{

    @Autowired
    ProdutoRepository produtoRepository;
    @Override
    public ProdutoEntity findById(int id){return produtoRepository.findById(id);}
    @Override
    public List<ProdutoEntity> findAll(){return (List<ProdutoEntity>) produtoRepository.findAll();}
    @Override
    public ProdutoEntity save(ProdutoEntity produtos){return produtoRepository.save(produtos);}
    @Override
    public void deleteById(int id){produtoRepository.deleteById(id);}
}
