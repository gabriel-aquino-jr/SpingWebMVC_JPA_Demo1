package main;

import main.dao.AgentDao_JPA;
import main.model.SecretAgent;
import net.bytebuddy.dynamic.ClassFileLocator;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("GET SMART SIMULATOR ..");

        SecretAgent a1 = new SecretAgent("Mike Fresno", "Alpine Skiing");
        SecretAgent a2 = new SecretAgent("Little Cheese", "Power lifting");
        System.out.println("adding 2 agents ...");

        AgentDao_JPA aDao = new AgentDao_JPA();
        aDao.addAgent(a1);
        aDao.addAgent(a2);


        System.out.println("added 2 agents...");
    }
}
