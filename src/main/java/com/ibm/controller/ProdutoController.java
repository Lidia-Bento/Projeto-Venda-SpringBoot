package com.ibm.controller;

import com.ibm.model.ProdutoEntity;
import com.ibm.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/produto")
public class ProdutoController {
    private final ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoService produtoService) { this.produtoService = produtoService; }

    @GetMapping("/listar")
    public ResponseEntity<?> listall(){
        return new ResponseEntity<> (produtoService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/salvar")
    public ResponseEntity<?> save(@RequestBody ProdutoEntity produtoEntity){
        return new ResponseEntity<>(produtoService.save(produtoEntity), HttpStatus.OK);
    }

    @DeleteMapping(path="/id/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        produtoService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<?> update(@RequestBody ProdutoEntity produtoEntity){
        produtoService.save(produtoEntity);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
