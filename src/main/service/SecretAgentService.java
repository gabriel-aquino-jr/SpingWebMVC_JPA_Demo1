package main.service;

import main.dao.AgentDao_JPA;
import main.model.SecretAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecretAgentService {

    @Autowired
    private AgentDao_JPA aDao;

    public long addAgent(SecretAgent s) {
        long newId = aDao.addAgent(s);
        return newId;
    }

    public SecretAgent getAgent(long id) {
        return aDao.getAgent(id);
    }

    public List<SecretAgent> getAllAgents() {
        return aDao.getAllAgents();
    }
}
