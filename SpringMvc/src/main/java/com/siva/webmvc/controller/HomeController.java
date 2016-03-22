/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siva.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author siva
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("msg", "Hello msg");
        return "index";
    }
}
