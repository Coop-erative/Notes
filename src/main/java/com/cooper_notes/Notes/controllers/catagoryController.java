package com.cooper_notes.Notes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class catagoryController extends ActionsController {

    @RequestMapping(value={"html_css"})
    public String html_css(Model model) {
        return "categories/HTML_CSS";
    }

    @RequestMapping(value={"csharp"})
    public String csharp(Model model) {
        return "categories/csharp";
    }

    @RequestMapping(value={"java"})
    public String java(Model model) {
        return "categories/java";
    }

    @RequestMapping(value={"javascript"})
    public String javascript(Model model) {
        return "categories/javascript";
    }
}
