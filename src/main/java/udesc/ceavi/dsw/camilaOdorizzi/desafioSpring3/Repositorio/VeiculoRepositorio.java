/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udesc.ceavi.dsw.camilaOdorizzi.desafioSpring3.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import udesc.ceavi.dsw.camilaOdorizzi.desafioSpring3.models.Veiculo;

/**
 *
 * @author CamilaOdorizzi
 */
@Repository
public interface VeiculoRepositorio extends JpaRepository<Veiculo, Long> {
    

   

}