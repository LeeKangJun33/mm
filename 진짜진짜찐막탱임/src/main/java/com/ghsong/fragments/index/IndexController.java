package com.ghsong.fragments.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @GetMapping(value = {"/", "/index"})
    public String index() {
        return "index";
    }

    @GetMapping(value = {"/index2"})
    public String index2() {
        return "index2";
    }

    @RequestMapping(value="/Searchlist")
    private String Searchlist(){
        return "list.html";
    }

}
