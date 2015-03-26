/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicioentidades.app;

import edu.co.sena.ejercicioentidades.arbol.Arbol;
import edu.co.sena.ejercicioentidades.carro.Carro;
import edu.co.sena.ejercicioentidades.computador.Computador;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ColsutecR
 */
public class JpaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emfabrica1 = Persistence.createEntityManagerFactory("edu.co.sena_PrimerPersistence");
        Carro car1 = new Carro();
        car1.setId("ACD123");
        car1.setModelo("2014");
        car1.setMarca("Audi");
        car1.setColor("Azul");
        car1.setPuesto(4);

        EntityManager em1 = emfabrica1.createEntityManager();
        em1.getTransaction().begin();
        em1.merge(car1);
        em1.getTransaction().commit();
        em1.close();
        emfabrica1.close();
//        
        //Computadora
        EntityManagerFactory emfabrica2 = Persistence.createEntityManagerFactory("edu.co.sena_TerceraPersistence");
        Computador pc1 = new Computador();
        pc1.setReferencia("Z200");
        pc1.setMarca("Lenovo");
        pc1.setProcesador("ItelCore3");
        pc1.setDiscoduro("1000gb");
        pc1.setColor("Azul");
        pc1.setMonitor("LCD");
        
        EntityManager em2 = emfabrica2.createEntityManager();
        em2.getTransaction().begin();
        em2.merge(pc1);
        em2.getTransaction().commit();
        em2.close();
        emfabrica2.close();

        //Arbol
        EntityManagerFactory emfabrica3 = Persistence.createEntityManagerFactory("edu.co.sena_SegundaPersistence");
        Arbol arbolito1 = new Arbol();
        arbolito1.setReferencia("EA123");
        arbolito1.setNombre("Arbol Manzano");
        arbolito1.setFruto("Manzana");
        arbolito1.setDiamentro(100);
        arbolito1.setEdad(70);
        arbolito1.setAltura(150);
        
        EntityManager em3 = emfabrica3.createEntityManager();
        em3.getTransaction().begin();
        em3.merge(arbolito1);
        em3.getTransaction().commit();
        em3.close();
        emfabrica3.close();
        
    }
    
}
