/*
 �� ���� ����� � ����� ������ �������
    � ����� ������������ ������������ ��������� ������ 1, 2, 3�
 */
package com.evg_ws.jpa;

import javax.persistence.EntityManager;

public class ModelsDAO {
    
    
    public Models getById(Integer id_rec) throws Exception {
        EntityManager em = LocalEntityManagerFactory.createEntityManager();
        try {
            Models model =  (Models) em.createNamedQuery("Models.findById").setParameter("id",id_rec).getSingleResult();
            return model;
        }
        finally {
            em.close();
        }
        
    }    
}
