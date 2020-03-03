package com.cooper_notes.Notes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchController extends ActionsController{
    //Navigation Controller
    @RequestMapping(value ={"/search"})
    public String search(Model model) {
        return "search";
    }
}
