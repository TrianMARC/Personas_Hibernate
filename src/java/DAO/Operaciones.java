/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Persona;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author victo
 */
public class Operaciones {
    
    public Persona getPersona (Persona p, SessionFactory con){
       Session sess = con.openSession();
        Query q = sess.createQuery("FROM Persona WHERE nif = :nifV");
        q.setParameter("nifV", p.getNif());
        Persona persona = (Persona)q.uniqueResult();
        return persona;

    }    
}
