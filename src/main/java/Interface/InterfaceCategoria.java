/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.Categoria;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ALEXIS
 */
public interface InterfaceCategoria extends CrudRepository<Categoria, Integer> {
    
}
