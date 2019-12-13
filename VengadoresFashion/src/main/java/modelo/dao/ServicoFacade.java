/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.entidad.Servico;

/**
 *
 * @author PC06
 */
@Stateless
public class ServicoFacade extends AbstractFacade<Servico> {

    @PersistenceContext(unitName = "VengadoresFashion")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ServicoFacade() {
        super(Servico.class);
    }
    
}