/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo2jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ColsutecR
 */
public class Ejemplo1JPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          EntityManagerFactory emfabrica1 = Persistence.createEntityManagerFactory("edu.co.sena_Ejemplo2JPA1");
          
            Employee emp = new Employee(1);
            emp.setName("Daniel");
            emp.setSalary(1530000);
            
            EntityManager em1 = emfabrica1.createEntityManager();
            em1.getTransaction().begin();
            em1.merge(emp);
            em1.getTransaction().commit();
            em1.close();
            emfabrica1.close();
    }
    
}
