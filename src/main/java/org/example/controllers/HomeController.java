package org.example.controllers;

import org.example.dao.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Vladislav Osada
 * @date 09.06.2023 18:15
 */
@Controller
public class HomeController {

    private final PersonDAO personDAO;

    @Autowired
    public HomeController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("people", personDAO.index());

        return "people/index";
    }
}
