package com.wildSchool.challengespringq1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {


    @GetMapping("/doctor/1")
    @ResponseBody
    public String indexDoctor1() {

        return "William Hartnell <img src='/images/william-hartnell.jpg'> <br><br> <a href='/'>Retour</a>";
    //    return "William Hartnell ";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String indexDoctor10() {

          return "David Tennant <br><br> <a href='/'>Retour</a>";
    }
    @GetMapping("/doctor/13")
    @ResponseBody
    public String indexDoctor13() {

          return "Jodie Whittaker <br><br> <a href='/'>Retour</a>";
    }

}
