package com.evg_ws.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
// ���� ��� , ���� �������� ��� tomcat
@WebListener
public class LocalEntityManagerFactory implements ServletContextListener{
    private static EntityManagerFactory emf;
    @Override
    public void contextInitialized(ServletContextEvent event) {
        emf = Persistence.createEntityManagerFactory("WebApplication1PU");
    }
    @Override
    public void contextDestroyed(ServletContextEvent event) {
        emf.close();
    }
    public static EntityManager createEntityManager() {
        if (emf == null) {
            throw new IllegalStateException("Context is not initialized yet.");
        }
        return emf.createEntityManager();
    }
}