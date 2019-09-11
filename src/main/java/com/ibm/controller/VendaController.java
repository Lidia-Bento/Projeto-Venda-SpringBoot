package com.ibm.controller;

import com.ibm.model.VendaEntity;
import com.ibm.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/venda")
public class VendaController {
    @Autowired
    VendaService vendaService;

    @GetMapping("/listar")
    public ResponseEntity<?> listall(){
        return new ResponseEntity<> (vendaService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/salvar")
    public ResponseEntity<?> save(@RequestBody VendaEntity vendaEntity){
        return new ResponseEntity<>(vendaService.save(vendaEntity), HttpStatus.OK);
    }

    @DeleteMapping(path="/id/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        vendaService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<?> update(@RequestBody VendaEntity vendaEntity){
        vendaService.save(vendaEntity);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
