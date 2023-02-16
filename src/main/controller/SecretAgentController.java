package main.controller;


import main.dao.AgentDao_JPA;
import main.model.SecretAgent;
import main.service.SecretAgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SecretAgentController {

    @Autowired
    private SecretAgentService sas;

    @RequestMapping(value="/login")
    public String showLogin(Model model) {
        model.addAttribute("agent", new SecretAgent());
        return "login"; // load login.jsp w/ an empty agent object to attach to the login form (binding)
    }

    @RequestMapping(value="/display-agents")
    public String displayAllAgents(Model model){



        List<SecretAgent> aList = sas.getAllAgents();


        model.addAttribute("aList", aList);
        if(aList.size()==0) {
            model.addAttribute("aListFull", Boolean.FALSE);
        } else {
            model.addAttribute("aListFull", Boolean.TRUE);
        }
        return "displayAllAgentsPage";
    }
}
