/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.seguranca;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jose
 */
@Stateless
public class LoginRepository {
    @PersistenceContext(unitName = "ifpb_seguranca_PU")
    private EntityManager manager;
    public void salvar(UserLogin login){
        manager.persist(login);
    }
    
}
