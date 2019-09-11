package com.ibm.controller;

import com.ibm.model.Produto_VendaEntity;
import com.ibm.service.Produto_VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value ="/produto_venda")
public class Produto_VendaController {
    @Autowired
    Produto_VendaService produto_vendaService;

    @GetMapping("/listar")
    public ResponseEntity<?> listall(){
        return new ResponseEntity<> (produto_vendaService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/salvar")
    public ResponseEntity<?> save(@RequestBody Produto_VendaEntity produto_vendaEntity){
        return new ResponseEntity<>(produto_vendaService.save(produto_vendaEntity), HttpStatus.OK);
    }

    @DeleteMapping(path="/id/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        produto_vendaService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<?> update(@RequestBody Produto_VendaEntity produto_vendaEntity){
        produto_vendaService.save(produto_vendaEntity);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
