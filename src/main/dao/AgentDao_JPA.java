package main.dao;

import main.model.SecretAgent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class AgentDao_JPA implements IAgentDao{

    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private EntityManager em;

    public AgentDao_JPA() {
        try{
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("SECRET AGENT CODE 1");

        em = emf.createEntityManager();
    }

    @Override
    public long addAgent(SecretAgent s) {
        em.getTransaction().begin();
        s = em.merge(s);
        em.getTransaction().commit();
        return s.getId();
    }

    @Override
    public SecretAgent getAgent(long searchId) {
        SecretAgent foundAgent = em.find(SecretAgent.class, searchId);

        return foundAgent;
    }

    @Override
    public List<SecretAgent> getAllAgents() {
        //jpql uses the name of the entity instead of the name of the table
        //jpql uses the entity alias instead of * to retrieve
        Query q = em.createQuery("SELECT a FROM SecretAgent a");
        List<SecretAgent> aList = q.getResultList();
        return aList;
    }
}
