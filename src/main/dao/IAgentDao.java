package main.dao;

import main.model.SecretAgent;

import java.util.List;

public interface IAgentDao {

    long addAgent(SecretAgent s);
    SecretAgent getAgent(long id);
    List<SecretAgent> getAllAgents();
}
