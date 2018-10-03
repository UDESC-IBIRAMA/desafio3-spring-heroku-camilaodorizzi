/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udesc.ceavi.dsw.camilaOdorizzi.desafioSpring3.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import udesc.ceavi.dsw.camilaOdorizzi.desafioSpring3.Repositorio.VeiculoRepositorio;
import udesc.ceavi.dsw.camilaOdorizzi.desafioSpring3.models.Veiculo;

/**
 *
 * @author CamilaOdorizzi
 */
@RestController
@RequestMapping("/veiculos")
public class VeiculoResources {
    
    @Autowired
    private VeiculoRepositorio vl;
    
    @GetMapping(value = "/teste", produces = "application/json")
    public @ResponseBody
    Veiculo testeVeiculo() {
        return new Veiculo(1L, "FORD","FORD","FORD","FORD","FORD","FORD");
    }
    @GetMapping(value = "/{id}") public ResponseEntity<Veiculo> buscarPorId(@PathVariable Long id) { 
		 Veiculo contato = vl.getOne(id); 
		 if(contato == null) { 
		 	return ResponseEntity.notFound().build(); 
		 } 
		 return ResponseEntity.ok(contato); 
	 }
     @PostMapping(value = "/adiciona")
    public Veiculo cadastraVeiculo(@RequestBody @Valid Veiculo oVeiculo) {
        return vl.save(oVeiculo);
    }
}
