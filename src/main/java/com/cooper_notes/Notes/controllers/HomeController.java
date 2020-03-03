package com.cooper_notes.Notes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController extends ActionsController {

        //Navigation Controller
        @RequestMapping(value ={"","/"})
        public String index(Model model) {
            actionChoices.put("home", "Home");
            actionChoices.put("edit", "Edit");
            actionChoices.put("search", "Search");

            model.addAttribute("actions", actionChoices);

            return "index";
        }
}
